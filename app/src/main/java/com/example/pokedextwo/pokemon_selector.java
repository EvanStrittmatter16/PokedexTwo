package com.example.pokedextwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pokemon_selector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_selector);

        ArrayAdapter listAdapter = new ArrayAdapter<pokemon>(
                this,
                android.R.layout.simple_list_item_1,
                pokemon.drinks);
        ListView listDrinks = (ListView) findViewById(R.id.list_pokemon);
        listDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(pokemon_selector.this, pokemon_activity.class);

                        intent.putExtra(pokemon_activity.EXTRA_POKEMONID, (int) id);
                        startActivity(intent);
                    }
                };
        listDrinks.setOnItemClickListener(itemClickListener);
    }
}
