package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class PracticeTestDrawColorView extends View {

    public PracticeTestDrawColorView(Context context) {
        super(context);
    }

    public PracticeTestDrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PracticeTestDrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Paint paint1 = new Paint();
        Paint paint2 = new Paint();


        Shader shader = new LinearGradient(100,100,500,500,Color.parseColor("#E91E93"),
                Color.parseColor("#2196F3"), Shader.TileMode.MIRROR);
        paint.setShader(shader);

        canvas.drawCircle(300,300,200,paint);


        Shader shader1 = new RadialGradient(700,300,200,Color.parseColor("#E91E93"),
                Color.parseColor("#2196F3"), Shader.TileMode.REPEAT);
        paint1.setShader(shader1);

        canvas.drawCircle(700,300,200,paint1);



        Shader shader2 = new SweepGradient(500, 500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"));
        paint2.setShader(shader2);

        canvas.drawCircle(500,500,200,paint2);



    }
}
