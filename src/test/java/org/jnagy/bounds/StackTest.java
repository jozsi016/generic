package org.jnagy.bounds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {


    @Test
    public void shouldFifo() {
        String element1 = "element1";
        String element2 = "element2";

        Stack<String> myStack = new Stack<>();

        myStack.push(element1);
        myStack.push(element2);

        assertThat(myStack.pop(), is(element2));
    }

    @Test
    public void shouldFifoForInt() {
        Integer element1 = 1;
        Integer element2 = 2;

        Stack<Integer> myStack = new Stack();

        myStack.push(element1);
        myStack.push(element2);

        assertThat(myStack.pop(), is(element2));
    }

    @Test
    public void shouldAnimal() {
        Dog dog = new Dog("dog");
        Puli puli = new Puli("puli");
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya");

        Stack<Animal> myStack = new Stack();

        myStack.push(dog);
        myStack.push(puli);
        myStack.push(farkasKutya);

        assertThat((FarkasKutya) myStack.pop(), is(farkasKutya));
    }

    @Test
    public void shouldAbleToExtendsStackGenreic() {
        Dog dog = new Dog("dog");
        Puli puli = new Puli("puli");
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya");

        Stack<Animal> myStack = new Stack();

        myStack.push(dog);
        myStack.push(puli);
        myStack.push(farkasKutya);

        assertThat((FarkasKutya) myStack.pop(), is(farkasKutya));
    }


    @Test
    public void shouldSupportLowerBound() {
        Dog dog = new Dog("dog");
        Puli puli = new Puli("puli");
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya");

        List<? super Animal> myList = new ArrayList<>();

        myList.add(dog);
        myList.add(puli);
        myList.add(farkasKutya);

        assertThat((FarkasKutya) myList.get(2), is(farkasKutya));
    }

}
