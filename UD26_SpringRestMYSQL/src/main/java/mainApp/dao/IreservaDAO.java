package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.reserva;

public interface IreservaDAO extends JpaRepository<reserva, Integer> {

}
