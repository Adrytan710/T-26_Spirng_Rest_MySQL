package ejercicio1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicio1.dto.*;

public interface ISuministraDAO extends JpaRepository<Suministra, Integer> {
	
	public List<Suministra> findByPieza(Piezas pieza);
	public List<Suministra> findByProveedor(Proveedores proveedor);

}