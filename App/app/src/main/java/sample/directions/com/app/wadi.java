package sample.directions.com.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class wadi extends AppCompatActivity {
        Button w;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wadi);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        //Picasso.with(Intent).invalidate(file);
        Picasso.with(this)
                .load("http://192.168.43.244/capture_01.jpg")
                .into(imageView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        w=(Button)findViewById(R.id.ar);
        w.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Intent intent = new Intent("sample.directions.com.app.w2");
                startActivity(intent);
             ///

            }


        });

    }

}



