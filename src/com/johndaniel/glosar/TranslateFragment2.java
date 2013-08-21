package com.johndaniel.glosar;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TranslateFragment2 extends Fragment {

	private  String text;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		text = getArguments().getString(TranslateHolder.FRAGMENT_TRANSLATION);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View v = inflater.inflate(R.layout.fragment_translate2,	container, false);
		
		TextView txtView = (TextView) v.findViewById(R.id.text2);
		if (text != null){
			txtView.setText(text);
		}
		return v;
	}
	
	
}