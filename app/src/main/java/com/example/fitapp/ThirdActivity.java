package com.example.fitapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ThirdActivity extends AppCompatActivity {
    private EditText edttext;
    private EditText edtName;
    private EditText edtCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        edtName = findViewById(R.id.edtName);
        edtCity = findViewById(R.id.edtCity);
        edttext=findViewById(R.id.edttext);
    }

    public void BtnShow_click(View view) {
        String msg="";
        float  h = 0;
        float w=0;

        float cal=0;

        h= Integer.parseInt(edtName.getText().toString());
        w= Integer.parseInt(edtCity.getText().toString());
        cal = (100*100*w/(h*h));
        String m = String.valueOf(cal) ;
        msg =m;
        if (cal <18.5 ){
//            Toast.makeText( this,"Underweight"+m ,
//                    Toast.LENGTH_SHORT).show();
            msg = "Underweight" +m;
            edttext.setText(msg);
        }
        if (cal >=18.5 && cal < 24.9 ){
//            Toast.makeText( this,"Normal weight "+m ,
//                    Toast.LENGTH_SHORT).show();
            msg = "Normal weight" +m;
            edttext.setText(msg);
        }
        if (cal >=25 && cal < 29.9 ){
//            Toast.makeText( this,"Overweight "+m ,
//                    Toast.LENGTH_SHORT).show();
            msg = "Overweight" +m;
            edttext.setText(msg);
        }
        if (cal >=30 ){
//            Toast.makeText( this,"Obesity "+m ,
//                    Toast.LENGTH_SHORT).show();
            msg = "Obesity" +m;
            edttext.setText(msg);
        }

//        Toast.makeText( this,m,
//                Toast.LENGTH_SHORT).show();
        msg =  m;
//        edttext.setText(msg);



    }
}