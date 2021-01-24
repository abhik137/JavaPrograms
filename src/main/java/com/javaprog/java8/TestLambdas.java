package com.javaprog.java8;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestLambdas
{
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String productList = "[{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"135572619268GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Take me to Venice\\\\\\\\ Hand Embroidered Kurti\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/8474.jpg?v=1519909026\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"135572619268\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_description\":\"Summer is on and its time to start planning your vacations. Okhai's artisans  have made this fabulous cotton handloom kurta in Rama and Black shades. The  stylish silhoutte with a side slit in front clubbed with rich hand embroidery  makes it suitable for any occasion.\",\"e_size\":\"S\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_link\":\"https://okhai.org/products/okhai-take-me-to-venice-hand-embroidered-kurti-llk1751090-xs?variant=135572619268\",\"e_sale_price\":\"500.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1500.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.904Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":4.55,\"message\":\"16767\\t135572619268\\tGLOBAL\\tINR\\t4.55\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5695427510304GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"okhai\",\"e_currency\":\"INR\",\"e_name\":\"Blue Meteors - Natural Stone Earrings\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/74.jpg?v=1513685961\",\"business_segment\":\"jewelry\",\"vertical\":\"ecommerce\",\"sku_id\":\"5695427510304\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Accessories\",\"country_code\":\"GLOBAL\",\"e_description\":\"Dangler earrings made of multifaceted stones set in Gold polished metal alloy  to accentuate your daily attire or pep-up any party look.\",\"e_google_product_category\":\"apparel & accessories > jewelry\",\"e_link\":\"https://okhai.org/products/blue-meteors-natural-stone-earrings-1?variant=5695427510304\",\"e_sale_price\":\"650.00\",\"e_product_type\":\"Accessories\",\"e_price\":\"650.00\",\"sku_minus_1\":\"Accessories\",\"@timestamp\":\"2018-05-10T05:22:26.919Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":5.2,\"message\":\"16767\\t5695427510304\\tGLOBAL\\tINR\\t5.2\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5090812133408GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhaistore\",\"e_currency\":\"INR\",\"e_name\":\"Gift Card\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/gift_1_b682b51b-a88e-476e-b38d-7083ed483f23.jpg?v=1512131840\",\"business_segment\":\"party & celebration\",\"vertical\":\"ecommerce\",\"sku_id\":\"5090812133408\",\"subvertical\":\"arts & entertainment\",\"category_l1\":\"Gift Card\",\"e_google_product_category\":\"arts & entertainment > party & celebration\",\"country_code\":\"GLOBAL\",\"e_description\":\"Shopping for someone else but not sure what to give them? Give them the gift of  choice with a Okhaistore gift card. Gift cards are delivered by email and  contain instructions to redeem them at checkout. Our gift cards have no  additional processing fees.\",\"e_link\":\"https://okhai.org/products/gift-card?variant=5090812133408\",\"e_sale_price\":\"1000.00\",\"e_product_type\":\"Gift Card\",\"e_price\":\"1000.00\",\"sku_minus_1\":\"Gift Card\",\"@timestamp\":\"2018-05-10T05:22:26.919Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":5.2,\"message\":\"16767\\t5090812133408\\tGLOBAL\\tINR\\t5.2\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"135573143556GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Flower Galaxy\\\\\\\\ Mirror Work Embroidery Kurti\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/16_14944127-1c09-4067-b257-6d6160742862.jpg?v=1521804524\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"135573143556\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_description\":\"A smart Indigo kurta with a beautiful floral jaal print and two slits in the  front will make you feel like you are floating in a flower galazy. To add to  it, the sleeves are enhanced with some intricate mirror work. Dyed in indigo,  this will rub some blue for the first few washes, but that only means that its  real indigo.\",\"e_size\":\"L\",\"e_link\":\"https://okhai.org/products/okhai-flower-galaxy-mirror-work-embroidery-kurti-llk1751240-xs?variant=135573143556\",\"e_sale_price\":\"650.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1250.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.920Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":5.2,\"message\":\"16767\\t135573143556\\tGLOBAL\\tINR\\t5.2\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5919463735328GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Spring Sky\\\\\\\\ Embroidery Work Dress\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/LLK17C462_A.jpg?v=1515584937\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"5919463735328\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_description\":\"Embrace the romance of clear blue skies and the spring breeze in this airy  cotton handloom design, graced with mirror work embroidery and pockets. Pair it  with your favourite pastel accessories to complete the look.\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_size\":\"XXL\",\"e_link\":\"https://okhai.org/products/okhai-spring-sky-embroidery-work-dress?variant=5919463735328\",\"e_sale_price\":\"1700.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1700.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.932Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":6.8,\"message\":\"16767\\t5919463735328\\tGLOBAL\\tINR\\t6.8\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5710421655584GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"okhai\",\"e_currency\":\"INR\",\"e_name\":\"Rama Green - Natural Stone Earrings\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/30.JPG?v=1513766815\",\"business_segment\":\"jewelry\",\"vertical\":\"ecommerce\",\"sku_id\":\"5710421655584\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Accessories\",\"e_google_product_category\":\"apparel & accessories > jewelry\",\"country_code\":\"GLOBAL\",\"e_description\":\"Dangler earrings made of multifaceted stones in bright colours set in Gold  polished metal alloy ideal as party wear.\",\"e_link\":\"https://okhai.org/products/rama-green-natural-stone-earrings-1?variant=5710421655584\",\"e_sale_price\":\"450.00\",\"e_product_type\":\"Accessories\",\"e_price\":\"450.00\",\"sku_minus_1\":\"Accessories\",\"@timestamp\":\"2018-05-10T05:22:26.907Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":4.55,\"message\":\"16767\\t5710421655584\\tGLOBAL\\tINR\\t4.55\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"135568949252GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Paisley Park\\\\\\\\ Mirror Work Kurti\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/24.jpg?v=1521805106\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"135568949252\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_description\":\"This beautiful silhouette has been designed to fit you beautifully. Wear it  like a dress or wear it like a Kurta, it will look graceful in both styles. The  mirror work adds that extra charm to the front and enhances the look!! There  are pockets for your precious things.\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_size\":\"L\",\"e_link\":\"https://okhai.org/products/okhai-paisley-park-mirror-work-kurti-llk1771630-xs?variant=135568949252\",\"e_sale_price\":\"950.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1300.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.922Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":5.7,\"message\":\"16767\\t135568949252\\tGLOBAL\\tINR\\t5.7\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"6452141522976GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Indigo Holiday\\\\\\\\ Indigo Dhabu Dress\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/Untitled-2_baffc953-7624-4f15-9429-8ae2339863c3.jpg?v=1522846347\",\"business_segment\":\"hobbies & creative arts\",\"vertical\":\"ecommerce\",\"sku_id\":\"6452141522976\",\"subvertical\":\"arts & entertainment\",\"category_l1\":\"Apparels\",\"country_code\":\"GLOBAL\",\"e_description\":\"Perfect for a day off or a holiday or even casual fridays. crafted from comfy  block printed indigo dhabu fabric, this dress has two front pockets and can be  styled easily. Keep it casual with sneakers or jazz it up with your favourite  pair of shoes.\",\"e_google_product_category\":\"arts & entertainment > hobbies & creative arts\",\"e_size\":\"S\",\"e_link\":\"https://okhai.org/products/okhai-indigo-holiday-indigo-dhabu-dress?variant=6452141522976\",\"e_sale_price\":\"1750.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1750.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.911Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":4.55,\"message\":\"16767\\t6452141522976\\tGLOBAL\\tINR\\t4.55\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5154600845344GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Royal Palace\\\\\\\\ Mirror Work Kurti\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/LLK176580-A.jpg?v=1512131835\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"5154600845344\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_description\":\"Something new with an ethnic touch to it always catches the eye. The indigo  printed kurti with traditional long cut, two comfy pockets and beautiful  mirrored yoke is just what you were looking for this casual monsoon outing! The  Kurti has side slits and beautiful mirror work detail\",\"e_size\":\"S\",\"e_link\":\"https://okhai.org/products/okhai-royal-palace-mirror-work-kurti-llk176580-xs?variant=5154600845344\",\"e_sale_price\":\"980.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1050.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.938Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":7.35,\"message\":\"16767\\t5154600845344\\tGLOBAL\\tINR\\t7.35\",\"client_id\":\"16767\"}},{\"_index\":\"cli_16767\",\"_type\":\"products\",\"_id\":\"5789844308000GLOBALINR\",\"_score\":1,\"_source\":{\"e_brand\":\"Okhai\",\"e_currency\":\"INR\",\"e_name\":\"Okhai \\\\Globetrotter\\\\\\\\ Block Printed Kurti\",\"e_quantity\":\"0\",\"e_availability\":\"out of stock\",\"e_is_available_for_view\":\"false\",\"e_is_available_for_sale\":\"false\",\"e_gtin\":\"3.22E+11\",\"e_image_link\":\"https://cdn.shopify.com/s/files/1/2116/1923/products/LLK17C1072_A.jpg?v=1514283134\",\"business_segment\":\"clothing\",\"vertical\":\"ecommerce\",\"sku_id\":\"5789844308000\",\"subvertical\":\"apparel & accessories\",\"category_l1\":\"Apparels\",\"e_description\":\"Nail the airport look with this classy design, tailored for the jet-setting  woman on the go. With a chic winter dress silhouette adorned with indian  handicraft mirror work and block print, its the best of both worlds. Wear it  with your favourite pair of formal shoes and accessories, and you're set to  make heads turn. u00A0 u00A0\",\"e_google_product_category\":\"apparel & accessories > clothing\",\"country_code\":\"GLOBAL\",\"e_size\":\"L\",\"e_link\":\"https://okhai.org/products/okhai-globetrotter-block-printed-kurti?variant=5789844308000\",\"e_sale_price\":\"1850.00\",\"e_product_type\":\"Apparels\",\"e_price\":\"1850.00\",\"sku_minus_1\":\"Apparels\",\"@timestamp\":\"2018-05-10T05:22:26.938Z\",\"host\":\"ares-1.hzdc14.onlinesales.ai\",\"@version\":\"1\",\"currency\":\"INR\",\"bid_value\":7.4,\"message\":\"16767\\t5789844308000\\tGLOBAL\\tINR\\t7.4\",\"client_id\":\"16767\"}}]";
        List<Map<String, Object>> esProducts = 
            mapper.readValue(productList, new TypeReference<List<Map<String, Object>>>(){});
        List<String> fetchedSkuIds = 
            esProducts.stream()
                    .filter(product -> ((Map<String,Object>) product.get("_source")).get("sku_id") != null)
                    .map(product -> ((Map<String, Object>) product.get("_source")).get("sku_id").toString())
                    .collect(Collectors.toList());
        System.out.println(fetchedSkuIds.size());
    }
}