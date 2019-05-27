package com.example.aaliyakhan.driverapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class ListAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    ArrayList list;

    public ListAdapter(Context context, ArrayList list) {
        this.context = context;
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.item,null,false);
        TextView name,from,to;
        Button start;

        start=convertView.findViewById(R.id.start);
        name=convertView.findViewById(R.id.name);
        from=convertView.findViewById(R.id.from);
        to=convertView.findViewById(R.id.to);
        OrderData data=(OrderData) list.get(position);
        name.setText(data.getCustomername());
        from.setText("From : "+data.getFrom());
        to.setText("To : "+data.getTo());
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent intent=new Intent(context,MainActivity.class);
               String pos=""+position;
               intent.putExtra("pos",pos);
               context.startActivity(intent);
            }
        });
        return convertView;
    }
}
