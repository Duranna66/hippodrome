package com.javarush.task.task21.task2113;

public class Horse {
    private String name;
    private double distance;
    private double speed;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void move(){
        this.distance += this.speed * Math.random();
    }
    public void print(){
        String s = "";
        int a = (int) distance;
        for (int i = 0; i < a; i++)
        {
            s = s + ".";
        }
        s = s + name;
        System.out.println(s);
        System.out.println();
    }
}
