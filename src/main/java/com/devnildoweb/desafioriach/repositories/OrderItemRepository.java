package com.devnildoweb.desafioriach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnildoweb.desafioriach.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
