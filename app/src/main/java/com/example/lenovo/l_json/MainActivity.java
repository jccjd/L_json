package com.example.lenovo.l_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button mButtonJson;
private TextView mViewShowMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void init() {
     mButtonJson.setOnClickListener(this);
    }

    private void initView() {
        mButtonJson = (Button) findViewById(R.id.btn_Json);
        mViewShowMsg = (TextView) findViewById(R.id.tv_show_msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Json:
                json();
                break;
        }
    }

    private void json() {
        HttpUtil.requestNews(new Callback<HttpResult<List<news>>>() {
            @Override
            public void onResponse(Call<HttpResult<List<news>>> call, Response<HttpResult<List<news>>> response) {
                List<news> news = response.body().getData();
                for (news lnes:news) {
                    Log.i(TAG,lnes.toString());
                    mViewShowMsg.setText(lnes.toString());
                }
            }

            @Override
            public void onFailure(Call<HttpResult<List<news>>> call, Throwable t) {

            }
        });
    }
}
