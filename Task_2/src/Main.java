public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada","LadaGranta", 1.7, "yelow",2015, "Russia" );

        Car audi = new Car("Audi","Audi A8 50 L TDI quattro",3.0, "black", 2020, "Germany" );

        Car bmv = new Car("BMV", "BMV Z8", 3.0, "black",2021,"Germany");

        Car kia = new Car("Kia", "Kia Sportage 4 generation", 2.4,"red", 2018 , "South Korea");

        Car hyundai = new Car("Hyundai","Hyundai Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());


    }
}