package ch1.good_software.models;

public class Guitar {

    private final Double price;
    private final String serialNumber;
    private final GuitarSpecification guitarSpecification;

    public Guitar(String serialNumber, Double price, GuitarSpecification guitarSpecification) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpecification = guitarSpecification;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public GuitarSpecification getGuitarSpecification() {
        return guitarSpecification;
    }
}
