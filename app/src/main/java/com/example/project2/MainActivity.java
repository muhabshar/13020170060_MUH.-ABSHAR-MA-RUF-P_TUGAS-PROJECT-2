package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText input1, input2, hasil;
    private Toolbar toolbar;
    private Button hitung, reset, input;
    double a, b, c;
    String text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        input1 = (EditText) findViewById(R.id.editText);
        input2 = (EditText) findViewById(R.id.editText2);
        hasil = (EditText) findViewById(R.id.editText3);
        hitung = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.button2);
        input = (Button) findViewById(R.id.button3);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Muh. Abshar Ma'ruf P");
        getSupportActionBar().setSubtitle("13020170060");
        getSupportActionBar().setLogo(R.drawable.images);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //text1 = input1.getText().toString();
                //text2 = input2.getText().toString();
                c = a*b*0.5;
                hasil.setText(""+c);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                hasil.setText("");
            }
        });
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1.getText().toString().length()==0){
                    input1.setError("Harus Ada Isi !!!");
                }
                else if (input1.getText().toString().length()==1){
                a = Double.parseDouble(input1.getText().toString());
                }
                if (input2.getText().toString().length()==0){
                    input2.setError("Harus Ada Isi !!!");
                }
                else if (input2.getText().toString().length()==1){
                b = Double.parseDouble(input2.getText().toString());
                }

            }
        });

    }
}

