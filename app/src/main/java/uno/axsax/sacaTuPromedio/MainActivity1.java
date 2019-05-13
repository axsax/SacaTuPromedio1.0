package uno.axsax.sacaTuPromedio;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity1 extends AppCompatActivity {
    private TextView parcial;
    private TextView total;
    private ListView principal;
    private TextView esco;

    private String semestres[]={"1 Semestre","2 Semestre","3 Semestre","4 Semestre"
            ,"5 Semestre","6 Semestre","7 Semestre","8 Semestre","9 Semestre","10 Semestre"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        principal= (ListView)findViewById(R.id.lvPrincipal);
        parcial=(TextView)findViewById(R.id.parcial);
        total=(TextView)findViewById(R.id.total);
        esco=(TextView)findViewById(R.id.escoje);

        SharedPreferences guardadoNombre=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
        String temporal=guardadoNombre.getString("nombrePer","");
        esco.setText(temporal+" escoje tu semestre");

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,R.layout.list_item_semestres,semestres);
        principal.setAdapter(adapter);

        principal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent cambio= new Intent(view.getContext(), CadaSemestre.class);
                if (position==0){
                    cambio.putExtra("primero","1 Semestre");
                    startActivity(cambio);

                }else if (position==1){
                    cambio.putExtra("primero","2 Semestre");
                    startActivity(cambio);

                }else if (position==2){
                    cambio.putExtra("primero","3 Semestre");
                    startActivity(cambio);

                }else if (position==3){
                    cambio.putExtra("primero","4 Semestre");
                    startActivity(cambio);

                }else if (position==4){
                    cambio.putExtra("primero","5 Semestre");
                    startActivity(cambio);

                }else if (position==5){
                    cambio.putExtra("primero","6 Semestre");
                    startActivity(cambio);

                }else if (position==6){
                    cambio.putExtra("primero","7 Semestre");
                    startActivity(cambio);

                }else if (position==7){
                    cambio.putExtra("primero","8 Semestre");
                    startActivity(cambio);

                }else if (position==8){
                    cambio.putExtra("primero","9 Semestre");
                    startActivity(cambio);

                }else if (position==9){
                    cambio.putExtra("primero","10 Semestre");
                    startActivity(cambio);

                }

            }
        });


        SharedPreferences guardado=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado2=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado3=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado4=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado5=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado6=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado7=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado8=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado9=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado


        SharedPreferences guardado10=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado

    int cont=0;
    Double fal=0.0;
        if (!guardado.getString("Total","").isEmpty()){
            fal= fal+Double.parseDouble(guardado.getString("Total",""));
            ++cont;
        }
        if (!guardado2.getString("Total2","").isEmpty()){
            fal= fal+Double.parseDouble(guardado2.getString("Total2",""));
            ++cont;
        }
        if (!guardado3.getString("Total3","").isEmpty()){
            fal= fal+Double.parseDouble(guardado3.getString("Total3",""));
            ++cont;
        }
        if (!guardado4.getString("Total4","").isEmpty()){
            fal=fal+ Double.parseDouble(guardado4.getString("Total4",""));
            ++cont;
        }
        if (!guardado5.getString("Total5","").isEmpty()){
            fal= fal+Double.parseDouble(guardado5.getString("Total5",""));
            ++cont;
        }
        if (!guardado6.getString("Total6","").isEmpty()){
            fal= fal+Double.parseDouble(guardado6.getString("Total6",""));
            ++cont;
        }
        if (!guardado7.getString("Total7","").isEmpty()){
            fal=fal+ Double.parseDouble(guardado7.getString("Total7",""));
            ++cont;
        }
        if (!guardado8.getString("Total8","").isEmpty()){
            fal= fal+Double.parseDouble(guardado8.getString("Total8",""));
            ++cont;
        }
        if (!guardado9.getString("Total9","").isEmpty()){
            fal= fal+Double.parseDouble(guardado9.getString("Total9",""));
            ++cont;
        }
        if (!guardado10.getString("Total10","").isEmpty()){
            fal= fal+Double.parseDouble(guardado10.getString("Total10",""));
            ++cont;
        }

        if (cont==0){

        }else{
            BigDecimal format=new BigDecimal(Double.toString((fal)/10));
            format=format.setScale(2,RoundingMode.DOWN);
            BigDecimal format2=new BigDecimal(Double.toString((fal)/cont));
            format2=format2.setScale(2,RoundingMode.DOWN);
            parcial.setText(String.valueOf(format2));
            total.setText(String.valueOf(format));
        }

    }
    public void promedioCorte(View view){
        Intent cambio= new Intent(view.getContext(), Calculo_de_Corte.class);
            startActivity(cambio);

    }
}
