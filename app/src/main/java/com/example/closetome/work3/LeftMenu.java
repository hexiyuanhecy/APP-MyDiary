package com.example.closetome.work3;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.left);
        final Button exit=(Button)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
}
