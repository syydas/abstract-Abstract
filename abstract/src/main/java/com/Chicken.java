package com;

public abstract class Chicken {
    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

    public void outPut() {
        System.out.format("100元可以买%s %d只\n", this.getType(), (int) (100 / this.getPrice()));
    }
}
