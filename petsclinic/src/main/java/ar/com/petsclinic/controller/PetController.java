package ar.com.petsclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.com.petsclinic.model.Pet;
import ar.com.petsclinic.service.IPetService;

@Controller
public class PetController {
	
	@Autowired
	private IPetService petService;
	
	@RequestMapping(value="/api/pets", method=RequestMethod.GET, headers="Accept=*/*")
	public @ResponseBody List<Pet> pets(){
		List<Pet> pets = petService.getAll();
		return pets;
	}
	
	@RequestMapping(value="/api/pets/{id}", method=RequestMethod.GET, headers="Accept=*/*")
	public @ResponseBody Pet pet(@PathVariable int id){
		return petService.getById(id);
	}
}
