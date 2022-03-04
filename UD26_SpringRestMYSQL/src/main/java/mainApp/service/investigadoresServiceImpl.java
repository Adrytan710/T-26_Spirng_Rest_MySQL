package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IinvestigadoresDAO;
import mainApp.dto.investigadores;

@Service
public class investigadoresServiceImpl implements IinvestigadoresService{

	@Autowired
	IinvestigadoresDAO iinvestigadoresDAO;

	@Override
	public List<investigadores> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iinvestigadoresDAO.findAll();
	}

	@Override
	public investigadores guardarInvestigadores(investigadores investigadores) {
		// TODO Auto-generated method stub
		return iinvestigadoresDAO.save(investigadores);
	}

	@Override
	public investigadores InvestigadoresXID(int id) {
		// TODO Auto-generated method stub
		return iinvestigadoresDAO.findById(id).get();
	}

	@Override
	public investigadores actualizarInvestigadores(investigadores investigadores) {
		// TODO Auto-generated method stub
		return iinvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		// TODO Auto-generated method stub
		iinvestigadoresDAO.deleteById(id);
	}

}
