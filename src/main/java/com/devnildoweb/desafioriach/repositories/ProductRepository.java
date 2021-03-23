package com.devnildoweb.desafioriach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnildoweb.desafioriach.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{

}