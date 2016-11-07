package ar.com.petsclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.petsclinic.model.Pet;

@Service
public interface IPetService {
	List<Pet> getAll();
	Pet getById(int id);
}
