package panjiangang.bwie.com.lianxi.jdt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/11/01.
 */

public class Circle extends View{

    private Paint paint = new Paint();
    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //整体的颜色
        //canvas.drawColor(Color.YELLOW);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200/2,200/2,100,paint);
       // canvas.drawRect(0,0,200,200,paint);

        //        measureText  测量字符串的宽度
        float textWidth = paint.measureText("123");
        Rect rextText = new Rect();
//        rextText.height() 获取字符串的高度
        paint.getTextBounds("123", 0, "123".length(), rextText);

        int x = getWidth()/2-rextText.width()/2;
        int y = getHeight()/2+rextText.height()/2;

        paint.setTextSize(15);
        paint.setColor(Color.BLACK);
        canvas.drawText("123",x,y,paint);
    }


}
