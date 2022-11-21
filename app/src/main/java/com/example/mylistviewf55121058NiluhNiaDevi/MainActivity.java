package com.example.mylistviewf55121058NiluhNiaDevi;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] dataName = {"Cut Nyak Dien","Ki Hajar Dewantara","Moh Yamin","Patimura","R A Kartini", "Soekarno"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ListView = findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, dataName);
        ListView.setAdapter(adapter);

    }
}