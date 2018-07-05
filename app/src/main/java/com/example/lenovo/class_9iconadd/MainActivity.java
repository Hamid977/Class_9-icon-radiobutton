package com.example.lenovo.class_9iconadd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    private TextView textViewresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textViewresult = findViewById(R.id.textview_result);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton_male:
                        Toast.makeText(MainActivity.this, "Male Selected", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton_female:
                        Toast.makeText(MainActivity.this, "Female Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }

    public void submit(View view) {

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButton_male:
                textViewresult.setText("Male Selected");
                Toast.makeText(this, "Male selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton_female:
                textViewresult.setText("Female Selected");
                Toast.makeText(this, "Female selected", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
