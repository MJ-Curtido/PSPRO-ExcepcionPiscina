/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.excepcionPiscina.clases;

/**
 *
 * @author manu1
 */
public class Piscina {

    private int nivel;
    public final int MAX_NIVEL;

    public Piscina(int max) {
        if (max < 0) {
            max = 0;
        }
        MAX_NIVEL = max;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void vaciar(int cantidad) throws Excepcion{
        if (this.nivel - cantidad < 0) {
            throw new Excepcion("No queda agua suficiente\nSe queda con " + this.nivel);
        } else {
            this.nivel = this.nivel - cantidad;
        }
    }

    public void llenar(int cantidad) throws Excepcion{
        if (this.nivel + cantidad > MAX_NIVEL) {
            throw new Excepcion("Se desborda con tanta agua\nSe queda con " + this.nivel);
        } else {
            this.nivel = this.nivel + cantidad;
        }
    }
}