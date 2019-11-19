package com.example.a30259.eleven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    public String data = "hello second";
    public String data2 = "hello thrid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Button to_second = (Button)findViewById(R.id.to_second);
        to_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("2",data);
                startActivityForResult(intent,1);
            }
        });


    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1 :
                if(resultCode == RESULT_OK){
                    String result = data.getStringExtra("return");
                    Log.d("FirstActivity",result);
                }
        }
    }
}
