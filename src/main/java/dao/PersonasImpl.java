package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Persona;

@Repository
public class PersonasImpl implements PersonasDao {

	@Autowired
	PersonasJPASpring repo;
	
	@Override
	public void gregarPersona(Persona persona) {
		repo.save(persona);
	}

	@Override
	public Persona obtenerPersona(int Idpersona) {
		return repo.findById(Idpersona).orElse(null);
	}

	@Override
	public Persona obtenerPersona(String cedula) {
		
		return repo.findByCedula(cedula);
	}

	@Override
	public Persona obtenerPersonaEmail(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public void borrarPersona(int Idpersona) {
		repo.deleteById(Idpersona);
			
	}

	@Override
	public List<Persona> obtenerPersonas() {
		
		return repo.findAll();
	}

	@Override
	public void actualizarPersona(Persona persona) {
	
		repo.save(persona);
	}

}
