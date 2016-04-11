package info.wwwood.holamundo.presentationlayer.controllers.activities;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import info.wwwood.holamundo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // llamar a onCreate clase padre (on som està sobrescrita la classe)
        setContentView(R.layout.activity_main);

        int numero=1;

        Persona p1=new Persona();
        p1.Edad=30;
        p1.Nombre="AA";

        String Saludo="";

        p1.Saludar(Saludo);
    }
}
class Persona{
    public String Nombre;
    public int Edad;

    public void Saludar(String Saludo){
        Saludo="HOLA";
    }
}
