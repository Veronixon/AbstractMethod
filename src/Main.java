public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new MercedesFactory();
        carFactory.createCar();
    }
}

interface Car {
    void drive();
}

class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Mercedes");
    }
}

class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("Drive BMW");
    }
}

abstract class CarFactory {
    public void createCar() {
        Car car = getCar();
        car.drive();
    }

    abstract Car getCar();
}

class MercedesFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Mercedes();
    }
}

class BmwFactory extends CarFactory {
    @Override
    Car getCar() {
        return new Bmw();
    }
}


