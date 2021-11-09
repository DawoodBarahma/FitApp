package com.example.fitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Spinner spinner ;
    Button bt1,bt2,bt3,gobt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        spinner = findViewById(R.id.select);
        gobt= findViewById(R.id.Go);

    }


    public void click(View view) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
    startActivity(intent);
    }


    public void bt2click(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void bt3click(View view) {
        Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
        startActivity(intent);
    }

    public void Goclick(View view) {
        String tabname1 = null;
       boolean msg=false;
        int i=0;
        int y=0;
        String text = spinner.getSelectedItem().toString();
        String[] r = getResources().getStringArray(R.array.Exer_num);

        for(String t:r ){
            tabname1=r[i];
            if (text.equals(tabname1)){
                msg = true;
                y=i;

            break;
            }
            i++;


        }




        if (msg==true && i==1 ){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else if(msg==true && i==2 ){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else if(msg==true && i==0 ){
            Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(intent);
        }


    }
}