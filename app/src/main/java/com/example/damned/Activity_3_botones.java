package com.example.damned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_3_botones extends AppCompatActivity {

    private Pantalla[] listaPantallas = new Historia().getListaPantallas();
    private Pantalla pantallaActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_botones);

        /**Recibe en el Bundle el codigo que ha mandado la Pantalla anterior y luego por medio del
         * metodo getInt del Bundle extrae ese codigo entero y lo utiliza para marcar la posicion
         * del array donde esta la Pantalla en cuestion, y esa pantalla la instancia en pantallaActual*/
        Bundle recibirDatos = this.getIntent().getExtras();
        pantallaActual = listaPantallas[recibirDatos.getInt("codigoPantalla")];

        /**Aqui se instancian los elementos del xml y se les pasa el texto de la pantallaActual, asi
         * como se declaran sus listeners con sus onClick*/

        TextView textoP = (TextView) findViewById(R.id.textoPantalla);
        textoP.setText(pantallaActual.getTextoPantalla());

        Button bot1 = (Button) findViewById(R.id.boton1);
        bot1.setText(pantallaActual.getOpcion1().getTextoOpcion());
        bot1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /**En esta linea se crea una nueva Pantalla con el codigoPantallaReferenciada del Opciones equivalente
                 * a este boton. Se declara una linea igual al principio de cada onClick pues cada boton pulsado va a tener
                 * un codigo referenciado distinto.
                 * Esta ventana va a representar la ventana a la que nos va a mandar este Button, y en el siguiente switch,
                 * dependiendo del tipo de Activity en el que tenga que ser instanciada, declara un Intent o otro y
                 * inicia esa Activity pasandole el codigoPantallaReferenciada que le corresponde.*/
                Pantalla pantallaRef = listaPantallas[pantallaActual.getOpcion1().getCodigoPantallaReferenciada()];

                switch (pantallaRef.getTipoActivity()) {
                    case 1: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_1_boton.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion1().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 2: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_2_botones.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion1().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 3: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_3_botones.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion1().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                }
            }
        });

        /*Button bot2 = (Button) findViewById(R.id.boton2);
        bot2.setText(pantallaActual.getOpcion2().getTextoOpcion());
        bot2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Pantalla pantallaRef = listaPantallas[pantallaActual.getOpcion2().getCodigoPantallaReferenciada()];

                switch (pantallaRef.getTipoActivity())
                {
                    case 1:
                    {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_1_boton.class);
                        intnt.putExtra("codigoPantalla",pantallaActual.getOpcion2().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 2:
                    {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_2_botones.class);
                        intnt.putExtra("codigoPantalla",pantallaActual.getOpcion2().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 3:
                    {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_3_botones.class);
                        intnt.putExtra("codigoPantalla",pantallaActual.getOpcion2().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                }
            }
        });*/

        /*Button bot3 = (Button) findViewById(R.id.boton3);
        bot3.setText(pantallaActual.getOpcion3().getTextoOpcion());
        bot3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Pantalla pantallaRef = listaPantallas[pantallaActual.getOpcion3().getCodigoPantallaReferenciada()];

                switch (pantallaRef.getTipoActivity()) {
                    case 1: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_1_boton.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion3().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 2: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_2_botones.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion3().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                    case 3: {
                        Intent intnt = new Intent(Activity_3_botones.this, Activity_3_botones.class);
                        intnt.putExtra("codigoPantalla", pantallaActual.getOpcion3().getCodigoPantallaReferenciada());
                        startActivity(intnt);
                        finish();
                        break;
                    }
                }
            }
        });*/
    }
}