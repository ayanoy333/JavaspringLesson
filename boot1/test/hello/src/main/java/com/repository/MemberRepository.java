package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Member;

public interface MemberRepository extends JpaRepository<Member,Long>{

    void save(java.lang.reflect.Member member);
}
