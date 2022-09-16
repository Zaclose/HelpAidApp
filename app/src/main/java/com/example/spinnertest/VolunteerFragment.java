package com.example.spinnertest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VolunteerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_volunteer, container, false);
        WebView web = (WebView) view.findViewById(R.id.projectsView);
        String url = "https://www.helpaidafrica.org/projects";
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);
        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView webView, String url)
            {
                webView.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName(header)$0.style.display='none'; " +
                        "document.getElementsByClassName(footer)" +
                        "})()");
            }
        });
        return view;
    }
}