package com.example.menuproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Button button_newAct;
    private Button button_sms;
    private Button button_phone;
    private Button button_web;
    private Button button_map;
    private Button button_share;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.help){
            Intent helpIntent = new Intent(this, HelpActivity.class);
            startActivity(helpIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_newAct = (Button) findViewById(R.id.button_newAct);
        button_newAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_newAct ();

            }

        });

        button_sms = (Button) findViewById(R.id.button_sms);
        button_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_sms ();
            }

        });

        button_phone = (Button) findViewById(R.id.button_phone);
        button_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_phone ();
            }

        });

        button_web = (Button) findViewById(R.id.button_web);
        button_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_web ();
            }

        });

        button_map = (Button) findViewById(R.id.button_map);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_map ();
            }

        });

        button_share = (Button) findViewById(R.id.button_share);
        button_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_share ();
            }

        });
    }

    public void launch_newAct () {
        Intent authority = new Intent(this, NewActivity.class);
        startActivity(authority);
    }

    public void launch_sms () {
        final Intent authority = new Intent(Intent.ACTION_SENDTO);
        authority.setData(Uri.parse("smsto:" + Uri.encode("12323458912")));
        authority.putExtra("sms_body", "Karl Eshwer");
        startActivity(authority);
    }

    public void launch_phone () {
        final Intent authority = new Intent(Intent.ACTION_DIAL);
        authority.setData(Uri.parse("tel:12323458912"));
        startActivity(authority);
    }

    public void launch_web () {
        final Intent authority = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(authority);
    }

    public void launch_map () {
        String geoUri = String.format("geo:25.781914, -80.130608");
        Uri geo = Uri.parse(geoUri);
        Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
        startActivity(geoMap);
    }

    public void launch_share () {
        final Intent authority = new Intent(Intent.ACTION_SEND);
        authority.setType("text/plain");
        authority.putExtra(Intent.EXTRA_SUBJECT, "CS374");
        authority.putExtra(Intent.EXTRA_TEXT, "Join CS374");
        startActivity(Intent.createChooser(authority, "Share the love"));
    }
}