package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class ao {
    private static Field f1089a;

    static {
        try {
            f1089a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f1089a.setAccessible(true);
        } catch (Throwable e) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }

    static void m2617a(PopupWindow popupWindow, boolean z) {
        if (f1089a != null) {
            try {
                f1089a.set(popupWindow, Boolean.valueOf(z));
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }
}
