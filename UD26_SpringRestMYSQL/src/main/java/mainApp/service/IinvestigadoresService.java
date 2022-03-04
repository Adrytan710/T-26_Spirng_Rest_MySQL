package mainApp.service;

import java.util.List;

import mainApp.dto.investigadores;

public interface IinvestigadoresService {
	public List<investigadores> listarInvestigadores();

	public investigadores guardarInvestigadores(investigadores investigadores);

	public investigadores InvestigadoresXID(int id);

	public investigadores actualizarInvestigadores(investigadores investigadores);

	public void eliminarInvestigadores(int id);
}
