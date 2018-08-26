package ru.gorshckov;

public  class Driver extends Lorry {
    private int age;
    private String name = "Петр";
    private String[] newCities = new String[]{"Казань-Питер", "Москва-Питер", "Москва-Казань"};

    @Override
    protected String getCities(int keyRoutes) {
        return this.newCities[keyRoutes];
    }
    public void sayName ( String name1) {
        this.name = name1;
        if (name1 == "Петр") {
            System.out.println("Имя Вашего водителя" + " " + name);
        }
        else {
            System.out.println("Вы ввели неверное имя");
        }
    }
}



