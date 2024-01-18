package com.itter.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.itter.domain.Alumno;
import com.itter.domain.Contacto;
import com.itter.domain.Domicilio;
import com.itter.servicio.ServicioAlumno;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idAlumnoS = request.getParameter("idAlumno");
		Integer idAlumno = Integer.parseInt(idAlumnoS);
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(idAlumno);
		
		ServicioAlumno servicioAlumno = new ServicioAlumno();
		alumno = servicioAlumno.encontrarAlumno(alumno);
		
		//request.setAttribute("alumno", alumno);
		HttpSession sesion = request.getSession();
		sesion.setAttribute("alumno",alumno);
		
		request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String modificar = request.getParameter("Modificar");
		
		if(modificar != null) {
			//Modificar
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String calle = request.getParameter("calle");
			String noCalle = request.getParameter("noCalle");
			String ciudad = request.getParameter("ciudad");
			String pais = request.getParameter("pais");
			String email = request.getParameter("email");
			String telefono = request.getParameter("telefono");
			
			HttpSession sesion = request.getSession();
			Alumno alumno = (Alumno) sesion.getAttribute("alumno");
			
			alumno.setNombre(nombre);
			alumno.setApellido(apellido);
			alumno.getDomicilio().setCalle(calle);
			alumno.getDomicilio().setNoCalle(noCalle);
			alumno.getDomicilio().setCiudad(ciudad);
			alumno.getDomicilio().setPais(pais);
			alumno.getContacto().setEmail(email);
			alumno.getContacto().setTelefono(telefono);
			
			ServicioAlumno servicioAlumno = new ServicioAlumno();
			servicioAlumno.guardarAlumno(alumno);
			
			sesion.removeAttribute("alumno");
			
		} else {
			//Eliminar
			String idAlumnoS = request.getParameter("idAlumno");
			Integer idAlumno = Integer.parseInt(idAlumnoS);
			Alumno alumno = new Alumno();
			alumno.setIdAlumno(idAlumno);
			
			ServicioAlumno servicioAlumno = new ServicioAlumno();
			alumno = servicioAlumno.encontrarAlumno(alumno);
			
			servicioAlumno.eliminarAlumno(alumno);
		}
		
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
