package com.lighthouse.awfulandroid2;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class BugFoundAlertBuilder implements AdapterView.OnClickListener, AdapterView.OnLongClickListener {

    private final AlertDialog.Builder alertBuilder;
    private Context context;

    public BugFoundAlertBuilder(Context context) {
        this.context = context;
        alertBuilder = new AlertDialog.Builder(context);
    }

    @Override
    public boolean onLongClick(View view) {
        showBugFoundAlert();
        return true;
    }

    private void showBugFoundAlert() {
        alertBuilder.setTitle(context.getString(R.string.bug_found_text))
                    .setIcon(R.drawable.ic_bug_found)
                    .setMessage("Congratz! See if you can find more bugs!")
                    .setCancelable(false)
                    .setPositiveButton(R.string.stuck_button_got_it,
                                       (dialog, which) -> dialog.cancel());

        AlertDialog bugFoundAlert = alertBuilder.create();
        bugFoundAlert.show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, "Clicked!", Toast.LENGTH_SHORT).show();

    }
}
