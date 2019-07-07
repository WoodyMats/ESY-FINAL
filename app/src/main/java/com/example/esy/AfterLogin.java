package com.example.esy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterLogin extends AppCompatActivity {

    private TextView user;
    private Button btn_history, btn_exams;
    private String amka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_after_login);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            amka = extras.getString("AMKA");
            user = findViewById(R.id.user);
            user.setText("AMKA: " + amka);
            btn_exams = findViewById(R.id.exams);
            btn_history = findViewById(R.id.history);
            btn_history.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(AfterLogin.this, HistoryActivity.class);
                    startActivity(intent);
                }
            });
        }else {
            Toast.makeText(this, "Can't retrieve the DATA", Toast.LENGTH_SHORT).show();
        }

        btn_exams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AfterLogin.this, ExamsActivity.class);
                startActivity(intent);
            }
        });

    }

}
