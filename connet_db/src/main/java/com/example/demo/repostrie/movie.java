package com.example.demo.repostrie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movie extends JpaRepository<movie,Integer>{

	
}
