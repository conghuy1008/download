package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.layout3);
        Button btn12 = (Button)findViewById(R.id.btn12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, MainActivity.class);
                startActivity(intent);

            }
        });

        super.onCreate(savedInstanceState);


    }
}
