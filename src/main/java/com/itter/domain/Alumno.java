package com.itter.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private Integer idAlumno;
	
	private String nombre;
	
	private String apellido;
	
	@JoinColumn(name = "id_domicilio", referencedColumnName = "id_domicilio")
	@ManyToOne(cascade= CascadeType.ALL)
	private Domicilio domicilio;
	
	@JoinColumn(name = "id_contacto", referencedColumnName = "id_contacto")
	@ManyToOne(cascade= CascadeType.ALL)
	private Contacto contacto;
	
	@OneToMany(mappedBy = "alumno", cascade=CascadeType.REMOVE)
	private List<Asignacion> asignaciones;
	
	public Alumno() {
		
	}
	
	public Alumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	
	

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio="
				+ domicilio + ", contacto=" + contacto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAlumno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(idAlumno, other.idAlumno);
	}
	
	
}
