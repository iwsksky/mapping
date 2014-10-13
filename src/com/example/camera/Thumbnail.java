package com.example.camera;

import java.io.IOException;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Thumbnail extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thumbnail);
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		TextView tv2 = (TextView)findViewById(R.id.textView2);
		TextView tv3 = (TextView)findViewById(R.id.textView3);
		ImageView thumbnail = (ImageView)findViewById(R.id.imageView1);
		
		try {
			// ExifInterfaceのインスタンス取得
			ExifInterface exif = new ExifInterface(Environment.getExternalStorageDirectory().getPath() +"/"+ "test.jpg");
			if (exif != null) {
				String info = String.format("size: %d x %d", 
						exif.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH, -1),
						exif.getAttributeInt(ExifInterface.TAG_IMAGE_LENGTH, -1));
				tv1.setText(info);
				info = String.format("date: %s", exif.getAttribute(ExifInterface.TAG_DATETIME));
				tv2.setText(info);
				float[] latlong = new float[2];
				exif.getLatLong(latlong);
				info = String.format("latlong: %f, %f", latlong[0], latlong[1]);
				tv3.setText(info);
				// サムネイ
				if (exif.hasThumbnail()) {
					byte[] image = exif.getThumbnail();
					Bitmap bitmap = BitmapFactory.decodeByteArray(image, 0, image.length);
					thumbnail.setImageBitmap(bitmap);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				}
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.thumbnail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
