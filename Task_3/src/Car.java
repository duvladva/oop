public class Car {
    public String brand;
    public String model;
    public Double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    Car(String brand, String model, Double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == "" || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
            ;
        }

        if (model == "" || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == "" || color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }


        if (productionCountry == "" || productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

    }


    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume + " " + color + " " + productionYear + " " + productionCountry;
    }
}
