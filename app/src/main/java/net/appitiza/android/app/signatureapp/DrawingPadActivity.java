package net.appitiza.android.app.signatureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import net.appitiza.android.drawingpad.drawpad.views.DrawingView;

public class DrawingPadActivity extends AppCompatActivity implements DrawingView.OnDrawingListener{
    private DrawingView mDrawingView;
    private ImageView mIvDrawing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing_pad);
        this.mDrawingView = (DrawingView) findViewById(R.id.drawing_view);
        this.mIvDrawing = (ImageView) findViewById(R.id.iv_sign);
        this.mDrawingView.setOnDrawingListener(this);
    }

    @Override
    public void onStartSigning() {

    }

    @Override
    public void onSigned() {
        this.mIvDrawing.setImageBitmap(mDrawingView.getSignatureBitmap());
    }

    @Override
    public void onClear() {
        this.mIvDrawing.setImageDrawable(null);
    }

    @Override
    public void onColorChange(int color) {

    }
}
