package com.quekhithe.problem6event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText txtA, txtB;
    TextView txtKetQua;
    Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnTong = findViewById(R.id.btnTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());
                int c = a+b;
                txtKetQua.setText(String.valueOf(c));
            }
        });
    }
}
