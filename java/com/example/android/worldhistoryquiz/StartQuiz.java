package com.example.android.worldhistoryquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class StartQuiz extends AppCompatActivity {
    int score = 0;
    boolean isAnswer1, isAnswer2, isAnswer3, isAnswer4, isAnswer5, isAnswer6, isAnswer7, isAnswer8, isAnswer9, isAnswer10;
    ImageView remark1, remark2, remark3, remark4, remark5, remark6, remark7, remark8, remark9, remark10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
    }

    public void onRadioButtonClicked1(View view){
        remark1 = (ImageView) findViewById(R.id.remark1);
        isAnswer1 = onRadioButtonClicked1();
    }
    public boolean onRadioButtonClicked1(){
        RadioButton option1_1 = (RadioButton) findViewById(R.id.option1_1);
        //RadioButton option1_2 = (RadioButton) findViewById(R.id.option1_2);
        //RadioButton option1_3 = (RadioButton) findViewById(R.id.option1_3);
        //RadioButton option1_4 = (RadioButton) findViewById(R.id.option1_4);
        if(option1_1.isChecked()){
            score += 10;
            return true;
        }
        else{
            score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked2(View view){
        remark2 = (ImageView) findViewById(R.id.remark2);
        isAnswer2 = onRadioButtonClicked2();
    }
    public boolean onRadioButtonClicked2(){
        RadioButton option2_1 = (RadioButton) findViewById(R.id.option2_1);
        //RadioButton option2_2 = (RadioButton) findViewById(R.id.option2_2);
        //RadioButton option2_3 = (RadioButton) findViewById(R.id.option2_3);
        //RadioButton option2_4 = (RadioButton) findViewById(R.id.option2_4);
        if(option2_1.isChecked()){
            score += 10;
            return true;
        }
        else{
            score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked3(View view){
        remark3 = (ImageView) findViewById(R.id.remark3);
        isAnswer3 = onRadioButtonClicked3();
    }
    public boolean onRadioButtonClicked3() {
        //RadioButton option3_1 = (RadioButton) findViewById(R.id.option3_1);
        //RadioButton option3_2 = (RadioButton) findViewById(R.id.option3_2);
        RadioButton option3_3 = (RadioButton) findViewById(R.id.option3_3);
        //RadioButton option3_4 = (RadioButton) findViewById(R.id.option3_4);
        if (option3_3.isChecked()) {
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked4(View v){
        remark4 = (ImageView) findViewById(R.id.remark4);
        isAnswer4 = onRadioButtonClicked4();
    }
    public boolean onRadioButtonClicked4() {
        //RadioButton option4_1 = (RadioButton) findViewById(R.id.option4_1);
        //RadioButton option4_2 = (RadioButton) findViewById(R.id.option4_2);
        RadioButton option4_3 = (RadioButton) findViewById(R.id.option4_3);
        //RadioButton option4_4 = (RadioButton) findViewById(R.id.option4_4);
        if (option4_3.isChecked()) {
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onCheckBoxClicked5(View v){
        remark5 = (ImageView) findViewById(R.id.remark5);
        isAnswer5 = onCheckBoxClicked5();
    }
    public boolean onCheckBoxClicked5(){
        CheckBox check5_1 = (CheckBox) findViewById(R.id.check5_1);
        CheckBox check5_2 = (CheckBox) findViewById(R.id.check5_2);
        CheckBox check5_3 = (CheckBox) findViewById(R.id.check5_3);
        CheckBox check5_4 = (CheckBox) findViewById(R.id.check5_4);
        CheckBox check5_5 = (CheckBox) findViewById(R.id.check5_5);

        if (check5_1.isChecked() && check5_3.isChecked() && check5_5.isChecked()&& !check5_2.isChecked() && !check5_4.isChecked()){
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onCheckBoxClicked6(View view){
        remark6 = (ImageView) findViewById(R.id.remark6);
        isAnswer6 = onCheckBoxClicked6();
    }
    public boolean onCheckBoxClicked6(){
        CheckBox check6_1 = (CheckBox) findViewById(R.id.check6_1);
        CheckBox check6_2 = (CheckBox) findViewById(R.id.check6_2);
        CheckBox check6_3 = (CheckBox) findViewById(R.id.check6_3);
        CheckBox check6_4 = (CheckBox) findViewById(R.id.check6_4);
        CheckBox check6_5 = (CheckBox) findViewById(R.id.check6_5);



        if (check6_2.isChecked() && check6_3.isChecked() && check6_5.isChecked() && !check6_1.isChecked()&& !check6_4.isChecked()){
            score += 10;
            return true;
        } else {
           score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked7(View v){
        remark7 = (ImageView) findViewById(R.id.remark7);
        isAnswer7 = onRadioButtonClicked7();
    }
    public boolean onRadioButtonClicked7() {
        //RadioButton option7_1 = (RadioButton) findViewById(R.id.option7_1);
        RadioButton option7_2 = (RadioButton) findViewById(R.id.option7_2);
        //RadioButton option7_3 = (RadioButton) findViewById(R.id.option7_3);
        //RadioButton option7_4 = (RadioButton) findViewById(R.id.option7_4);

        if (option7_2.isChecked()) {
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked8(View view){
        remark8 = (ImageView) findViewById(R.id.remark8);
        isAnswer8 = onRadioButtonClicked8();
    }
    public boolean onRadioButtonClicked8() {
        RadioButton option8_1 = (RadioButton) findViewById(R.id.option8_1);
        //RadioButton option8_2 = (RadioButton) findViewById(R.id.option8_2);
        //RadioButton option8_3 = (RadioButton) findViewById(R.id.option8_3);
        //RadioButton option8_4 = (RadioButton) findViewById(R.id.option8_4);

        if (option8_1.isChecked()) {
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onRadioButtonClicked9(View v){
        remark9 = (ImageView) findViewById(R.id.remark9);
        isAnswer9 = onRadioButtonClicked9();

    }
    public boolean onRadioButtonClicked9() {
        //RadioButton option9_1 = (RadioButton) findViewById(R.id.option9_1);
        //RadioButton option9_2 = (RadioButton) findViewById(R.id.option9_2);
        //RadioButton option9_3 = (RadioButton) findViewById(R.id.option9_3);
        RadioButton option9_4 = (RadioButton) findViewById(R.id.option9_4);

        if (option9_4.isChecked()) {
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void onCheckBoxClicked10(View v){
        remark10 = (ImageView) findViewById(R.id.remark10);
        isAnswer10 = onCheckBoxClicked10();
    }
    public boolean onCheckBoxClicked10(){
        CheckBox check10_1 = (CheckBox) findViewById(R.id.check10_1);
        CheckBox check10_2 = (CheckBox) findViewById(R.id.check10_2);
        CheckBox check10_3 = (CheckBox) findViewById(R.id.check10_3);
        CheckBox check10_4 = (CheckBox) findViewById(R.id.check10_4);
        CheckBox check10_5 = (CheckBox) findViewById(R.id.check10_5);

        if (check10_1.isChecked() && check10_5.isChecked() && !check10_2.isChecked()
                && !check10_3.isChecked() && !check10_4.isChecked()){
            score += 10;
            return true;
        } else {
            score += 0;
            return false;
        }
    }

    public void submitQuiz(View v){

        if(isAnswer1){
            remark1.setImageResource(R.drawable.correctmark1);
        }else{
            remark1.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer2){
            remark2.setImageResource(R.drawable.correctmark1);
        }else{
            remark2.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer3){
            remark3.setImageResource(R.drawable.correctmark1);
        }
        else{
            remark3.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer4){
            remark4.setImageResource(R.drawable.correctmark1);
        }else{
            remark4.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer5){
            remark5.setImageResource(R.drawable.correctmark1);
        }else{
            remark5.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer6){
            remark6.setImageResource(R.drawable.correctmark1);
        }
        else{
            remark6.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer7){
            remark7.setImageResource(R.drawable.correctmark1);
        }else{
            remark7.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer8){
            remark8.setImageResource(R.drawable.correctmark1);
        }else{
            remark8.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer9){
            remark9.setImageResource(R.drawable.correctmark1);
        }else{
            remark9.setImageResource(R.drawable.incorrectmark1);
        }
        if(isAnswer10){
            remark10.setImageResource(R.drawable.correctmark1);
        }
        else{
            remark10.setImageResource(R.drawable.incorrectmark1);
        }

        //create result sheet.
        MainActivity name = new MainActivity();
        String myName = quizGrade(score) + " " + name.getName()+";\n"+"You scored: "
                + score+"%.";
        TextView text = (TextView) findViewById(R.id.results);
        text.setText(myName);
    }

    //method to calculate the grade
    public String quizGrade(int score){
        switch(score/10){
            case 10:
                return "Excellent!";
            case 9:
                return "Awesome!";
            case 8:
                return "Great!";
            case 7:
                return "Very Good!";
            case 6:
                return "Good!";
            case 5:
                return "Fair!";
            default:
                return "poor";
        }
    }

}

