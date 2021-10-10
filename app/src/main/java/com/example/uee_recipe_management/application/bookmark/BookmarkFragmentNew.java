package com.example.uee_recipe_management.application.bookmark;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.uee_recipe_management.application.CustomArrayList.CustomArrayList;
import com.example.uee_recipe_management.application.R;
import com.example.uee_recipe_management.application.bookmark.adapter.BookmarkAdapter;
import com.example.uee_recipe_management.application.bookmark.model.RecipieItem;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class BookmarkFragmentNew extends Fragment {

    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    BookmarkAdapter bookmarkAdapter;
    ArrayList<RecipieItem> items;
    EditText searchBar;
    ImageButton fvrt_btn;

    FirebaseDatabase database;
    DatabaseReference databaseReference, fvrtref,fvrt_listRef;
    Boolean fvrtChecker = false;
    private CustomArrayList FirebaseAuth;
    //temp
    String currentUserid;


    public static BookmarkFragmentNew newInstance(String param1, String param2) {
        BookmarkFragmentNew fragment = new BookmarkFragmentNew();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bookmark2, container, false);
        /**
         * Search Bar Listener.
         * **/
        searchBar = view.findViewById(R.id.search_layout_search_2);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

//       FirebaseUser user = CustomArrayList.getInstance().getCurrentUser();
//       String currentUserId = user.getUid();

//       fvrtref = database.getReference("favourites");
//       fvrt_listRef = database.getReference("favouriteList").child(currentUserid);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("Fifth Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        images.add(R.drawable.image_1);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);
        images.add(R.drawable.image_5);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);
        images.add(R.drawable.image_1);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);
        images.add(R.drawable.image_1);
        images.add(R.drawable.image_2);
        images.add(R.drawable.image_3);
        images.add(R.drawable.image_4);


        bookmarkAdapter = new BookmarkAdapter(getContext(),titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter((RecyclerView.Adapter) bookmarkAdapter);

        return view;

    }
}