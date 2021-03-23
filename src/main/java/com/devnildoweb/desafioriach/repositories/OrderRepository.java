package com.devnildoweb.desafioriach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnildoweb.desafioriach.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}