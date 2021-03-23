package com.devnildoweb.desafioriach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnildoweb.desafioriach.entities.User;



public interface UserRepository extends JpaRepository<User, Long>{

}
