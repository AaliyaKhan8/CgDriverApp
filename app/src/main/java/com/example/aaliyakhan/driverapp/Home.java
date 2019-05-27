package com.example.aaliyakhan.driverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ListView listView;
    ArrayList <OrderData>list=new ArrayList<OrderData>();
    Location location;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView=findViewById(R.id.listview);
        list.add(new OrderData("Ramesh","Tambaram","Kundratur"));
        list.add(new OrderData("Suresh","CMBT","Perungulathur"));
        list.add(new OrderData("Rajesh","Vadapalani","T.Nagar"));
        list.add(new OrderData("George","Sholinganllur","Tambaram"));

        listView.setAdapter(new ListAdapter(Home.this,list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                intent=new Intent(Home.this,MainActivity.class);
//                intent.putExtra("pos",position);
//                startActivity(intent);
//                //                location.setFromlocation(list.get(position).getFrom());
////                location.setTolocation(list.get(position).getTo());
//                Toast.makeText(Home.this, "item"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
