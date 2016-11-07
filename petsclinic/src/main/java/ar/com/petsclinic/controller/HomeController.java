package ar.com.petsclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.petsclinic.model.Pet;
import ar.com.petsclinic.service.IPetService;

@Controller
public class HomeController {
	
	@Autowired
	private IPetService petService;
	
	@RequestMapping(value="/")
	public String home(Model model){
		List<Pet> pets = petService.getAll();
		model.addAttribute("pets", pets);
		return "home";
	}
	
	@RequestMapping(value="/about")
	public String about(){
		return "about";
	}
}
