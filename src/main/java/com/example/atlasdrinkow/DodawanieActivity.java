package com.example.atlasdrinkow;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class DodawanieActivity extends AppCompatActivity implements View.OnClickListener{
    Button dodaj_button;
    EditText przepis_view;
    Button usun_button;
    EditText jak_zrobic_view;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodawanie);
        Intent intent = getIntent();
       /*
        dodaj_button =(Button)findViewById(R.id.dodawanie_but);
        dodaj_button.setOnClickListener(this);
        usun_button =(Button)findViewById(R.id.usun_but);
        usun_button.setOnClickListener(this);
        przepis_view = (EditText)findViewById(R.id.przepis_textview);
        jak_zrobic_view = (EditText)findViewById(R.id.jak_zrobic_textview);
        */
    }
    public void onClick(View v){


    }
}
