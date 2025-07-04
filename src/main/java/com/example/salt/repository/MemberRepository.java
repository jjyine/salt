package com.example.salt.repository;

import com.example.salt.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    boolean existsByUsername(String username);

    Optional<MemberEntity> findByUsername(String username);
//    boolean findByUsername(String username);
}
