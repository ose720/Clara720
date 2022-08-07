package MemberExample3;

import java.util.Arrays;

public class Member implements Cloneable {
    public String name;
    public int age;
    //참조 타입 필드 (깊은 복제 대상)
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사를 해서 name, age 를 복제한다.
        //super 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수입니다.
        //Object 의 clone() 호출
        Member cloned = (Member) super.clone();
        //scores 를 깊은 복제한다.
//        cloned.scores = Arrays.copyOf(this.scores,this,scores.length);
        //car 를 깊은 복제한다.
        cloned.car = new Car(this.car.model);
        //깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
