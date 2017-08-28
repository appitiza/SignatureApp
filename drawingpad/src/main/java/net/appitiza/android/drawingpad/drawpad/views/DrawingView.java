package net.appitiza.android.drawingpad.drawpad.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import net.appitiza.android.drawingpad.R;
import net.appitiza.android.drawingpad.colorpicker.LinearColorPicker;
import net.appitiza.android.drawingpad.colorpicker.OnColorChangedListener;

public class DrawingView extends LinearLayout implements View.OnClickListener, SignatureView.OnSignedListener, OnColorChangedListener {
    private SignatureView mSignatureView;
    private ImageView mIvColorPicker;
    private LinearColorPicker mColorPicker;
    private ImageView mIvPen;
    private ImageView mIvEraser;
    private ImageView mIvSize;
    private ImageView mIvSize1;
    private ImageView mIvSize2;
    private ImageView mIvSize3;
    private ImageView mIvClear;
    private LinearLayout mLlSize;
    private OnDrawingListener mOnDrawingListener;
    private int mPenColor;
    private int mPenSize;
    private String[] pallete = new String[]{"#212121", "#3B5998", "#FE0883", "#C63D2D",
            "#86B32D", "#FF3333", "#008CFF", "#FCD20B", "#4E6252"};
    private int[] colors = new int[pallete.length];

    public DrawingView(Context context) {
        super(context);
        init();
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(getContext()).inflate(R.layout.drawing_view, this, true);

        mSignatureView = findViewById(R.id.sv_sign);
        mIvColorPicker = findViewById(R.id.iv_color);
        mColorPicker = findViewById(R.id.lcp_color);
        mIvPen = findViewById(R.id.iv_pen);
        mIvEraser = findViewById(R.id.iv_eraser);
        mIvSize = findViewById(R.id.iv_size);
        mLlSize = findViewById(R.id.ll_size);
        mIvSize1 = findViewById(R.id.iv_size_1);
        mIvSize2 = findViewById(R.id.iv_size_2);
        mIvSize3 = findViewById(R.id.iv_size_3);
        mIvClear = findViewById(R.id.iv_clear);

        for (int i = 0; i < colors.length; i++) {
            colors[i] = Color.parseColor(pallete[i]);
        }
        mColorPicker.setColors(colors);
        mColorPicker.setSelectedColor(colors[0]);

        mPenColor = colors[0];
        mPenSize = 20;


        setPenSize(R.id.iv_size_1);
        mSignatureView.setPenColor(mPenColor);
        mSignatureView.setMinWidth(mPenSize);
        mColorPicker.setVisibility(GONE);
        mIvPen.setBackgroundResource(R.drawable.select_item);
        mIvEraser.setBackgroundResource(0);
        setClick();
    }

