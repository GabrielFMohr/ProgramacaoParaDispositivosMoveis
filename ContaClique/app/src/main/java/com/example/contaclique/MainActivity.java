package com.example.contaclique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.MeuTXT);
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