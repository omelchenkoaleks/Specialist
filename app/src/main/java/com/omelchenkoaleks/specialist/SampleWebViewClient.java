package com.omelchenkoaleks.specialist;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SampleWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
