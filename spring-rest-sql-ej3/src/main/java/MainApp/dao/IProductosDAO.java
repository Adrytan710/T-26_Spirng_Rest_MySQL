package MainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MainApp.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer> {

}