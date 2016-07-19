package com.lighthouse.awfulandroid2;

import android.databinding.ObservableBoolean;

public class Bug {

    private ObservableBoolean found = new ObservableBoolean();
    private ObservableBoolean camouflage = new ObservableBoolean();
    private ObservableBoolean findable = new ObservableBoolean();

    public void setFound(boolean found) {
        this.found.set(found);
//        this.setEnabled(false);
    }

    public void setFindable(boolean canFind) {
        findable.set(canFind);
    }

    public boolean isFindable() {
        return findable.get();
    }

    public boolean found() {
        return found.get();
    }

    public boolean isCamouflaged() {
        return camouflage.get();
    }

    public void setCamouflage(boolean isCamouflage) {
        camouflage.set(isCamouflage);
//        this.setBackground(getResources().getDrawable(R.color.button_camouflage, null));
    }
}
