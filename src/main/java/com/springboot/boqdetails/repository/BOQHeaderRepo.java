package com.springboot.boqdetails.repository;

import com.springboot.boqdetails.entity.BOQHeaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BOQHeaderRepo extends JpaRepository<BOQHeaderEntity,String> {

    Optional<BOQHeaderEntity> findByboqHeaderId(String boqHeaderId);
}
