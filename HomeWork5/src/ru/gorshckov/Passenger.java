package ru.gorshckov;

public class Passenger {
private String name = "Олег";
private int age = 32;

    public void sayName(String name2) {
        this.name = name2;
        if (name2.equals("олег")) {
            System.out.println("Имя пассажира Олег");
        }
        else {
            System.out.println("вы ввели неверное имя пасажира");
        }
    }
    public void sayAge (int age) {
        this.age = age;
        if(age == 32) {
            System.out.println("Олегу 32 года");
        }
        else {
            System.out.println("Это не возраст пассажира");
        }
    }
    }
