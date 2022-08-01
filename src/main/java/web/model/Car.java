package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String factoryManufac;
    private String model;
    private int yearOfRelease;
    private static String header = "Factory Manufac/" + ' ' + "Model/" + ' ' + "yearOfRelease";
    public Car(){}

    public Car(String factoryManufac, String model, int yearOfRelease) {
        this.factoryManufac = factoryManufac;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public String getFactoryManufac() {
        return factoryManufac;
    }


    public void setFactoryManufac(String factoryManufac) {
        this.factoryManufac = factoryManufac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "factoryManufac='" + factoryManufac + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
    public String toStringFormatted() {
        return factoryManufac + "/ " + model + "/ " + +yearOfRelease;
    }

    public String header() {
        return header;
    }

}
