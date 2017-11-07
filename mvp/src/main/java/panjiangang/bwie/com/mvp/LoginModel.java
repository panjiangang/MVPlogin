package panjiangang.bwie.com.mvp;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by lenovo on 2017/11/02.
 */

public class LoginModel {
    public void login(String zh, String mm, final ModelCallBack callBack){
        OkHttpClient okHttpClient = new OkHttpClient();

        RequestBody body = new FormBody.Builder().add("pscid","39").add("page","1").build();

        Request request = new Request.Builder().url("http://120.27.23.105/product/getProducts").post(body).build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.failed(1);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                callBack.success(result);
            }
        });
    }
    interface ModelCallBack{
        public void success(String data);
        public void failed(int code);
    }
}