    private void setClick(){
        mColorPicker.setOnColorChangedListener(this);
        mSignatureView.setOnSignedListener(this);
        mIvColorPicker.setOnClickListener(this);
        mIvPen.setOnClickListener(this);
        mIvEraser.setOnClickListener(this);
        mIvSize.setOnClickListener(this);
        mIvSize1.setOnClickListener(this);
        mIvSize2.setOnClickListener(this);
        mIvSize3.setOnClickListener(this);
        mIvClear.setOnClickListener(this);
    }
    private void showColorList() {

        ObjectAnimator colorselectorAnimator;
        if (mColorPicker.getVisibility() == GONE) {
            colorselectorAnimator = ObjectAnimator.ofFloat(mColorPicker, "rotationY", -90f, 0f);
            mColorPicker.setVisibility(View.VISIBLE);
        } else {
            colorselectorAnimator = ObjectAnimator.ofFloat(mColorPicker, "rotationY", 0f, -90f);
            Handler mHandler = new Handler();
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mColorPicker.setVisibility(GONE);
                }
            }, 100);

        }
        colorselectorAnimator.setDuration(100);
        colorselectorAnimator.start();
    }

    private void showSizeList() {

        ObjectAnimator sizeselectorAnimator;
        if (mLlSize.getVisibility() == GONE) {
            sizeselectorAnimator = ObjectAnimator.ofFloat(mLlSize, "rotationY", -90f, 0f);
            mLlSize.setVisibility(View.VISIBLE);
        } else {
            sizeselectorAnimator = ObjectAnimator.ofFloat(mLlSize, "rotationY", 0f, -90f);
            Handler mHandler = new Handler();
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mLlSize.setVisibility(GONE);
                }
            }, 100);

        }
        sizeselectorAnimator.setDuration(100);
        sizeselectorAnimator.start();
    }

    private void setmPenColor() {
        mIvPen.setBackgroundResource(R.drawable.select_item);
        mIvEraser.setBackgroundResource(0);
        mSignatureView.setPenColor(mPenColor);
    }

    private void activateEraser() {
        mIvEraser.setBackgroundResource(R.drawable.select_item);
        mIvPen.setBackgroundResource(0);
        mSignatureView.setPenColor(Color.WHITE);
    }

    private void setPenSize(int selection) {

        if (selection == R.id.iv_size_1) {
            mPenSize = 5;
            mSignatureView.setMinWidth(mPenSize);
            mIvSize1.setImageResource(R.drawable.ic_radio_on_button_1);
            mIvSize2.setImageResource(R.drawable.ic_radio_off_button_2);
            mIvSize3.setImageResource(R.drawable.ic_radio_off_button_3);
        } else if (selection == R.id.iv_size_2) {
            mPenSize = 10;
            mSignatureView.setMinWidth(mPenSize);
            mIvSize1.setImageResource(R.drawable.ic_radio_off_button_1);
            mIvSize2.setImageResource(R.drawable.ic_radio_on_button_2);
            mIvSize3.setImageResource(R.drawable.ic_radio_off_button_3);
        } else if (selection == R.id.iv_size_3) {
            mPenSize = 15;
            mSignatureView.setMinWidth(mPenSize);
            mIvSize1.setImageResource(R.drawable.ic_radio_off_button_1);
            mIvSize2.setImageResource(R.drawable.ic_radio_off_button_2);
            mIvSize3.setImageResource(R.drawable.ic_radio_on_button_3);
        }
        showSizeList();
    }

    public final void setOnDrawingListener(OnDrawingListener listener) {
        mOnDrawingListener = listener;
    }

    public Bitmap getSignatureBitmap() {

        return mSignatureView.getSignatureBitmap();
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.iv_color) {
            showColorList();
        } else if (view.getId() == R.id.iv_pen) {
            setmPenColor();
        } else if (view.getId() == R.id.iv_eraser) {
            activateEraser();
        } else if (view.getId() == R.id.iv_size) {
            showSizeList();
        } else if (view.getId() == R.id.iv_size_1) {
            setPenSize(R.id.iv_size_1);
        } else if (view.getId() == R.id.iv_size_2) {
            setPenSize(R.id.iv_size_2);
        } else if (view.getId() == R.id.iv_size_3) {
            setPenSize(R.id.iv_size_3);
        } else if (view.getId() == R.id.iv_clear) {
            mSignatureView.clear();
        }
    }

    @Override
    public void onStartSigning() {
        if (mOnDrawingListener != null) {
            mOnDrawingListener.onStartSigning();
        }
    }

    @Override
    public void onColorChanged(int c) {

        mIvPen.setBackgroundResource(R.drawable.select_item);
        mIvEraser.setBackgroundResource(0);
        mPenColor = c;
        mSignatureView.setPenColor(mPenColor);
        if (mOnDrawingListener != null) {
            mOnDrawingListener.onColorChange(c);
        }

        showColorList();
    }

    @Override
    public void onSigned() {
        if (mOnDrawingListener != null) {
            mOnDrawingListener.onSigned();
        }
    }

    @Override
    public void onClear() {
        if (mOnDrawingListener != null) {
            mOnDrawingListener.onClear();
        }
    }

    public interface OnDrawingListener {
        void onStartSigning();

        void onSigned();

        void onClear();

        void onColorChange(int color);
    }
}
