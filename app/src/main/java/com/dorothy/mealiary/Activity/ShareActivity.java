package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dorothy.mealiary.R;

public class ShareActivity extends BaseActivity {

    private Button btnException;
    private Button btnFacebook;
    private Button btnKakao;
    private Button btnBand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initToolbar(toolbar, this.getLocalClassName());

        btnException = (Button) findViewById(R.id.btn_exception);
        btnFacebook = (Button) findViewById(R.id.btn_facebook);
        btnKakao = (Button) findViewById(R.id.btn_kakao);
        btnBand = (Button) findViewById(R.id.btn_band);

        btnException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 5/0;
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(FacebookActivity.class);
            }
        });

        btnKakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(KakaotalkActivity.class);
            }
        });

        btnBand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runActivity(BandActivity.class);
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
