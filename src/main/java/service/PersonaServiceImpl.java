package service;

import org.springframework.stereotype.Service;

import model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Override
	public boolean agregarContacto(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPersona(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

}
