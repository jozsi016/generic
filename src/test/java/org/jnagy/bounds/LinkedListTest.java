package org.jnagy.bounds;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LinkedListTest {
    @Test
    public void shouldInsertString() {
        String element1 = "element1";
        String element2 = "element2";
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insert(stringLinkedList, element1);
        stringLinkedList.insert(stringLinkedList, element2);

        assertThat(stringLinkedList.size(), is(2));
    }

    @Test
    public void shouldInsertInteger() {
        Integer element1 = 1;
        Integer element2 = 2;

        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.insert(integerLinkedList, element1);
        integerLinkedList.insert(integerLinkedList, element2);

        assertThat(integerLinkedList.size(), is(2));
    }

    @Test
    public void shouldInsertDog() {
        Dog dogOne = new Dog("one", 1);
        Dog dogTwo = new Dog("two", 2);
        Dog dogThree = new Dog("three", 3);

        LinkedList<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.insert(dogLinkedList, dogOne);
        dogLinkedList.insert(dogLinkedList, dogTwo);
        dogLinkedList.insert(dogLinkedList, dogThree);
        dogLinkedList.deleteByKey(dogLinkedList, dogTwo);

        assertThat(dogLinkedList.size(), is(2));
    }

    @Test
    public void shouldDeleteFirst() {
        Dog dogOne = new Dog("one", 1);
        Dog dogTwo = new Dog("two", 2);
        Dog dogThree = new Dog("three", 3);

        LinkedList<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.insert(dogLinkedList, dogOne);
        dogLinkedList.insert(dogLinkedList, dogTwo);
        dogLinkedList.insert(dogLinkedList, dogThree);
        dogLinkedList.deleteFirst(dogLinkedList);

        assertThat(dogLinkedList.size(), is(2));
    }

    @Test
    public void shouldDeleteLast() {
        Dog dogOne = new Dog("ome", 1);
        Dog dogTwo = new Dog("two", 2);
        Dog dogThree = new Dog("three", 3);

        LinkedList<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.insert(dogLinkedList, dogOne);
        dogLinkedList.insert(dogLinkedList, dogTwo);
        dogLinkedList.insert(dogLinkedList, dogThree);
        dogLinkedList.deleteLast(dogLinkedList);

        assertThat(dogLinkedList.size(), is(2));
    }

    @Test
    public void shouldGetNode() {
        Dog dogOne = new Dog("ome", 1);
        Dog dogTwo = new Dog("two", 2);
        Dog dogThree = new Dog("three", 3);

        LinkedList<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.insert(dogLinkedList, dogOne);
        dogLinkedList.insert(dogLinkedList, dogTwo);
        dogLinkedList.insert(dogLinkedList, dogThree);

        assertThat(dogLinkedList.size(), is(3));
        assertThat(dogLinkedList.get(dogLinkedList, dogThree), is(dogThree));
    }

}
