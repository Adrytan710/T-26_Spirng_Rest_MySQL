package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.equipos;

public interface IequiposDAO extends JpaRepository<equipos, Integer>{

}