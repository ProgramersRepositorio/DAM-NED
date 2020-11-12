package com.example.damned;
/**ESTA ES LA CLASE EN LA QUE SE VA A ESCRIBIR LA HISTORIA
 *
 * LITERALMENTE
 *
 * Tiene un atributo que es un array de Pantallas con un getter (pero no un setter por que la historia
 * se escribe desde aqui y desde ningun otro lado)
 *
 * El array se instancia con el metodo relacionPantallas, que es basicamente una lista de Pantallas en
 * las que vamos modificando los constructores para establecer los elementos de las pantallas.
 *
 * Para escribir una nueva Pantalla, copiar y pegar una de las ya echas o hacerlo a mano, pero tener
 * cuidado de seguir el orden en el que se establecen los atributos. Si en vez de escribir primero
 * codigoPantalla y luego tipoActivity se hace al reves va a petar, o como minimo, funcionar mal.
 *
 * rutaImagen esta en todas en null. Cuando probemos a meter imagenes, habra que hacerlo por ahi.
 *
 * IMPORTANTE
 *
 * Aunque todas las pantallas se instancian igual, hay que fijarse en los atributos Opciones.
 * Si el tipoActivity es 1, quiere decir que es la pantalla de 1 boton, por lo que solo hay que instanciar
 * un Opciones. Si es tipoActivity = 2, habra que instanciar 2. Siempre el mismo numero de Opciones que el
 * tipoActivity.
 *
 * Tambien importante, si haceis una pantalla nueva, ponerle el codigoPantalla un numero superior que el anterior,
 * vamos, que si la anterior es la 16 poner 17, por que si no va a petar y ademas tiene que coincidir el codigoPantalla
 * con la posicion del array para que vaya.
 *
 * Para hacer llamadas de un boton a una pantalla, en codigoPantallaReferenciada del Opciones en cuestion teneis
 * que poner el codigo de la pantalla a la que quereis llamar, es tan facil como mirar que codigo tiene en la lista
 * guiandose por el texto.*/
public class Historia
{
    private Pantalla[] listaPantallas = relacionPantallas();

    private Pantalla[] relacionPantallas()
    {
        Pantalla[] pantallas =
        {
            new Pantalla(
                    0,
                    3,
                    "Te despiertas en una habitacion oscura",
                    null,
                    new Opciones(
                            "Buscas una luz",
                            1
                    ),
                    new Opciones(
                            "Buscas una ventana",
                            2
                    )
            ),
                    new Pantalla(
                            1,
                            2,
                            "Palpas la pared y te encuentras con un interruptor. Lo enciendes",
                            null,
                            new Opciones(
                                    "Inspeccionas la habitacion",
                                    3
                            ),
                            new Opciones(
                                    "Buscas una salida",
                                    3
                            )
                    ),
                    new Pantalla(
                            2,
                            2,
                            "No encuentras una ventana",
                            null,
                            new Opciones(
                                    "Buscas una luz",
                                    1
                            ),
                            new Opciones(
                                    "Buscas una salida",
                                    4
                            )
                    ),
                    new Pantalla(
                            3,
                            1,
                            "Entra Mercedes y palmas",
                            null,
                            new Opciones(
                                    "Volver a intentarlo",
                                    0
                            )
                    ),
                    new Pantalla(
                            4,
                            3,
                            "Probando Activity de 3 opciones",
                            null,
                            new Opciones(
                                    "Ir a activity de 1",
                                    3
                            ),
                            new Opciones(
                                    "Ir a activity de 2",
                                    0
                            ),
                            new Opciones(
                                    "Ir a esta misma que es de 3",
                                    4
                            )
                    )
        };

        return pantallas;
    };

    public Pantalla[] getListaPantallas() {
        return listaPantallas;
    }
}
