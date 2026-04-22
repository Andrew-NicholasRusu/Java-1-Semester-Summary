package February.February_12_2026.Homework;

public class Car {
    private String model;
    private String color;
    private double gasLimit;

    public Car(String model, String color, double gasLimit) {
        this.model = model;
        this.color = color;
        this.gasLimit = gasLimit;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(double gasLimit) {
        this.gasLimit = gasLimit;
    }

    //toString example
    @Override
    public String toString(){
        return "Model: " + model + ", Color: " + color + ", Gas Limit: " + gasLimit;
    }
    
}
