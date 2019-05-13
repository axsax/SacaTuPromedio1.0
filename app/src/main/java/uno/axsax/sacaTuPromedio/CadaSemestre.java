package uno.axsax.sacaTuPromedio;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CadaSemestre extends AppCompatActivity {

    private TextView semestre;

    private EditText credito1;
    private EditText credito2;
    private EditText credito3;
    private EditText credito4;
    private EditText credito5;
    private EditText credito6;
    private EditText credito7;
    private EditText credito8;

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText nota4;
    private EditText nota5;
    private EditText nota6;
    private EditText nota7;
    private EditText nota8;

    private EditText materia1;
    private EditText materia2;
    private EditText materia3;
    private EditText materia4;
    private EditText materia5;
    private EditText materia6;
    private EditText materia7;
    private EditText materia8;

    private TextView Total;

    private EditText conocido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cada_semestre);

        semestre= (TextView)findViewById(R.id.semestreMostrar);
        String temporal="";
        temporal=getIntent().getStringExtra("primero");
        semestre.setText(temporal);
    recibir();

        if (temporal.equals("1 Semestre")){

            SharedPreferences guardado=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado.getString("materia1",""));
            materia2.setText(guardado.getString("materia2",""));
            materia3.setText(guardado.getString("materia3",""));
            materia4.setText(guardado.getString("materia4",""));
            materia5.setText(guardado.getString("materia5",""));
            materia6.setText(guardado.getString("materia6",""));
            materia7.setText(guardado.getString("materia7",""));
            materia8.setText(guardado.getString("materia8",""));

            credito1.setText(guardado.getString("credito1",""));
            credito2.setText(guardado.getString("credito2",""));
            credito3.setText(guardado.getString("credito3",""));
            credito4.setText(guardado.getString("credito4",""));
            credito5.setText(guardado.getString("credito5",""));
            credito6.setText(guardado.getString("credito6",""));
            credito7.setText(guardado.getString("credito7",""));
            credito8.setText(guardado.getString("credito8",""));

            nota1.setText(guardado.getString("nota1",""));
            nota2.setText(guardado.getString("nota2",""));
            nota3.setText(guardado.getString("nota3",""));
            nota4.setText(guardado.getString("nota4",""));
            nota5.setText(guardado.getString("nota5",""));
            nota6.setText(guardado.getString("nota6",""));
            nota7.setText(guardado.getString("nota7",""));
            nota8.setText(guardado.getString("nota8",""));

            Total.setText(guardado.getString("Total",""));
            conocido.setText(guardado.getString("Total",""));
        } else if (temporal.equals("2 Semestre")){

            SharedPreferences guardado2=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado2.getString("materia12",""));
            materia2.setText(guardado2.getString("materia22",""));
            materia3.setText(guardado2.getString("materia32",""));
            materia4.setText(guardado2.getString("materia42",""));
            materia5.setText(guardado2.getString("materia52",""));
            materia6.setText(guardado2.getString("materia62",""));
            materia7.setText(guardado2.getString("materia72",""));
            materia8.setText(guardado2.getString("materia82",""));

            credito1.setText(guardado2.getString("credito12",""));
            credito2.setText(guardado2.getString("credito22",""));
            credito3.setText(guardado2.getString("credito32",""));
            credito4.setText(guardado2.getString("credito42",""));
            credito5.setText(guardado2.getString("credito52",""));
            credito6.setText(guardado2.getString("credito62",""));
            credito7.setText(guardado2.getString("credito72",""));
            credito8.setText(guardado2.getString("credito82",""));

            nota1.setText(guardado2.getString("nota12",""));
            nota2.setText(guardado2.getString("nota22",""));
            nota3.setText(guardado2.getString("nota32",""));
            nota4.setText(guardado2.getString("nota42",""));
            nota5.setText(guardado2.getString("nota52",""));
            nota6.setText(guardado2.getString("nota62",""));
            nota7.setText(guardado2.getString("nota72",""));
            nota8.setText(guardado2.getString("nota82",""));

            Total.setText(guardado2.getString("Total2",""));
            conocido.setText(guardado2.getString("Total2",""));
        }else if (temporal.equals("3 Semestre")){

            SharedPreferences guardado3=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado3.getString("materia13",""));
            materia2.setText(guardado3.getString("materia23",""));
            materia3.setText(guardado3.getString("materia33",""));
            materia4.setText(guardado3.getString("materia43",""));
            materia5.setText(guardado3.getString("materia53",""));
            materia6.setText(guardado3.getString("materia63",""));
            materia7.setText(guardado3.getString("materia73",""));
            materia8.setText(guardado3.getString("materia83",""));

            credito1.setText(guardado3.getString("credito13",""));
            credito2.setText(guardado3.getString("credito23",""));
            credito3.setText(guardado3.getString("credito33",""));
            credito4.setText(guardado3.getString("credito43",""));
            credito5.setText(guardado3.getString("credito53",""));
            credito6.setText(guardado3.getString("credito63",""));
            credito7.setText(guardado3.getString("credito73",""));
            credito8.setText(guardado3.getString("credito83",""));

            nota1.setText(guardado3.getString("nota13",""));
            nota2.setText(guardado3.getString("nota23",""));
            nota3.setText(guardado3.getString("nota33",""));
            nota4.setText(guardado3.getString("nota43",""));
            nota5.setText(guardado3.getString("nota53",""));
            nota6.setText(guardado3.getString("nota63",""));
            nota7.setText(guardado3.getString("nota73",""));
            nota8.setText(guardado3.getString("nota83",""));

            Total.setText(guardado3.getString("Total3",""));
            conocido.setText(guardado3.getString("Total3",""));
        }else if (temporal.equals("4 Semestre")){

            SharedPreferences guardado4=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado4.getString("materia14",""));
            materia2.setText(guardado4.getString("materia24",""));
            materia3.setText(guardado4.getString("materia34",""));
            materia4.setText(guardado4.getString("materia44",""));
            materia5.setText(guardado4.getString("materia54",""));
            materia6.setText(guardado4.getString("materia64",""));
            materia7.setText(guardado4.getString("materia74",""));
            materia8.setText(guardado4.getString("materia84",""));

            credito1.setText(guardado4.getString("credito14",""));
            credito2.setText(guardado4.getString("credito24",""));
            credito3.setText(guardado4.getString("credito34",""));
            credito4.setText(guardado4.getString("credito44",""));
            credito5.setText(guardado4.getString("credito54",""));
            credito6.setText(guardado4.getString("credito64",""));
            credito7.setText(guardado4.getString("credito74",""));
            credito8.setText(guardado4.getString("credito84",""));

            nota1.setText(guardado4.getString("nota14",""));
            nota2.setText(guardado4.getString("nota24",""));
            nota3.setText(guardado4.getString("nota34",""));
            nota4.setText(guardado4.getString("nota44",""));
            nota5.setText(guardado4.getString("nota54",""));
            nota6.setText(guardado4.getString("nota64",""));
            nota7.setText(guardado4.getString("nota74",""));
            nota8.setText(guardado4.getString("nota84",""));

            Total.setText(guardado4.getString("Total4",""));
            conocido.setText(guardado4.getString("Total4",""));
        }else if (temporal.equals("5 Semestre")){
            SharedPreferences guardado5=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado5.getString("materia15",""));
            materia2.setText(guardado5.getString("materia25",""));
            materia3.setText(guardado5.getString("materia35",""));
            materia4.setText(guardado5.getString("materia45",""));
            materia5.setText(guardado5.getString("materia55",""));
            materia6.setText(guardado5.getString("materia65",""));
            materia7.setText(guardado5.getString("materia75",""));
            materia8.setText(guardado5.getString("materia85",""));

            credito1.setText(guardado5.getString("credito15",""));
            credito2.setText(guardado5.getString("credito25",""));
            credito3.setText(guardado5.getString("credito35",""));
            credito4.setText(guardado5.getString("credito45",""));
            credito5.setText(guardado5.getString("credito55",""));
            credito6.setText(guardado5.getString("credito65",""));
            credito7.setText(guardado5.getString("credito75",""));
            credito8.setText(guardado5.getString("credito85",""));

            nota1.setText(guardado5.getString("nota15",""));
            nota2.setText(guardado5.getString("nota25",""));
            nota3.setText(guardado5.getString("nota35",""));
            nota4.setText(guardado5.getString("nota45",""));
            nota5.setText(guardado5.getString("nota55",""));
            nota6.setText(guardado5.getString("nota65",""));
            nota7.setText(guardado5.getString("nota75",""));
            nota8.setText(guardado5.getString("nota85",""));

            Total.setText(guardado5.getString("Total5",""));
            conocido.setText(guardado5.getString("Total5",""));
        }else if (temporal.equals("6 Semestre")){
            SharedPreferences guardado6=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado6.getString("materia16",""));
            materia2.setText(guardado6.getString("materia26",""));
            materia3.setText(guardado6.getString("materia36",""));
            materia4.setText(guardado6.getString("materia46",""));
            materia5.setText(guardado6.getString("materia56",""));
            materia6.setText(guardado6.getString("materia66",""));
            materia7.setText(guardado6.getString("materia76",""));
            materia8.setText(guardado6.getString("materia86",""));

            credito1.setText(guardado6.getString("credito16",""));
            credito2.setText(guardado6.getString("credito26",""));
            credito3.setText(guardado6.getString("credito36",""));
            credito4.setText(guardado6.getString("credito46",""));
            credito5.setText(guardado6.getString("credito56",""));
            credito6.setText(guardado6.getString("credito66",""));
            credito7.setText(guardado6.getString("credito76",""));
            credito8.setText(guardado6.getString("credito86",""));

            nota1.setText(guardado6.getString("nota16",""));
            nota2.setText(guardado6.getString("nota26",""));
            nota3.setText(guardado6.getString("nota36",""));
            nota4.setText(guardado6.getString("nota46",""));
            nota5.setText(guardado6.getString("nota56",""));
            nota6.setText(guardado6.getString("nota66",""));
            nota7.setText(guardado6.getString("nota76",""));
            nota8.setText(guardado6.getString("nota86",""));

            Total.setText(guardado6.getString("Total6",""));
            conocido.setText(guardado6.getString("Total6",""));
        }else if (temporal.equals("7 Semestre")){
            SharedPreferences guardado7=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado7.getString("materia17",""));
            materia2.setText(guardado7.getString("materia27",""));
            materia3.setText(guardado7.getString("materia37",""));
            materia4.setText(guardado7.getString("materia47",""));
            materia5.setText(guardado7.getString("materia57",""));
            materia6.setText(guardado7.getString("materia67",""));
            materia7.setText(guardado7.getString("materia77",""));
            materia8.setText(guardado7.getString("materia87",""));

            credito1.setText(guardado7.getString("credito17",""));
            credito2.setText(guardado7.getString("credito27",""));
            credito3.setText(guardado7.getString("credito37",""));
            credito4.setText(guardado7.getString("credito47",""));
            credito5.setText(guardado7.getString("credito57",""));
            credito6.setText(guardado7.getString("credito67",""));
            credito7.setText(guardado7.getString("credito77",""));
            credito8.setText(guardado7.getString("credito87",""));

            nota1.setText(guardado7.getString("nota17",""));
            nota2.setText(guardado7.getString("nota27",""));
            nota3.setText(guardado7.getString("nota37",""));
            nota4.setText(guardado7.getString("nota47",""));
            nota5.setText(guardado7.getString("nota57",""));
            nota6.setText(guardado7.getString("nota67",""));
            nota7.setText(guardado7.getString("nota77",""));
            nota8.setText(guardado7.getString("nota87",""));

            Total.setText(guardado7.getString("Total7",""));
            conocido.setText(guardado7.getString("Total7",""));
        }else if (temporal.equals("8 Semestre")){
            SharedPreferences guardado8=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado8.getString("materia18",""));
            materia2.setText(guardado8.getString("materia28",""));
            materia3.setText(guardado8.getString("materia38",""));
            materia4.setText(guardado8.getString("materia48",""));
            materia5.setText(guardado8.getString("materia58",""));
            materia6.setText(guardado8.getString("materia68",""));
            materia7.setText(guardado8.getString("materia78",""));
            materia8.setText(guardado8.getString("materia88",""));

            credito1.setText(guardado8.getString("credito18",""));
            credito2.setText(guardado8.getString("credito28",""));
            credito3.setText(guardado8.getString("credito38",""));
            credito4.setText(guardado8.getString("credito48",""));
            credito5.setText(guardado8.getString("credito58",""));
            credito6.setText(guardado8.getString("credito68",""));
            credito7.setText(guardado8.getString("credito78",""));
            credito8.setText(guardado8.getString("credito88",""));

            nota1.setText(guardado8.getString("nota18",""));
            nota2.setText(guardado8.getString("nota28",""));
            nota3.setText(guardado8.getString("nota38",""));
            nota4.setText(guardado8.getString("nota48",""));
            nota5.setText(guardado8.getString("nota58",""));
            nota6.setText(guardado8.getString("nota68",""));
            nota7.setText(guardado8.getString("nota78",""));
            nota8.setText(guardado8.getString("nota88",""));

            Total.setText(guardado8.getString("Total8",""));
            conocido.setText(guardado8.getString("Total8",""));
        }else if (temporal.equals("9 Semestre")){
            SharedPreferences guardado9=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado9.getString("materia19",""));
            materia2.setText(guardado9.getString("materia29",""));
            materia3.setText(guardado9.getString("materia39",""));
            materia4.setText(guardado9.getString("materia49",""));
            materia5.setText(guardado9.getString("materia59",""));
            materia6.setText(guardado9.getString("materia69",""));
            materia7.setText(guardado9.getString("materia79",""));
            materia8.setText(guardado9.getString("materia89",""));

            credito1.setText(guardado9.getString("credito19",""));
            credito2.setText(guardado9.getString("credito29",""));
            credito3.setText(guardado9.getString("credito39",""));
            credito4.setText(guardado9.getString("credito49",""));
            credito5.setText(guardado9.getString("credito59",""));
            credito6.setText(guardado9.getString("credito69",""));
            credito7.setText(guardado9.getString("credito79",""));
            credito8.setText(guardado9.getString("credito89",""));

            nota1.setText(guardado9.getString("nota19",""));
            nota2.setText(guardado9.getString("nota29",""));
            nota3.setText(guardado9.getString("nota39",""));
            nota4.setText(guardado9.getString("nota49",""));
            nota5.setText(guardado9.getString("nota59",""));
            nota6.setText(guardado9.getString("nota69",""));
            nota7.setText(guardado9.getString("nota79",""));
            nota8.setText(guardado9.getString("nota89",""));

            Total.setText(guardado9.getString("Total9",""));
            conocido.setText(guardado9.getString("Total9",""));
        }else if (temporal.equals("10 Semestre")){
            SharedPreferences guardado10=  getSharedPreferences("datos",Context.MODE_PRIVATE);//para recuperar lo que se halla guardado
            materia1.setText(guardado10.getString("materia110",""));
            materia2.setText(guardado10.getString("materia210",""));
            materia3.setText(guardado10.getString("materia310",""));
            materia4.setText(guardado10.getString("materia410",""));
            materia5.setText(guardado10.getString("materia510",""));
            materia6.setText(guardado10.getString("materia610",""));
            materia7.setText(guardado10.getString("materia710",""));
            materia8.setText(guardado10.getString("materia810",""));

            credito1.setText(guardado10.getString("credito110",""));
            credito2.setText(guardado10.getString("credito210",""));
            credito3.setText(guardado10.getString("credito310",""));
            credito4.setText(guardado10.getString("credito410",""));
            credito5.setText(guardado10.getString("credito510",""));
            credito6.setText(guardado10.getString("credito610",""));
            credito7.setText(guardado10.getString("credito710",""));
            credito8.setText(guardado10.getString("credito810",""));

            nota1.setText(guardado10.getString("nota110",""));
            nota2.setText(guardado10.getString("nota210",""));
            nota3.setText(guardado10.getString("nota310",""));
            nota4.setText(guardado10.getString("nota410",""));
            nota5.setText(guardado10.getString("nota510",""));
            nota6.setText(guardado10.getString("nota610",""));
            nota7.setText(guardado10.getString("nota710",""));
            nota8.setText(guardado10.getString("nota810",""));

            Total.setText(guardado10.getString("Total10",""));
            conocido.setText(guardado10.getString("Total10",""));
        }


    }



    public void paraAtras(View view){
        Intent cambio= new Intent(this, MainActivity1.class);
        startActivity(cambio);
        finish();
    }
    public void recibir(){
        credito1=(EditText)findViewById(R.id.credito1);
        credito2=(EditText)findViewById(R.id.credito2);
        credito3=(EditText)findViewById(R.id.credito3);
        credito4=(EditText)findViewById(R.id.credito4);
        credito5=(EditText)findViewById(R.id.credito5);
        credito6=(EditText)findViewById(R.id.credito6);
        credito7=(EditText)findViewById(R.id.credito7);
        credito8=(EditText)findViewById(R.id.credito8);

        nota1=(EditText)findViewById(R.id.nota1);
        nota2=(EditText)findViewById(R.id.nota2);
        nota3=(EditText)findViewById(R.id.nota3);
        nota4=(EditText)findViewById(R.id.nota4);
        nota5=(EditText)findViewById(R.id.nota5);
        nota6=(EditText)findViewById(R.id.nota6);
        nota7=(EditText)findViewById(R.id.nota7);
        nota8=(EditText)findViewById(R.id.nota8);

        materia1=(EditText)findViewById(R.id.materia1);
        materia2=(EditText)findViewById(R.id.materia2);
        materia3=(EditText)findViewById(R.id.materia3);
        materia4=(EditText)findViewById(R.id.materia4);
        materia5=(EditText)findViewById(R.id.materia5);
        materia6=(EditText)findViewById(R.id.materia6);
        materia7=(EditText)findViewById(R.id.materia7);
        materia8=(EditText)findViewById(R.id.materia8);

        Total=(TextView) findViewById(R.id.total);

        conocido=(EditText)findViewById(R.id.conocidoo);
    }
    //finish(); permite terminar el activity
    public void calculo(View view){
        semestre= (TextView)findViewById(R.id.semestreMostrar);
        String temporal="";
        temporal=getIntent().getStringExtra("primero");




        if (!conocido.getText().toString().isEmpty()){

            if (temporal.equals("1 Semestre")){
                SharedPreferences preferencias= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias.edit();
                objEditor.putString("Total",conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                Total.setText(conocido.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("2 Semestre")){
                SharedPreferences preferencias2= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias2.edit();
                objEditor.putString("Total2",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("3 Semestre")){
                SharedPreferences preferencias3= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias3.edit();
                objEditor.putString("Total3",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("4 Semestre")){
                SharedPreferences preferencias4= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias4.edit();
                objEditor.putString("Total4",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("5 Semestre")){
                SharedPreferences preferencias5= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias5.edit();
                objEditor.putString("Total5",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("6 Semestre")){
                SharedPreferences preferencias6= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias6.edit();
                objEditor.putString("Total6",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("7 Semestre")){
                SharedPreferences preferencias7= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias7.edit();
                objEditor.putString("Total7",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("8 Semestre")){
                SharedPreferences preferencias8= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias8.edit();
                objEditor.putString("Total8",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("9 Semestre")){
                SharedPreferences preferencias9= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias9.edit();
                objEditor.putString("Total9",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }else if (temporal.equals("10 Semestre")){
                SharedPreferences preferencias10= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias10.edit();
                objEditor.putString("Total10",conocido.getText().toString());
                Total.setText(conocido.getText().toString());
                Toast.makeText(this,"Añadido Correctamente",Toast.LENGTH_LONG).show();
                objEditor.commit();
            }

        }else{

            if (temporal.equals("1 Semestre")){
                SharedPreferences preferencias= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias.edit();
                objEditor.putString("materia1",materia1.getText().toString());
                objEditor.putString("materia2",materia2.getText().toString());
                objEditor.putString("materia3",materia3.getText().toString());
                objEditor.putString("materia4",materia4.getText().toString());
                objEditor.putString("materia5",materia5.getText().toString());
                objEditor.putString("materia6",materia6.getText().toString());
                objEditor.putString("materia7",materia7.getText().toString());
                objEditor.putString("materia8",materia8.getText().toString());

                objEditor.putString("credito1",credito1.getText().toString());
                objEditor.putString("credito2",credito2.getText().toString());
                objEditor.putString("credito3",credito3.getText().toString());
                objEditor.putString("credito4",credito4.getText().toString());
                objEditor.putString("credito5",credito5.getText().toString());
                objEditor.putString("credito6",credito6.getText().toString());
                objEditor.putString("credito7",credito7.getText().toString());
                objEditor.putString("credito8",credito8.getText().toString());

                objEditor.putString("nota1",nota1.getText().toString());
                objEditor.putString("nota2",nota2.getText().toString());
                objEditor.putString("nota3",nota3.getText().toString());
                objEditor.putString("nota4",nota4.getText().toString());
                objEditor.putString("nota5",nota5.getText().toString());
                objEditor.putString("nota6",nota6.getText().toString());
                objEditor.putString("nota7",nota7.getText().toString());
                objEditor.putString("nota8",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("2 Semestre")){
                SharedPreferences preferencias2= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias2.edit();
                objEditor.putString("materia12",materia1.getText().toString());
                objEditor.putString("materia22",materia2.getText().toString());
                objEditor.putString("materia32",materia3.getText().toString());
                objEditor.putString("materia42",materia4.getText().toString());
                objEditor.putString("materia52",materia5.getText().toString());
                objEditor.putString("materia62",materia6.getText().toString());
                objEditor.putString("materia72",materia7.getText().toString());
                objEditor.putString("materia82",materia8.getText().toString());

                objEditor.putString("credito12",credito1.getText().toString());
                objEditor.putString("credito22",credito2.getText().toString());
                objEditor.putString("credito32",credito3.getText().toString());
                objEditor.putString("credito42",credito4.getText().toString());
                objEditor.putString("credito52",credito5.getText().toString());
                objEditor.putString("credito62",credito6.getText().toString());
                objEditor.putString("credito72",credito7.getText().toString());
                objEditor.putString("credito82",credito8.getText().toString());

                objEditor.putString("nota12",nota1.getText().toString());
                objEditor.putString("nota22",nota2.getText().toString());
                objEditor.putString("nota32",nota3.getText().toString());
                objEditor.putString("nota42",nota4.getText().toString());
                objEditor.putString("nota52",nota5.getText().toString());
                objEditor.putString("nota62",nota6.getText().toString());
                objEditor.putString("nota72",nota7.getText().toString());
                objEditor.putString("nota82",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("3 Semestre")){
                SharedPreferences preferencias3= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias3.edit();
                objEditor.putString("materia13",materia1.getText().toString());
                objEditor.putString("materia23",materia2.getText().toString());
                objEditor.putString("materia33",materia3.getText().toString());
                objEditor.putString("materia43",materia4.getText().toString());
                objEditor.putString("materia53",materia5.getText().toString());
                objEditor.putString("materia63",materia6.getText().toString());
                objEditor.putString("materia73",materia7.getText().toString());
                objEditor.putString("materia83",materia8.getText().toString());

                objEditor.putString("credito13",credito1.getText().toString());
                objEditor.putString("credito23",credito2.getText().toString());
                objEditor.putString("credito33",credito3.getText().toString());
                objEditor.putString("credito43",credito4.getText().toString());
                objEditor.putString("credito53",credito5.getText().toString());
                objEditor.putString("credito63",credito6.getText().toString());
                objEditor.putString("credito73",credito7.getText().toString());
                objEditor.putString("credito83",credito8.getText().toString());

                objEditor.putString("nota13",nota1.getText().toString());
                objEditor.putString("nota23",nota2.getText().toString());
                objEditor.putString("nota33",nota3.getText().toString());
                objEditor.putString("nota43",nota4.getText().toString());
                objEditor.putString("nota53",nota5.getText().toString());
                objEditor.putString("nota63",nota6.getText().toString());
                objEditor.putString("nota73",nota7.getText().toString());
                objEditor.putString("nota83",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("4 Semestre")){
                SharedPreferences preferencias4= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias4.edit();
                objEditor.putString("materia14",materia1.getText().toString());
                objEditor.putString("materia24",materia2.getText().toString());
                objEditor.putString("materia34",materia3.getText().toString());
                objEditor.putString("materia44",materia4.getText().toString());
                objEditor.putString("materia54",materia5.getText().toString());
                objEditor.putString("materia64",materia6.getText().toString());
                objEditor.putString("materia74",materia7.getText().toString());
                objEditor.putString("materia84",materia8.getText().toString());

                objEditor.putString("credito14",credito1.getText().toString());
                objEditor.putString("credito24",credito2.getText().toString());
                objEditor.putString("credito34",credito3.getText().toString());
                objEditor.putString("credito44",credito4.getText().toString());
                objEditor.putString("credito54",credito5.getText().toString());
                objEditor.putString("credito64",credito6.getText().toString());
                objEditor.putString("credito74",credito7.getText().toString());
                objEditor.putString("credito84",credito8.getText().toString());

                objEditor.putString("nota14",nota1.getText().toString());
                objEditor.putString("nota24",nota2.getText().toString());
                objEditor.putString("nota34",nota3.getText().toString());
                objEditor.putString("nota44",nota4.getText().toString());
                objEditor.putString("nota54",nota5.getText().toString());
                objEditor.putString("nota64",nota6.getText().toString());
                objEditor.putString("nota74",nota7.getText().toString());
                objEditor.putString("nota84",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("5 Semestre")){
                SharedPreferences preferencias5= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias5.edit();
                objEditor.putString("materia15",materia1.getText().toString());
                objEditor.putString("materia25",materia2.getText().toString());
                objEditor.putString("materia35",materia3.getText().toString());
                objEditor.putString("materia45",materia4.getText().toString());
                objEditor.putString("materia55",materia5.getText().toString());
                objEditor.putString("materia65",materia6.getText().toString());
                objEditor.putString("materia75",materia7.getText().toString());
                objEditor.putString("materia85",materia8.getText().toString());

                objEditor.putString("credito15",credito1.getText().toString());
                objEditor.putString("credito25",credito2.getText().toString());
                objEditor.putString("credito35",credito3.getText().toString());
                objEditor.putString("credito45",credito4.getText().toString());
                objEditor.putString("credito55",credito5.getText().toString());
                objEditor.putString("credito65",credito6.getText().toString());
                objEditor.putString("credito75",credito7.getText().toString());
                objEditor.putString("credito85",credito8.getText().toString());

                objEditor.putString("nota15",nota1.getText().toString());
                objEditor.putString("nota25",nota2.getText().toString());
                objEditor.putString("nota35",nota3.getText().toString());
                objEditor.putString("nota45",nota4.getText().toString());
                objEditor.putString("nota55",nota5.getText().toString());
                objEditor.putString("nota65",nota6.getText().toString());
                objEditor.putString("nota75",nota7.getText().toString());
                objEditor.putString("nota85",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("6 Semestre")){
                SharedPreferences preferencias6= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias6.edit();
                objEditor.putString("materia16",materia1.getText().toString());
                objEditor.putString("materia26",materia2.getText().toString());
                objEditor.putString("materia36",materia3.getText().toString());
                objEditor.putString("materia46",materia4.getText().toString());
                objEditor.putString("materia56",materia5.getText().toString());
                objEditor.putString("materia66",materia6.getText().toString());
                objEditor.putString("materia76",materia7.getText().toString());
                objEditor.putString("materia86",materia8.getText().toString());

                objEditor.putString("credito16",credito1.getText().toString());
                objEditor.putString("credito26",credito2.getText().toString());
                objEditor.putString("credito36",credito3.getText().toString());
                objEditor.putString("credito46",credito4.getText().toString());
                objEditor.putString("credito56",credito5.getText().toString());
                objEditor.putString("credito66",credito6.getText().toString());
                objEditor.putString("credito76",credito7.getText().toString());
                objEditor.putString("credito86",credito8.getText().toString());

                objEditor.putString("nota16",nota1.getText().toString());
                objEditor.putString("nota26",nota2.getText().toString());
                objEditor.putString("nota36",nota3.getText().toString());
                objEditor.putString("nota46",nota4.getText().toString());
                objEditor.putString("nota56",nota5.getText().toString());
                objEditor.putString("nota66",nota6.getText().toString());
                objEditor.putString("nota76",nota7.getText().toString());
                objEditor.putString("nota86",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("7 Semestre")){
                SharedPreferences preferencias7= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias7.edit();
                objEditor.putString("materia17",materia1.getText().toString());
                objEditor.putString("materia27",materia2.getText().toString());
                objEditor.putString("materia37",materia3.getText().toString());
                objEditor.putString("materia47",materia4.getText().toString());
                objEditor.putString("materia57",materia5.getText().toString());
                objEditor.putString("materia67",materia6.getText().toString());
                objEditor.putString("materia77",materia7.getText().toString());
                objEditor.putString("materia87",materia8.getText().toString());

                objEditor.putString("credito17",credito1.getText().toString());
                objEditor.putString("credito27",credito2.getText().toString());
                objEditor.putString("credito37",credito3.getText().toString());
                objEditor.putString("credito47",credito4.getText().toString());
                objEditor.putString("credito57",credito5.getText().toString());
                objEditor.putString("credito67",credito6.getText().toString());
                objEditor.putString("credito77",credito7.getText().toString());
                objEditor.putString("credito87",credito8.getText().toString());

                objEditor.putString("nota17",nota1.getText().toString());
                objEditor.putString("nota27",nota2.getText().toString());
                objEditor.putString("nota37",nota3.getText().toString());
                objEditor.putString("nota47",nota4.getText().toString());
                objEditor.putString("nota57",nota5.getText().toString());
                objEditor.putString("nota67",nota6.getText().toString());
                objEditor.putString("nota77",nota7.getText().toString());
                objEditor.putString("nota87",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("8 Semestre")){
                SharedPreferences preferencias8= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias8.edit();
                objEditor.putString("materia18",materia1.getText().toString());
                objEditor.putString("materia28",materia2.getText().toString());
                objEditor.putString("materia38",materia3.getText().toString());
                objEditor.putString("materia48",materia4.getText().toString());
                objEditor.putString("materia58",materia5.getText().toString());
                objEditor.putString("materia68",materia6.getText().toString());
                objEditor.putString("materia78",materia7.getText().toString());
                objEditor.putString("materia88",materia8.getText().toString());

                objEditor.putString("credito18",credito1.getText().toString());
                objEditor.putString("credito28",credito2.getText().toString());
                objEditor.putString("credito38",credito3.getText().toString());
                objEditor.putString("credito48",credito4.getText().toString());
                objEditor.putString("credito58",credito5.getText().toString());
                objEditor.putString("credito68",credito6.getText().toString());
                objEditor.putString("credito78",credito7.getText().toString());
                objEditor.putString("credito88",credito8.getText().toString());

                objEditor.putString("nota18",nota1.getText().toString());
                objEditor.putString("nota28",nota2.getText().toString());
                objEditor.putString("nota38",nota3.getText().toString());
                objEditor.putString("nota48",nota4.getText().toString());
                objEditor.putString("nota58",nota5.getText().toString());
                objEditor.putString("nota68",nota6.getText().toString());
                objEditor.putString("nota78",nota7.getText().toString());
                objEditor.putString("nota88",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("9 Semestre")){
                SharedPreferences preferencias9= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias9.edit();
                objEditor.putString("materia19",materia1.getText().toString());
                objEditor.putString("materia29",materia2.getText().toString());
                objEditor.putString("materia39",materia3.getText().toString());
                objEditor.putString("materia49",materia4.getText().toString());
                objEditor.putString("materia59",materia5.getText().toString());
                objEditor.putString("materia69",materia6.getText().toString());
                objEditor.putString("materia79",materia7.getText().toString());
                objEditor.putString("materia89",materia8.getText().toString());

                objEditor.putString("credito19",credito1.getText().toString());
                objEditor.putString("credito29",credito2.getText().toString());
                objEditor.putString("credito39",credito3.getText().toString());
                objEditor.putString("credito49",credito4.getText().toString());
                objEditor.putString("credito59",credito5.getText().toString());
                objEditor.putString("credito69",credito6.getText().toString());
                objEditor.putString("credito79",credito7.getText().toString());
                objEditor.putString("credito89",credito8.getText().toString());

                objEditor.putString("nota19",nota1.getText().toString());
                objEditor.putString("nota29",nota2.getText().toString());
                objEditor.putString("nota39",nota3.getText().toString());
                objEditor.putString("nota49",nota4.getText().toString());
                objEditor.putString("nota59",nota5.getText().toString());
                objEditor.putString("nota69",nota6.getText().toString());
                objEditor.putString("nota79",nota7.getText().toString());
                objEditor.putString("nota89",nota8.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("10 Semestre")){
                SharedPreferences preferencias10= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias10.edit();
                objEditor.putString("materia110",materia1.getText().toString());
                objEditor.putString("materia210",materia2.getText().toString());
                objEditor.putString("materia310",materia3.getText().toString());
                objEditor.putString("materia410",materia4.getText().toString());
                objEditor.putString("materia510",materia5.getText().toString());
                objEditor.putString("materia610",materia6.getText().toString());
                objEditor.putString("materia710",materia7.getText().toString());
                objEditor.putString("materia810",materia8.getText().toString());

                objEditor.putString("credito110",credito1.getText().toString());
                objEditor.putString("credito210",credito2.getText().toString());
                objEditor.putString("credito310",credito3.getText().toString());
                objEditor.putString("credito410",credito4.getText().toString());
                objEditor.putString("credito510",credito5.getText().toString());
                objEditor.putString("credito610",credito6.getText().toString());
                objEditor.putString("credito710",credito7.getText().toString());
                objEditor.putString("credito810",credito8.getText().toString());

                objEditor.putString("nota110",nota1.getText().toString());
                objEditor.putString("nota210",nota2.getText().toString());
                objEditor.putString("nota310",nota3.getText().toString());
                objEditor.putString("nota410",nota4.getText().toString());
                objEditor.putString("nota510",nota5.getText().toString());
                objEditor.putString("nota610",nota6.getText().toString());
                objEditor.putString("nota710",nota7.getText().toString());
                objEditor.putString("nota810",nota8.getText().toString());
                objEditor.commit();
            }





            int creditoUno=0;int creditoDos=0;int creditoTres=0;int creditoCuatro=0;int creditoCinco=0;
            int creditoSeis=0;int creditoSiete=0;int creditoOcho=0;int creditoNueve=0;int creditoDiez=0 ;

            double notaUno=0.0;double notaDos=0.0;double notaTres=0.0;double notaCuatro=0.0;double notaCinco=0.0;
            double notaSeis=0.0;double notaSiete=0.0;double notaOcho=0.0;double notaNueve=0.0;double notaDiez=0.0;
            double totalito=0.0;double totalito1=0.0;
            int totalCreditos=0;

            boolean saber=true;
            if (!credito1.getText().toString().isEmpty()){
                if (nota1.getText().toString().isEmpty()){

                    saber=false;
                }else{
                    creditoUno=Integer.parseInt(credito1.getText().toString());
                    notaUno=Double.parseDouble(nota1.getText().toString());
                    totalito=(notaUno*creditoUno);
                    totalCreditos=totalCreditos+creditoUno;
                }
            }
            if (!credito2.getText().toString().isEmpty()){
                if (nota2.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoDos=Integer.parseInt(credito2.getText().toString());
                    notaDos=Double.parseDouble(nota2.getText().toString());
                    totalito=totalito+(notaDos*creditoDos);
                    totalCreditos=totalCreditos+creditoDos;
                }
            }
            if (!credito3.getText().toString().isEmpty()){
                if (nota3.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoTres=Integer.parseInt(credito3.getText().toString());
                    notaTres=Double.parseDouble(nota3.getText().toString());
                    totalito=totalito+(notaTres*creditoTres);
                    totalCreditos=totalCreditos+creditoTres;
                }
            }
            if (!credito4.getText().toString().isEmpty()){
                if (nota4.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoCuatro=Integer.parseInt(credito4.getText().toString());
                    notaCuatro=Double.parseDouble(nota4.getText().toString());
                    totalito=totalito+(notaCuatro*creditoCuatro);
                    totalCreditos=totalCreditos+creditoCuatro;
                }
            }
            if (!credito5.getText().toString().isEmpty()){
                if (nota5.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoCinco=Integer.parseInt(credito5.getText().toString());
                    notaCinco=Double.parseDouble(nota5.getText().toString());
                    totalito=totalito+(notaCinco*creditoCinco);
                    totalCreditos=totalCreditos+creditoCinco;
                }
            }
            if (!credito6.getText().toString().isEmpty()){
                if (nota6.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoSeis=Integer.parseInt(credito6.getText().toString());
                    notaSeis=Double.parseDouble(nota6.getText().toString());
                    totalito=totalito+(notaSeis*creditoSeis);
                    totalCreditos=totalCreditos+creditoSeis;
                }
            }
            if (!credito7.getText().toString().isEmpty()){
                if (nota7.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoSiete=Integer.parseInt(credito7.getText().toString());
                    notaSiete=Double.parseDouble(nota7.getText().toString());
                    totalito=totalito+(notaSiete*creditoSiete);
                    totalCreditos=totalCreditos+creditoSiete;
                }
            }
            if (!credito8.getText().toString().isEmpty()){
                if (nota8.getText().toString().isEmpty()){
                    saber=false;
                }else{
                    creditoOcho=Integer.parseInt(credito8.getText().toString());
                    notaOcho=Double.parseDouble(nota8.getText().toString());
                    totalito=totalito+(notaOcho*creditoOcho);
                    totalCreditos=totalCreditos+creditoOcho;
                }
            }

            if (saber==false){
                Toast.makeText(this,"Rellena el credito o la nota faltante que estas digitando",Toast.LENGTH_LONG).show();
            }else{
                System.out.println(totalito/totalCreditos);
                Double sal=totalito/totalCreditos;
                BigDecimal format=new BigDecimal(sal);
                format=format.setScale(2,RoundingMode.DOWN);

                Total.setText(String.valueOf(format));
            }

            if (temporal.equals("1 Semestre")){
                SharedPreferences preferencias= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias.edit();
                objEditor.putString("Total",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("2 Semestre")){
                SharedPreferences preferencias2= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias2.edit();
                objEditor.putString("Total2",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("3 Semestre")){
                SharedPreferences preferencias3= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias3.edit();
                objEditor.putString("Total3",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("4 Semestre")){
                SharedPreferences preferencias4= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias4.edit();
                objEditor.putString("Total4",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("5 Semestre")){
                SharedPreferences preferencias5= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias5.edit();
                objEditor.putString("Total5",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("6 Semestre")){
                SharedPreferences preferencias6= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias6.edit();
                objEditor.putString("Total6",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("7 Semestre")){
                SharedPreferences preferencias7= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias7.edit();
                objEditor.putString("Total7",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("8 Semestre")){
                SharedPreferences preferencias8= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias8.edit();
                objEditor.putString("Total8",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("9 Semestre")){
                SharedPreferences preferencias9= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias9.edit();
                objEditor.putString("Total9",Total.getText().toString());
                objEditor.commit();
            }else if (temporal.equals("10 Semestre")){
                SharedPreferences preferencias10= getSharedPreferences("datos",Context.MODE_PRIVATE);//son iguales al de OnCreate
                SharedPreferences.Editor objEditor=preferencias10.edit();
                objEditor.putString("Total10",Total.getText().toString());
                objEditor.commit();
            }

        }


       // objEditor.commit();//confirma que lo que acabamos de recuperar, lo queremos guardar
    }
}
