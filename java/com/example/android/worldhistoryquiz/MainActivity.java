package com.example.android.worldhistoryquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameField;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = (EditText) findViewById(R.id.name);
    }

    public void startQuiz(View view){
        Intent intent = new Intent(this, StartQuiz.class);
        startActivity(intent);

    }
    public String getName(){
        String name  = nameField.getText().toString();
        return name;
    }
    public void quitQuiz(View view){

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
