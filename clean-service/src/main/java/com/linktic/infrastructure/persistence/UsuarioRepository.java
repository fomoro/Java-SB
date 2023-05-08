package com.linktic.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linktic.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {
}
