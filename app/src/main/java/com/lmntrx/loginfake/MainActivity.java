package com.lmntrx.loginfake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   .     setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText UsernameEditText = (EditText)findViewById(R.id.username);
        EditText PasswordEditText = (EditText)findViewById(R.id.password);

        String uname = UsernameEditText.getText().toString();
        String pass = PasswordEditText.getText().toString();
        if (uname.equals(pass)) {
            Toast.makeText(MainActivity.this, "Entered username and password are correct", Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this,Main2Activity.class);
            startActivity(myIntent);
            finish();
        }
        else
            Toast.makeText(MainActivity.this, "PODO..", Toast.LENGTH_LONG).show();
    }
}
