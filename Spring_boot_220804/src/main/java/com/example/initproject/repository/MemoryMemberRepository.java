//package com.example.initproject.repository;
//
//import com.example.initproject.domain.Member;
//
//import java.util.*;
//
//public class MemoryMemberRepository implements MemberRepository{
//
//    //동시성 문제가 생길 수 있어서 공유된 변수에는  컨커러해쉬맵
//    private static Map<Long, Member> store = new HashMap<>();
//    //시퀀스는 0,1,2.. key값을 생성
//    //동시성 문제로 어텀 롱 쓰임
//    private static long sequence = 0L;
//
//    @Override
//    public Member save(Member member) {
//        member.setId(++sequence);
//        store.put(member.getId(), member);
//        return member;
//    }
//
//    @Override
//    public Optional<Member> findById(Long id) {
//    //ofNullable null이라도 객체를 감쌀 수 있음
//        return Optional.ofNullable(store.get(id));
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
//    //getId가 같은 경우에만 필터링
//        //람다
//    //findAny 하나라도 찾기
//        return store.values().stream().filter(member -> member.getName().equals(name)).findAny();
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return new ArrayList<>(store.values());
//    }
//}
