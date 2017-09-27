package com.example.kairos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    private WebView MywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        MywebView = (WebView)findViewById(R.id.web);
        WebSettings webSettings = MywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        MywebView.loadUrl("http://putyourlink./");
        MywebView.setWebViewClient(new WebViewClient());
    }


    @Override
    public void onBackPressed() {
        if(MywebView.canGoBack()){
            MywebView.goBack();
        }else {

            super.onBackPressed();

        }

    }
}
