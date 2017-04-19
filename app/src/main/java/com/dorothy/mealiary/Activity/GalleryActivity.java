package com.dorothy.mealiary.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.dorothy.mealiary.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class GalleryActivity extends BaseActivity {

    private ImageView galleryImage;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        galleryImage = (ImageView) findViewById(R.id.gallery_image);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        new GetImageTask().execute();

    }

    public class GetImageTask extends AsyncTask<Void, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(Void... params) {
            try {
                bitmap = BitmapFactory.decodeStream((InputStream) new URL("http://upload.inven.co.kr/upload/2014/12/13/bbs/i4244511366.jpg").getContent());

                return bitmap;

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            galleryImage.setImageBitmap(result);
        }

    }
}
