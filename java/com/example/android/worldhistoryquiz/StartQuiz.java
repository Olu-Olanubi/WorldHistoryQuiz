package com.example.android.worldhistoryquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;

public class StartQuiz extends AppCompatActivity {
int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
    }
    public void onRadioButtonClicked1(View view){
        RadioButton option1_1 = (RadioButton) findViewById(R.id.option1_1);
        //RadioButton option1_2 = (RadioButton) findViewById(R.id.option1_2);
        //RadioButton option1_3 = (RadioButton) findViewById(R.id.option1_3);
        //RadioButton option1_4 = (RadioButton) findViewById(R.id.option1_4);
        ImageView remark1 = (ImageView) findViewById(R.id.remark1);
        if(option1_1.isChecked()){
            remark1.setImageResource(R.drawable.correctmark1);
            score += 10;
        }
        else{
            remark1.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }
    public void onRadioButtonClicked2(View view){
        RadioButton option2_1 = (RadioButton) findViewById(R.id.option2_1);
        //RadioButton option2_2 = (RadioButton) findViewById(R.id.option2_2);
        //RadioButton option2_3 = (RadioButton) findViewById(R.id.option2_3);
        //RadioButton option2_4 = (RadioButton) findViewById(R.id.option2_4);
        ImageView remark2 = (ImageView) findViewById(R.id.remark2);
        if(option2_1.isChecked()){
            remark2.setImageResource(R.drawable.correctmark1);
            score += 10;
        }
        else{
            remark2.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }
    public void onRadioButtonClicked3(View view) {
        //RadioButton option3_1 = (RadioButton) findViewById(R.id.option3_1);
        //RadioButton option3_2 = (RadioButton) findViewById(R.id.option3_2);
        RadioButton option3_3 = (RadioButton) findViewById(R.id.option3_3);
        //RadioButton option3_4 = (RadioButton) findViewById(R.id.option3_4);
        ImageView remark3 = (ImageView) findViewById(R.id.remark3);
        if (option3_3.isChecked()) {
            remark3.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark3.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }
    public void onRadioButtonClicked4(View view) {
        //RadioButton option4_1 = (RadioButton) findViewById(R.id.option4_1);
        //RadioButton option4_2 = (RadioButton) findViewById(R.id.option4_2);
        RadioButton option4_3 = (RadioButton) findViewById(R.id.option4_3);
        //RadioButton option4_4 = (RadioButton) findViewById(R.id.option4_4);
        ImageView remark4 = (ImageView) findViewById(R.id.remark4);
        if (option4_3.isChecked()) {
            remark4.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark4.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }
    public void onCheckBoxClicked5(View view){
        CheckBox check5_1 = (CheckBox) findViewById(R.id.check5_1);
        CheckBox check5_2 = (CheckBox) findViewById(R.id.check5_2);
        CheckBox check5_3 = (CheckBox) findViewById(R.id.check5_3);
        CheckBox check5_4 = (CheckBox) findViewById(R.id.check5_4);
        CheckBox check5_5 = (CheckBox) findViewById(R.id.check5_5);

        ImageView remark5 = (ImageView) findViewById(R.id.remark5);

        if (check5_1.isChecked() && check5_3.isChecked() && check5_5.isChecked()){
            remark5.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark5.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void onCheckBoxClicked6(View view){
        CheckBox check6_1 = (CheckBox) findViewById(R.id.check6_1);
        CheckBox check6_2 = (CheckBox) findViewById(R.id.check6_2);
        CheckBox check6_3 = (CheckBox) findViewById(R.id.check6_3);
        CheckBox check6_4 = (CheckBox) findViewById(R.id.check6_4);
        CheckBox check6_5 = (CheckBox) findViewById(R.id.check6_5);

        ImageView remark6 = (ImageView) findViewById(R.id.remark6);

        if (check6_2.isChecked() && check6_3.isChecked() && check6_5.isChecked()){
            remark6.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark6.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void onRadioButtonClicked7(View view) {
        //RadioButton option7_1 = (RadioButton) findViewById(R.id.option7_1);
        RadioButton option7_2 = (RadioButton) findViewById(R.id.option7_2);
        //RadioButton option7_3 = (RadioButton) findViewById(R.id.option7_3);
        //RadioButton option7_4 = (RadioButton) findViewById(R.id.option7_4);
        ImageView remark7 = (ImageView) findViewById(R.id.remark7);
        if (option7_2.isChecked()) {
            remark7.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark7.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void onRadioButtonClicked8(View view) {
        RadioButton option8_1 = (RadioButton) findViewById(R.id.option8_1);
        //RadioButton option8_2 = (RadioButton) findViewById(R.id.option8_2);
        //RadioButton option8_3 = (RadioButton) findViewById(R.id.option8_3);
        //RadioButton option8_4 = (RadioButton) findViewById(R.id.option8_4);
        ImageView remark8 = (ImageView) findViewById(R.id.remark8);
        if (option8_1.isChecked()) {
            remark8.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark8.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void onRadioButtonClicked9(View view) {
        //RadioButton option9_1 = (RadioButton) findViewById(R.id.option9_1);
        //RadioButton option9_2 = (RadioButton) findViewById(R.id.option9_2);
        //RadioButton option9_3 = (RadioButton) findViewById(R.id.option9_3);
        RadioButton option9_4 = (RadioButton) findViewById(R.id.option9_4);
        ImageView remark9 = (ImageView) findViewById(R.id.remark9);
        if (option9_4.isChecked()) {
            remark9.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark9.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void onCheckBoxClicked10(View view){
        CheckBox check10_1 = (CheckBox) findViewById(R.id.check10_1);
        CheckBox check10_2 = (CheckBox) findViewById(R.id.check10_2);
        CheckBox check10_3 = (CheckBox) findViewById(R.id.check10_3);
        CheckBox check10_4 = (CheckBox) findViewById(R.id.check10_4);
        CheckBox check10_5 = (CheckBox) findViewById(R.id.check10_5);

        ImageView remark10 = (ImageView) findViewById(R.id.remark10);

        if (check10_1.isChecked() && check10_5.isChecked()){
            remark10.setImageResource(R.drawable.correctmark1);
            score += 10;
        } else {
            remark10.setImageResource(R.drawable.incorrectmark1);
            score += 0;
        }
    }

    public void submitQuiz(View view){

    }
}

