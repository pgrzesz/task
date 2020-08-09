package com.example.task.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBaseValueRepository extends JpaRepository<DataBaseValue, Long> {

}
