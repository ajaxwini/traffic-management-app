package sample.directions.com.app;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        onclick();
    }


    public void onclick() {
        but = (Button) findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE );
                boolean statusOfGPS = manager.isProviderEnabled(LocationManager.GPS_PROVIDER);
                if(statusOfGPS==true){
                Intent intent = new Intent("sample.directions.com.app.nav");
                startActivity(intent);}
                else{
                    Toast.makeText( getApplicationContext(),

                            "Please Switch on GPS",

                            Toast.LENGTH_SHORT ).show();
                    startActivityForResult(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS), 0);
                }
            }
        });
    }





}

