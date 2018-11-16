package com.yazidmf.error;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Error extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
    }

    public void btn_error(View view) {
        Intent main = new Intent(Error.this, Kaget.class);
        startActivity(main);
    }
}
