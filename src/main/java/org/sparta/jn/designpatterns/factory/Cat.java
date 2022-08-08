package org.sparta.jn.designpatterns.factory;

public class Cat implements Speakable{
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
