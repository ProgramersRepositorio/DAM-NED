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
                    "Te despiertas en una habitación vacia. Tu cuerpo está dolorido y notas un fuerte dolor de cabeza" +
                            " que casi no te deja pensar. No recuerdas donde estás ni por qué estás ahí...",
                    null,
                    new Opciones(
                            "Compruebas que estás bien",
                            1
                    ),
                    new Opciones(
                            "Buscas una salida",
                            3
                    ),
                new Opciones(
                        "Investigas la habitación",
                        2
                )
            ),
                    new Pantalla(
                            1,
                            2,
                            "Te ves semidesnudo. Tu ropa está destrozada y cubierta de sangre. En ese momento, notas " +
                                    "dolor en tu brazo y te das cuenta de que tienes una herida que no recuerdas haberte echo.",
                            null,
                            new Opciones(
                                    "Buscas una salida",
                                    3
                            ),
                            new Opciones(
                                    "Investigas la habitación",
                                    2
                            )
                    ),
                    new Pantalla(
                            2,
                            1,
                            "Ves la habitación destrozada. No sabes donde te encuentras, pero lo que está claro es" +
                                    "que no ha estado habitada en mucho tiempo.",
                            null,
                            new Opciones(
                                    "Buscas una salida",
                                    3
                            )
                    ),
                    new Pantalla(
                            3,
                            3,
                            "Encuentras una puerta y al salir te ves en medio de un largo pasillo. Esta oscuro, y la única " +
                                    "luz que te permite distinguir algo se cuela a través de un par de ventanas en un lateral.",
                            null,
                            new Opciones(
                                    "Miras por la ventana",
                                    4
                            ),
                            new Opciones(
                                    "Exploras el pasillo --INACABADO--",
                                    0
                            ),
                            new Opciones(
                                    "¨Hola! Hay alguien ahí?¨",
                                    5
                            )
                    ),
                    new Pantalla(
                            4,
                            2,
                            "Al asomarte te das cuenta de que estas en un edificio grande. Por lo menos, la vista corresponde " +
                                    "a un tercer piso. La luz de una luna llena en un cielo despejado te permite ver un gran jardin descuidado y" +
                                    ", más allá, un oscuro bosque. Por un momento, te parece ver algo que, corriendo, se esconde entre las sombras " +
                                    "de los arboles.",
                            null,
                            new Opciones(
                                    "Exploras el pasillo --INACABADO--",
                                    0
                            ),
                            new Opciones(
                                    "¨Hola! Hay alguien ahí?¨",
                                    5
                            )
                    ),
                        new Pantalla(
                                5,
                                2,
                                "Oyes un ruido a lo lejos. Al poco, consigues distinguir una especie de sollozo proveniente " +
                                        "de una habitación al final del pasillo.",
                                null,
                                new Opciones(
                                        "Investigar el ruido --INACABADO--",
                                        0
                                ),
                                new Opciones(
                                        "Investigar el sollozo",
                                        6
                                )
                        ),
                            new Pantalla(
                                    6,
                                    2,
                                    "Avanzas por el pasillo hacia la habitación. Al acercarte, notas que el sollozo " +
                                            "cesa repentinamente.",
                                    null,
                                    new Opciones(
                                            "Llamas a la puerta",
                                            7
                                    ),
                                    new Opciones(
                                            "Abres la puerta",
                                            9
                                    )
                            ),
                            new Pantalla(
                                    7,
                                    2,
                                    "Nadie responde.",
                                    null,
                                    new Opciones(
                                            "´Hola! Soy Tom! Hay alguien ahí?´",
                                            8
                                    ),
                                    new Opciones(
                                            "Abres la puerta",
                                            9
                                    )
                            ),
                            new Pantalla(
                                    8,
                                    1,
                                    "¨Tom...Eres tu?... Entra! RÁPIDO!¨",
                                    null,
                                    new Opciones(
                                            "Entras en la habitación",
                                            10
                                    )
                            ),
                            new Pantalla(
                                    9,
                                    2,
                                    "Te encuentras en un dormitorio viejo y lleno de polbo. Al igual que el resto " +
                                            "de habitaciones, parece que lleva abandonado un buen tiempo. Buscas con la mirada " +
                                            "pero no ves a nadie.",
                                    null,
                                    new Opciones(
                                            "Investigas la habitación",
                                            11
                                    ),
                                    new Opciones(
                                            "´Hola! Soy Tom! Hay alguien ahí?´",
                                            10
                                    )
                            ),
                            new Pantalla(
                                    10,
                                    2,
                                    "¨Oh dios mio, Tom! Pensaba que tu también habrías muerto!¨ " +
                                            "Reconoces la voz nerviosa de Lucia mientras esta sale de su escondite " +
                                            "bajo la cama, con un cuchillo en la mano.",
                                    null,
                                    new Opciones(
                                            "¨Que coño está pasando aquí?¨ --INACABADA--",
                                            0
                                    ),
                                    new Opciones(
                                            "´Joder Lucía, estas bien?´ --INACABADA--",
                                            0
                                    )
                            ),
                            new Pantalla(
                                    11,
                                    1,
                                    "Fijandote, eres capaz de distinguir como en la gruesa capa de polbo que cubre el suelo " +
                                            "se marca un rastro que va hasta debajo de la cama",
                                    null,
                                    new Opciones(
                                            "Miras debajo de la cama",
                                            12
                                    )
                            ),
                            new Pantalla(
                                    12,
                                    1,
                                    "En cuanto te asomas por debajo de la cama, un cuchillo sale fugazmente de entre " +
                                            "las sombras y atraviesa tu garganta. --PANTALLA DE MUERTE--",
                                    null,
                                    new Opciones(
                                            "Volver a empezar",
                                            0
                                    )
                            )
        };

        return pantallas;
    };

    public Pantalla[] getListaPantallas() {
        return listaPantallas;
    }
}
