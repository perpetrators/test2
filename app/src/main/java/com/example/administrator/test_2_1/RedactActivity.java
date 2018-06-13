package com.example.administrator.test_2_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RedactActivity extends AppCompatActivity {

    private android.widget.EditText redactcontent;
    private ImageView redactbuttform;
    private ImageView redactbuttadd;
    private ImageView redactbuttsca;
    private ImageView redactbuttatt;
    private LinearLayout redactviewcontainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redact);
        Intent intentData = getIntent();
        binding();
        redactcontent.setText(intentData.getStringExtra("data"));
    }

    private void binding() {
        this.redactviewcontainer = (LinearLayout) findViewById(R.id.redact_view_container);
        this.redactbuttatt = (ImageView) findViewById(R.id.redact_butt_att);
        this.redactbuttsca = (ImageView) findViewById(R.id.redact_butt_sca);
        this.redactbuttadd = (ImageView) findViewById(R.id.redact_butt_add);
        this.redactbuttform = (ImageView) findViewById(R.id.redact_butt_form);
        this.redactcontent = (EditText) findViewById(R.id.redact_content);
    }
}
