package com.bbps.repository;

import com.bbps.entity.BillerConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BillerRepo extends JpaRepository<BillerConfigEntity,Long> {

    Optional< BillerConfigEntity> findById(Long id);

}

