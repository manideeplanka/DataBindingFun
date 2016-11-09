package com.rapidbizapps.databindingfun;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rapidbizapps.databindingfun.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainBinding.greeting.setText("Glad to see you");

        User user = new User();
        user.setName("Hermione");



        mainBinding.setUser(user);

        user.setName("Harry");

    }
}
