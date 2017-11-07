package panjiangang.bwie.com.day04;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity implements TitleView.LeftCallBack {

    public TitleView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleView = (TitleView) findViewById(R.id.titleview_id);
        titleView.setCallBack(this);
    }

    @Override
    public void leftClick() {
        Toast.makeText(this, "leftClick", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void rightClick() {
        Toast.makeText(this, "rightClick", Toast.LENGTH_SHORT).show();
    }
}
