package MainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MainApp.dto.Ventas;

public interface IVentasDAO extends JpaRepository<Ventas, Integer>{

}
