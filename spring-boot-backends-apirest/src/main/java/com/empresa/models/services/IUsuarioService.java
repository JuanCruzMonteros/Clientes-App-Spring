package com.empresa.models.services;

import com.empresa.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
