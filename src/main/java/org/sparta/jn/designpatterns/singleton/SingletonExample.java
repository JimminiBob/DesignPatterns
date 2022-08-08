package org.sparta.jn.designpatterns.singleton;

public class SingletonExample {

    private static final SingletonExample SINGLETON = new SingletonExample();
    private SingletonExample() {

    }

    public static SingletonExample getSingleton() {
        return SINGLETON;
    }

}
