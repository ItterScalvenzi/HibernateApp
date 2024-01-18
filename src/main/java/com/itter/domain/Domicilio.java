package com.itter.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
public class Domicilio implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id_domicilio")
	private Integer idDomicilio;
	
	private String calle;
	
	@Column(name = "no_calle")
	private String noCalle;
	
	private String ciudad;
	
	private String pais;
	
	public Domicilio() {
		
	}
	
	public Domicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNoCalle() {
		return noCalle;
	}

	public void setNoCalle(String noCalle) {
		this.noCalle = noCalle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", calle=" + calle + ", noCalle=" + noCalle + ", ciudad="
				+ ciudad + ", pais=" + pais + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDomicilio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio other = (Domicilio) obj;
		return Objects.equals(idDomicilio, other.idDomicilio);
	}
	
	
}
