package com.example.administrator.yalimasinei.dao;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.administrator.yalimasinei.bean.Contact;

/**
 * Created by Administrator on 2019/1/2.
 */

public class MySQL {
    private MyHelper myHelper;
    public MySQL(MyHelper myHelper){
        this.myHelper = myHelper;
    }
    public long insert(Contact contact){
        SQLiteDatabase db = myHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",contact.getName());
        values.put("number",contact.getNumber());
        long code = db.insert("Contact",null,values);
        return code;
    }
}
