package dao;

import java.util.List;

import model.Persona;

public interface PersonasDao {


		void gregarPersona(Persona persona);
		Persona obtenerPersona(int Idpersona);
		Persona obtenerPersona(String cedula);
		Persona obtenerPersonaEmail(String email);
		void borrarPersona(int Idpersona);
		List<Persona> obtenerPersonas();
		void actualizarPersona(Persona persona);
}
