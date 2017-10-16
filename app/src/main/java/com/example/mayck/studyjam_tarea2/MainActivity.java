package com.example.mayck.studyjam_tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    public EditText pantalla;
    public double operacion1,operacion2,resultado;
    public int ope;
    public TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (EditText)findViewById(R.id.cajaR);
        t=(TextView)findViewById(R.id.mostrar);

    }
    public void bt1(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"1";
        pantalla.setText(captura);
    }
    public void bt2(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"2";
        pantalla.setText(captura);
    }
    public void bt3(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"3";
        pantalla.setText(captura);
    }
    public void bt4(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"4";
        pantalla.setText(captura);
    }
    public void bt5(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"5";
        pantalla.setText(captura);
    }
    public void bt6(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"6";
        pantalla.setText(captura);
    }
    public void bt7(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"7";
        pantalla.setText(captura);
    }
    public void bt8(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"8";
        pantalla.setText(captura);
    }
    public void bt9(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"9";
        pantalla.setText(captura);
    }
    public void btcero(View v){
        String captura=pantalla.getText().toString();
        captura=captura +"0";
        pantalla.setText(captura);
    }
    public void btpunto(View v){
        String captura=pantalla.getText().toString();
        captura=captura +".";
        pantalla.setText(captura);
    }
    public void btraiz(View v){
        try {
            String aux1=pantalla.getText().toString();
            operacion1=Double.parseDouble(aux1);
        }
        catch (NumberFormatException n){}

        pantalla.setText("√("+operacion1+")");
        ope=5;
    }
    public void sumar(View v){
        try {
            String aux1=pantalla.getText().toString();
            operacion1=Double.parseDouble(aux1);
        }
        catch (NumberFormatException n){}

        pantalla.setText("");

        ope=1;
    }
    public void restar(View v){
        try {
            String aux1=pantalla.getText().toString();
            operacion1=Double.parseDouble(aux1);
        }
        catch (NumberFormatException n){}
        pantalla.setText("");
        ope=2;
    }
    public void multiplicar(View v){
        try {
            String aux1=pantalla.getText().toString();
            operacion1=Double.parseDouble(aux1);
        }
        catch (NumberFormatException n){}
        pantalla.setText("");
        ope=3;
    }    public void dividir(View v){
        try {
            String aux1=pantalla.getText().toString();
            operacion1=Double.parseDouble(aux1);
        }
        catch (NumberFormatException n){}
        pantalla.setText("");
        ope=4;
    }
    public void igual(View v){
        try {
            String aux2=pantalla.getText().toString();
            operacion2=Double.parseDouble(aux2);
        }
        catch (NumberFormatException n){}
        pantalla.setText("");
        if(ope==1){

            resultado=operacion1+operacion2;
        }
        if(ope==2){
            resultado=operacion1-operacion2;
        }
        if(ope==3){
            resultado=operacion1*operacion2;
        }
        if(ope==4){
           if(operacion2==0){
               pantalla.setText("Error Division entre 0");
               Toast.makeText(this, "Error no se puede dividir entre 0", Toast.LENGTH_SHORT).show();
           }
           else{
               resultado=operacion1/operacion2;
           }

        }
        if(ope==5){
            resultado=Math.sqrt(operacion1);
        }
        pantalla.setText(""+resultado);
        operacion1=resultado;
    }
    public void limpiarTodo(View v) {
        pantalla.setText("");
        operacion1 = 0.0;
        operacion2 = 0.0;
        resultado = 0.0;
    }
    public void borrarNumero(View v){
            if(!pantalla.getText().toString().equals("")){
                pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");

    }
    else{
                Toast.makeText(this, "No hay Numeros que Borrar", Toast.LENGTH_SHORT).show();
            }
    }
        public void off(View v){
        finish();

    }






}
