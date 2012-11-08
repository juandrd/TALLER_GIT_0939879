/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Juan
 */
public class Pasajero {
    String identificacion, nombres, apellidos, telefono, direccion, genero, email;
    
    public Pasajero(String identificacion, String nombres, String apellidos,
            String telefono, String direccion, String genero, String email){
        this.identificacion=identificacion;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.direccion=direccion;
        this.genero=genero;
        this.email=email;
    }
    
    public Pasajero(){}

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEmail() {
        return email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }
    
        
    public String getNombres() {
        return nombres;
    }
}
