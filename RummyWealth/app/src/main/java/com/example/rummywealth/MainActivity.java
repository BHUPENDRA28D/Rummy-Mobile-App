package com.example.rummywealth;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.idImage);
      img.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Uri uri = Uri.parse("https://royallyrummy.online/apks/rummywealth"); // missing 'http://' will cause crashed
              Intent intent = new Intent(Intent.ACTION_VIEW, uri);
              startActivity(intent);

          }
      });

    }
}