package com.example.trabalho_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.trabalho_android.models.Franquias;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewFranquias;
    private ArrayList<Franquias> franquias = new ArrayList<>();
    private FranquiaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateListView();
    }
    public void populateListView(){
        listViewFranquias = (ListView) findViewById(R.id.listViewFranquias);
        franquias.add(new Franquias("Mc Donalds", "Amo muito tudo isso","mcdonalds_logo_meaning"));
        franquias.add(new Franquias("Bobs","Pior que mc","bobs"));
        franquias.add(new Franquias("Burguer King","Melhor que Burguer King", "download__2_"));
        franquias.add(new Franquias("Subway", "Saudável","download__4_"));

        adapter = new FranquiaAdapter(this,franquias);
        listViewFranquias.setAdapter(adapter);
        listViewFranquias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "click to item:" + position, Toast.LENGTH_SHORT).show();
            }
    });
    }

}
