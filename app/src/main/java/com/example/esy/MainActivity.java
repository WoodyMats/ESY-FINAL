package com.example.esy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_amka, doctor_pass;
    Button login, exit;
    String str_amka, str_doc_pass, SHARED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_amka = findViewById(R.id.amka);
        doctor_pass = findViewById(R.id.doc_pass);
        login = findViewById(R.id.login_btn);
        exit = findViewById(R.id.exit_btn);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        Toast.makeText(this, "Για είσοδο γίνονται δεκτά οποιαδήποτε στοιεία ΑΜΚΑ και κωδικός!", Toast.LENGTH_LONG).show();
    }

    private void Login() {
        if(edt_amka.getText().toString().equals("") || doctor_pass.getText().toString().equals("")){
            Toast.makeText(this, "Παρακαλώ συμπληρώστε όλα τα στοιχεία.", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(MainActivity.this, AfterLogin.class);

        intent.putExtra("AMKA", edt_amka.getText().toString());

        startActivity(intent);











    }
}
