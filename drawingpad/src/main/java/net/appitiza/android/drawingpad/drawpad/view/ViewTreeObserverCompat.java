package net.appitiza.android.drawingpad.drawpad.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewTreeObserver;

public final class ViewTreeObserverCompat {

    public static void removeOnGlobalLayoutListener(ViewTreeObserver observer, ViewTreeObserver.OnGlobalLayoutListener victim) {
        if (Build.VERSION.SDK_INT >= 16) {
            observer.removeOnGlobalLayoutListener(victim);
        }
        else {
            observer.removeGlobalOnLayoutListener(victim);
        }
    }
}
