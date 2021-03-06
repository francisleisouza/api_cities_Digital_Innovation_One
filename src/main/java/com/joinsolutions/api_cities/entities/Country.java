package com.joinsolutions.api_cities.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name = "pais")
public class Country  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(name = "nome")	
	@NotNull
	private String name;	
	
	@Column(name = "nome_pt")	
	@NotNull
	private String portugueseName;	
	
	@NotNull
	private String sigla;	
	
	@Column(name = "bacen")	
	@NotNull
	private Integer codeBacen;
	
	
	public Country() {
		
	}
	
	public Country(Long id,  String name,  String portugueseName,  String sigla,
			 Integer codeBacen) {		
		this.id = id;
		this.name = name;
		this.portugueseName = portugueseName;
		this.sigla = sigla;
		this.codeBacen = codeBacen;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortugueseName() {
		return portugueseName;
	}

	public void setPortugueseName(String portugueseName) {
		this.portugueseName = portugueseName;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Integer getCodeBacen() {
		return codeBacen;
	}

	public void setCodeBacen(Integer codeBacen) {
		this.codeBacen = codeBacen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
