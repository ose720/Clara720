//11. 자바 API 도큐먼트 equals 문제
//학생이름과 조 번호를 갖고 있는 class 를 만들고 getter, setter 를 통해 데이터를 조회 및 수정 할 수 있도록 구성하시오
//학생이름과 조 번호를 갖고 equals 를 오버랑이딩으로 동명이인이라도 다른 사람인지 같은 사람인지 구분할 수 있도록 구성
//"김준석"1(조),"김준석'2(조)가 같은 이름이더라도 "다르다고" equals 를 오버라이딩을 구성하시오
//해시코드를 사용하여 각 학생들의 성향을 분석하시오
//getter, setter 쓰는 이유: 객체의 캡슐화, 데이터 입출력 이라는 기능의 메소드를 잘 쓰기 위해서


package TeacherPromblem;

public class Student {

         //필드
         //private : 접근제한자
         //student.name ="김준석" ==>안됨
         //public : 모두 다 접근 가능
         //default : 같은 패키지 내에서 접근 가능
         //protect : 같은 패키지 + 상속 내에서 접근 가능
         private String name;
         private int groupNum;

         //생성자 :생성자는 클래스 이름과 동일
         //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
         //기본적으로 생성자(매개변수 없는) 1개는 있음(안보일뿐)

          public Student(String i_name, int i_groupNum) {
             //this : 제일 가까운 객체를 지칭 > Student 라는 클래스
             //this.name: Student 의 필드 name
             //this.groupNum = Student 의 groupNum
             this.name = i_name;
             this.groupNum = i_groupNum;
         }



    //메서드
         //getter, setter 쓰는 이유 : 객체의 캡슐화, 데이터 입출력이라는 기능의 메서드를 활용
         //외부에서 필드값을 바로 조회 또는 수정을 막기 위함, 객체는 딱 닫혀야 함
         public int getGroupNum() {
             return groupNum;
         }

         public String getName() {
             return name;
         }

         public void setName(String i_name) {
              this.name = i_name;
         }

         //Student 인스턴스 타입으로 아래 equals 라는 메서드 매개 변수를 들어감 (단, Object "타입" 형변환)
         @Override
         public boolean equals(Object obj) {
             //instanceof: 메모리 heap 에 있는 인스턴스끼리 비교하는 것
             //instanceof : 같은 핏줄이면 true
             //상속받았다면 부모 클래스도 동일 true
             if (obj instanceof Student) {
                 Student student_1 = (Student) obj;
                 if(groupNum == student_1.getGroupNum()) {

                 }
             }
             return  false;
         };

    }


