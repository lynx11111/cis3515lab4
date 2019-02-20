package edu.temple.cis3515lab4;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PaletteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Resources res = getResources();
        final String[] colors = res.getStringArray(R.array.Colors);


        ColorAdapter colorAdapter = new ColorAdapter(this, colors);


        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(colorAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);

                intent.putExtra("color", colors[position]);

                startActivity(intent);
            }
        });
    }
}
