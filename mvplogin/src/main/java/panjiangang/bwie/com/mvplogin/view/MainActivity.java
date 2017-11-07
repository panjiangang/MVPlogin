package panjiangang.bwie.com.mvplogin.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import panjiangang.bwie.com.mvplogin.R;
import panjiangang.bwie.com.mvplogin.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginPresenter.MainPresenter{

    private EditText phone,password;
    private Button login,reg;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        reg = (Button) findViewById(R.id.reg);
        loginPresenter = new LoginPresenter(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.loginClick("login", phone.getText().toString(), password.getText().toString());
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.regClick();
            }
        });
    }


    @Override
    public void lClick(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void rClick() {
        startActivity(new Intent(MainActivity.this, RegActivity.class));
    }
}
