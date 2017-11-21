package View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(210f,210f,810f,710f,0,100,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(200f,200f,800f,700f,110,57,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(200f,200f,800f,700f,170,57,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(200f,200f,800f,700f,230,67,true,paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(200f,200f,800f,700f,300,17,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(200f,200f,800f,700f,320,17,true,paint);
        paint.setColor(Color.WHITE);
        canvas.drawArc(200f,200f,800f,700f,340,17,true,paint);

        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(700,650);
        path.lineTo(750, 700);
        path.rLineTo(50, 0);
        canvas.drawPath(path,paint);

        paint.setTextSize(16f);
        canvas.drawText("A", 810, 700, paint);


    }
}
