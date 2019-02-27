package git.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"abcd",Toast.LENGTH_SHORT).show();
        try {Thread.sleep(3000);} catch (Exception e) {}
        Toast.makeText(getApplicationContext(),"efgh",Toast.LENGTH_SHORT).show();
        try {Thread.sleep(3000);} catch (Exception e) {}
        Toast.makeText(getApplicationContext(),"ijkl",Toast.LENGTH_SHORT).show();
        try {Thread.sleep(3000);} catch (Exception e) {}
        Toast.makeText(getApplicationContext(),"mnop",Toast.LENGTH_SHORT).show();
        try {Thread.sleep(3000);} catch (Exception e) {}
        Toast.makeText(getApplicationContext(),"qrst",Toast.LENGTH_SHORT).show();
        try {Thread.sleep(3000);} catch (Exception e) {}
    }
}
