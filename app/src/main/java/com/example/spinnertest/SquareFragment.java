package com.example.spinnertest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SquareFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_square, container, false);
        WebView web = (WebView) view.findViewById(R.id.squareView);
        String url = "https://checkout.square.site/merchant/MLKW5Y2YZYB6S/checkout/FXS5WXQ4HSN3N6QPTW2DXPLZ";
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);
        return view;
    }
}