package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class hassan2 extends AppCompatActivity {
TextView textView;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hassan2);
        textView =findViewById(R.id.text);
        btn= findViewById(R.id.code);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pro="";
                try {
                    InputStream inputStream= getAssets().open("c_sourceCode.c");
                    int c=inputStream.available();
                    byte[] space =new byte[c];
                    inputStream.read(space);
                    inputStream.close();
                    pro=new String(space);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                textView.setText((CharSequence)pro);
            }

        });

    }
}
