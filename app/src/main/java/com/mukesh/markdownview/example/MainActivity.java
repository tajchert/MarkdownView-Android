package com.mukesh.markdownview.example;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.mukesh.MarkdownView;

public class MainActivity extends AppCompatActivity {
  MarkdownView markdownView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    markdownView = (MarkdownView) findViewById(R.id.markdown_view);
    //markdownView.loadMarkdownFromAssets("README.md");
    Handler handler = new Handler();
    final Runnable r = new Runnable() {
      public void run() {
        if(markdownView != null) {
          markdownView.setMarkDownText("# Hello World\nThis is a simple markdown");
        }
      }
    };

    handler.postDelayed(r, 1000);
  }
}
