package com.example.simpledemocal;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText userInput;
    private Button zero, one, two, three, four, five, six;
    private Button seven, eight, nine;
    private Button dec, plus, minus, mult, div, equal, clear;
    private int val1, val2;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText)findViewById(R.id.userInput);
        zero =  (Button)findViewById(R.id.button0);
        one =  (Button)findViewById(R.id.button1);
        two =  (Button)findViewById(R.id.button2);
        three =  (Button)findViewById(R.id.button3);
        four =  (Button)findViewById(R.id.button4);
        five =  (Button)findViewById(R.id.button5);
        six =  (Button)findViewById(R.id.button6);
        seven =  (Button)findViewById(R.id.button7);
        eight =  (Button)findViewById(R.id.button8);
        nine =  (Button)findViewById(R.id.button9);
        plus =  (Button)findViewById(R.id.buttonPlus);
        minus =  (Button)findViewById(R.id.buttonMinus);
        mult =  (Button)findViewById(R.id.buttonMult);
        div =  (Button)findViewById(R.id.buttonDiv);
        dec =  (Button)findViewById(R.id.buttonDec);
        clear = (Button)findViewById(R.id.buttonClear);
        equal = (Button)findViewById(R.id.button1Equal);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        clear.setOnClickListener(this);
        dec.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    public void doMath() {
        if (operation.equals("+")) {
            val2 = Integer.parseInt(userInput.getText().toString());
            //userInput.setText("");
            val1 = val1 + val2;
            userInput.setText(Integer.toString(val1));
        } else if (operation.equals("-")) {
            val2 = Integer.parseInt(userInput.getText().toString());
            //userInput.setText("");
            val1 = val1 - val2;
            userInput.setText(Integer.toString(val1));
        } else if (operation.equals("*")) {
            val2 = Integer.parseInt(userInput.getText().toString());
            //userInput.setText("");
            val1 = val1 * val2;
            userInput.setText(Integer.toString(val1));
        } else if (operation.equals("/")) {
            val2 = Integer.parseInt(userInput.getText().toString());
            //userInput.setText("");
            //val1 = val1 / val2;
            float ans = (float) val1 / val2;
            userInput.setText(Float.toString(ans));
        }
    }

    @Override
    public void onClick(View v) {
        Editable str =  userInput.getText();
        switch(v.getId()){
            case R.id.button1:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(one.getText());
                userInput.setText(str);
                break;
            case R.id.button2:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(two.getText());
                userInput.setText(str);
                break;
            case R.id.button3:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(three.getText());
                userInput.setText(str);
                break;
            case R.id.button4:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(four.getText());
                userInput.setText(str);
                break;
            case R.id.button5:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(five.getText());
                userInput.setText(str);
                break;
            case R.id.button6:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(six.getText());
                userInput.setText(str);
                break;
            case R.id.button7:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(seven.getText());
                userInput.setText(str);
                break;
            case R.id.button8:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(eight.getText());
                userInput.setText(str);

                break;
            case R.id.button9:
                if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                str = str.append(nine.getText());
                userInput.setText(str);

                break;
            case R.id.buttonClear:
                val1 = 0;
                val2 = 0;
                userInput.setText("");
                userInput.setHint("Enter number ");

                break;
            case R.id.buttonPlus:
                operation = "+";
                if(val1 == 0){
                    val1 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                }
                else if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                else{
                    val2 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                    val1 = val1 + val2;
                    userInput.setText(Integer.toString(val1));
                }
                break;
            case R.id.buttonMinus:
                operation = "-";
                if(val1 == 0){
                    val1 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                }
                else if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                else{
                    val2 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                    val1 = val1 - val2;
                    userInput.setText(Integer.toString(val1));
                }
                break;
            case R.id.buttonMult:
                operation = "*";
                if(val1 == 0){
                    val1 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                }
                else if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                else{
                    val2 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                    val1 = val1 * val2;
                    userInput.setText(Integer.toString(val1));
                }
                break;
            case R.id.buttonDiv:
                operation = "/";
                if(val1 == 0){
                    val1 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                }
                else if(val2 != 0){
                    val2 = 0;
                    userInput.setText("");
                }
                else{
                    val2 = Integer.parseInt(userInput.getText().toString());
                    userInput.setText("");
                    val1 = val1 / val2;
                    userInput.setText(Integer.toString(val1));
                }
                break;
            case R.id.button1Equal:
                if(!operation.equals(null)){
                    if(val2 != 0){
                        if(operation.equals("+")){
                            userInput.setText("");
                            /*op1 = op1 + op2;*/
                            userInput.setText(Integer.toString(val1));
                        }
                        else if(operation.equals("-")){
                            userInput.setText("");/*
							op1 = op1 - op2;*/
                            userInput.setText(Integer.toString(val1));
                        }
                        else if(operation.equals("*")){
                            userInput.setText("");/*
							op1 = op1 * op2;*/
                            userInput.setText(Integer.toString(val1));
                        }
                        else if(operation.equals("/")){
                            userInput.setText("");/*
							op1 = op1 / op2;*/
                            userInput.setText(Integer.toString(val1));
                        }
                    }
                    else{
                        doMath();
                    }
                }
                break;
        }}


}


