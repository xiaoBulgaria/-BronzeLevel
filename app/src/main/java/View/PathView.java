package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * Created by Android on 2017/11/13.
 */

public class PathView extends View{
    private Paint paint = new Paint();
    private Path path = new Path();

    public PathView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

         path.addCircle(300,300,200, Path.Direction.CW);

        paint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path.rLineTo(100, 0);
        canvas.drawPath(path,paint);

        String text = "bulgaria";
        paint.setTextSize(18);
        canvas.drawText(text, 100, 25, paint);
        paint.setTextSize(36);
        canvas.drawText(text, 100, 70, paint);
        paint.setTextSize(60);
        canvas.drawText(text, 100, 145, paint);
        paint.setTextSize(84);
        canvas.drawText(text, 100, 240, paint);

    }
}
