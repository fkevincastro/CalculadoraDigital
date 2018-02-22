package com.fkevincastro.calculadoradigital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String Operador1="0",DisplayText=" ";
    int Operacion;
    double op1,op2,ans;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bMas,bMenos,bPor,bDiv,bPunto;
    TextView Display;
    int OnOff=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bMas=findViewById(R.id.bmas);
        bMenos=findViewById(R.id.bMenos);
        bPor=findViewById(R.id.bPor);
        bDiv=findViewById(R.id.bDiv);
        bPunto=findViewById(R.id.bPunto);
        Display=findViewById(R.id.tDisplay);


    }

    public void OnNumberIsClicked(View view) {
       int id=view.getId();

        switch (id){
            case R.id.b0: Operador1=Operador1+"0";
                DisplayText=DisplayText+"0";
                Display.setText(DisplayText);
                break;
            case R.id.b1: Operador1=Operador1+"1";
                DisplayText=DisplayText+"1";
                Display.setText(DisplayText);
                break;
            case R.id.b2: Operador1=Operador1+"2";
                DisplayText=DisplayText+"2";
                Display.setText(DisplayText);
                break;
            case R.id.b3: Operador1=Operador1+"3";
                DisplayText=DisplayText+"3";
                Display.setText(DisplayText);
                break;
            case R.id.b4: Operador1=Operador1+"4";
                DisplayText=DisplayText+"4";
                Display.setText(DisplayText);
                break;
            case R.id.b5: Operador1=Operador1+"5";
                DisplayText=DisplayText+"5";
                Display.setText(DisplayText);
                break;
            case R.id.b6: Operador1=Operador1+"6";
                DisplayText=DisplayText+"6";
                Display.setText(DisplayText);
                break;
            case R.id.b7: Operador1=Operador1+"7";
                DisplayText=DisplayText+"7";
                Display.setText(DisplayText);
                break;
            case R.id.b8: Operador1=Operador1+"8";
                DisplayText=DisplayText+"8";
                Display.setText(DisplayText);
                break;
            case R.id.b9: Operador1=Operador1+"9";
                DisplayText=DisplayText+"9";
                Display.setText(DisplayText);
                break;
            case R.id.bPunto: Operador1=Operador1+".";
                DisplayText=DisplayText+".";
                Display.setText(DisplayText);
                break;

        }

            switch (OnOff){
                case 1:op1 = Double.valueOf(Operador1);
                    Log.d("dat 1 :",Operador1);
                    break;
                case 0: op2=Double.valueOf(Operador1);
                    Log.d("dat 1 :",Operador1);
                    break;
            }




    }

    public void OnOperatorIsClicked(View view) {
        int id=view.getId();
        Operador1 = "0";
        OnOff=0;


        switch (id){
            case R.id.bmas: Operacion=1;
                DisplayText=DisplayText+" + ";
                Display.setText(DisplayText);
                break;
            case R.id.bMenos: Operacion=2;
                DisplayText=DisplayText+" - ";
                Display.setText(DisplayText);
                break;
            case R.id.bPor: Operacion=3;
                DisplayText=DisplayText+" x ";
                Display.setText(DisplayText);
                break;
            case R.id.bDiv:Operacion=4;
                DisplayText=DisplayText+" / ";
                Display.setText(DisplayText);
                break;
        }



    }

    public void OnIgualIsClicked(View view) {

        switch(Operacion){
            case 1: suma();
                Log.d("op 1 =",String.valueOf(op1));
                Log.d("op 2=", String.valueOf(op2));
                break;
            case 2: resta();
                Log.d("op 1 =",String.valueOf(op1));
                Log.d("op 2=", String.valueOf(op2));
                break;
            case 3: multiplicacion();
                Log.d("op 1 =",String.valueOf(op1));
                Log.d("op 2=", String.valueOf(op2));
                break;
            case 4: division();
                Log.d("op 1 =",String.valueOf(op1));
                Log.d("op 2=", String.valueOf(op2));
                break;

        }
        op1=ans;
    }

    private void division() {
        Log.d("op 1 =",String.valueOf(op1));
        Log.d("op 2=", String.valueOf(op2));
        ans=op1/op2;
        DisplayText=String.valueOf(ans);
        Display.setText(DisplayText);
    }

    private void multiplicacion() {
        ans=op1*op2;
        DisplayText=String.valueOf(ans);
        Display.setText(DisplayText);
    }

    private void resta() {
        ans=op1-op2;
        DisplayText=String.valueOf(ans);
        Display.setText(DisplayText);
    }

    private void suma() {
        ans=op1+op2;
        DisplayText=String.valueOf(ans);
        Display.setText(DisplayText);

    }

    public void OnClearClicked(View view) {

        OnOff=1;
        Display.setText(" ");
        Operador1="0";
        DisplayText=" ";
        op1=0;
        op2=0;

    }


}
