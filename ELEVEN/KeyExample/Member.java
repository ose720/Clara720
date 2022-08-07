package KeyExample;

public class Member {
    public String id;
    //생성자 (클래스를 토대로 인스턴스를 처음 만들 때 세팅 하는 거)
    //String 매개 변수를 id를 받아서 필드값 id에 할당(대입)
    public Member(String id) {
        this.id = id;
    }

    //메서드 : 이 인스턴스가 갖고 있는 기능
    //매서드 : Object 에 있는 equals();
    //오버라이딩은 상속을 받아서 재정의하는 건데, Member 상속 어디서?
    //모든 클래스는 Object 라는 클래스에서 시작되며 상속받습니다.***
    //equals 를 재정의 해서 새로운 비교구문 만들기
    //@ : 어노테이션은 아래 메서드의 성질을 JVM 에게 선언해주는 구문
    //public : 접근제한자 로서 모두 다 접근 가능
    //boolean : 이 메서드가 실행되고 최종적으로 리턴되는 "타입"에 boolean
    //(Object obj): 매개변수로써 어떤 인스턴스 Object 로 "형변환" 된다.
    //어떤 클래스든 Object 객체를 모두 상속받기 때문에 최고 부모 클래스의 Object 로 "자동 형변환" 이 가능
    //어디까지나 타입 형병환 (인스턴스의 타입이 바뀌는 게 아닙)
    //Member obj4 = new Member("blue";>Object obj4 = new Member("blue"))
    @Override
    public boolean equals(Object obj) {
        //실제로 구현되 인스턴스의 타입을 Member 이기 때문에 if 문에 true 뜸
        if(obj instanceof Member) {
            //Member 타입으로 obj 매개변수를 형변환
            //member 라는 변수명으로 obj(주소)가 연결
            Member member = (Member) obj;
            //id = member 의 필드값
            //id = String  이기 때문에 참조타입이므로 equals 를 통해 비교
            //인스턴스 id 라는 필드값과 매개변수 obj(member)의 id 를 비교
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
