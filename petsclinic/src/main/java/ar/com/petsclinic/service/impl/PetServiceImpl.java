package ar.com.petsclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.petsclinic.dao.IPetRepository;
import ar.com.petsclinic.model.Pet;
import ar.com.petsclinic.service.IPetService;

public class PetServiceImpl implements IPetService{

	@Autowired
	private IPetRepository petRepository;
	
	public List<Pet> getAll() {
		return petRepository.getPets();
	}

	public Pet getById(int id) {
		return petRepository.findById(id);
	}

}
