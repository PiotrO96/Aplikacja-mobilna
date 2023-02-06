package com.example.atlasdrinkow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class CzynnoscActivity extends AppCompatActivity implements View.OnClickListener {


    Button przegladanie_button;
    Button dodawanie_button;
    Button kalklulator_button;
    Button szukaj_po_nazwie_button;
    Button szukaj_po_skladniku_button;
    EditText szukaj_view;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czynnosc);
        Intent intent = getIntent();
        przegladanie_button =(Button)findViewById(R.id.przeglad_but);
        przegladanie_button.setOnClickListener(this);
        dodawanie_button =(Button)findViewById(R.id.dodawanie_but);
        dodawanie_button.setOnClickListener(this);
        kalklulator_button =(Button)findViewById(R.id.kalkulator_but);
        kalklulator_button.setOnClickListener(this);
        szukaj_po_nazwie_button =(Button)findViewById(R.id.szuk_po_nazwie_but);
        szukaj_po_nazwie_button.setOnClickListener(this);
        szukaj_po_skladniku_button =(Button)findViewById(R.id.szuk_po_sklad_but);
        szukaj_po_nazwie_button.setOnClickListener(this);
        szukaj_view = (EditText)findViewById(R.id.szukaj_view);

    }
    public void onClick(View v){
        if (v == przegladanie_button)
        {
            Intent intent = new Intent(CzynnoscActivity.this, DrinkiListView.class);
            startActivity(intent);
        }
        else if(v== dodawanie_button) {
            Intent intent = new Intent(CzynnoscActivity.this, DodawanieActivity.class);
            startActivity(intent);
        }
        else if (v== kalklulator_button){
            Intent intent = new Intent(CzynnoscActivity.this, KalkulatorActivity.class);
            startActivity(intent);
        }
         if(szukaj_view.getText().toString().length() < 1 && v==szukaj_po_nazwie_button){
            Toast.makeText(getApplicationContext(), "Wprowadz tekst", Toast.LENGTH_LONG).show();
        } else if(szukaj_view.getText().toString().length() < 1 && v==szukaj_po_skladniku_button){
            Toast.makeText(getApplicationContext(), "Wprowadz tekst", Toast.LENGTH_LONG).show();
        }
          if(v==szukaj_po_nazwie_button){
            String szukaj = szukaj_view.getText().toString();
            Intent intent = new Intent(CzynnoscActivity.this, DrinkiListView.class);
            intent.putExtra("Wyszukaj", szukaj);
            startActivity(intent);
        } else if(v==szukaj_po_skladniku_button){
            String szukaj = szukaj_view.getText().toString();
            Intent intent = new Intent(CzynnoscActivity.this, DrinkiListView.class);
            intent.putExtra("Wyszukaj", szukaj);
            startActivity(intent);
        }

/*
// Create URL
        URL restdbEndpoint = null;
        try {
            restdbEndpoint = new URL("https://atlasdrinkow-9348.restdb.io/rest/drinki");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

// Create connection
        HttpsURLConnection myConnection =
                null;
        try {
            myConnection = (HttpsURLConnection) restdbEndpoint.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        myConnection.setRequestProperty("User-Agent", "my-restdb-app");
        myConnection.setRequestProperty("Accept", "application/json");
        myConnection.setRequestProperty("x-apikey", "6171abab8597142da17458d7");
        try {
            if (myConnection.getResponseCode() == 200) {
                // Success


                // Further processing here
            } else {
                // Error handling code goes here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }




}
