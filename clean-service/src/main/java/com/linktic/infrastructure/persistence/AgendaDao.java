package com.linktic.infrastructure.persistence;

import java.util.List;

import com.linktic.domain.model.Contacto;

public interface AgendaDao {
	void agregarContacto(Contacto contacto);

	Contacto recuperarContacto(String email);

	void eliminarContacto(String email);

	List<Contacto> devolverContactos();

	void eliminarContacto(int idContacto);

	Contacto recuperarContacto(int idContacto);

	void actualizarContacto(Contacto contacto);
}
