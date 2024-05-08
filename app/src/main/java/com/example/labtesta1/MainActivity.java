package com.example.labtesta1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText sha,a,b,c,col;
    AppCompatButton colbtn, shabtn;
    TextView area,peri,color;

    Double aa,bb,cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sha=findViewById(R.id.editTextText);
        a=findViewById(R.id.editTextText2);
        b=findViewById(R.id.editTextText3);
        c=findViewById(R.id.editTextText4);
        col=findViewById(R.id.editTextText5);

        colbtn=findViewById(R.id.button2);
        shabtn=findViewById(R.id.button);

        area=findViewById(R.id.textView3);
        peri=findViewById(R.id.textView4);
        color=findViewById(R.id.textView5);

        shabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=Double.valueOf(a.getText().toString());
                bb=Double.valueOf(b.getText().toString());
                cc=Double.valueOf(c.getText().toString());

                if(sha.getText().toString().equalsIgnoreCase("circle"))
                {
                    Circle c = new Circle(aa);
                    area.setText(String.valueOf(c.area()));
                    peri.setText(String.valueOf(c.perimeter()));
                }
                else if(sha.getText().toString().equalsIgnoreCase("square"))
                {
                    Square c = new Square(aa);
                    area.setText(String.valueOf(c.area()));
                    peri.setText(String.valueOf(c.perimeter()));
                }
                else if(sha.getText().toString().equalsIgnoreCase("triangle"))
                {
                    Triangle c = new Triangle(aa,bb,cc);
                    area.setText(String.valueOf(c.area()));
                    peri.setText(String.valueOf(c.perimeter()));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid shape input", Toast.LENGTH_SHORT).show();
                }

            }
        });

        colbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(col.getText().toString().equalsIgnoreCase("Red"))
                {
                    Red r = new Red();
                    color.setText(r.showcolor());
                }
               else if(col.getText().toString().equalsIgnoreCase("Green"))
                {
                    Green r = new Green();
                    color.setText(r.showcolor());
                }
                else if(col.getText().toString().equalsIgnoreCase("Blue"))
                {
                    Blue r = new Blue();
                    color.setText(r.showcolor());
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid color input", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}