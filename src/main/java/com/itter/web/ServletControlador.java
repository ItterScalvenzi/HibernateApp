package com.itter.web;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.itter.domain.Alumno;
import com.itter.servicio.ServicioAlumno;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		ServicioAlumno servicioAlumno = new ServicioAlumno();
		
		List<Alumno> alumnos = servicioAlumno.listarAlumnos();
		
		request.setAttribute("alumnos", alumnos);
		
		try {
			request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
		} catch (Exception e) {
			
			e.printStackTrace(System.out);
		} 
	}
}
