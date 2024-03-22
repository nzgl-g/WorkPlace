package Abstraction.AbstactClass;

public abstract class Cars {
    //here in abstraction you can use the class like an interface or like a class but there is a rules
    private String model;
    private String carColor ;
    private int horsePower;
    private double engineCapacity;
    public static final int carDoors=2;//there is no default public static final you must declare it
    abstract void Color();//if you need to play an interface function without body you must declare void before the return type
    // OR type the function normally like the classes

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getcarColor() {
        return carColor;
    }

    public void setcarColor(String color) {
        this.carColor = carColor;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
