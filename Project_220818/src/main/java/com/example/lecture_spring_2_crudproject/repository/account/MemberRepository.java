package com.example.lecture_spring_2_crudproject.repository.account;


import com.example.lecture_spring_2_crudproject.entity.account.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//MemberRepository는 CrudRepository를 상속받아 기능을 온전히 씀
//CrudRepository : JPA를 통해 DB에 기본적인 SQL문을 통해 소통 (INSERT INTO, SELECT, UPDATE, DELETE)
public interface MemberRepository extends JpaRepository<Member, Long> {

//    List<Member> findByIdOrEmail(String email);

    //Return 내용선언, Find~변수명에 맞춰서 메서드 생성, 필요한 매개변수
    @Query(value = "select m from Member m where m.email = :email_1 or m.id = :id_1")
    List<Member> findMemberByEmailOrId(String email_1, String id_1);

    //(ID는 중복가능한 구조에서)Id값을 매개변수로 넣고, 아이디 생성날짜가 가장 최신인 것
    @Query(value = "select m from Member m where m.id = :id_1 order by m.createDate DESC")
    Member findFirstById(String id_1);
}
