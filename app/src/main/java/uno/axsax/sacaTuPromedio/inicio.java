package uno.axsax.sacaTuPromedio;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class inicio extends AppCompatActivity {

    private EditText nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        switch(getFirstTimeRun(this)) {
            case 0:

                break;
            case 1:
                Intent intento= new Intent(inicio.this, MainActivity1.class);
                startActivity(intento);
                finish();
                break;

        }
        nombre=(EditText)findViewById(R.id.digitaNombre);
    }

    public void vale(View view){
        if (nombre.getText().toString().isEmpty()){
            Toast.makeText(this,"Digita tu nombre",Toast.LENGTH_SHORT).show();
        }else{
            Intent cambio= new Intent(view.getContext(), MainActivity1.class);


            SharedPreferences preferencias= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
            SharedPreferences.Editor objEditor=preferencias.edit();
            objEditor.putString("nombrePer",nombre.getText().toString());
            objEditor.commit();
            startActivity(cambio);
            finish();
        }

    }
    public void ojo(View view){
        Toast.makeText(this,"Cuidado el nombre solo puede ser modificado una vez",Toast.LENGTH_LONG).show();
    }


    //Con la siguiente función puedes saber si es la primera vez que usa la app (return 0), si ya la usado antes (return 1) o si se ejecuta por primera vez trás una actualización (return 2)

    //Retorna: 0 primera vez / 1 no es primera vez / 2 nueva versión
    public static int getFirstTimeRun(Context contexto) {
        SharedPreferences sp = contexto.getSharedPreferences("MYAPP", 0);
        int result, currentVersionCode = BuildConfig.VERSION_CODE;
        int lastVersionCode = sp.getInt("FIRSTTIMERUN", -1);
        if (lastVersionCode == -1) result = 0; else
            result = (lastVersionCode == currentVersionCode) ? 1 : 2;
        sp.edit().putInt("FIRSTTIMERUN", currentVersionCode).apply();
        return result;
    }
}
