package KeyExample;

import java.util.HashMap;

public class KeyExample {
    //public :접근제한자 모두다 접근가능
    //static :프로그램이 실행 되는 시점에서 1개만 만들어진 인스턴스
    //void :return 없음
    //(String[] args) :매개변수를 String 배열로 받음
    public static void main(String[] args) {
        //HashMap 타입으로 선언하되 안에 값은 Key 라는 객체와 String 문자열을 넣음
        //=New HashMap<Key, String> : Heap 메모리에 인스턴스 만들기
        //HashMap<String, String> key 위치는 String, Value 위치는 String
        //HashMap 특징 : Key 값은 중복 안됌
        //Key 값을 "김준석", Value "오전수업"
        //Key 값을 "김준석", Value "오후수업"
        //"김준석"을 검색하면 "오후수업" 이 뜸

        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성

        HashMap<Key, String> hashMap = new HashMap<Key, String>();
         //Key 라는 객체타입으로 testKey 라는 변수명으로 타입 선언
        //=new Key(23) ; = heap 메모리에서 Key 라는 인스턴스를 생성(단,인자값 23 남음)
        //생성자(매개변수23) 인 실행

        //식별키 "new Key(1)" 로 "홍길동"을 저장
        hashMap.put(new Key(1), "홍길동");

        //식별키 "new Key(1)" 로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);



        //
    }

}
