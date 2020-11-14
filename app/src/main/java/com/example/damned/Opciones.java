package com.example.damned;
/**Clase que define los elementos de los botones que se van a mostrar en la activity.
 * Los atributos son los siguientes:
 *  -   String textoOpcion  -   El texto que se va a mostrar en el boton.
 *  -   int codigoPantallaReferenciada  -  El codigo de la pantalla a la que se pasara al pulsar este boton.
 *
 *      Los metodos de Opciones agrupan los Getters y Setters de sus atributos y un constructor en el que
 *      se piden los dos atributos.*/
public class Opciones
{
    String textoOpcion;
    int codigoPantallaReferenciada;

    public Opciones
                (
                        String textoOpcion,
                        int codigoPantallaReferenciada
                )
                {
                        this.textoOpcion = textoOpcion;
                        this.codigoPantallaReferenciada = codigoPantallaReferenciada;
                }

    public String getTextoOpcion() {
        return textoOpcion;
    }

    public void setTextoOpcion(String textoOpcion) {
        this.textoOpcion = textoOpcion;
    }

    public int getCodigoPantallaReferenciada() {
        return codigoPantallaReferenciada;
    }

    public void setCodigoPantallaReferenciada(int codigoPantallaReferenciada) {
        this.codigoPantallaReferenciada = codigoPantallaReferenciada;
    }
}
