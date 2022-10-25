package org.example.interfaceUse;

public class Country implements Measurable{

    private String name;
    private int area;

    public Country(String name, int area)
    {
        this.name = name;
        this.area = area;
    }
    @Override
    public double getMeasurable() {
        return area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
