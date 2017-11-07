package panjiangang.bwie.com.lianxi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lenovo on 2017/10/31.
 */

public class Aa extends View {
    //定义的画笔
    private Paint paint =new Paint();
    public Aa(Context context) {
        super(context);
//        initData();
    }


//    private void initData() {
//        paint=new Paint();
//        paint.setColor(Color.YELLOW);
//        //变成空心
//        //paint.setStyle(Paint.Style.STROKE);
//    }

    public Aa(Context context, AttributeSet attrs) {
        super(context, attrs);
//        initData();
    }

    public Aa(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        initData();
    }

    //用来测量view的大小
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    //画布,用来显示的
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        //方块
        //第一个参数是距离左边多远,第二个参数是距离上边边多远,第三个参数是最终显示的宽,第四个是最终显示的高
        canvas.drawRect(10,50,200,200,paint);

        //写文字
        paint.setTextSize(50);//设置文字大小
        paint.setColor(Color.RED);
        //第一个参数是文本内容,第二个参数是X轴,第三个参数Y轴
        canvas.drawText("小小的石头", 50, 100, paint); //不带任何效果

        //定义颜色
        paint.setColor(Color.BLUE);
        //园
        //第一个参数是X轴,第二个参数是Y轴,第三个参数是圆的半径
        canvas.drawCircle(800/2,1000/2,200,paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(800/2,1000/2,100,paint);
    }
}
