package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Proyecto;

public interface IProyectoDao  extends JpaRepository<Proyecto,Long> {

}
