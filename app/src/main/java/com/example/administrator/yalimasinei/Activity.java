package com.example.administrator.yalimasinei;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.yalimasinei.bean.Contact;
import com.example.administrator.yalimasinei.dao.MyHelper;
import com.example.administrator.yalimasinei.dao.MySQL;

public class Activity extends AppCompatActivity implements View.OnClickListener{
    private MyHelper myHelper = new MyHelper(this,"miniContact.db",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        init();
    }
    public void init(){
        Button quit = (Button)findViewById(R.id.button);
        quit.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                MySQL mySQL = new MySQL(myHelper);
                Contact  contact = new Contact("nico","13159202998");
                long code = mySQL.insert(contact);
                Toast.makeText(this, "success"+code, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
