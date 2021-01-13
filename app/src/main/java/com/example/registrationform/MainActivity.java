package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //starting method for program
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //access activity_main file

        TextView firstName = findViewById(R.id.first_name);
        firstName.setText("User's first name");
        TextView lastName = findViewById(R.id.last_name);
        lastName.setText("User's last name");
        TextView email = findViewById((R.id.email));
        email.setText("User's email");

        //TODO: Push code to GitHub

    }

    public void onBtnClick (View view) {         // execute when user clicks button

        TextView txtFirstName = findViewById(R.id.first_name);      //use ID to find TextView for first name
        EditText edtFirstName = findViewById(R.id.edtTxtFirstName); //access UI for editing text
        txtFirstName.setText(edtFirstName.getText().toString());    //Convert user input to text

        TextView txtLastName = findViewById(R.id.last_name);
        EditText edtLastName = findViewById(R.id.edtTxtLastName);
        txtLastName.setText(edtLastName.getText().toString());

        TextView txtEmail = findViewById(R.id.email);
        EditText edtEmail = findViewById(R.id.edtTxtEmail);
        txtEmail.setText(edtEmail.getText().toString());

    }

}