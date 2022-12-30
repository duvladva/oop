public class Main {
    public static void main(String[] args) {
        Car lada = new Car("",null, 1.7, "",-2015, null );

        Car audi = new Car(null,"",3.0, null, -2020, "" );

        Car bmv = new Car("BMV", "BMV Z8", -1.0, "black",2021,"Germany");

        Car kia = new Car("Kia", "Kia Sportage 4 generation", -10.0,"red", 2018 , "South Korea");

        Car hyundai = new Car("Hyundai","Hyundai Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());


    }
}