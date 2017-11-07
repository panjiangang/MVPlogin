package panjiangang.bwie.com.day04;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by lenovo on 2017/11/03.
 */

public class TitleView extends LinearLayout {
    public TitleView(Context context) {
        this(context, null);
    }

    public TitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // setContentView
        View inflate = LayoutInflater.from(context).inflate(R.layout.kaoshi_title_layout, this);
        Button left = (Button) inflate.findViewById(R.id.left_btn);
        Button right = (Button) inflate.findViewById(R.id.right_btn);

        left.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.leftClick();
            }
        });

        right.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.rightClick();
            }
        });

    }

    public LeftCallBack callBack;
    public void setCallBack(LeftCallBack callBack) {
        this.callBack = callBack;
    }

    interface LeftCallBack {
        public void leftClick();

        public void rightClick();
    }
}
