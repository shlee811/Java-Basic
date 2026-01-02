package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

//실행해보면 `ClassA` `ClassB` `ClassC` 순서로 실행된다. 생성자의 실행 순서가 결과적으로 최상위 부모부터
//실행되어서 하나씩 아래로 내려오는 것이다. 따라서 초기화는 최상위 부모부터 이루어진다.
// 왜냐하면 자식 생성자의 첫 줄에서 부모의 생성자를 호출해야 하기 때문이다.