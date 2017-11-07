package panjiangang.bwie.com.mvp;

/**
 * Created by lenovo on 2017/11/02.
 */

public interface LoginView {
    // 手机号码为空
    public void zhEmpty();

    //    密码为空
    public void mmEmpty();

    // 登陆成功
    public void loginSuccess(Object object);

    //  登陆失败
    public void loginFailed(int code);

}

