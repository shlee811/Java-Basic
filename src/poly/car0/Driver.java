package poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car; //추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }
    //추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    //변경
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}


//드라이버는 `K3Car` , `Model3Car` 를 모두 운전할 줄 알아야 한다. 다음과 같은 코드 변경이 발생한다.
//`Model3Car` 용 필드 추가
//`setModel3Car(..)` 메서드 추가
//`drive()` 메서드에서 가지고 있는 차량에 따른 분기