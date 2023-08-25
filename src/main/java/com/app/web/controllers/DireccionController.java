package com.app.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.web.models.dao.IDireccionDao;

@Controller
public class DireccionController {

	@Autowired
	@Qualifier("direccionDaoJPA")
	private IDireccionDao direccionDao;
	
	@RequestMapping(value = "listar", method=RequestMethod.GET)
	public String listar (Model model) {
		
		model.addAttribute("titulo", "listado de usuarios");
		model.addAttribute("direccion", direccionDao.findAll());
		
		return "listar";
	}
}