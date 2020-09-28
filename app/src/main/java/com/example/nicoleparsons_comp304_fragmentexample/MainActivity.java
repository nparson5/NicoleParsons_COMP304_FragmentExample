package com.example.nicoleparsons_comp304_fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private SecondFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
    }

    public void sendMessage(View view){
        EditText etMessage=(EditText)findViewById(R.id.edMessege);
        String message = etMessage.getText().toString();
        fragment.display(message);
    }

}