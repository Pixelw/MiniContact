package com.example.administrator.yalimasinei;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yalimasinei.bean.Contact;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2019/1/2.
 */

public class MyAdapter extends ArrayAdapter<Contact> {
    private  int resourceID;
    public MyAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource,objects);
        this.resourceID = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        super.getView(position, convertView, parent);
        Contact contact = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.contactName = (TextView)view.findViewById(R.id.Name);
            viewHolder.contactNumber = (TextView)view.findViewById(R.id.Number);
            viewHolder.contactImage = (ImageView)view.findViewById(R.id.call);
            view.setTag(viewHolder);
        } else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.contactNumber.setText(contact.getNumber());
        viewHolder.contactName.setText(contact.getName());
        return view;
    }
    class ViewHolder{
        TextView contactName;
        TextView contactNumber;
        ImageView contactImage;
    }
}
