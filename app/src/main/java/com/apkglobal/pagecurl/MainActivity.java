package com.apkglobal.pagecurl;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity  {
PageCurlView pc;

//PDFView pv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pc=findViewById(R.id.pc);
        List<Integer> list=new ArrayList<>();
      /*list.add(R.drawable.c1);
      list.add(R.drawable.c2);
      list.add(R.drawable.c4);
        list.add(R.drawable.c8);
        list.add(R.drawable.c9);
        list.add(R.drawable.c11);
        list.add(R.drawable.c15);*/
      list.add(R.drawable.ak);
      list.add(R.drawable.ak1);
      list.add(R.drawable.c11);

      pc.setCurlView(list);
        pc.setCurlSpeed(300);







    }
}
