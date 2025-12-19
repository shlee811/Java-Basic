package ref;

public class Method2
{
    public static void main(String[] args)
    {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    //`createStudent()` 라는 메서드를 만들고 객체를 생성하는 부분도 이 메서드안에 함께 포함했다. 이제 이 메서드 하
    //나로 객체의 생성과 초기값 설정을 모두 처리한다.
    //그런데 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려주어야 한다. 그래야
    //메서드 밖에서 이 객체를 사용할 수 있다. 메서드는 호출 결과를 반환(`return` )을 할 수 있다. 메서드의 반환 기능을 사
    //용해서 만들어진 객체의 참조값을 메서드 밖으로 반환하면 된다.


    static Student createStudent(String name,int age,int grade){

        Student student = new Student(); //x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;           //x001
    }


    static void printStudent(Student student1)
    {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);

    }

}
//value1은 초긱값을 지정하지 않았지만 멤버변수는 자동으로 초기화 된다. 숫자는 0으로 초기화된다.
//value2는 10으로 초기값을 지정해두었기 떄문에 객체를 생성할떄 10으로 초기화 된다.