package br.exemplolistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Atividade2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atividade2);
	}
	
	public void getBack(View view){
		finish();
	}
}
