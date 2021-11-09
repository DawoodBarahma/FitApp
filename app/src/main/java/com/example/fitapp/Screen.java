package com.example.fitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Screen extends AppCompatActivity {

private boolean login =false;
private Button logbt;
private EditText name;
private EditText gender;
private CheckBox remem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        name =findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        logbt=findViewById(R.id.loginbt);
        remem= findViewById(R.id.remember);




        SharedPreferences pref = getSharedPreferences("checkbox",MODE_PRIVATE);
        String check = pref.getString("remember","");



        if (check.equals("true")){
            Toast.makeText(this,"Log in is done  ",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Screen.this,MainActivity.class);
            startActivity(intent);
        }
        else if(check.equals("false")){
            Toast.makeText(this,"Please log in ",Toast.LENGTH_SHORT).show();

        }




        remem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()){
                    SharedPreferences pref = getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor edt = pref.edit();
                    edt.putString("remember","true");
                    edt.apply();
                    Toast.makeText(Screen.this,"Checked ",Toast.LENGTH_SHORT).show();
                }else if(!compoundButton.isChecked()){
                    SharedPreferences pref = getSharedPreferences("checkbox",MODE_PRIVATE);
                    SharedPreferences.Editor edt = pref.edit();
                    edt.putString("remember","false");
                    edt.apply();
                    Toast.makeText(Screen.this,"UnChecked ",Toast.LENGTH_SHORT).show();
                }
            }
        });


//        if (login){
//       new Handler().postDelayed(new Runnable() {
//           @Override
//           public void run() {
//
//
//                startActivity(new Intent(getApplicationContext(),MainActivity.class));
//                finish();
//
//
//
//           }
//       },3500);
//        }

    }
    public void btlog(View view) {
            if ((!name.getText().toString().isEmpty() && (gender.getText().toString().equalsIgnoreCase("male")||
                    gender.getText().toString().equalsIgnoreCase("female")) )
                    ) {
                Intent intent = new Intent(Screen.this,MainActivity.class);
                startActivity(intent);

        }


    }

}