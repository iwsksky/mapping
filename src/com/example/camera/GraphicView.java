package com.example.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class GraphicView extends View {
	//public float[] froot;
	int latala;
    public GraphicView(Context context) {
        super(context);
    }
    
    @Override
    public void onDraw(Canvas canvas) {
        // 座標系がわかるような罫線を引く
    	Imagelist imglist = new Imagelist();
    	//froot = new float[2];
    	float[] imgX = new float[1];
    	float[] imgY = new float[1];
    	imgX=imglist.getlatitude();
    	imgY=imglist.getlongtitude();
    	
    	
        Paint paint = new Paint();
        paint.setStrokeWidth(1);
       	paint.setColor(Color.GRAY);
        for (int y = 0; y <1800 ; y = y + 2) {
            canvas.drawLine(0, y, 1800, y, paint);
        }
        for (int x = 0; x < 1800; x = x + 2) {
            canvas.drawLine(x, 0, x, 1800, paint);
        }
        paint.setStrokeWidth(12);
        canvas.drawPoint(140, 36, paint);
    }
    protected void onMeasure(int widthMeasureSpec,int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // Viewの描画サイズを指定する
        setMeasuredDimension(1800,1800);
    }
    
}