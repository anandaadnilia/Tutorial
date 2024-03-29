package com.example.tutorial3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;

public class ActivityIntentFilter extends AppCompatActivity {
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);

    Button btnSend = (Button) findViewById(R.id.sendMail);
    btnSend.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent si = new Intent(Intent.ACTION_SEND);
             si.setType("message/rfc822");
             si.putExtra(Intent.EXTRA_EMAIL, new String[]{"anandaadnilia@gmail.com"});
             si.putExtra(Intent.EXTRA_SUBJECT, "Welcome");
             si.putExtra(Intent.EXTRA_TEXT, "Hi Students, Welcome to My Class");
            startActivity(Intent.createChooser(si, "Choose Mail App"));
        }
    });
}
}
