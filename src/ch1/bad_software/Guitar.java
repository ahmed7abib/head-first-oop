package ch1.bad_software;

public class Guitar {

    private final String serialNumber;
    private final Double price;
    private final String builder;
    private final String type;
    private final String model;
    private final String topWood;
    private final String backWood;

    public Guitar(String serialNumber, Double price, String builder, String type, String model, String topWood, String backWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getTopWood() {
        return topWood;
    }

    public String getBackWood() {
        return backWood;
    }
}
