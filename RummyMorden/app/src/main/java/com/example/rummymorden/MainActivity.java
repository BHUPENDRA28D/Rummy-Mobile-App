package com.example.rummymorden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      ImageView img;
      Button btn;

      img = findViewById(R.id.idStart);
      btn =findViewById(R.id.btn);
      img.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Uri uri = Uri.parse("https://holyrummy.org/apks/rummymodern"); // missing 'http://' will cause crashed
              Intent intent = new Intent(Intent.ACTION_VIEW, uri);
              startActivity(intent);
          }
      });

      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Uri uri = Uri.parse("https://holyrummy.org/apks/rummymodern"); // missing 'http://' will cause crashed
              Intent intent = new Intent(Intent.ACTION_VIEW, uri);
              startActivity(intent);

          }
      });
    }

}