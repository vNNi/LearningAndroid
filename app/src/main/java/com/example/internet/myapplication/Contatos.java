package com.example.internet.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import java.net.URI;

public class Contatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);
    }

    public void back(View v) {
        finish();
    }

    public void sendEmail(View v) {
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "vinicius@gmail.com", null));
        i.putExtra(Intent.EXTRA_SUBJECT, "Assunto do Email");
        i.putExtra(Intent.EXTRA_TEXT, "EAEAEAEAEAEAEAEAE");
        startActivity(Intent.createChooser(i, "Sending email..."));
    }

    public void callMe(View v) {
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "11989678941"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }else{

        }
        startActivity(i);
    }
}
