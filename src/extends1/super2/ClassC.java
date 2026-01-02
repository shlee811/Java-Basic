package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20);
        System.out.println("ClassC 생성자");
    }

}


//`ClassC` 는 `ClassB` 를 상속 받았다. `ClassB` 다음 두 생성자가 있다.
//`ClassB(int a)`
//`ClassB(int a, int b)`
//생성자는 하나만 호출할 수 있다. 두 생성자 중에 하나를 선택하면 된다.
//`super(10, 20)` 를 통해 부모 클래스의 `ClassB(int a, int b)` 생성자를 선택했다.
//참고로 `ClassC` 의 부모인 `ClassB` 에는 기본 생성자가 없다.
// 따라서 부모의 기본 생성자를 호출하는 `super()` 를 사용하거나 생략할 수 없다