package com.example.closetome.work3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        Button edit=(Button)findViewById(R.id.button_edit);
        Button menu=(Button)findViewById(R.id.button_menu);
        menu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(index.this,LeftMenu.class);
                startActivity(intent);
            }
        });
//        menu.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(index.this,Edit.class);
//                startActivity(intent);
//            }
//        });
    }
}
