package MainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MainApp.dto.Cajeros;

public interface ICajerosDAO extends JpaRepository<Cajeros, Integer> {

}