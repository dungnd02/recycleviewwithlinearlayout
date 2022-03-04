package com.example.recyclerviewtrainning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {


    private Context mcontext;
    private List<User> mlistuser;


    public UserAdapter(Context mcontext){
        this.mcontext = mcontext;
    }
    public void setData(List<User> list){
        this.mlistuser = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  UserAdapter.UserViewHolder holder, int position) {
     User  user = mlistuser.get(position);
     if(user ==null){
         return;
     }
     holder.imgUser.setImageResource(user.getResourceID());
     holder.tvUser.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if(mlistuser !=null){
            return mlistuser.size();
        }
        return 0;
    }

    public  class UserViewHolder extends RecyclerView.ViewHolder{
      private ImageView imgUser;
      private TextView tvUser;


        public UserViewHolder(@NonNull  View itemView) {
            super(itemView);
            imgUser = itemView.findViewById(R.id.img_user);
            tvUser = itemView.findViewById(R.id.tv_name);


        }
    }

}
