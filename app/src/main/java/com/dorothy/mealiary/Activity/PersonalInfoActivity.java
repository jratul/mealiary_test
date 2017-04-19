package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dorothy.mealiary.R;

public class PersonalInfoActivity extends BaseActivity {

    private Button btnGetSns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());

        btnGetSns = (Button) findViewById(R.id.btn_get_sns);
        btnGetSns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(GetSnsActivity.class);
            }
        });


    }

    private void runActivity(Class targetActivityClass) {
        Intent intent = new Intent(this, targetActivityClass);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
