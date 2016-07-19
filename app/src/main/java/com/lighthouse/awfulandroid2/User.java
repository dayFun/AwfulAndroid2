package com.lighthouse.awfulandroid2;

import android.databinding.ObservableField;

public class User {

    private ObservableField<String> loginName;

    public ObservableField<String> getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        if(NameValidator.checkName(loginName)) {
            this.loginName.set(loginName);
        }
    }
}
