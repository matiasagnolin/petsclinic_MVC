package ar.com.petsclinic.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import ar.com.petsclinic.model.Pet;

@Repository
public interface IPetRepository{
	List<Pet> getPets();
	Pet findById(Integer id);
}