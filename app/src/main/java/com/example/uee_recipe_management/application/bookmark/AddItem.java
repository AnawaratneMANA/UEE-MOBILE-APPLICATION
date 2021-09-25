package com.example.uee_recipe_management.application.bookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uee_recipe_management.application.R;

public class AddItem extends AppCompatActivity {

    Button addItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        addItem = findViewById(R.id.button_add);

        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(view.getContext(), SingleItemView.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}