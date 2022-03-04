package ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ejercicio1.dto.Piezas;


public interface IPiezasDAO extends JpaRepository<Piezas, Long> {

}