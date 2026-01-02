package fianl1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;
        data = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}


//참조형 변수 `data` 에 `final` 이 붙었다. 변수 선언 시점에 참조값을 할당했으므로 더는 참조값을 변경할 수 없다.
//그런데 참조 대상의 객체 값은 변경할 수 있다.