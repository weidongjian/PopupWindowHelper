package cn.xm.weidongjian.popupwindowhelper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import cn.xm.weidongjian.popuphelper.PopupWindowHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PopupWindowHelper popupWindowHelper;
    private View popupview, popupview_up, popupview_down;

    @SuppressLint("InflateParams")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);

        popupview = LayoutInflater.from(this).inflate(R.layout.popupview, null);
        popupview_up = LayoutInflater.from(this).inflate(R.layout.popupview_up, null);
        popupview_down = LayoutInflater.from(this).inflate(R.layout.popupview_down, null);

        popupview.findViewById(R.id.button3).setOnClickListener(this);
        popupview_up.findViewById(R.id.button3).setOnClickListener(this);
        popupview_down.findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                popupWindowHelper = new PopupWindowHelper(popupview_up);
                popupWindowHelper.showAsPopUp(v);
                break;
            case R.id.button2:
                popupWindowHelper = new PopupWindowHelper(popupview_down);
                popupWindowHelper.showAsDropDown(v, 0, 0);
                break;
            case R.id.button4:
                popupWindowHelper = new PopupWindowHelper(popupview);
                popupWindowHelper.showFromTop(v);
                break;
            case R.id.button5:
                popupWindowHelper = new PopupWindowHelper(popupview);
                popupWindowHelper.showFromBottom(v);
                break;
            case R.id.button3:
                popupWindowHelper.dismiss();
                break;
            default:
                break;
        }
    }
}
