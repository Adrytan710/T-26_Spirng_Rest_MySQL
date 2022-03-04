package ejercicio1.service;

import java.util.List;

import ejercicio1.dto.Proveedores;

public interface IProveedoresService {
	
	public List<Proveedores> listarProveedores();

	public Proveedores guardarProveedores(Proveedores proveedor);

	public Proveedores proveedoresXID(String id);

	public Proveedores actualizarProveedores(Proveedores proveedor);

	public void eliminarProveedores(String id);
}
