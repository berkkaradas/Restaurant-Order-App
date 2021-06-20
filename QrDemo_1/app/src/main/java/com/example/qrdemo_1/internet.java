package com.example.qrdemo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class internet extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        webView = (WebView) findViewById(R.id.webview);
        // webView'i JavaScript kodlarını çalıştıracak şekilde set ediyoruz.
        webView.getSettings().setJavaScriptEnabled(true);

        // Sayfanın yüklendiğinin anlaşılması için ProgressDialog açıyoruz.
        final ProgressDialog progressDialog = ProgressDialog.show(this, "Click N Eat",
                "Sayfa Yükleniyor...", true);

        webView.setWebViewClient(new WebViewClient() {

            // Sayfa Yüklenirken bir hata oluşursa kullanıcıyı uyarıyoruz.
            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Sayfa Yüklenemedi!",
                        Toast.LENGTH_SHORT).show();
            }

            // Sayfanın yüklenme işlemi bittiğinde progressDialog'u kapatıyoruz.
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (progressDialog.isShowing())
                    progressDialog.dismiss();
            }
        });

        //Web sayfamızın url'ini webView'e yüklüyoruz.
        webView.loadUrl("https://www.google.com/");




    }
}