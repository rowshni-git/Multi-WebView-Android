package com.example.multi_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new MyBrowser());

        //set javascript enable in web view

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com/");
    }


    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);

            return true;
        }
    }

    //create test method

    public void test (View view){
        switch (view.getId()){

            case R.id.google:
                //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                //String date1 = sdf.format(new Date());
                webView.loadUrl("https://www.google.com/");
                break;

            case R.id.trello:
                webView.loadUrl("https://www.trello.com/");
                break;

            case R.id.gmail:
                webView.loadUrl("https://www.gmail.com/");
                break;


            case R.id.stack:
                webView.loadUrl("https://stackoverflow.com/");
                break;

            case R.id.rmgpp:
                webView.loadUrl("https://sites.google.com/rmgpp.org/web");
                break;

        }

    }


}
