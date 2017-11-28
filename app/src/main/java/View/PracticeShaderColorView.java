package View;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.gene.android.hencoderlearn.R;

public class PracticeShaderColorView extends View {

    public PracticeShaderColorView(Context context) {
        super(context);
    }

    public PracticeShaderColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PracticeShaderColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
        Shader shader = new BitmapShader(bitmap,Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);
        paint.setShader(shader);

        ColorFilter lightingColorFilter = new LightingColorFilter(0xffffff, 0x003000);
        paint.setColorFilter(lightingColorFilter);

        canvas.drawCircle(300,300,200,paint);
    }
}
