package com.lighthouse.awfulandroid2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lighthouse.awfulandroid2.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        User user = new User();
        binding.setUser(user);

        BugFoundAlertBuilder bugFoundAlertBuilder = new BugFoundAlertBuilder(this);
        binding.setBugFoundAlertBuilder(bugFoundAlertBuilder);


        StuckButtonListener stuckButtonListener = new StuckButtonListener(this);
        binding.setStuckButtonListener(stuckButtonListener);
    }
}
