package com.app.web.models.dao;

import java.util.List;
import com.app.web.models.entity.Usuario;

public interface IUsuarioDao {

	public List<Usuario> findAll(); 
}
