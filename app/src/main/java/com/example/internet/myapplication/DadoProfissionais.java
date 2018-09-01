package com.example.internet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DadoProfissionais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dado_profissionais);
        WebView myWebView = (WebView) findViewById(R.id.github);
        myWebView.loadUrl("https://github.com/vNNi");
    }


}
