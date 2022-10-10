package com.radson.jumbledwords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.InterstitialAd;

public class LOgo extends Activity implements AdListener {
	private InterstitialAd interstitialAds;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		this.interstitialAds = new InterstitialAd(this,
				"ca-app-pub-2805037520028203/1037069575");

		AdRequest adRequest = new AdRequest();
		interstitialAds.loadAd(adRequest);
		interstitialAds.show();
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent asdf = new Intent(getApplicationContext(),
						MainActivity.class);
				asdf.putExtra("ssss", "0");
				startActivity(asdf);

			}
		}, 3000);

	}

	@Override
	public void onDismissScreen(Ad arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFailedToReceiveAd(Ad arg0, ErrorCode arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLeaveApplication(Ad arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPresentScreen(Ad arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onReceiveAd(Ad arg0) {
		// TODO Auto-generated method stub

	}
}
