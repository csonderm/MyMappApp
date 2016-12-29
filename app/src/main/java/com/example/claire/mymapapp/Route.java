package com.example.claire.mymapapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Claire on 12/26/2016.
 */

public class Route extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.route);

        TextView txtProduct = (TextView) findViewById(R.id.item_label_2);

        Intent i = getIntent();
        // getting attached intent data
        String item = i.getStringExtra("item");
        // displaying selected product name
        txtProduct.setText(item);
        txtProduct.setTextColor(Color.BLACK);

    }
}
