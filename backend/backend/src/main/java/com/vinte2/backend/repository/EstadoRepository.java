package com.vinte2.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinte2.backend.entity.Estado;

public interface EstadoRepository extends JpaRepository <Estado, Long>  {
    
}
