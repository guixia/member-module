package com.fenlibao.member;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.fenlibao.common.base.BaseActivity;
import com.fenlibao.common.base.RoutePath;


@Route(path = RoutePath.MEMBER_1_URL_MAIN)
public class MainActivity extends BaseActivity {


    @Override
    public void init() {

    }

    @Override
    public void initViews() {
        Button bt_button1 = findViewById(R.id.bt_button1);
        bt_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RoutePath.APP_URL_MAIN).navigation();
                _activity.finish();
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.member_activity_home;
    }
}
