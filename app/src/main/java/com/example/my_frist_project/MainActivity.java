package com.example.my_frist_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//   EditText a1,a2;
//   Button add,clr;
//   TextView aaa;
    EditText t1,t2;
    Button l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
//        a1=findViewById(R.id.a1);
//        a2=findViewById(R.id.a2);
//        add=findViewById(R.id.add);
//        aaa=findViewById(R.id.aaa);
//        clr=findViewById(R.id.clr);
//
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(a1.getText().toString().length()==0)
//                {
//                    a1.setText("0");
//                }
//                if(a2.getText().toString().length()==0)
//                {
//                    a1.setText("0");
//                }
//                int n1=Integer.parseInt(a1.getText().toString());
//                int n2=Integer.parseInt(a2.getText().toString());
//
//                int sum=n1+n2;
//                aaa.setText(String.valueOf(sum));
//
//            }
//        });
//        clr.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                a1.setText("");
//                a2.setText("");
//                aaa.setText("");
//            }
//        });
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        l1=findViewById(R.id.l1);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!t1.getText().toString().contains("@")) {
                    System.out.println("True");
                    t1.setError("Must require @");
                }
                if(!t2.getText().toString().contains("assddd"))
                {
                    System.out.println("true");
                    t2.setError("must require assddd");
                }

            }
        });
    }
}