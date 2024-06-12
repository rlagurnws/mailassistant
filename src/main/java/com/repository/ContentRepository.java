package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer>{

}
