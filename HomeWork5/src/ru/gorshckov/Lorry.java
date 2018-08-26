package ru.gorshckov;

public class Lorry {
    private double dieselFuel;
    private String[] drivers = new String[]{"Иванов", "Петров", "Сидоров"};
    private String[] cities = new String[]{"Казань-Москва", "Казань-Питер", "Москва-Питер"};

    public void addDieselFuel(double dieselFuel) {
        this.dieselFuel = dieselFuel;
    }

    protected String getDrivers(int keySurname) {
        return this.drivers[keySurname];
    }

    protected String getCities(int keyRoutes) {
        return this.cities[keyRoutes];
    }

    public void Start(int keySurname,int keyRoutes) {
        if (this.dieselFuel > 0) {
            if (keySurname > this.drivers.length) {
                System.out.println("такого водителя нет");
            } else {
                String drivers = getDrivers(keySurname);
                System.out.println("фамилия водителя: " + drivers);
            }
            if (keyRoutes > this.cities.length) {
                System.out.println("такого маршрута нет");
            } else {
                String cities = getCities(keyRoutes);
                System.out.println("Ваш маршрут: " + cities);
            }
        }
        else {
            System.out.println("заправьте автомобиль!");
        }
    }
}