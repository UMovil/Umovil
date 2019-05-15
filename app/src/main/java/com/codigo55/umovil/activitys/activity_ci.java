package com.codigo55.umovil.activitys;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.codigo55.umovil.R;

public class activity_ci extends AppCompatActivity{

    //
    WebView webView1,webView2,webView3;

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
        webView3 = findViewById(R.id.webView3);

        WebSettings webSettings1 = webView1.getSettings();
        webView1.setWebChromeClient(new MyChrome ());
        webSettings1.setJavaScriptEnabled(true);
        webSettings1.setAllowFileAccess(true);
        webSettings1.setAppCacheEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://www.youtube.com/embed/jfacOd3Ahkc");

        WebSettings webSettings2 = webView2.getSettings();
        webView2.setWebChromeClient(new MyChrome ());
        webSettings2.setJavaScriptEnabled(true);
        webSettings2.setAllowFileAccess(true);
        webSettings2.setAppCacheEnabled(true);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://www.youtube.com/embed/WAzaFuVmQ98");

        WebSettings webSettings3 = webView3.getSettings();
        webView3.setWebChromeClient(new MyChrome ());
        webSettings3.setJavaScriptEnabled(true);
        webSettings3.setAllowFileAccess(true);
        webSettings3.setAppCacheEnabled(true);
        webView3.setWebViewClient(new WebViewClient());
        webView3.loadUrl("https://www.youtube.com/embed/Psq5Y7zukoQ");

        //
    }
    public void showToolbar(boolean upButton) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
    //
    private class MyChrome extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        protected FrameLayout mFullscreenContainer;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;

        MyChrome() {}

        public Bitmap getDefaultVideoPoster()
        {
            if (mCustomView == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView()
        {
            ((FrameLayout)getWindow().getDecorView()).removeView(this.mCustomView);
            this.mCustomView = null;
            getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
        }

        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
        {
            if (this.mCustomView != null)
            {
                onHideCustomView();
                return;
            }
            this.mCustomView = paramView;
            this.mOriginalSystemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            this.mOriginalOrientation = getRequestedOrientation();
            this.mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout)getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
            getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }
}