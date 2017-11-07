package panjiangang.bwie.com.mvp;

import android.text.TextUtils;

/**
 * Created by lenovo on 2017/11/02.
 */

public class LoginPresenter {

    private LoginView loginView;
    private LoginModel loginModel;
    public LoginPresenter(LoginView loginView){
        this.loginView = loginView;
        loginModel = new LoginModel();
    }


    //清除数据
    public void detach(){
        this.loginView = null;
    }

    public void login(String zh,String mm){

        if (TextUtils.isEmpty(zh)){
            loginView.zhEmpty();
            return;
        }

        if (TextUtils.isEmpty(mm)){
            loginView.mmEmpty();
            return;
        }

        loginModel.login(zh,mm, new LoginModel.ModelCallBack() {
            @Override
            public void success(String data) {
                loginView.loginSuccess(data);
            }

            @Override
            public void failed(int code) {
                loginView.loginFailed(code);
            }
        });

    }

}
