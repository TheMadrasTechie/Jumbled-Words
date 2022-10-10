package com.radson.jumbledwords;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdView;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WORDS extends ActionBarActivity implements AdListener{
	private AdView adview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.words);
		adview=(AdView)this.findViewById(R.id.ad);
		AdRequest re=new AdRequest();
		re.setTesting(true);
		adview.loadAd(re);
		final TextView tv1 = (TextView) findViewById(R.id.textView1);
		final TextView tv2 = (TextView) findViewById(R.id.textView2);
		final TextView tv3 = (TextView) findViewById(R.id.textView3);
		final TextView tv4 = (TextView) findViewById(R.id.textView4);
		final TextView tv5 = (TextView) findViewById(R.id.textView5);
		final TextView tv6 = (TextView) findViewById(R.id.textView6);
		final Button bc1 = (Button) findViewById(R.id.c1);
		final Button bc2 = (Button) findViewById(R.id.c2);
		final Button bc3 = (Button) findViewById(R.id.c3);
		final Button bc4 = (Button) findViewById(R.id.c4);
		final Button bc5 = (Button) findViewById(R.id.c5);
		final EditText et1 = (EditText) findViewById(R.id.editText1);
		final EditText et2 = (EditText) findViewById(R.id.editText2);
		final EditText et3 = (EditText) findViewById(R.id.editText3);
		final EditText et4 = (EditText) findViewById(R.id.editText4);
		final EditText et5 = (EditText) findViewById(R.id.editText5);

		final Button btmnu = (Button) findViewById(R.id.buttonmenu);
		final Button btshr = (Button) findViewById(R.id.buttonshare);

		final Intent i = getIntent();
		final String ta1 = i.getStringExtra("ta1");
		final String ta2 = i.getStringExtra("ta2");
		final String ta3 = i.getStringExtra("ta3");
		final String ta4 = i.getStringExtra("ta4");
		final String ta5 = i.getStringExtra("ta5");
		final String c1 = i.getStringExtra("a1");
		final String c2 = i.getStringExtra("b1");
		final String c3 = i.getStringExtra("c1");
		final String c4 = i.getStringExtra("d1");
		final String c5 = i.getStringExtra("e1");
		final String s1 = i.getStringExtra("a");
		final String s2 = i.getStringExtra("b");
		final String s3 = i.getStringExtra("c");
		final String s4 = i.getStringExtra("d");
		final String s5 = i.getStringExtra("e");
		final String s6 = i.getStringExtra("tn");
		tv1.setText(s1);
		tv2.setText(s2);
		tv3.setText(s3);
		tv4.setText(s4);
		tv5.setText(s5);
		tv6.setText(s6);
		if (s6.equals("1")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("2")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);

		}

		if (s6.equals("3")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("4")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}

		if (s6.equals("5")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("6")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("7")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("8")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("9")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("10")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("11")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("12")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("13")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("14")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("15")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("16")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("17")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("18")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("19")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("20")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("21")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("22")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);

		}

		if (s6.equals("23")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("24")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}

		if (s6.equals("25")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("26")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("27")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("28")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("29")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("30")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("31")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("32")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("33")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("34")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("35")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("36")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("37")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("38")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("39")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		if (s6.equals("40")) {
			et1.setText(ta1);
			et2.setText(ta2);
			et3.setText(ta3);
			et4.setText(ta4);
			et5.setText(ta5);
		}
		final String ss = s6;
		btmnu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String ans1 = (et1.getText().toString());
				String a1 = ans1.toUpperCase();
				String ans2 = (et2.getText().toString());
				String a2 = ans2.toUpperCase();
				String ans3 = (et3.getText().toString());
				String a3 = ans3.toUpperCase();
				String ans4 = (et4.getText().toString());
				String a4 = ans4.toUpperCase();
				String ss = s6;
				String ans5 = (et5.getText().toString());
				String a5 = ans5.toUpperCase();
				if ((a1.equals(c1)) && (a2.equals(c2)) && (a3.equals(c3))
						&& (a4.equals(c4)) && (a5.equals(c5))) {
					String poi=i.getStringExtra("tit");
					if(poi.equals("act2"))
					{
						Intent asd = new Intent(getApplicationContext(),
								ACT2.class);
						startActivity(asd);

						finish();
					}
					else
					{
					Intent asd = new Intent(getApplicationContext(),
							MainActivity.class);
					startActivity(asd);

					finish();
					}
				} else {
					String poi=i.getStringExtra("tit");
					if(poi.equals("act2"))
					{
						Intent asd = new Intent(getApplicationContext(),
								ACT2.class);
						startActivity(asd);

						finish();
					}
					else
					{
					Intent asd = new Intent(getApplicationContext(),
							MainActivity.class);
					startActivity(asd);

					finish();
					}
				}
			}
		});
		btshr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String share = "share puzzle via:-";
				Intent si = new Intent();
				si.setAction(Intent.ACTION_SEND);
				si.setType("text/plain");
				si.putExtra(
						Intent.EXTRA_TEXT,
						"puzzle of the day:-\n"
								+ "Find the answer for these jumbled words:-\n\n\n"
								+ s1
								+ "\n"
								+ s2
								+ "\n"
								+ s3
								+ "\n"
								+ s4
								+ "\n"
								+ s5
								+ "\n\n\n"
								+ "(Source:-\thttps://play.google.com/store/apps/details?id=com.radson.jumbledwords)");
				startActivity(Intent.createChooser(si, share));

			}
		});
		SharedPreferences sharedPreferences = getSharedPreferences("shp",
				Context.MODE_PRIVATE);
		final SharedPreferences.Editor editor = sharedPreferences.edit();
		bc1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gt1 = (et1.getText().toString());
				String aa = gt1.toUpperCase();

				if (aa.equals(c1)) {
					bc1.setText("c");
					String t1 = (et1.getText().toString());

					String ss = i.getStringExtra("tn");
					if (ss.equals("1")) {
						editor.putString("t1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("t2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("t3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("t4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("t5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("t6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("t7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("t8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("t9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("t10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("t11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("t12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("t13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("t14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("t15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("t16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("t17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("t18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("t19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("t20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("t21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("t22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("t23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("t24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("t25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("t26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("t27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("t28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("t29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("t30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("t31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("t32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("t33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("t34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("t35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("t36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("t37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("t38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("t39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("t40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();

				} else {
					bc1.setText("W");
					String t1 = (et1.getText().toString());

					String ss = i.getStringExtra("tn");
					if (ss.equals("1")) {
						editor.putString("t1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("t2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("t3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("t4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("t5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("t6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("t7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("t8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("t9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("t10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("t11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("t12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("t13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("t14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("t15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("t16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("t17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("t18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("t19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("t20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("t21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("t22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("t23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("t24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("t25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("t26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("t27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("t28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("t29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("t30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("t31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("t32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("t33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("t34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("t35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("t36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("t37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("t38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("t39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("t40", t1);
						editor.commit();
					}
				}
				Toast.makeText(getApplicationContext(), "Your answer is wrong",
						Toast.LENGTH_SHORT).show();

			}

		});
		bc2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gt2 = (et2.getText().toString());
				String aa = gt2.toUpperCase();
				if (aa.equals(c2)) {
					bc2.setText("c");
					String t1 = (et2.getText().toString());
					if (ss.equals("1")) {
						editor.putString("a1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("a2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("a3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("a4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("a5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("a6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("a7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("a8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("a9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("a10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("a11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("a12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("a13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("a14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("a15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("a16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("a17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("a18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("a19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("a20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("a21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("a22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("a23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("a24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("a25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("a26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("a27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("a28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("a29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("a30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("a31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("a32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("a33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("a34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("a35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("a36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("a37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("a38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("a39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("a40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();

				} else {
					bc2.setText("W");
					String t1 = (et2.getText().toString());
					if (ss.equals("1")) {
						editor.putString("a1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("a2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("a3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("a4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("a5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("a6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("a7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("a8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("a9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("a10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("a11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("a12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("a13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("a14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("a15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("a16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("a17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("a18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("a19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("a20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("a21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("a22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("a23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("a24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("a25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("a26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("a27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("a28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("a29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("a30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("a31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("a32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("a33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("a34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("a35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("a36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("a37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("a38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("a39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("a40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is wrong", Toast.LENGTH_SHORT).show();

				}
			}
		});
		bc3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gt3 = (et3.getText().toString());
				String ss = i.getStringExtra("tn");
				editor.putString("ss", ss);
				String aa = gt3.toUpperCase();
				if (aa.equals(c3)) {
					bc3.setText("c");
					String t1 = (et3.getText().toString());
					if (ss.equals("1")) {
						editor.putString("b1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("b2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("b3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("b4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("b5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("b6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("b7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("b8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("b9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("b10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("b11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("b12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("b13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("b14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("b15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("b16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("b17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("b18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("b19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("b20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("b21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("b22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("b23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("b24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("b25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("b26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("b27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("b28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("b29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("b30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("b31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("b32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("b33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("b34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("b35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("b36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("b37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("b38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("b39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("b40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();

				} else {
					bc3.setText("W");
					String t1 = (et3.getText().toString());
					if (ss.equals("1")) {
						editor.putString("b1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("b2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("b3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("b4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("b5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("b6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("b7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("b8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("b9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("b10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("b11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("b12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("b13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("b14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("b15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("b16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("b17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("b18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("b19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("b20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("b21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("b22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("b23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("b24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("b25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("b26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("b27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("b28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("b29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("b30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("b31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("b32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("b33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("b34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("b35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("b36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("b37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("b38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("b39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("b40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is wrong", Toast.LENGTH_SHORT).show();

				}
			}
		});
		bc4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gt4 = (et4.getText().toString());
				String aa = gt4.toUpperCase();
				if (aa.equals(c4)) {
					bc4.setText("c");
					String t1 = (et4.getText().toString());
					if (ss.equals("1")) {
						editor.putString("c1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("c2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("c3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("c4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("c5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("c6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("c7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("c8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("c9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("c10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("c11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("c12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("c13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("c14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("c15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("c16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("c17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("c18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("c19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("c20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("c21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("c22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("c23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("c24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("c25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("c26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("c27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("c28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("c29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("c30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("c31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("c32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("c33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("c34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("c35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("c36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("c37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("c38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("c39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("c40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();

				} else {
					bc4.setText("W");
					String t1 = (et4.getText().toString());
					if (ss.equals("1")) {
						editor.putString("c1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("c2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("c3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("c4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("c5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("c6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("c7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("c8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("c9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("c10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("c11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("c12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("c13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("c14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("c15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("c16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("c17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("c18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("c19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("c20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("c21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("c22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("c23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("c24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("c25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("c26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("c27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("c28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("c29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("c30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("c31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("c32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("c33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("c34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("c35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("c36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("c37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("c38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("c39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("c40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is wrong", Toast.LENGTH_SHORT).show();

				}
			}
		});
		bc5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gt5 = (et5.getText().toString());
				String aa = gt5.toUpperCase();
				if (aa.equals(c5)) {
					bc5.setText("c");
					String t1 = (et5.getText().toString());
					if (ss.equals("1")) {
						editor.putString("d1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("d2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("d3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("d4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("d5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("d6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("d7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("d8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("d9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("d10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("d11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("d12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("d13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("d14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("d15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("d16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("d17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("d18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("d19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("d20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("d21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("d22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("d23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("d24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("d25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("d26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("d27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("d28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("d29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("d30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("d31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("d32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("d33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("d34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("d35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("d36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("d37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("d38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("d39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("d40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is correct", Toast.LENGTH_SHORT)
							.show();

				} else {
					bc5.setText("W");
					String t1 = (et5.getText().toString());
					if (ss.equals("1")) {
						editor.putString("d1", t1);
						editor.commit();
					}
					if (ss.equals("2")) {
						editor.putString("d2", t1);
						editor.commit();
					}
					if (ss.equals("3")) {
						editor.putString("d3", t1);
						editor.commit();
					}
					if (ss.equals("4")) {
						editor.putString("d4", t1);
						editor.commit();
					}
					if (ss.equals("5")) {
						editor.putString("d5", t1);
						editor.commit();
					}
					if (ss.equals("6")) {
						editor.putString("d6", t1);
						editor.commit();
					}
					if (ss.equals("7")) {
						editor.putString("d7", t1);
						editor.commit();
					}
					if (ss.equals("8")) {
						editor.putString("d8", t1);
						editor.commit();
					}
					if (ss.equals("9")) {
						editor.putString("d9", t1);
						editor.commit();
					}
					if (ss.equals("10")) {
						editor.putString("d10", t1);
						editor.commit();
					}
					if (ss.equals("11")) {
						editor.putString("d11", t1);
						editor.commit();
					}
					if (ss.equals("12")) {
						editor.putString("d12", t1);
						editor.commit();
					}
					if (ss.equals("13")) {
						editor.putString("d13", t1);
						editor.commit();
					}
					if (ss.equals("14")) {
						editor.putString("d14", t1);
						editor.commit();
					}
					if (ss.equals("15")) {
						editor.putString("d15", t1);
						editor.commit();
					}
					if (ss.equals("16")) {
						editor.putString("d16", t1);
						editor.commit();
					}
					if (ss.equals("17")) {
						editor.putString("d17", t1);
						editor.commit();
					}
					if (ss.equals("18")) {
						editor.putString("d18", t1);
						editor.commit();
					}
					if (ss.equals("19")) {
						editor.putString("d19", t1);
						editor.commit();
					}
					if (ss.equals("20")) {
						editor.putString("d20", t1);
						editor.commit();
					}
					if (ss.equals("21")) {
						editor.putString("d21", t1);
						editor.commit();
					}
					if (ss.equals("22")) {
						editor.putString("d22", t1);
						editor.commit();
					}
					if (ss.equals("23")) {
						editor.putString("d23", t1);
						editor.commit();
					}
					if (ss.equals("24")) {
						editor.putString("d24", t1);
						editor.commit();
					}
					if (ss.equals("25")) {
						editor.putString("d25", t1);
						editor.commit();
					}
					if (ss.equals("26")) {
						editor.putString("d26", t1);
						editor.commit();
					}
					if (ss.equals("27")) {
						editor.putString("d27", t1);
						editor.commit();
					}
					if (ss.equals("28")) {
						editor.putString("d28", t1);
						editor.commit();
					}
					if (ss.equals("29")) {
						editor.putString("d29", t1);
						editor.commit();
					}
					if (ss.equals("30")) {
						editor.putString("d30", t1);
						editor.commit();
					}
					if (ss.equals("31")) {
						editor.putString("d31", t1);
						editor.commit();
					}
					if (ss.equals("32")) {
						editor.putString("d32", t1);
						editor.commit();
					}
					if (ss.equals("33")) {
						editor.putString("d33", t1);
						editor.commit();
					}
					if (ss.equals("34")) {
						editor.putString("d34", t1);
						editor.commit();
					}
					if (ss.equals("35")) {
						editor.putString("d35", t1);
						editor.commit();
					}
					if (ss.equals("36")) {
						editor.putString("d36", t1);
						editor.commit();
					}
					if (ss.equals("37")) {
						editor.putString("d37", t1);
						editor.commit();
					}
					if (ss.equals("38")) {
						editor.putString("d38", t1);
						editor.commit();
					}
					if (ss.equals("39")) {
						editor.putString("d39", t1);
						editor.commit();
					}
					if (ss.equals("40")) {
						editor.putString("d40", t1);
						editor.commit();
					}
					Toast.makeText(getApplicationContext(),
							"Your answer is wrong", Toast.LENGTH_SHORT).show();

				}
			}
		});

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