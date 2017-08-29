package net.appitiza.android.app.signatureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SelectOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option);
        (findViewById(R.id.btn_signaturepad)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectOptionActivity.this, SignatureActivity.class));
            }
        });
        (findViewById(R.id.btn_drawingpad)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectOptionActivity.this, DrawingPadActivity.class));
            }
        });
    }
}
