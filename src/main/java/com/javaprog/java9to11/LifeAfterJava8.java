package com.javaprog.java9to11;

import java.util.*;

public class LifeAfterJava8 {
    /* https://www.youtube.com/watch?v=eot4kLJEnd4
     * https://trishagee.github.io/presentation/beyond_java_8/
     * https://github.com/JetBrains/intellij-samples/tree/master/standard-java/src/main/java/com/jetbrains/inspections */

    // note that Arrays.asList() is not immutable hence, Collections.unmodifiableList()
    // you can't add to Arrays.aslist() list but you can modify it's elements
    private static final List<String> EXAMPLE_LIST_OLD =
        Collections.unmodifiableList(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));
    // can use List.of() directly instead
    private static final List<String> EXAMPLE_LIST = List.of("aaa", "bbb", "ccc", "ddd", "eee");

    private static final Set<String> EXAMPLE_SET_OLD = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("HAPPY", "SAD")));
    private static final Set<String> EXAMPLE_SET = Set.of("aaa", "bbb", "ccc", "ddd", "eee");
    //TODO: Map.of, Collectors.toUnmodifiableList()
    //TODO: stream().takeWhile()/dropWhile() i.e. do this stream[take/drop] operation until some criteria is met
    //TODO: Predicate::not
}
