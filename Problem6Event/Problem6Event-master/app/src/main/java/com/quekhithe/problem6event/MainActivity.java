package com.quekhithe.problem6event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtA, txtB;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtKetQua = findViewById(R.id.txtKetQua);
    }

    public void Tong2So(View view) {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c= a+b;
        txtKetQua.setText(String.valueOf(c));
    }
}
