package com.app.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.web.models.dao.IUsuarioDao;

@Controller
public class UsuarioController {

    @Autowired
    @Qualifier("usuarioDaoJPA")
    private IUsuarioDao usuarioDao;

    @GetMapping("/usuarios/listar") // Ruta más específica
    public String listar(Model model) {
        try {
            model.addAttribute("titulo", "Listado de usuarios");
            model.addAttribute("usuarios", usuarioDao.findAll());
        } catch (Exception e) {
            // Manejo de excepciones: podrías agregar un mensaje de error al modelo si es necesario
            model.addAttribute("error", "Ocurrió un error al obtener la lista de usuarios");
        }
        
        return "listar";
    }
}