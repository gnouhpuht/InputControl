package com.example.inputcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToat1(View view){
        Toast.makeText(this,"Gà sốt vang",Toast.LENGTH_SHORT).show();
    }
    public void showToat2(View view){
        Toast.makeText(this,"Trứng cút xào me",Toast.LENGTH_SHORT).show();
    }
    public void showToat3(View view){
        Toast.makeText(this,"cơm cuộn hàn quốc",Toast.LENGTH_SHORT).show();
    }
    public void showToat4(View view){
        Toast.makeText(this,"kim chi củ cải",Toast.LENGTH_SHORT).show();
    }
    public void showToat5(View view){
        Toast.makeText(this,"Trà đào",Toast.LENGTH_SHORT).show();
    }
    public void showToat6(View view){
        Toast.makeText(this,"Trà sữa ô long",Toast.LENGTH_SHORT).show();
    }

}
