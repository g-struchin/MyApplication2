package com.example.a1.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //static public int themeMode=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*
        switch(themeMode) {
            case 3:
                setTheme(R.style.GreenTheme);

                break;
            case 1:
                setTheme(R.style.BlueTheme);

                break;
            case 2:
                setTheme(R.style.BrounTheme);

                break;
            default:
                setTheme(R.style.AppTheme);

                break;
        }

        */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClick(View view){
        Toast mytoast = Toast.makeText(this, "changed",Toast.LENGTH_SHORT);
        mytoast.show();
        //themeMode= 1;
        setTheme(R.style.BlueTheme);
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public  void onClick2(View view){
        Toast mytoast = Toast.makeText(this, "changed2",Toast.LENGTH_SHORT);
        mytoast.show();
        //themeMode=3;
        setTheme(R.style.GreenTheme);
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public  void onClick3(View view){
        Toast mytoast = Toast.makeText(this, "changed3",Toast.LENGTH_SHORT);
        mytoast.show();
        //themeMode=2;
        setTheme(R.style.BrounTheme);
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }


}