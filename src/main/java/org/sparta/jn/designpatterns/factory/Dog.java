package org.sparta.jn.designpatterns.factory;

public class Dog implements Speakable{
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    public void jump() { //breaks lizkov
        System.out.println("The dog is jumping");
    }
}
