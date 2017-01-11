package com.apps.hari.registration;

/**
 * Created by Hari on 08/01/17.
 */

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class RequestPermission extends PermissionActivity {

    private static final int REQUEST_PERMISSIONS = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestPermission.super.requestAppPermissions(new
                                String[]{Manifest.permission.RECORD_AUDIO,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE},R.string.google_app_id
                         ,REQUEST_PERMISSIONS);
            }
        });
    }

    @Override
    public void onPermissionsGranted(final int requestCode) {
        Toast.makeText(this, "Permissions Received.", Toast.LENGTH_LONG).show();
    }

    public void damal (View view){
        Intent intent = new Intent(this,ConfessVoice.class);
        startActivity(intent);
    }

}