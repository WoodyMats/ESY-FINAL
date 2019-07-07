package com.example.esy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class ExamsActivity extends AppCompatActivity {

    private DatePicker calendar;
    private Spinner spinner;
    private Button check;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exams_layout);

        check = findViewById(R.id.check_button);

        calendar = findViewById(R.id.calendarView);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exams_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        pointExam();
    }

    public void pointExam() {
        spinner.setVisibility(View.VISIBLE);
        calendar.setVisibility(View.VISIBLE);
        check.setVisibility(View.VISIBLE);


    }

    public void check(View view) {
        toast = Toast.makeText(this, ""+spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString() + " έκλεισε για " + calendar.getDayOfMonth() + "/" + calendar.getMonth() + "/" + calendar.getYear(), Toast.LENGTH_LONG);
        toast.show();


    }
}
