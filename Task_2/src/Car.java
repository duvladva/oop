public class Car {
    public String brand;
    public String model;
    public Double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    Car(String brand, String model, Double engineVolume, String color, int productionYear, String productionCountry){
    this.brand = brand;
    this.model = model;
    this.engineVolume = engineVolume;
    this.color = color;
    this.productionYear = productionYear;
    this.productionCountry = productionCountry;
    }


    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume + " " + color + " " + productionYear + " " + productionCountry;
    }
}
