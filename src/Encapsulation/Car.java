package Encapsulation;

public class Car {
    private String maker;
    private String model;
    private int year;

    public Car(String maker, String model, int year) {
        this.setMaker(maker);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
