package org.jnagy.bounds;

public class Animal implements Comparable<Animal> {
    protected Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.getAge().compareTo(animal.getAge());
    }
}
