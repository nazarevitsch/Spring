package com.bida.springHomeWork.demo.repository;

import com.bida.springHomeWork.demo.domain.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {
}
