package com.example.calculadora1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	double num1, num2, res;
	int operador;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    
    Button bsuma;
    Button br;
    Button bm;
    Button bd;
    
    Button bp;
    Button bb;
    
    Button bi;
    
    EditText Resultado;
    
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        
        bm = (Button) findViewById(R.id.bm);
        br = (Button) findViewById(R.id.br);
        bsuma = (Button) findViewById(R.id.bsuma);
        bd = (Button) findViewById(R.id.bd);
        
        bp = (Button) findViewById(R.id.bp);
        bb = (Button) findViewById(R.id.bb);
        bi = (Button) findViewById(R.id.bi);
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        
        bm.setOnClickListener(this);
        br.setOnClickListener(this);
        bsuma.setOnClickListener(this);
        bd.setOnClickListener(this);
        bp.setOnClickListener(this);
        bb.setOnClickListener(this);
        bi.setOnClickListener(this);
        
        
        
        Resultado = (EditText) findViewById(R.id.Resultado);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		Button b = (Button) v;
		System.out.println(b.getText());
		
		if(v == bi){
			num2 = Double.parseDouble(Resultado.getText().toString());
			switch(operador){
			case 1: 
				res = num1 + num2;
				break;
			case 2: 
				res = num1 - num2;
				break;
			case 3:
				res = num1 * num2;
				break;
			case 4:
				res = num1 / num2;
				break;
		}
			Resultado.setText(res + "");
			num1 = res;
			operador = 0;
			num2 = 0;
	}
		
		if(v == bsuma){
			num1 = Double.parseDouble(Resultado.getText().toString());
			operador = 1;
			Resultado.setText("");
		}
		
		if(v == br){
			num1 = Double.parseDouble(Resultado.getText().toString());
			Resultado.setText("");
			operador = 2;
			
		}
		
		if(v == bm){
			num1 = Double.parseDouble(Resultado.getText().toString());
			Resultado.setText("");
			operador = 3;
			
		}
		
		if(v == bd){
			num1 = Double.parseDouble(Resultado.getText().toString());
			Resultado.setText("");
			operador = 4;
			
		}
		
		if(v == bb){
			Resultado.setText("");
			num1 = 0;
			num2 = 0;
			operador = 0;
			res = 0;
		}
		
		if(v == bp || v == b0 || v == b1 || v == b2 || v == b3 || v == b4 || v == b5 || v == b6 ||v == b7 || v == b8 || v == b9){
			Button button = (Button) v;
			String caption = button.getText().toString();
			Resultado.setText(Resultado.getText() + caption);
		}
		
	}
}
