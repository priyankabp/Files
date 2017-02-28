package com.example.android.w6_files_demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    private EditText titleNote;
    private EditText bodyNote;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleNote=(EditText)findViewById(R.id.inout_title_not_ma);
        bodyNote=(EditText)findViewById(R.id.inout_body_not_ma);
        tv=(TextView)findViewById(R.id.tv_ma);
    }

    public void saveNote(View view) {
        try{
            FileOutputStream outputStream = openFileOutput(titleNote.getText().toString().replace("",""),MODE_APPEND);
        }catch (Exception e){
            Log.e("ERROR",e.getMessage());
        }
    }

    public void loadNote(View view) {
    }
}
