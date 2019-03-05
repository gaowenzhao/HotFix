package com.zhao.hotfix;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Bug2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);
        bugTest();
    }
    private void bugTest(){
        int i = 10;
        int a = 0;
        Toast.makeText(this, "Hello,Minuit:" + i / a, Toast.LENGTH_SHORT).show();
    }
}
