package com.example.textview_spinner_autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    AutoCompleteTextView actv1;
    Spinner s1;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrSides = new ArrayList<>();
    ArrayList<String> arrFavorite = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = findViewById(R.id.lv1);
        actv1 = findViewById(R.id.actv1);
        s1 = findViewById(R.id.s1);

        arrNames.add("Yuta");
        arrNames.add("Itadori");
        arrNames.add("Megumi");
        arrNames.add("Nobara");
        arrNames.add("Maki");
        arrNames.add("Toji");
        arrNames.add("Choso");
        arrNames.add("Todo");
        arrNames.add("Nanami");
        arrNames.add("Yuta");
        arrNames.add("Itadori");
        arrNames.add("Megumi");
        arrNames.add("Nobara");
        arrNames.add("Maki");
        arrNames.add("Toji");
        arrNames.add("Choso");
        arrNames.add("Todo");
        arrNames.add("Nanami");

        ArrayAdapter<String> lvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrNames);
        lv1.setAdapter(lvAdapter);

        lv1.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(getApplicationContext(),"Jujutsu kaisen",Toast.LENGTH_SHORT).show();
        });

        arrSides.add("Curse Spirits");
        arrSides.add("Jujutsu Sourcers");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrSides);
        actv1.setAdapter(actvAdapter);
        actv1.setThreshold(1);

        arrFavorite.add("Yuta");
        arrFavorite.add("Megumi");
        arrFavorite.add("Yuji");

        ArrayAdapter<String> sAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrFavorite);
        s1.setAdapter(sAdapter);


    }
}