package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
