package com.gpsbike.juego;

import android.content.Intent;
import android.nfc.TagLostException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tv2;
    private Button b1;
    private String LATITUD = "40.416775";
    private String LONGITUD = "-3.70379";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv2 = (TextView) findViewById(R.id.tv2);
        b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(mapasListener);



        // Tomamos los datos del intent

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String estado = bundle.getString("estado");
            Toast.makeText(SecondActivity.this, estado, Toast.LENGTH_LONG).show();
            tv2.setText(estado);
        } else {
            Toast.makeText(SecondActivity.this, "vacio", Toast.LENGTH_LONG).show();
        }



    }

    private View.OnClickListener mapasListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            Intent intent = new Intent(SecondActivity.this, MapsActivity.class );
            intent.putExtra("latitud", LATITUD);
            intent.putExtra("longitud", LONGITUD);
            startActivity(intent);

        }
    };
}