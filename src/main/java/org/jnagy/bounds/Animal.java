package org.jnagy.bounds;


import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

//christofer alexander
//creation pattern
//structural
// behavioral
public class Animal implements Comparable<Animal>{

    //eletkor int age,  comparable by age upper bounddal
    //meg kap egy listat rendez aztan visszad egy masik listat.....
    //unit tesztek

    protected Integer age;

    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.getAge().compareTo(animal.getAge());
    }


}
