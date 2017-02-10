package com.example.prasanth.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LifeCycleActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        Button nxtActivityBtn;
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate()",Toast.LENGTH_SHORT).show();
        nxtActivityBtn=(Button)findViewById(R.id.nxtactbutton);
        nxtActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LifeCycleActivity.this,SampleActivity.class);
                startActivity(intent);
            }
        });
    }

public void onStart()
{
    super.onStart();
    Toast.makeText(this,"onStart()",Toast.LENGTH_SHORT).show();
}
    public void onResume()
    {
        super.onResume();
        Toast.makeText(this,"onResume()",Toast.LENGTH_SHORT).show();
    }
    public void onPause()
    {
        super.onPause();
        Toast.makeText(this,"onPause()",Toast.LENGTH_SHORT).show();
    }
    public void onStop() {
    super.onStop();
        Toast.makeText(this,"onStop()",Toast.LENGTH_SHORT).show();
    }
    public void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRestart()",Toast.LENGTH_SHORT).show();
    }
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"onDestroy()",Toast.LENGTH_SHORT).show();
    }
}
