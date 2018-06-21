package com.example.closetome.work3;

        import android.content.ContentValues;
        import android.content.Intent;
        import android.database.sqlite.SQLiteDatabase;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;


public class Login extends AppCompatActivity {

    private  MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHelper=new MyDatabaseHelper(this,"MyDiary",null,1);
        dbHelper.getWritableDatabase();

        SQLiteDatabase db=dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("user_name","15858197902");
        values.put("password","123456");
        values.put("days","20");
        values.put("logintime","20180621");
        values.put("items","30");
        db.insert("USWER",null,values);


        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        TextView reg=(TextView)findViewById(R.id.reg);
        Button login=(Button)findViewById(R.id.btn_login) ;
        reg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Reg.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,index.class);
                startActivity(intent);
            }
        });

    }
}
