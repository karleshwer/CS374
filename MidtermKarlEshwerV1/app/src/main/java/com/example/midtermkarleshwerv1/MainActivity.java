package com.example.midtermkarleshwerv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvert = (Button) findViewById(R.id.button_convert);
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                EditText textBoxMi = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKms = (EditText) findViewById(R.id.editTextKms);
                double miles = Double.valueOf(textBoxMi.getText().toString());
                double kms = miles / 0.6215;
                DecimalFormat format = new DecimalFormat("##.##");
                textBoxKms.setText(format.format(kms));
            }
        });
    }
}