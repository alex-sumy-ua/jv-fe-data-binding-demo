package com.example.databindingdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.databindingdemo.databinding.ActivityMainBinding;
import com.example.databindingdemo.model.Person;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Initialize the Person object and set it to the binding
        Person person = new Person("Simon", "35", "simon.morgan@northcoders.com");
        activityMainBinding.setPerson(person);
        activityMainBinding.setLifecycleOwner(this);
    }
}