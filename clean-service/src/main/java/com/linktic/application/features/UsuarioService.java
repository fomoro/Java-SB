package com.linktic.application.features;

import java.util.List;

import com.linktic.domain.model.Usuario;

public interface UsuarioService {

    Usuario saveUsuario(Usuario usuario);

    List<Usuario> getAllUsuarios();

    Usuario getUsuario(String usuarioId);
}
