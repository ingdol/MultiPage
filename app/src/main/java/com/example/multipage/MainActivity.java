package com.example.multipage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myListener(View target){ //버튼이 눌러지면 해당되는 액티비티를 실행한다.
        Intent intent = new Intent(getApplicationContext(), IntroActivity.class); //IntroActivity를 호출한다.
        startActivity(intent); //인텐트 시작
    }
    public void myListener1(View target){ //버튼이 눌러지면 해당되는 액티비티를 실행한다.
        Intent intent = new Intent(getApplicationContext(), SetupActivity.class); //SetupActivity를 호출한다.
        startActivity(intent); //인텐트 시작
    }
    public void myListener3(View target){ //버튼이 눌러지면 해당되는 액티비티를 실행한다.
        Intent intent = new Intent(getApplicationContext(), StartActivity.class); //StartActivity를 호출한다.
        startActivity(intent); //인텐트 시작
    }

}
