package ir.samanaslani.samanlibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
        setBackgroundResource(R.drawable.ic_android_black_24dp);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.ic_android_black_24dp);
    }
}
