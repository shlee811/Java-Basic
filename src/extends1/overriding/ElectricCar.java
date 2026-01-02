package extends1.overriding;

public class ElectricCar extends Car {


    //**@Override**
    //`@` 이 붙은 부분을 애노테이션이라 한다. 애노테이션은 주석과 비슷한데, 프로그램이 읽을 수 있는 특별한 주석이라 생각면 된다
    //이 애노테이션은 상위 클래스의 메서드를 오버라이드하는 것임을 나타낸다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

}

//ElectricCar` 는 부모인 `Car` 의 `move()` 기능을 그대로 사용하고 싶지 않다. 메서드 이름은 같지만 새로운 기능을 사용하고 싶다.
// 그래서 `ElectricCar` 의 `move()` 메서드를 새로 만들었다.
//이렇게 부모의 기능을 자식이 새로 재정의하는 것을 메서드 오버라이딩이라 한다.******
//이제 `ElectricCar` 의 `move()` 를 호출하면 `Car` 의 `move()` 가 아니라 `ElectricCar` 의 `move()` 가 호출된다.