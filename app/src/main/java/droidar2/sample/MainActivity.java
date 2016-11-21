package droidar2.sample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import com.droidar2.system.ArActivity;
import com.droidar2.util.Support;

import java.io.File;

import droidar2.sample.setups.TestSetup;

public class MainActivity extends Activity {

    public static final float MIN_ACCURACY = 30f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Toast.makeText(this, Support.supportsAR(this) + "-", Toast.LENGTH_SHORT).show();

        ArActivity.startWithSetup(MainActivity.this,
                new GeoSetup(MainActivity.this, 28.411825, 77.041894,
                        new File(Environment.getExternalStorageDirectory(), "ar" + File.separator), "shuttl", MIN_ACCURACY, 500f, 500f, 30d));

//        ArActivity.startWithSetup(MainActivity.this, new TestSetup());


    }
}
