package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dorothy.mealiary.R;

public class ManageActivity extends BaseActivity {

    private Button btnRunInvite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());

        btnRunInvite = (Button) findViewById(R.id.btn_run_invite);
        btnRunInvite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(InviteActivity.class);
            }
        });


    }

    private void runActivity(Class targetActivityClass) {
        Intent intent = new Intent(this, targetActivityClass);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
