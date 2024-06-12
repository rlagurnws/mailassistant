package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Mail;

@Repository
public interface MailRepository extends JpaRepository<Mail, Integer>{

}
