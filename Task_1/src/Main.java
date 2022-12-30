public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "LadaGranta";
        lada.engineVolume = 1.7;
        lada.productionYear = 2015;
        lada.color = "yelow";
        lada.productionCountry = "Russia";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "Audi A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.productionYear = 2020;
        audi.color = "black";
        audi.productionCountry = "Germany";

        Car bmv = new Car();
        bmv.brand = "BMV";
        bmv.model = "BMV Z8";
        bmv.engineVolume = 3.0;
        bmv.productionYear = 2021;
        bmv.color = "black";
        bmv.productionCountry = "Germany";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Kia Sportage 4 generation";
        kia.engineVolume = 2.4;
        kia.productionYear = 2018;
        kia.color = "red";
        kia.productionCountry = "South Korea";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Hyundai Avante";
        hyundai.engineVolume = 1.6;
        hyundai.productionYear = 2016;
        hyundai.color = "orange";
        hyundai.productionCountry = "South Korea";

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());


    }
}