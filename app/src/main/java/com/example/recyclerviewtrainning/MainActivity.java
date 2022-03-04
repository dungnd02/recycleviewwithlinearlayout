package com.example.recyclerviewtrainning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvuser;
private UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvuser  = findViewById(R.id.rcv_user);
       userAdapter = new UserAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvuser.setLayoutManager(linearLayoutManager);
        userAdapter.setData(getListUser());
        rcvuser.setAdapter(userAdapter);

    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"UserName 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"UserName 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"UserName 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"UserName 4"));

        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"UserName 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"UserName 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"UserName 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"UserName 4"));

        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"UserName 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"UserName 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"UserName 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"UserName 4"));

        list.add(new User(R.drawable.z2886585750344_a864093541b57f2c5bfeca1c73001c2a,"UserName 1"));
        list.add(new User(R.drawable.z2886588959466_09e1722641d53e6393685d253656ba36,"UserName 2"));
        list.add(new User(R.drawable.z2886590750036_a864093541b57f2c5bfeca1c73001c2a,"UserName 3"));
        list.add(new User(R.drawable.z2886592925943_9952711bedfd47728f31814d598155a7,"UserName 4"));

        return  list;
    }
}