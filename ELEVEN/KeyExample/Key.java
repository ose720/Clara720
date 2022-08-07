package KeyExample;

public class Key {
    //Key 라는 클래스 (껍데기, 설계도) (heap 메모리에 없음)

    public int number;
    public Key(int number) {
        //this(제일 가까운 객체인 Key 라는 class 를 가르킴)
        //this.number >> Key 라는 클래스의 number 라는 필드값을 가르킴
        //= number >>매개변수 number 가 this.number 에 할당
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }

    //홍길동의 key 와 다르다로 인식 (hashcode()) 기반으로 구분 = HashMap 의 자료저장 구조
    //new Key(1) 이라고 get() 에 매개변수를 넣으면
    //hashMap.get() 메서드의 비교방식
    //json 포맷으로 인터넷 통신을 주로 합니다 (key, value)
    //hashMap.get() :인자값(key)을 넣어서 key 와 함께 넣은 value 반환
    //hashMap() 에는 put() : hashmap 에 데이터 넣기
    //hashcode() 메서드는 equals() 메서드랑 동일하게 Object 클래스(최상위 부모클래스)의 메서드

}
