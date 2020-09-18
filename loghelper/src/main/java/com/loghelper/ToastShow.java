package com.loghelper;

import android.content.Context;
import android.widget.Toast;

public class ToastShow {
    public void makeToastShort(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public void makeToastLong(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
