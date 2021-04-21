package com.pdam.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<CheckBox> checkBoxes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxes.add((CheckBox) findViewById(R.id.syrup_checkbox));
        checkBoxes.add((CheckBox) findViewById(R.id.sprinkles_checkbox));
        checkBoxes.add((CheckBox) findViewById(R.id.nuts_checkbox));
        checkBoxes.add((CheckBox) findViewById(R.id.cherries_checked));
        checkBoxes.add((CheckBox) findViewById(R.id.cookie_checkbox));
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view) {
        String message = "Toppings: ";
        for(CheckBox checkBox : checkBoxes) {
            if(checkBox.isChecked()) {
                message = message + checkBox.getText().toString() + " ";
            }
        }
        displayToast(message);
    }
}