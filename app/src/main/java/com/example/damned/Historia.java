package com.example.damned;

import android.widget.ImageView;

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
 * Para escribir una nueva Pantalla, copiar y pegar una de las ya hechas o hacerlo a mano, pero tener
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
 * ==PANTALLAS DE MUERTE==
 * Hay dos pantallas de muerte:
 *  - una es la típica activity de dos botón con texto (tipoActivity 2): un botón para voler al principio
 * del juego, y otro para finalizar y salir.
 *  - la otra es una activity (activity -1) que no tiene el marco decorativo del resto de las pantallas, sino
 * que tiene el fondo negro, una imagen que representa un tipo de final al juego, un texto, y los dos botones
 * para ir al inicio o salir.
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
                "Te despiertas en la cama de una habitación. Estás aturdido, y la cabeza te da vueltas." +
                            " Todo está oscuro a tu alrededor, y la luz de la luna que se filtra por la ventana " +
                            "apenas basta para iluminar tímidamente la estancia. \n\n¿Dónde estoy? - Piensas. No " +
                            "reconoces nada de lo que te rodea y... a medida que recobras las facultades hay una " +
                            "pregunta que acelerara tu respiración y tu pulso: \n\n¿QUIÉN SOY???",
                null,
                new Opciones(
                        "Buscas una luz",
                        1
                ),
                new Opciones(
                        "Miras en tus bolsillos",
                        2
                ),
                new Opciones(
                        "Miras por la ventana",
                        3
                )
            ),
            new Pantalla(
                1,
                2,
                "Te levantas con cuidado porque aún estás un poco mareado. Te apoyas en una pared " +
                            "y caminas despacio mientras vas palpando en busca de algún interruptor. \nFinalmente " +
                            "encuentras uno y lo pulsas. La habitación se ilumina, y la claridad te molesta los ojos. \n" +
                            "Tras unos segundos te acostumbras y puedes ver con claridad, pero lo primero que miras es la " +
                            "cama donde estabas hace un momento, para descubrir que la sábana está manchada de sangre.",
                null,
                new Opciones(
                        "Inspeccionas la cama",
                        4
                ),
                new Opciones(
                        "Miras en tus bolsillos",
                        2
                )
            ),
            new Pantalla(
                2,
                3,
                "Examinas tus bolsillos en busca de algo que te pueda proporcionar cualquier información. " +
                            "En el bolsillo derecho de tu pantalón hay unos pocos dólares arrugados. \nEn el " +
                            "bolsillo izquierdo hay un papel doblado, y en el bolsillo trasero encuentras un " +
                            "objeto envuelto con una cinta de tela ancha...",
                null,
                new Opciones(
                        "Examinas el objeto",
                        5
                ),
                new Opciones(
                        "Inspeccionas la cama",
                        4
                ),
                new Opciones(
                        "Inspeccionas el papel",
                        6
                )
            ),
            new Pantalla(
                3,
                1,
                "Miras por la ventana. Tu habitación está a bastante altura. El cielo está densamente " +
                            "nublado, y no permite ver la luna. Pero pese a la oscuridad puedes ver el entorno: " +
                            "es un bosque, y no sabes por qué, pero te resulta familiar. Te asomas por la ventana " +
                            "y miras hacia abajo. Ves que la construcción es toda de piedra, y que un piso por " +
                            "debajo de ti hay otra ventana, y hay luz dentro.",
                null,
                new Opciones(
                        "Examinas la habitación",
                        7
                )
            ),
            new Pantalla(
                4,
                3,
                "Te acercas a la cama y te inclinas sobre ella para examinar de cerca la sangre. " +
                            "Hay mucha sangre! Te asustas y te incorporas súbitamente, para luego gritar: !OH DIOS MIO!!" +
                            "pero no por la sangre de la cama, sino al descubrir que tú también estás manchado de sangre " +
                            "por varias zonas. \nPasas tu mano para limpiarla, y compruebas que... esa sangre no es tuya.",
                null,
                new Opciones(
                        "Te acercas a la ventana",
                        3
                ),
                new Opciones(
                        "Examinas la habitación",
                        7
                ),
                new Opciones(
                        "Prefieres tumbarte y dormir de nuevo",
                        8
                )
            ),
            new Pantalla(
                5,
                2,
                "Poco a poco retiras la cinta que envuelve el objeto. ¡Es una credencial! Pero " +
                            "más en concreto, una credencial de periodista. En la parte superior de la tarjeta " +
                            "pone: REPORTERO. -¡¿Soy reportero de televisión!? -piensas-, y giras la tarjeta " +
                            "para ver el logotipo de la cadena de televisión: ¡La PMDM! y junto a él, tu nombre: " +
                            "TOM THOORB. \nTom Thoorb... ¡Sí! ¡Ya recuerdo! ¡Me llamo Tom Thoorb!",
                null,
                new Opciones(
                        "Inspeccionas la cama",
                        4
                ),
                new Opciones(
                        "Examinas el papel",
                        6
                )
            ),
            new Pantalla(
                6,
                1,
                "El papel es una hoja de periódico doblada varias veces. La abres, y lees un titular: " +
                            "\"Otro fallecido en las inmediaciones del castillo de Aunosa\". Debajo hay una foto de " +
                            "un bosque que, aunque no sabes por qué, te resulta muy familiar. En mitad del reportaje hay " +
                            "otro título remarcado en negrita: \"Todo apunta a que la manada de lobos del " +
                            "bosque ha sido nuevamente la responsable.\"",
                null,
                new Opciones(
                    "Examinas la habitación",
                    7
                )
            ),
            new Pantalla(
                7,
                1,
                "Aquí se examinaría la habitación. Y continuaría la trama.",
                null,
                new Opciones(
                        "Volver al inicio",
                        0
                )
            ),
            new Pantalla(
                8,
                1,
                "¡Esto es demasiado para mi! -Piensas- No quieres saber nada de esto. Mientras " +
                            "que la sangre no sa tuya, lo demás no te importa. Ya tienes bastantes problemas " +
                            "como para preocuparte por otros. Escoges dormir tranquilamente, y los problemas " +
                            "ya se arreglarán solos. Mejor descansar aquí, a salvo, que salir y correr peligros.",
                null,
                new Opciones(
                        "Cierras los ojos y te duermes",
                        9
                )
            ),
            new Pantalla(
                9,
                -1,
                "Te despiertas en otra cama por la voz de una mujer. \"¡Antonio! Despierta ya, " +
                            "dormilón! ¡Hay que llevar a los niños al cole!\"\nQuien te despierta no es otra " +
                            "que Belén Rueda, y tú eres Antonio Resines en Los Serrano. \n\n!!TODO ESTO SÓLO HABÍA " +
                            "SIDO UN SUEÑO!!",
                new Opciones(
                        "Volver al inicio",
                        0
                ),
                new Opciones(
                        "SALIR"
                            ),
                R.drawable.serrano,
                R.raw.los_serrano
            )
        };

        return pantallas;
    };

    public Pantalla[] getListaPantallas() {
        return listaPantallas;
    }
}
