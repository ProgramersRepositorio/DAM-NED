package com.example.damned;

import android.widget.ImageView;

/**Clase que define los elementos de la pantalla que se van a mostrar en la activity.
 * Los atributos son los siguientes:
 *  -   int codigoPantalla  -   Define el identificador de la pantalla y la posicion que debe ocupar en el array
 *  -   int tipoActivity  -   El tipo de activity en la que debe ir.
 *                             Se contemplan los siguientes valores:
 *                              -   1   -   Activity_1_boton
 *                              -   2   -   Activity_2_botones
 *                              -   3   -   Activity_3_botones
 *
 *  -   String textoPantalla  -   El texto que se va a mostrar en el TextView
 *  -   String rutaImagen   -   La URL en la que esta alojada la imagen de fondo
 *  -   Opciones opcion1  -  Instancia de la clase Opciones correspondiente al boton1 de las activitys.
 *  -   Opciones opcion2  -  Instancia de la clase Opciones correspondiente al boton2 de las activitys.
 *  -   Opciones opcion2  -  Instancia de la clase Opciones correspondiente al boton2 de las activitys.
 *      (Las Opciones no siempre se van a definir, pues depende de si la Activity en la que se va a
 *      mostrar la Pantalla va a tener 1, 2, o 3 botones, esa sera la cantidad de Opciones que se
 *      declaren a la hora de construir la clase.
 *
 *      Los metodos de Pantalla agrupan los Getters y Setters de sus atributos y tres constructores distintos,
 *      uno que pide por parametro 1 boton de Opciones, otro para 2 y el ultimo pide los 3 atributos Opciones.
 *
 *  ==PANTALLAS DE MUERTE==
 *  Hay dos pantallas de muerte:
 *   - una es la típica activity de dos botón con texto (tipoActivity 2): un botón para voler al principio
 *  del juego u otra pantalla X, y otro para finalizar y salir.
 *   - la otra es una activity (activity -1) que no tiene el marco decorativo del resto de las pantallas, sino
 *  que tiene el fondo negro, una imagen que representa un tipo de final al juego, un texto, y los dos botones
 *  para ir al inicio, o a donde sea, o salir.*/
public class Pantalla
{
    private int codigoPantalla;
    private int tipoActivity;
    private String textoPantalla;
    private String rutaImagen;
    Opciones opcion1;
    Opciones opcion2;
    Opciones opcion3;
    private int urimagen;
    private int uriSonido;

    public Pantalla(        //Constructor Pantalla 1 boton
            int codigoPantalla,
            int tipoActivity, //0 = sin botones, 1 = 1 boton, 2 = 2 botones, 3 = 3 botones
            String textoPantalla,
            String rutaImagen,
            Opciones opcion1
    ){
            this.codigoPantalla = codigoPantalla;
            this.tipoActivity = tipoActivity;
            this.textoPantalla = textoPantalla;
            this.rutaImagen = rutaImagen;
            this.opcion1 = opcion1;
    }
    public Pantalla(        //Constructor Pantalla 2 botones
            int codigoPantalla,
            int tipoActivity, //0 = sin botones, 1 = 1 boton, 2 = 2 botones, 3 = 3 botones
            String textoPantalla,
            String rutaImagen,
            Opciones opcion1,
            Opciones opcion2
    ){
        this.codigoPantalla = codigoPantalla;
        this.tipoActivity = tipoActivity;
        this.textoPantalla = textoPantalla;
        this.rutaImagen = rutaImagen;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
    }

    public Pantalla(        //Constructor Pantalla de muerte con 2 botones texto y una imagen
            int codigoPantalla,
            int tipoActivity,
            String textoPantalla,
            Opciones opcion1,
            Opciones opcion2,
            int urimagen,
            int uriSonido
    ){
        this.codigoPantalla = codigoPantalla;
        this.tipoActivity = tipoActivity;
        this.textoPantalla = textoPantalla;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.urimagen= urimagen;
        this.uriSonido= uriSonido;
    }

    public Pantalla(        //Constructor Pantalla 3 botones
            int codigoPantalla,
            int tipoActivity, //0 = sin botones, 1 = 1 boton, 2 = 2 botones, 3 = 3 botones
            String textoPantalla,
            String rutaImagen,
            Opciones opcion1,
            Opciones opcion2,
            Opciones opcion3
    ){
        this.codigoPantalla = codigoPantalla;
        this.tipoActivity = tipoActivity;
        this.textoPantalla = textoPantalla;
        this.rutaImagen = rutaImagen;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
    }


    public int getCodigoPantalla()
    {
        return codigoPantalla;
    }
    public void setCodigoPantalla(int codigoPantalla)
    {
        this.codigoPantalla = codigoPantalla;
    }

    public int getTipoActivity() {return tipoActivity; }
    public void setTipoActivity(int tipoActivity) {this.tipoActivity = tipoActivity; }

    public String getTextoPantalla() {return textoPantalla; }
    public void setTextoPantalla(String textoPantalla) {
        this.textoPantalla = textoPantalla;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Opciones getOpcion1() {
        return opcion1;
    }
    public void setOpcion1(Opciones opcion1) {
        this.opcion1 = opcion1;
    }

    public Opciones getOpcion2() {
        return opcion2;
    }
    public void setOpcion2(Opciones opcion2) {
        this.opcion2 = opcion2;
    }

    public Opciones getOpcion3() {
        return opcion3;
    }
    public void setOpcion3(Opciones opcion3) {
        this.opcion3 = opcion3;
    }

    public int getUrimagen() {return urimagen; }
    public void setUrimagen(int urimagen) {this.urimagen = urimagen; }

    public int getUriSonido() {return uriSonido; }
    public void setUriSonido(int uriSonido) {this.uriSonido = uriSonido; }

}
