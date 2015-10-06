package com.hw.corcow.samplespinner;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2015-10-06.
 */
public class MyAdapter extends BaseAdapter {

    ArrayList<String> items = new ArrayList<String>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public String getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView != null) {
            tv = (TextView)convertView;
        }
        else {
            tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null);
        }
        tv.setText(items.get(position));
        return tv;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView != null) {
            tv = (TextView)convertView;
        }
        else {
            tv = (TextView) LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null);
            tv.setLayoutParams(new Spinner.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            tv.setBackgroundColor(Color.YELLOW);
        }
        tv.setText(items.get(position));
        return tv;

    }
}
