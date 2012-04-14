package com.stylingandroid.more.vector;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

public class MoreVectorDrawablesActivity extends Activity
{
	private BitmapDrawable background = null;

	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );

		ActionBar ab = getActionBar();
		background = (BitmapDrawable) getResources().getDrawable(
				R.drawable.backgroundpattern );
		ab.setBackgroundDrawable( getResources().getDrawable(
				R.drawable.backgroundpattern ) );
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		final ActionBar actionBar = getActionBar();
		background.setTileModeX( android.graphics.Shader.TileMode.REPEAT );
		actionBar.setBackgroundDrawable( background );
	}
}