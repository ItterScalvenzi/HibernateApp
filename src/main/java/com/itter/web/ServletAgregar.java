package com.itter.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.itter.domain.Alumno;
import com.itter.domain.Contacto;
import com.itter.domain.Domicilio;
import com.itter.servicio.ServicioAlumno;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String calle = request.getParameter("calle");
		String noCalle = request.getParameter("noCalle");
		String ciudad = request.getParameter("ciudad");
		String pais = request.getParameter("pais");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle(calle);
		domicilio.setNoCalle(noCalle);
		domicilio.setCiudad(ciudad);
		domicilio.setPais(pais);
		
		Contacto contacto = new Contacto();
		contacto.setEmail(email);
		contacto.setTelefono(telefono);
		
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setDomicilio(domicilio);
		alumno.setContacto(contacto);
		
		ServicioAlumno servicioAlumno = new ServicioAlumno();
		servicioAlumno.guardarAlumno(alumno);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
