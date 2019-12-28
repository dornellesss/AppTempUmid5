package com.app.apptempumid5.apptempumid5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecundActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secund);

        firebaseAuth = FirebaseAuth.getInstance();

        logout = (Button) findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });
    }

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecundActivity.this, MainActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.logoutMenu:{
                Logout();
                break;
            }
            case R.id.profileMenu:
                startActivity(new Intent(SecundActivity.this, ProfileActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

   /* public void abrirBrowser(View v){
        Uri uri = Uri.parse("http://10.11.100.242:8080/ScadaBR/system_settings.shtm");
        Intent intent = new  Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }*/


    public void abrirBrowser(View v){
        Uri uri = Uri.parse("http://18.231.40.94:8787/ScadaBR/login.htm");
        Intent intent = new  Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    /*public void telaOnLine(View view) {
        Intent intent = new Intent(this, OnLineActivity.class);
        startActivity(intent);
    } */

    public void telaPlanilha1(View view) {
        Intent intent = new Intent(this, SeletivaActivity.class);
        startActivity(intent);
    }

    public void telaQRCode(View view) {
        Intent intent = new Intent(this, QRCodeGeradorActivity.class);
        startActivity(intent);
    }
}