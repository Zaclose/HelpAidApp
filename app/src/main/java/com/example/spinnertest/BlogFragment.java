package com.example.spinnertest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class BlogFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentWebView web = (WebView) view.findViewById(R.id.blogView);
        View view = inflater.inflate(R.layout.fragment_blog, container, false);
        WebView web = (WebView) view.findViewById(R.id.blogView);
        String url = "https://www.helpaidafrica.org/blog";
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);
        return view;
    }
}