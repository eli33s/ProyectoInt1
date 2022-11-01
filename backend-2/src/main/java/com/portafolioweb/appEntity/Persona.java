package com.portafolioweb.appEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity


public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	 private Integer id;
	    private String nombre;
	    private String apellido;
	    private String imagen;
	    
	    //Constructors

	    public Persona() {
	    }

	    public Persona(String nombre, String apellido, String imagen) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.imagen = imagen;
	        

}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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
		
		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
	    
}