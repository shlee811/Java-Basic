package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}


//모든 차량에 문열기(`openDoor()` ) 기능을 추가해야 한다.
//새로운 수소차(`HydrogenCar` )를 추가해야 한다.
//수소차는 `fillHydrogen()` 기능을 통해 수소를 충전할 수 있다.