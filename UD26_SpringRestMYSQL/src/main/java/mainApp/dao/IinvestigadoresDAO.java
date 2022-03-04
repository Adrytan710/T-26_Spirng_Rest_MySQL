package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.investigadores;

public interface IinvestigadoresDAO extends JpaRepository<investigadores, Integer> {

}
