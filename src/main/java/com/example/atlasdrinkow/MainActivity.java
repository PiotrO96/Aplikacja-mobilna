package com.example.atlasdrinkow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tak_buttoon;
    Button nie_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tak_buttoon =(Button)findViewById(R.id.tak_but);
        tak_buttoon.setOnClickListener(this);
        nie_button=(Button) findViewById(R.id.nie_but);
        nie_button.setOnClickListener(this);
        }

    public void onClick(View v){
        if (v == tak_buttoon)
{
    Intent intent = new Intent(MainActivity.this, CzynnoscActivity.class);
    startActivity(intent);

}
else if(v== nie_button) {
            finish();
            System.exit(0);

        }
    }
}