package com.example.ppark.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ppark on 2016-10-03.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> arrayList;

    public CustomAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        Log.e("JSP", "getView position : " + position);
//        View view = LayoutInflater.from(context).inflate(R.layout.item_list_custom, null);
//
//        TextView textView = (TextView) view.findViewById(R.id.text);
//        textView.setText(arrayList.get(position));
//
//        return view;

        ViewHolder holder;
        if(convertView == null) {
            Log.e("JSP", "LayoutInflater position : " + position);

            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_custom, null);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.text);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(arrayList.get(position));

        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}


