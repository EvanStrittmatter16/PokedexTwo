package com.example.pokedextwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class pokemon_activity extends AppCompatActivity {

    public static final String EXTRA_POKEMONID = "pokemonID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        int poksId = (Integer)getIntent().getExtras().get(EXTRA_POKEMONID);
        pokemon p = pokemon.poks[poksId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(p.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(p.getDescription());

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(p.getImageResourceID());
        photo.setContentDescription(p.getName());

    }




}
