package ch1.bad_software;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(String serialNumber, String builder, String model, String type,
                          Double price, String backWood, String topWood) {

        Guitar guitar = new Guitar(serialNumber, price, builder, type, model, topWood, backWood);

        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }

        return null;
    }

    public List<Guitar> search(String builder, String model, String type, String backWood, String topWood) {
        ArrayList<Guitar> searchedGuitar = new ArrayList<>();

        for (Guitar guitar : guitars) {
            if (!guitar.getBuilder().equalsIgnoreCase(builder)) {
                continue;
            }

            if (!guitar.getModel().equalsIgnoreCase(model)) {
                continue;
            }

            if (!guitar.getType().equalsIgnoreCase(type)) {
                continue;
            }

            if (!guitar.getBackWood().equalsIgnoreCase(backWood)) {
                continue;
            }

            if (!guitar.getTopWood().equalsIgnoreCase(topWood)) {
                continue;
            }

            searchedGuitar.add(guitar);
        }

        return searchedGuitar;
    }
}
