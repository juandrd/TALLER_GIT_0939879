/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author cdariolo
 */
public class Bus {

    String placa, marca, numChasis, tipo, numAsientos, capacidad;
    Ruta ruta;

    public Bus(String placa, String marca, String numChasis, String tipo, String numAsientos,
            String capacidad,
            Ruta ruta) {
        this.placa = placa;
        this.marca = marca;
        this.numChasis = numChasis;
        this.tipo = tipo;
        this.numAsientos = numAsientos;
        this.capacidad = capacidad;
        this.ruta = ruta;

    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumAsientos() {
        return numAsientos;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public String getPlaca() {
        return placa;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumAsientos(String numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
