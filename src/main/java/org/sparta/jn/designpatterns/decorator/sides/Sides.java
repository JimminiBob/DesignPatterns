package org.sparta.jn.designpatterns.decorator.sides;

import org.sparta.jn.designpatterns.decorator.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription(); //e.g. of abstract method
}

