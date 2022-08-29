
package com.Portafolioweb.mgb.entity;

import com.sun.istack.internal.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;





@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    @NotNull
    @Size(min =1,max=50,message="No cumple con la longitud")
    private String nombre;
        @NotNull
    @Size(min =1,max=50,message="No cumple con la longitud")
    private String apellido;

    @Size(min =1,max=50,message="No cumple con la longitud")
    private String img;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Persona orElse(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
