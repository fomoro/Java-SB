package com.linktic.application.features;

import java.util.List;

import com.linktic.domain.model.Contacto;

public interface ContactoService {
	boolean agregarContacto(Contacto contacto);

	List<Contacto> recuperarContactos();

	void actualizarContacto(Contacto contacto);

	boolean eliminarContacto(int idContacto);

	Contacto buscarContacto(int idContacto);
}
