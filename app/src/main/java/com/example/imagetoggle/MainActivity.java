package com.example.imagetoggle;

import static com.example.imagetoggle.R.id.btn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView image;

    int images[]={R.drawable.cake1, R.drawable.cake2};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(btn1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image = findViewById(R.id.img1);
                image.setImageResource(images[i]);
                i++;
                if(i==2)
                    i=0;
            }
        });
    }
}