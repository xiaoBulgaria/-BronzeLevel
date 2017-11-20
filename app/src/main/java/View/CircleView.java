package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android on 2017/11/13.
 */

public class CircleView extends View{
    private Paint paint = new Paint();


    public CircleView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(15);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
       // canvas.drawCircle(300,300,200,paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        //canvas.drawPoint(50,50,paint);
        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
                8 /* 一共绘制 8 个数（4 个点）*/, paint);

    }
}
