package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private EditText textView2;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        textView2.setShowSoftInputOnFocus(false);


    }
    private void updateText(String strToAdd) {

        try {
            String oldStr = textView2.getText().toString();
            int cursorPosition = textView2.getSelectionStart();

            String leftStr = oldStr.substring(0, cursorPosition);
            String rightStr = oldStr.substring(cursorPosition);

            textView2.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
            textView2.setSelection(cursorPosition + strToAdd.length());
        } catch (Exception e) {
            Toast.makeText(this, R.string.somethingwentwrong, Toast.LENGTH_SHORT).show();
        }
    }

    public void br1pushButton(View view) {

        if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.br1));
        } else
            updateText(getResources().getString(R.string.br1));
    }

    public void br2pushButton(View view) {
        if (checkEmpty())
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();

        else if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.br2));
        } else
            updateText(getResources().getString(R.string.br2));
    }

    public void zeropushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s0));
        } else
            updateText(getResources().getString(R.string.s0));           // HardCode:  update("0");
    }

    public void onepushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s1));
        } else
            updateText(getResources().getString(R.string.s1));
    }

    public void twopushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s2));
        } else
            updateText(getResources().getString(R.string.s2));
    }

    public void threepushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s3));
        } else
            updateText(getResources().getString(R.string.s3));
    }

    public void fourpushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s4));
        } else
            updateText(getResources().getString(R.string.s4));
    }

    public void fivepushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s5));
        } else
            updateText(getResources().getString(R.string.s5));
    }

    public void sixpushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s6));
        } else
            updateText(getResources().getString(R.string.s6));
    }

    public void sevenpushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s7));
        } else
            updateText(getResources().getString(R.string.s7));
    }

    public void eightpushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s8));
        } else
            updateText(getResources().getString(R.string.s8));
    }

    public void ninepushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.s9));
        } else
            updateText(getResources().getString(R.string.s9));
    }

    public void sinpushButton(View view) {

        if (textView2.getText().length() == 20)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (textView2.getText().length() >= 8) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.sin));
        } else
            updateText(getResources().getString(R.string.sin));
    }

    public void cospushButton(View view) {

        if (textView2.getText().length() == 20)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (textView2.getText().length() >= 8) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.cos));
        } else
            updateText(getResources().getString(R.string.cos));
    }

    public void tanpushButton(View view) {

        if (textView2.getText().length() == 20)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (textView2.getText().length() >= 8) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.tan));
        } else
            updateText(getResources().getString(R.string.tan));
    }

    public void logpushButton(View view) {

        if (textView2.getText().length() == 20)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (textView2.getText().length() >= 8) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.log));
        } else
            updateText(getResources().getString(R.string.log));
    }

    public void lnpushButton(View view) {

        if (textView2.getText().length() == 20)
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (textView2.getText().length() >= 9) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.ln));
        } else
            updateText(getResources().getString(R.string.ln));
    }

    public void dotpushButton(View view) {
        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.dot));
        } else
            updateText(getResources().getString(R.string.dot));
    }

    public void dividepushButton(View view) {

        if (checkEmpty())
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.div));
        } else {
            if (maxAlert())
                Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
            else
                updateText(getResources().getString(R.string.div));
        }
    }

    public void multiplypushButton(View view) {

        if (checkEmpty()) {
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();
        } else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.multi));
        } else {
            updateText(getResources().getString(R.string.multi));
        }
    }

    public void subtractpushButton(View view) {
        if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.min));
        } else
            updateText(getResources().getString(R.string.min));
    }

    public void addpushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.sum));
        } else
            updateText(getResources().getString(R.string.sum));
    }

    public void pipushButton(View view) {

        if (maxAlert())
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();

        else if (maxlimit()) {
            textView2.setTextSize(20);
            updateText(getResources().getString(R.string.piUpdate));
        } else
            updateText(getResources().getString(R.string.piUpdate));
    }

    public void factpushButton(View view) {

        String strVal = textView2.getText().toString();

        if (checkEmpty()) {
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();
        } else {
            try{


            double val = Double.parseDouble(strVal);
            double fact = factorial(val);

            String finalResult = String.valueOf(fact);

            if(finalResult.length()>=10){
                textView2.setTextSize(20);
            }
            textView2.setText(finalResult);
            textView2.setSelection(textView2.getText().length());

        }
            catch (Exception e) {
                Toast.makeText(this, R.string.toastInvalid, Toast.LENGTH_SHORT).show();
            }
        }
    }

    private double factorial(double val) {
        return (val == 1 || val == 0) ? 1 : (val * factorial(val - 1));
    }


    public void squarepushButton(View view) {
        String strVal = textView2.getText().toString();

        if (checkEmpty()) {
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();
        } else {
            try{


            double val = Double.parseDouble(strVal);
            double square = val * val;
            String finalResult = String.valueOf(square);

            if(finalResult.length()>=10){
                textView2.setTextSize(20);
            }

            textView2.setText(finalResult);
            textView2.setSelection(textView2.getText().length());
        }
            catch (Exception e) {
                Toast.makeText(this, R.string.toastInvalid, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void sqrtpushButton(View view) {

        String val = textView2.getText().toString();

        if (checkEmpty()) {
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();
        } else {
            try {


                double sqrt = Math.sqrt(Double.parseDouble(val));
                String finalResult = String.valueOf(sqrt);

                if (finalResult.length() >= 10) {
                    textView2.setTextSize(20);
                }

                textView2.setText(finalResult);
                textView2.setSelection(textView2.getText().length());
            } catch (Exception e) {
                Toast.makeText(this, R.string.toastInvalid, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void inversepushButton(View view) {

        String strVal = textView2.getText().toString();
        if (checkEmpty()) {
            Toast.makeText(this, R.string.toastforBracket, Toast.LENGTH_SHORT).show();
        }
        else {
            try {


                double val = Integer.parseInt(strVal);
                double result = 1 / val;
                String finalResult = String.valueOf(result);
                if (finalResult.length() >= 10) {
                    textView2.setTextSize(20);
                }
                textView2.setText(finalResult);
                textView2.setSelection(textView2.getText().length());
            }
            catch(Exception e){
                Toast.makeText(this, "Too Large Number", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void ACpushButton(View view) {
        textView2.setText("");
        textView1.setText("");
        textView2.setTextSize(45);
    }

    public void backspacepushButton(View view) {

        int cursorPos = textView2.getSelectionStart();
        int textlen = textView2.getText().length();

        try {
            if (cursorPos != 0 && textlen != 0) {

                if (textView2.getText().length() <= 10) {
                    textView2.setTextSize(45);
                }

                SpannableStringBuilder selection = (SpannableStringBuilder) textView2.getText();
                selection.replace(cursorPos - 1, cursorPos, "");
                textView2.setText(selection);
                textView2.setSelection(cursorPos - 1);
            }
        } catch (Exception e) {
            Toast.makeText(this, R.string.somethingwentwrong, Toast.LENGTH_SHORT).show();
        }
    }



    public boolean checkEmpty() {
        String val = textView2.getText().toString();
        return val.isEmpty();
    }


    public boolean maxlimit(){
        if(textView2.getText().length()==10)
           return true;
        else
            return false;
    }

    public boolean maxAlert() {
        if (textView2.getText().length() == 20)
            return true;
        else
            return false;

    }

    public void equalpushButton(View view) {

        String userInput = textView2.getText().toString();

        textView1.setText(userInput);

        userInput = userInput.replaceAll(getResources().getString(R.string.div), "/");
        userInput = userInput.replaceAll(getResources().getString(R.string.multi), "*");
        userInput = userInput.replaceAll(getResources().getString(R.string.sq), "^" + "2");
        userInput = userInput.replaceAll(getResources().getString(R.string.sqrt), "^" + "-2");
        userInput = userInput.replaceAll(getResources().getString(R.string.piVal), "3.14159");

        try {
            Expression exp = new Expression(userInput);
            Double res=(exp.calculate());                 // To Remove Unnecessary .0 from result ex. 4562.0
            DecimalFormat decimalFormat= new DecimalFormat("######################.#############");
            String result=String.valueOf(decimalFormat.format(res));
   //         long ResultInLong=Long.parseLong(res);
   //         String result=String.valueOf(ResultInLong);

           if(result.contains("NaN")){
               Toast.makeText(this, R.string.toastInvalid, Toast.LENGTH_SHORT).show();
               String invalidStr= textView1.getText().toString();
               textView2.setText(invalidStr);
               textView2.setSelection(invalidStr.length());
           }

           else if(result.length()>=10){
               textView2.setTextSize(20);
               textView2.setText(result);
           }

            //  textView2.setText(String.format("%10s",result));       // precision upto 10
            else {
               textView2.setText(result);
               textView2.setSelection(result.length());
           }


        } catch (Exception e) {
            Toast.makeText(this, R.string.toastInvalid, Toast.LENGTH_SHORT).show();
        }
        textView2.setSelection(textView2.getText().length());
    }

    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}