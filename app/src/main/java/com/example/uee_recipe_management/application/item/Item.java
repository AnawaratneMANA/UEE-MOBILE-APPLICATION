package com.example.uee_recipe_management.application.item;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.uee_recipe_management.application.R;
import com.example.uee_recipe_management.application.bookmark.adapter.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.Objects;

public class Item extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.img_1, R.drawable.img_2, R.drawable.img_3,};
    ListView listView;
    TextView listText;

    //Array With Dummy values, This should be passed to from the item model class
            /**
             *  Reminder
             *  Refactor the model class and the item ingredients arraylist there. And pass to the
             *  This Activity.
             * **/
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        // Toolbar should be androidx version.
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //Registering the Image Slider.
        sliderView = findViewById(R.id.image_slider);
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        //Setting the data set to the List view (Ingredients)
        listView = findViewById(R.id.single_item_list_view);
        listText = findViewById(R.id.single_item_header);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item, R.id.single_item_header, mobileArray);
        listView.setAdapter(adapter);


    }
}