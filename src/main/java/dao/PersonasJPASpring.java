package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Persona;

public interface PersonasJPASpring extends JpaRepository<Persona, Integer> {

    Persona findByEmail(String email);
    
    Persona findByCedula(String cedula);
	
	
}
