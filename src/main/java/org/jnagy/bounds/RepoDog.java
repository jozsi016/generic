package org.jnagy.bounds;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class RepoDog {

    private final List<? super Dog> dogs = new ArrayList<>();

    public void saveAll(final List<Dog> dogs) {
        for (Dog dog : dogs) {
            save(dog);
        }
    }

    private void save(Dog dog) {
        dogs.add(dog);
    }

    public List<? super Dog> getDogs() {
        return dogs;
    }

    public static void copy(List<? super Comparable> dest, List<? extends Comparable> src) {
        src.stream().sorted().forEach(e -> dest.add(e));
    }

}
