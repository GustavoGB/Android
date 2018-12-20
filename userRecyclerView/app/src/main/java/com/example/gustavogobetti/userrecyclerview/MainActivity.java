package com.example.gustavogobetti.userrecyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mUsers_RecyclerView;
    private List<User> mUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsers_RecyclerView = (RecyclerView) findViewById(R.id.users_recyclerview);
        mUsers_RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Create the list of contacts to be added
        mUsers = new ArrayList<>();

        //Loop for adding contacts, less than 100...
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setmName("User #"+i);
            user.setnPhone("user"+ i + 975550223 );
            mUsers.add(user);
        }
        mUsers_RecyclerView.setAdapter(new UsersAdapter(mUsers));
    }

    class UsersAdapter extends RecyclerView.Adapter<UserViewHolder>{
        private List<User> mUsers;
        private UsersAdapter(List<User> users){
            super();
            this.mUsers = users;
        }

        @NonNull
        @Override
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new UserViewHolder(viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull UserViewHolder userViewHolder, int i) {
            userViewHolder.bind(this.mUsers.get(i));
        }

        @Override
        public int getItemCount() {
            return this.mUsers.size();
        }
    }

    class UserViewHolder extends RecyclerView.ViewHolder{

        private TextView mName;
        private TextView mPhone;

        public UserViewHolder(ViewGroup container){
            super(LayoutInflater.from(MainActivity.this).inflate(R.layout.user_list_item, container, false));
            mName = (TextView) itemView.findViewById(R.id.firstName_txt);
            mPhone = (TextView) itemView.findViewById(R.id.phone_txt);
        }

        public void bind(User user){
            mName.setText(user.getnName());
            mPhone.setText(user.getnPhone());
        }

    }


    class User{

        private String mName;
        private String nPhone;

        public void setmName(String mName) {
            this.mName = mName;
        }

        public String getnName() {
            return mName;
        }

        public void setnPhone(String nPhone) {
            this.nPhone = nPhone;
        }

        public String getnPhone() {
            return nPhone;
        }
    }


}



