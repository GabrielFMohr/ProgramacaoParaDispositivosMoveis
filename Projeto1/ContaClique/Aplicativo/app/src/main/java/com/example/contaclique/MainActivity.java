package com.example.contaclique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int i=0;
    EditText edMin,edMax;
    TextView textView,TextViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.MeuTXT);
        edMin=findViewById(R.id.edtextMin);
        edMax=findViewById(R.id.edtextMax);
        TextViewResult= findViewById(R.id.textView);

    }
    public void NumeroAleatorio(View V)
    {
        int max,min;
        min=Integer.parseInt(edMin.getText().toString());
        max=Integer.parseInt(edMax.getText().toString());
        Random R= new Random();
        int result=(R.nextInt(max-min+1)+min);
        TextViewResult.setText(Integer.toString(result));
    }
    public void contar(View V){
        i=i+1;
        TextView Tv= (TextView) V;
        Tv.setText(Integer.toString(i));

    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.setText("0");
    }
}