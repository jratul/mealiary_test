package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dorothy.mealiary.R;

public class HelpActivity extends BaseActivity {

    private Button btnRunFaq;
    private Button btnRunTutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());

        btnRunFaq = (Button) findViewById(R.id.btn_run_faq);
        btnRunTutorial = (Button) findViewById(R.id.btn_run_tutorial);

        btnRunFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(FaqActivity.class);
            }
        });

        btnRunTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(TutorialActivity.class);
            }
        });

    }


    private void runActivity(Class targetActivityClass) {
        Intent intent = new Intent(this, targetActivityClass);
        //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
