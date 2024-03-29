//DB connect ver
package com.example.initproject.domain;

//외장 라이브러리 (gradle로 다운로드한 롬북이 외장 라이브러리)
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//import javax.persistence.*;
import java.util.Date;

// 롬북에 있는 Getter라는 메서드를 통해
//하단에 있는 클래스 Board는
//자동으로 getter, setter 메서드가 생성됨을
//암시함 (@어노테이션)
//@Entity
@Getter
@Setter
@ToString
public class Board {

    //식별 필드
    //  @Id
    //  @GeneratedValue
    private Long seq;
    private String title;
    //  @Column(updatable = false)
    private String writer;
    private String content;
    //  @Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
    private Date createDate;
    //  @Column(insertable = false, updatable = false, columnDefinition = "number default 0")
    private long cnt;

    //원래는 setter, getter라는 메서드가 있어야 private 필드값에 데이터를 넣을 수 있지만, 
    //(gradle에서 설치)롬북 이라는 라이브러리로 자동 getter, setter 메서드 생성

//
//package com.example.initproject.domain;
//
//        import lombok.Getter;
//        import lombok.Setter;
//        import lombok.ToString;
//
//        import java.util.Date;
//
//@Getter
//@Setter
//@ToString
//public class Board {
//
//    private Long seq;
//    private String title;
//    private String writer;
//    private String content;
//    private Date createDate;
//    private long cnt;
//}



    }

