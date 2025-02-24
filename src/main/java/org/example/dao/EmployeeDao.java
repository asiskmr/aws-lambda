package org.example.dao;

import org.example.dto.EmployeeVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeDao extends JpaRepository<EmployeeVo, Integer> {

//    List<EmployeeVo> findAll();
//
//    Optional<EmployeeVo> findById(Integer id);
}
