package com.example.kairos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static Button button_open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        OnClickButtonListner();
    }

    public void OnClickButtonListner(){
        button_open= (Button)findViewById(R.id.button);
        button_open.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.kairos.WebActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
