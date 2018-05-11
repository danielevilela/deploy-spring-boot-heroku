package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Guest;
import com.example.demo.model.iGuest;


@Controller
@RequestMapping("/guests")
public class GuestsControler {
	
	@Autowired
	private iGuest guests;

	@GetMapping
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("GuestList");
		modelAndView.addObject("guests",guests.findAll());
		modelAndView.addObject(new Guest());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Guest guest) {
		this.guests.save(guest); 
		return "redirect:/guests";
	}
	
	@DeleteMapping
	public String delete(Guest guest) {
		this.guests.delete(guest); 
		return "redirect:/guests";
	}
}
