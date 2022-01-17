package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick (View view){ /* fct to use button */
        TextView txtHello = findViewById(R.id.txtMessage);
        /*txtHello.setText("Hello");*/
        /*we want to say hello +name of user for that we will ask for input */
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        txtHello.setText("Hello "+ edtTxtName.getText().toString());

    }
}