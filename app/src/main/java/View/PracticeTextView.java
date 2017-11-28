package View;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.icu.text.CollationKey;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.gene.android.hencoderlearn.R;

import java.util.Locale;

public class PracticeTextView extends View {

    public PracticeTextView(Context context) {
        super(context);
    }

    public PracticeTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PracticeTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        String text = "雨骨底条今直沿微写";
        float textHeight = 100f;
        paint.setTextSize(50);

        paint.setTextLocale(Locale.CHINA); // 中文
        canvas.drawText(text+"--------中文", 200, 100, paint);

        paint.setTextLocale(Locale.TAIWAN); // 台湾
        canvas.drawText(text+"--------弯弯", 200, 100+ textHeight, paint);

        paint.setTextLocale(Locale.JAPAN); // 日语
        canvas.drawText(text+"--------日语", 200, 100+ textHeight * 2, paint);

    }
}
