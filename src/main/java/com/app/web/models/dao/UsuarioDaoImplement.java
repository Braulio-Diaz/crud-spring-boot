package com.app.web.models.dao;

import java.util.List;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.web.models.entity.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository("usuarioDaoJPA")
public class UsuarioDaoImplement implements IUsuarioDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressAjWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Usuario").getResultList();
	}

}
