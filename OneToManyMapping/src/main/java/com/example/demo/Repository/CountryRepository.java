package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
