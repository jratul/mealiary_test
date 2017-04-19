package com.dorothy.mealiary.Activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.dorothy.mealiary.R;

public class AddMealActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());
    }

}
