package org.jnagy.bounds;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RepoDogTest {

    @Test
    public void shouldLowerBoundsDog() {
        // given
        RepoDog dogs = new RepoDog();
        List<Dog> dogList = new ArrayList<>();
        Puli puli = new Puli("puli", 3);
        Dog bigDog = new Dog("BigDog", 5);
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya", 6);
        dogList.add(puli);
        dogList.add(bigDog);
        dogList.add(farkasKutya);
        //when
        dogs.saveAll(dogList);
        //then
        int actual = 3;
        assertThat(actual, is(dogs.getDogs().size()));
    }

    @Test
    public void shouldSortAnimal() {
        // given
        RepoDog dogs = new RepoDog();
        List<Dog> dogList = new ArrayList<>();
        Puli puli = new Puli("puli", 3);
        Dog bigDog = new Dog("BigDog", 7);
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya", 8);
        Puli puli2 = new Puli("puli2", 5);

        dogList.add(puli);
        dogList.add(bigDog);
        dogList.add(farkasKutya);
        dogList.add(puli2);
        //when
        Collections.sort(dogList);
        dogs.saveAll(dogList);
        //then
        FarkasKutya actual = new FarkasKutya("farkasKutya", 8);
        assertThat(actual, is(dogs.getDogs().get(3)));
        assertThat(actual, is(dogList.get(3)));
    }

    @Test
    public void shouldBeSameAfterCopy() {
        // given
        RepoDog dogs = new RepoDog();
        List<Dog> dogList = new ArrayList<>();
        Puli puli = new Puli("puli", 3);
        Dog bigDog = new Dog("BigDog", 7);
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya", 8);
        Puli puli2 = new Puli("puli2", 5);

        dogList.add(puli);
        dogList.add(bigDog);
        dogList.add(farkasKutya);
        dogList.add(puli2);
        //when
        Collections.sort(dogList);
        dogs.saveAll(dogList);
        //then
        FarkasKutya actual = new FarkasKutya("farkasKutya", 8);
        assertThat(actual, is(dogs.getDogs().get(3)));
        assertThat(actual, is(dogList.get(3)));
    }

    @Test
    public void shouldBeCopy() {
        // given
        RepoDog dogs = new RepoDog();
        List<Dog> dogList = new ArrayList<>();
        Puli puli = new Puli("puli", 3);
        Dog bigDog = new Dog("BigDog", 7);
        FarkasKutya farkasKutya = new FarkasKutya("farkasKutya", 8);
        Puli puli2 = new Puli("puli2", 5);

        dogList.add(puli);
        dogList.add(bigDog);
        dogList.add(farkasKutya);
        dogList.add(puli2);

        // when
        dogs.saveAll(dogList);
        //then
        FarkasKutya actual = new FarkasKutya("farkasKutya", 8);
        assertThat(actual, is(dogs.getDogs().get(3)));
        assertThat(actual, is(dogList.get(3)));
    }

}
