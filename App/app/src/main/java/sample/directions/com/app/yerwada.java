package sample.directions.com.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class yerwada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yerwada);
        ImageView imageView = (ImageView) findViewById(R.id.imageButton);
        Picasso.with(this)
                .load("http://192.168.43.244/capture_001.jpg")
                .into(imageView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       Button w=(Button)findViewById(R.id.ar);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("sample.directions.com.app.y2");
                startActivity(intent);
            }
        });

    }


}
