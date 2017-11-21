package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        Paint paint = new Paint();

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5f);
        canvas.drawLine(20, 10, 20, 600, paint);
        canvas.drawLine(20, 600, 8000, 600, paint);


        float x = getWidth();
        float y = getHeight();


        canvas.drawRect(80, 500, 120, 600, paint);

        canvas.drawRect(200, 300, 240, 600, paint);
        paint.setTextSize(16f);
        canvas.drawText("A", 95, 640, paint);

        canvas.drawText("B", 215, 640, paint);



    }
}
