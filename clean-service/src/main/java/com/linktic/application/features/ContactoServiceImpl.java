package com.linktic.application.features;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linktic.domain.model.Contacto;
import com.linktic.infrastructure.persistence.AgendaDao;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	AgendaDao dao;

	@Override
	public boolean agregarContacto(Contacto contacto) {
		// a�ade el contacto si no existe
		if (dao.recuperarContacto(contacto.getIdContacto()) == null) {
			dao.agregarContacto(contacto);
			return true;
		}
		return false;
	}

	@Override
	public List<Contacto> recuperarContactos() {
		return dao.devolverContactos();
	}

	@Override
	public void actualizarContacto(Contacto contacto) {
		// elimina el contacto si existe
		if (dao.recuperarContacto(contacto.getIdContacto()) != null) {
			dao.actualizarContacto(contacto);
		}

	}

	@Override
	public boolean eliminarContacto(int idContacto) {
		if (dao.recuperarContacto(idContacto) != null) {
			dao.eliminarContacto(idContacto);
			return true;
		}
		return false;
	}

	@Override
	public Contacto buscarContacto(int idContacto) {
		return dao.recuperarContacto(idContacto);
	}

}
