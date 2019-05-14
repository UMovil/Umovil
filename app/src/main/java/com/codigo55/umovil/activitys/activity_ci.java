package com.codigo55.umovil.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.codigo55.umovil.R;

public class activity_ci extends AppCompatActivity{

    //
    WebView webView1,webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ci);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showToolbar(true);

        //
            webView1 = findViewById(R.id.webView1);
            webView2 = findViewById(R.id.webView2);

            WebSettings webSettings1 = webView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            webView1.setWebViewClient(new WebViewClient());
            webView1.loadUrl("https://www.youtube.com/embed/g2J2GScXm0U");

            WebSettings webSettings2 = webView2.getSettings();
            webSettings2.setJavaScriptEnabled(true);
            webView2.setWebViewClient(new WebViewClient());
            webView2.loadUrl("https://www.youtube.com/embed/g2J2GScXm0U");

        //
    }
    public void showToolbar(boolean upButton) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}


