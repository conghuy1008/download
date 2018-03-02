package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.layout);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showActivity2
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);

            }
        });
        super.onCreate(savedInstanceState);

    }
}
