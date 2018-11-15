package com.rishab.rxjavapractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnCompositeDisposable, R.id.btnCustomDataType})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnCompositeDisposable:
                startActivity(new Intent(MainActivity.this, CompositeDisposableActivity.class));
                break;
            case R.id.btnCustomDataType:
                //TODO next example
                break;
        }
    }
}
