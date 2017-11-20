package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        Paint paint = new Paint();
        Paint paint1 = new Paint();
        Paint paint2 = new Paint();

        canvas.drawCircle(100 ,100 ,50,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        canvas.drawCircle(300 ,100 ,50,paint);

        paint1.setColor(Color.BLUE);
        canvas.drawCircle(100 ,300 ,50,paint1);

        paint2.setColor(Color.BLUE);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(20);
        canvas.drawCircle(300 ,300 ,50,paint2);


    }
}
