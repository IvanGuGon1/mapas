package com.gpsbike.juego;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.fillEnabled;
import static android.R.attr.password;

public class MainActivity extends AppCompatActivity {


private final String estado = "online";

    private Button button;
    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

        button.setOnClickListener(buttonListener);


    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            if (et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                //ACCEDER AL SEGUNDO ACTIVITY
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("estado", estado);
                startActivity(intent);

            } else {
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

            }
        }
    };


}
