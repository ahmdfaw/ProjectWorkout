package com.example.projectworkout.Activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.projectworkout.Adapter.WorkoutAdapter;
import com.example.projectworkout.Domain.Lession;
import com.example.projectworkout.Domain.Workout;
import com.example.projectworkout.R;
import com.example.projectworkout.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));

    }

    private ArrayList<Workout> getData() {
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Running","You just woke up. It is a brand new day. The canvas is blank. How do you begin? Take 21 minute to cultivate a peaceful mind and strong body","pic_1",160,"9 min", getLession_1()));
        list.add(new Workout("Stretching","You just woke up. It is a brand new day. The canvas is blank. How do you begin? Take 21 minute to cultivate a peaceful mind and strong body","pic_2",230,"85 min", getLession_2()));
        list.add(new Workout("yoga","You just woke up. It is a brand new day. The canvas is blank. How do you begin? Take 21 minute to cultivate a peaceful mind and strong body","pic_3",180,"65 min", getLession_3()));

        return list;
    }

    private ArrayList<Lession> getLession_1() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","03:46","HBPMvFkpNge","pic_1_1"));
        list.add(new Lession("Lession 2","03:41","K6I24WgiiPw","pic_1_2"));
        list.add(new Lession("Lession 3","01:46","Zc08v4YYOeA","pic_1_3"));

        return list;
    }

    private ArrayList<Lession> getLession_2() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","20:23","L3eImBAXT7I","pic_3_1"));
        list.add(new Lession("Lession 2","18:27","47ExgzO7Flu","pic_3_2"));
        list.add(new Lession("Lession 3","32:25","OmLx8tmaQ-4","pic_3_3"));
        list.add(new Lession("Lession 4","07:52","w86EalEoFRY","pic_3_4"));

        return list;
    }

    private ArrayList<Lession> getLession_3() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1","23:00","v7AYKMP6rOE","pic_3_1"));
        list.add(new Lession("Lession 2","27:00","Eml2xnoLpYE","pic_3_2"));
        list.add(new Lession("Lession 3","25:00","v75N-d4qXx0","pic_3_3"));
        list.add(new Lession("Lession 4","21:00","LqXZ628YNj4","pic_3_4"));

        return list;
    }
}