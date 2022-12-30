public class Car {
    public String brand;
    public String model;
    public Double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume + " " + color + " " + productionYear + " " + productionCountry;
    }
}
