package ar.com.petsclinic.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import ar.com.petsclinic.dao.IPetRepository;
import ar.com.petsclinic.model.Pet;

public class PetRepository implements IPetRepository {

	@Autowired(required=true)
	private HibernateTemplate hibernateTemplate;
	
	public List<Pet> getPets() {
		return hibernateTemplate.loadAll(Pet.class);
	}

	public Pet findById(Integer id) {
		return hibernateTemplate.get(Pet.class, id);
	}
}
