package com.javaprog.reactive;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;

public class ExploringReactiveJava {
    /* Exploring reactive programming in Java by Miro Cupak
     * https://www.youtube.com/watch?v=nP-UeleMgE4 */
    public static void main(String[] args) {
        level0();
    }

    private static void level0() {
        Thread t = new Thread(() -> System.out.println("Hello, World!"));
        t.start();
        SimpleSubscriber sub = new SimpleSubscriber();
        SubmissionPublisher<String> pub = new SubmissionPublisher<>();

        // LEVEL-4 Reactive
        /* SubmissionPublisher is the default implementation of Publisher provided by java,
         * it's meant to be a base class for your own implementation, this is for demo only
         * Although you should not actually implement it, as it is meant for library devs,
         * not for application developers */
        pub.subscribe(sub);
        pub.getSubscribers();
        pub.submit("hello devoxx");
        pub.close();
        //pub.submit("hello devoxx"); //ERROR

        // LEVEL-5 Reactive [HTTP/Microservices]
        /*A simple http server*/
        HttpHandler handler = he -> {
            String body = "Hello Devoxx";
            he.sendResponseHeaders(200, body.length());
            try (OutputStream os = he.getResponseBody()){
                os.write(body.getBytes());
            }
        };
        HttpServer hs = null;
        try {
            hs = HttpServer.create(new InetSocketAddress(8080), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        hs.createContext("/hello", handler);
        hs.start();

        /* Http client using the new HTTP2 client API
         * https://openjdk.java.net/groups/net/httpclient/intro.html */
        HttpClient hc = HttpClient.newHttpClient();
        hc.version();   //HTTP_2
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/hello")).GET().build();
        HttpResponse response;
        CompletableFuture<HttpResponse<String>> asyncResponse;
        try {
            response = hc.send(request, HttpResponse.BodyHandlers.ofString());
            asyncResponse = hc.sendAsync(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            System.out.println(asyncResponse.get().body());
        } catch (InterruptedException | IOException | ExecutionException e) {
            e.printStackTrace();
        }
        /* Http2 client uses reactive streams and CompletableFuture behind the scenes */
        /* LEVEL-6: Reactive Libraries(Rxjava, Reactor..)
         * LEVEL-7: Reactive Microservices(Vertx, Spring, Kafka..)
         * Gradually more & more reactive features are being added to jdk
         * Watch out for Project Loom, Fiber in the Future
         * https://cr.openjdk.java.net/~rpressler/loom/Loom-Proposal.html
         * https://www.youtube.com/watch?v=vbGbXUjlRyQ
         * https://www.youtube.com/watch?v=EMv_8dxSqdE
         */
    }
}

class SimpleSubscriber implements Subscriber<String> {

    private Subscription sub;

    /**
     * Method invoked prior to invoking any other Subscriber
     * methods for the given Subscription. If this method throws
     * an exception, resulting behavior is not guaranteed, but may
     * cause the Subscription not to be established or to be cancelled.
     *
     * <p>Typically, implementations of this method invoke {@code
     * subscription.request} to enable receiving items.
     *
     * @param subscription a new subscription
     */
    @Override
    public void onSubscribe(Subscription subscription) {
        this.sub = subscription;
        sub.request(1); //request the 1st message
    }

    /**
     * Method invoked with a Subscription's next item.  If this
     * method throws an exception, resulting behavior is not
     * guaranteed, but may cause the Subscription to be cancelled.
     *
     * @param item the item
     */
    @Override
    public void onNext(String item) {
        System.out.println("Received: " + item);
        sub.request(1);
    }

    /**
     * Method invoked upon an unrecoverable error encountered by a
     * Publisher or Subscription, after which no other Subscriber
     * methods are invoked by the Subscription.  If this method
     * itself throws an exception, resulting behavior is
     * undefined.
     *
     * @param throwable the exception
     */
    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    /**
     * Method invoked when it is known that no additional
     * Subscriber method invocations will occur for a Subscription
     * that is not already terminated by error, after which no
     * other Subscriber methods are invoked by the Subscription.
     * If this method throws an exception, resulting behavior is
     * undefined.
     */
    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}