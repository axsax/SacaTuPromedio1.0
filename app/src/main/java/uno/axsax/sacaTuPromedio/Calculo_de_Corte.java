package uno.axsax.sacaTuPromedio;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculo_de_Corte extends AppCompatActivity {
    EditText pc;
    EditText sc;
    EditText tc;
    EditText pcp;
    EditText scp;
    EditText tcp;
     TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_de__corte);
        iniciar();
    }
    public void iniciar(){
        pc=(EditText)findViewById(R.id.primero);
        sc=(EditText)findViewById(R.id.segundo);
        tc=(EditText)findViewById(R.id.tercero);
        pcp=(EditText)findViewById(R.id.primeroP);
        scp=(EditText)findViewById(R.id.segundoP);
        tcp=(EditText)findViewById(R.id.terceroP);
        mostrar=(TextView)findViewById(R.id.resultado);
    }
    public void atras(View view){
        Intent cambio= new Intent(view.getContext(), MainActivity1.class);
        startActivity(cambio);
       finish();
    }
    public void calcular(View view){

        BigDecimal format2=new BigDecimal(Double.toString(((Double.parseDouble(pc.getText().toString())*Double.parseDouble(pcp.getText().toString()))+(Double.parseDouble(sc.getText().toString())*
                Double.parseDouble(scp.getText().toString()))+(Double.parseDouble(tc.getText().toString())*Double.parseDouble(tcp.getText().toString())))));
        format2=format2.setScale(2,RoundingMode.DOWN);
       mostrar.setText(String.valueOf(format2));
    }
}
