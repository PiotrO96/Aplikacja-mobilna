package com.example.atlasdrinkow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class DrinkiListView extends AppCompatActivity {
    String[] drinki = new String[]{"Long Island","Mojito","Matini","Manhattan","Bloody Mary","Margarita","Old Fashioned","Daiquiri","Gin and Tonic","Screw Driver","Gimlet"};
    String[] skladniki = new String[]{"Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients..."};
    ListView drinkiListview;
    TextView wynik_wyszuk_textview;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_drink_list_view);
        drinkiListview =(ListView) findViewById(R.id.drinki_list);



        wynik_wyszuk_textview = findViewById(R.id.wszukaj_wynik);
        DrinkiAdapter drinkiAdapter = new DrinkiAdapter(this, android.R.layout.simple_list_item_1, drinki, skladniki);
        drinkiListview.setAdapter(drinkiAdapter);


        String wynik = intent.getStringExtra("Wyszukaj: ");
        wynik_wyszuk_textview.setText("Znaleziono: "+wynik);

    }
}
