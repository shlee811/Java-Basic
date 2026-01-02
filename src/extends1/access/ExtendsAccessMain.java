package extends1.access;

import extends1.access.child.Child;


public class ExtendsAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }

}


//코드를 실행해보면 `Child.call()` `Parent.printParent()` 순서로 호출한다.
//`Child` 는 부모의 `public` , `protected` 필드나 메서드만 접근할 수 있다.
// 반면에 `Parent.printParent()` 의 경우 `Parent` 안에 있는 메서드이기 때문에 `Parent` 자신의 모든 필드와 메서드에 얼마든지 접근할 수 있다.