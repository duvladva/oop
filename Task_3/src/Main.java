import transport.Car;

public class Main {
    public static void main(String[] args) {// создаем пять объектов класса Car с определенными значениями параметров
        Car lada = new Car(null,null, 1.7, "",-2015, "", "ручная",
                "sedan", 123, 4, false, true, true);

        Car audi = new Car("Audi","",3.0, "", -2020, "", "автоматическая",
                "седан", 234, 4, false, true, true);

        Car bmv = new Car("BMV", "BMV Z8", -1.0, "black",2021,"Germany",
                "автоматическая", "седан", 345, 4, false, true, true);

        Car kia = new Car("Kia", "Kia Sportage 4 generation", -10.0,"red", 2018 ,
                "South Korea", "ручная", "седан", 456, 4,
                false, true, true);

        Car hyundai = new Car("Hyundai","Hyundai Avante", 1.6, "orange", 2016,
                "South Korea", "ручная", "седан", 567, 4,
                false, true, true);

        System.out.println("Созданы пять объектов класса Car с определенными значениями параметров:");
        System.out.println(lada); // вывод в консоль тех параметров объекта, которые определены в методе toString
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра Brand, вызываем геттер getBrand() = " + lada.getBrand());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра Model, вызываем геттер getModel() = " + lada.getModel());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра EngineVolume, вызываем геттер getEngineVolume() = " + lada.getEngineVolume());
        lada.setEngineVolume(4.0); //  для объекта lada вызывается сеттер параметра EngineVolume и параметру присваивается значение 4.0
        System.out.println("Для объекта Lada сеттером установлено значение параметра EngineVolume = 4.0. Проверяем, EngineVolume = " + lada.getEngineVolume());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра Color, вызываем геттер getColor() = " + lada.getColor());
        lada.setColor("фиолетовый"); //  для объекта lada вызывается сеттер параметра Color и параметру присваивается значение фиолетовый
        System.out.println("Для объекта Lada сеттером установлено значение параметра Color = \"фиолетовый\". Проверяем, EngineVolume = " + lada.getColor());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра ProductionYear, вызываем геттер getProductionYear() = " + lada.getProductionYear());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра ProductionCountry, вызываем геттер getProductionCountry() = " + lada.getProductionCountry());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра Transmission, вызываем геттер getTransmission() = " + lada.getTransmission());
        lada.setTransmission("автоматическая"); //  для объекта lada вызывается сеттер параметра Transmission и параметру присваивается значение "автоматическая""
        System.out.println("Для объекта Lada сеттером установлено значение параметра Transmission = \"автоматическая\". Проверяем, Transmission = " + lada.getTransmission());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра BodyTypes, вызываем геттер getBodyTypes() = " + lada.getBodyTypes());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра RegistrationNumber, вызываем геттер getRegistrationNumber() = " + lada.getRegistrationNumber());
        lada.setRegistrationNumber(999); //  для объекта lada вызывается сеттер параметра RegistrationNumber и параметру присваивается значение 999
        System.out.println("Для объекта Lada сеттером установлено значение параметра RegistrationNumber = 999. Проверяем, RegistrationNumber = " + lada.getRegistrationNumber());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра SeatsCount, вызываем геттер getSeatsCount() = " + lada.getSeatsCount());

        System.out.println();
        System.out.println("Для объекта Lada проверяем значение параметра SummerTyres, вызываем геттер getSummerTyres() = " + lada.getSummerTyres());
        lada.setSummerTyres(true); //  для объекта lada вызывается сеттер параметра summerTyres и параметру присваивается значение true
        System.out.println("Для объекта Lada сеттером установлено значение параметра summerTyres = true. Проверяем, SummerTyres = " + lada.getSummerTyres());
        lada.changeTyres(2); //  для объекта lada вызывается метод changeTyres и параметру присваивается значение 2
        System.out.println("Для объекта Lada методом changeTyres установлено значение параметра summerTyres = false. Проверяем, SummerTyres = " + lada.getSummerTyres());

        System.out.println();
        lada.setKey(false, false);
        System.out.println("Для объекта Lada сеттером объекта Кеу установлено значение параметров remoteEngineStart = false, nonKeyAccess = false. Проверяем: " );
        System.out.println(lada);




    }
}