package itheima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View viewById = findViewById(R.id.activity_main);
        View f = findViewById(R.id.activity_main);

        View viewById1 = findViewById(R.id.activity_main);
        View viewByI = findViewById(R.id.activity_main);
        View viewById2 = findViewById(R.id.activity_main);
        TextView tv2 = (TextView) findViewById(R.id.tv2);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText("沃日你嗨。。。");
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("呵呵。。。");
        tv.setTextColor(getResources().getColor(R.color.colorAccent));
        tv.setTextSize(23);
        tv2.setText("怎么回事呢 ");
    }
}
