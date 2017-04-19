package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dorothy.mealiary.R;

public class RecommendActivity extends BaseActivity {

    private Button btnException;
    private Button btnAddRecommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());

        btnException = (Button) findViewById(R.id.btn_exception);
        btnException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 5/0;
            }
        });

        btnAddRecommend = (Button) findViewById(R.id.btn_run_add_meal);
        btnAddRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(AddMealActivity.class);
            }
        });
    }

    private void runActivity(Class targetActivityClass) {
        Intent intent = new Intent(this, targetActivityClass);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
