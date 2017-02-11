package cn.xm.weidongjian.popupwindowhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import cn.xm.weidongjian.popuphelper.PopupWindowHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PopupWindowHelper popupWindowHelper;
    private View popView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        popView = LayoutInflater.from(this).inflate(R.layout.popupview, null);
        popupWindowHelper = new PopupWindowHelper(popView);
        popView.findViewById(R.id.button3).setOnClickListener(this);
        Log.d("weigan", "kkkk");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                popupWindowHelper.showAsPopUp(v);
                break;
            case R.id.button2:
                popupWindowHelper.showAsDropDown(v);
                break;
            case R.id.button3:
                popupWindowHelper.dismiss();
                break;
            case R.id.button4:
                popupWindowHelper.showFromTop(v);
                break;
            case R.id.button5:
                popupWindowHelper.showFromBottom(v);
                break;
            default:
                break;
        }
    }
}
