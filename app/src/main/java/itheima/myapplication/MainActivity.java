package itheima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View viewById = findViewById(R.id.activity_main);

        View viewById1 = findViewById(R.id.activity_main);
        View viewByI = findViewById(R.id.activity_main);
        View viewById2 = findViewById(R.id.activity_main);
    }
}
