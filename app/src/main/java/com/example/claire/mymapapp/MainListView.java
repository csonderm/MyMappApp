package com.example.claire.mymapapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainListView extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // storing string resources into Array
        String[] items = getResources().getStringArray(R.array.items);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, items));

        ListView lv = getListView();

        // listening to single list item on click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // selected item
                String item = ((TextView) view).getText().toString();

                Class c;
                if(item.equals("Current Location") ){
                    c = CurrentLocation.class;
                } else if (item.equals("Route")) {
                    c = Route.class;
                } else {
                   c = Extra.class;
                }

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), c);
                // sending data to new activity

                i.putExtra("item", item);
                startActivity(i);

            }
        });
    }
}
