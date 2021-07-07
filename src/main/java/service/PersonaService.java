package service;

import model.Persona;

public interface PersonaService {

	boolean agregarContacto(Persona persona);
	Persona buscarPorId(int id);
	Persona buscarPorEmail(String email);
	Persona buscarPorCedula(String cedula);
	boolean eliminarPersona(int id);
	void actualizarPersona(Persona persona);
	
}
