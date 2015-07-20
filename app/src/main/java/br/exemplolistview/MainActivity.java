package br.exemplolistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<HashMap<String, String>> carros = new ArrayList<HashMap<String, String>>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, String> carro = new HashMap<String, String>();
			carro.put("carro", "Carro " + (i+1));
			carro.put("marca", "Marca " + (i+1));
			carros.add(carro); // add carro in ArrayList carros..
		}

		String[] from = new String[]{"carro", "marca"};

		//int layout = android.R.layout.two_line_list_item;
		int layout = R.layout.carros;

		int[] to = new int[]{R.id.t1, R.id.t2 };



		ListView lv = (ListView)findViewById(R.id.lv);
		lv.setAdapter(new SimpleAdapter(this, carros, layout, from, to));

		

	}
	
	public void getOut(View view){
		finish();
	}
}
