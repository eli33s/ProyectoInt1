package com.portafolioweb.appEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombreEduc;
    private String fechaInicio;
    private String fechaFinal;
    private String descEduc;
    public Educacion() {
    }

    public Educacion(String nombreEduc, String fechaInicio, String fechaFinal, String descEduc) {
        this.nombreEduc = nombreEduc;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.descEduc = descEduc;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreEduc() {
		return nombreEduc;
	}

	public void setNombreEduc(String nombreEduc) {
		this.nombreEduc = nombreEduc;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getDescEduc() {
		return descEduc;
	}

	public void setDescEduc(String descEduc) {
		this.descEduc = descEduc;
	}
    

}
