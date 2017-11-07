package panjiangang.bwie.com.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements LoginView{

    @BindView(R.id.zh)
    EditText zh;
    @BindView(R.id.mm)
    EditText mm;
    @BindView(R.id.dl)
    Button dl;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.dl)
    public void onViewClicked() {
        //点击登录,调用LoginPresenter中的login方法
        presenter.login(zh.getText().toString(),mm.getText().toString());
    }


    @Override
    public void zhEmpty() {
        Toast.makeText(MainActivity.this,"账号不能为空",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mmEmpty() {
        Toast.makeText(MainActivity.this,"密码不能为空",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(Object object) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void loginFailed(int code) {
        //Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
            }
        });
    }


    //页面关闭时调用
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //调用LoginPresenter 里的detach方法,清空数据
        presenter.detach();
    }
}
