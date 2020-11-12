package com.example.damned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**Esta clase es la entrada a la aplicacion y representa la portada del juego.
 *
 * Debe contener al menos un boton para pasar de pantalla, el cual esta ya instanciado.
 *
 * Si queremos meterle mas funcionalidades, habria que modificar el xml y declararlas aqui
 * si queremos que realizen alguna funcion.
 *
 * No voy a comentar los activitys por que estan un poco cutres, en general solo tienen un LinearLayout
 * y los TextViews y Buttons necesarios para hacer las pruebas, asi que cualquier modificacion que le hagais
 * tener en cuenta solo mantener el id de los elementos que ya estan para no liarla.
 *
 * En cuanto al funcionamiento, tanto en esta como en el resto de las layouts empiezo isntanciando una
 * Pantalla[] listaPantalla con el array de Pantallas donde va escrita la historia y las interacciones entre
 * ventanas, y luego instancio la primera pantalla (posicion 0 en el array) en una Pantalla llamada pantallaActual.
 * De esta forma, pantallaActual va a contener la pantalla que se esta viendo reflejada en la activity en cada
 * momento, y por lo general esta variable se usa para pasar los datos de la Pantalla a los elementos de esta
 * y mandar al intent el codigo de la Pantalla siguiente en los listeners de los buttons.*/
public class MainActivity extends AppCompatActivity {

    private Pantalla[] listaPantallas = new Historia().getListaPantallas();
    private Pantalla pantallaActual = listaPantallas[0];
    /**En esta Activity, pantalla ya se actualiza con la posicion 0, pero en el resto se va a declarar pero
     * no se instanciara hasta recibir el codigo de la Pantalla que tiene que representar por el parametro
     * del onCreate.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer sonidoPortada = MediaPlayer.create(this, R.raw.horror_stories);
        sonidoPortada.start();
        sonidoPortada.setVolume(0.1f, 0.1f);
        final MediaPlayer sonidoAullido = MediaPlayer.create(this, R.raw.howling);
        sonidoAullido.start();




        final Button boton = (Button) findViewById((R.id.btnMainView));
        boton.setOnClickListener(new View.OnClickListener()
        {
            /**Esta pantalla, al ser la portada, instancia la pantalla 0 que va a ser por la que empieze la
             * historia y manda en el intent ese mismo codigo, el 0, para que empieze en su Activity correspondiente.*/
            @Override
            public void onClick(View v)
            {
                sonidoAullido.stop();
                MediaPlayer sonidoBoton = MediaPlayer.create(MainActivity.this,R.raw.door);
                sonidoBoton.start();
                Intent intnt = new Intent(MainActivity.this, Activity_3_botones.class);
                intnt.putExtra("codigoPantalla",pantallaActual.getCodigoPantalla());
                startActivity(intnt);
                finish();
            }
        });


    }
}
