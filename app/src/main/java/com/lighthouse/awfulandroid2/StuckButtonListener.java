package com.lighthouse.awfulandroid2;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;

import java.util.Random;

public class StuckButtonListener implements AdapterView.OnClickListener {

    private Context context;

    public StuckButtonListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        new AlertDialog.Builder(context)
                .setTitle("Stuck?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage(R.string.login_stuck_text)
                .setCancelable(false)
                .setPositiveButton(R.string.stuck_button_got_it, (dialog, button) -> dialog.cancel())
                .show();
    }

    private boolean changeBackgroundRandomly() {
        return new Random().nextInt(1) == 1;
    }
}
