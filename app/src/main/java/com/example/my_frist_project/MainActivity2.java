package com.example.my_frist_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText etxt1,etxt2;
    TextView txtAns;
    int n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etxt1=findViewById(R.id.et1);
        etxt2=findViewById(R.id.et2);
        txtAns=findViewById(R.id.txtAns);

        etxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
             try {
                 String str1=s.toString();
                 String str2=etxt2.getText().toString();
                 if(str2.isEmpty())
                 {
                     n2=0;
                 }
                 else {
                     n2= Integer.parseInt(str2.toString());
                 }
                 n1= Integer.parseInt(str1.toString());
                 sum=n1+n2;
                 txtAns.setText(""+sum);
             }
             catch (NumberFormatException exception)
             {
                 Toast.makeText(MainActivity2.this, "value can't0 b blank", Toast.LENGTH_SHORT).show();
             }


             }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etxt2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    String str2=s.toString();
                    String str1=etxt1.getText().toString();
                    if(str1.isEmpty())
                    {
                        n1=0;
                    }
                    else
                    {
                        n1=Integer.parseInt(str1.toString());
                    }
                    n2=Integer.parseInt(str2.toString());
                    sum=n1+n2;
                    txtAns.setText(""+sum);
                }
                catch (NumberFormatException exception)
                {
                    Toast.makeText(MainActivity2.this, "Value can't be blank", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}