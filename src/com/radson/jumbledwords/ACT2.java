package com.radson.jumbledwords;

import java.util.prefs.Preferences;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdView;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ACT2 extends Activity implements AdListener {
	private AdView adview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		adview=(AdView)this.findViewById(R.id.ad);
		AdRequest re=new AdRequest();
		re.setTesting(true);
		adview.loadAd(re);
		final Button bt1 = (Button) findViewById(R.id.button1);
		final Button bt2 = (Button) findViewById(R.id.button2);
		final Button bt3 = (Button) findViewById(R.id.button3);
		final Button bt4 = (Button) findViewById(R.id.button4);
		final Button bt5 = (Button) findViewById(R.id.button5);
		final Button bt6 = (Button) findViewById(R.id.button6);
		final Button bt7 = (Button) findViewById(R.id.button7);
		final Button bt8 = (Button) findViewById(R.id.button8);
		final Button bt9 = (Button) findViewById(R.id.button9);
		final Button bt10 = (Button) findViewById(R.id.button10);
		final Button bt11 = (Button) findViewById(R.id.button11);
		final Button bt12 = (Button) findViewById(R.id.button12);
		final Button bt13 = (Button) findViewById(R.id.button13);
		final Button bt14 = (Button) findViewById(R.id.button14);
		final Button bt15 = (Button) findViewById(R.id.button15);
		final Button bt16 = (Button) findViewById(R.id.button16);
		final Button bt17 = (Button) findViewById(R.id.button17);
		final Button bt18 = (Button) findViewById(R.id.button18);
		final Button bt19 = (Button) findViewById(R.id.button19);
		final Button bt20 = (Button) findViewById(R.id.button20);
		final Button btpre = (Button) findViewById(R.id.buttonprevious);
		final Button btnxt = (Button) findViewById(R.id.buttonnext);
		btnxt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent asdfgh = new Intent(ACT2.this, MainActivity.class);
				startActivity(asdfgh);
				finish();
			}
		});
		btpre.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent asdfgh = new Intent(ACT2.this, MainActivity.class);
				startActivity(asdfgh);
				finish();
			}
		});
		bt1.setText("21");

		bt2.setText("22");

		bt3.setText("23");

		bt4.setText("24");

		bt5.setText("25");

		bt6.setText("26");

		bt7.setText("27");

		bt8.setText("28");

		bt9.setText("29");

		bt10.setText("30");

		bt11.setText("31");

		bt12.setText("32");

		bt13.setText("33");
		bt14.setText("34");
		bt15.setText("35");
		bt16.setText("36");
		bt17.setText("37");
		bt18.setText("38");
		bt19.setText("39");
		bt20.setText("40");
		final SharedPreferences sh = getSharedPreferences("shp",
				Context.MODE_PRIVATE);
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "21";
				final String s1 = "SFTA";
				final String s2 = "TEIERLP";
				final String s3 = "PTOUOSC";
				final String s4 = "GHCARRE";
				final String s5 = "TAED";
				final String c1 = "FAST";
				final String c2 = "REPTILE";
				final String c3 = "OCTOPUS";
				final String c4 = "CHARGER";
				final String c5 = "DATE";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t21", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a21", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b21", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c21", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d21", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});

		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "22";
				final String s1 = "EATG";
				final String s2 = "DLAY";
				final String s3 = "ROIGLAL";
				final String s4 = "ZIPAZ";
				final String s5 = "ASERH";
				final String c1 = "GATE";
				final String c2 = "LADY";
				final String c3 = "GORILLA";
				final String c4 = "PIZZA";
				final String c5 = "SHARE";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t22", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a22", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b22", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c22", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d22", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "23";
				final String s1 = "MNMNCCTOUIAIO";
				final String s2 = "EAAMCR";
				final String s3 = "DEIOV";
				final String s4 = "RNLBJAI";
				final String s5 = "OOOETKBN";
				final String c1 = "COMMUNICATION";
				final String c2 = "CAMERA";
				final String c3 = "VIDEO";
				final String c4 = "BRINJAL";
				final String c5 = "NOTEBOOK";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t23", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a23", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b23", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c23", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d23", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "24";
				final String s1 = "OEKSPDT";
				final String s2 = "IOLPLW";
				final String s3 = "DHSTBEEE";
				final String s4 = "NRGI";
				final String s5 = "OGNS";
				final String c1 = "DESKTOP";
				final String c2 = "PILLOW";
				final String c3 = "BEDSHEET";
				final String c4 = "RING";
				final String c5 = "SONG";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t24", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a24", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b24", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c24", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d24", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});

		bt5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "25";
				final String s1 = "EOTP";
				final String s2 = "AIWRCSKH";
				final String s3 = "TNYDRCIIOA";
				final String s4 = "TORORE";
				final String s5 = "YNEPN";
				final String c1 = "POET";
				final String c2 = "RICKSHAW";
				final String c3 = "DICTIONARY";
				final String c4 = "ROOTER";
				final String c5 = "PENNY";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t25", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a25", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b25", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c25", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d25", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "26";
				final String s1 = "SCINO";
				final String s2 = "YMENO";
				final String s3 = "TATAKC";
				final String s4 = "ITNAP";
				final String s5 = "LUROOC";
				final String c1 = "COINS";
				final String c2 = "MONEY";
				final String c3 = "ATTACK";
				final String c4 = "PAINT";
				final String c5 = "COLOUR";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t26", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a26", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b26", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c26", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d26", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "27";
				final String s1 = "NDKRMEA";
				final String s2 = "RBHSU";
				final String s3 = "CNRDEA";
				final String s4 = "LAEHW";
				final String s5 = "MEUMRS";
				final String c1 = "DENMARK";
				final String c2 = "BRUSH";
				final String c3 = "DANCER";
				final String c4 = "WHALE";
				final String c5 = "SUMMER";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t27", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a27", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b27", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c27", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d27", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "28";
				final String s1 = "AREFNC";
				final String s2 = "IWN";
				final String s3 = "KUCD";
				final String s4 = "NLEGSIH";
				final String s5 = "CROTA";
				final String c1 = "FRANCE";
				final String c2 = "WIN";
				final String c3 = "DUCK";
				final String c4 = "ENGLISH";
				final String c5 = "ACTOR";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t28", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a28", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b28", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c28", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d28", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "29";
				final String s1 = "IHRA";
				final String s2 = "UFN";
				final String s3 = "EAEHHTC";
				final String s4 = "LRYPEA";
				final String s5 = "YESLT";
				final String c1 = "HAIR";
				final String c2 = "FUN";
				final String c3 = "CHEETAH";
				final String c4 = "PLAYER";
				final String c5 = "STYLE";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t29", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a29", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b29", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c29", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d29", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt10.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "30";
				final String s1 = "IAPNS";
				final String s2 = "ALBTE";
				final String s3 = "UICCSR";
				final String s4 = "SIHF";
				final String s5 = "TNRWEI";
				final String c1 = "SPAIN";
				final String c2 = "TABLE";
				final String c3 = "CIRCUS";
				final String c4 = "FISH";
				final String c5 = "WINTER";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t30", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a30", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b30", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c30", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d30", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt11.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "31";
				final String s1 = "CXMOIE";
				final String s2 = "NRU";
				final String s3 = "NHE";
				final String s4 = "SCDRBTAAO";
				final String s5 = "AAAEMRCMN";
				final String c1 = "MEXICO";
				final String c2 = "RUN";
				final String c3 = "HEN";
				final String c4 = "BROADCAST";
				final String c5 = "CAMERAMAN";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t31", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a31", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b31", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c31", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d31", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt12.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "32";
				final String s1 = "AIIDN";
				final String s2 = "THCCA";
				final String s3 = "RZDLAI";
				final String s4 = "NTNSEI";
				final String s5 = "GNRTROAA";
				final String c1 = "INDIA";
				final String c2 = "CATCH";
				final String c3 = "LIZARD";
				final String c4 = "TENNIS";
				final String c5 = "ARROGANT";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t32", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a32", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b32", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c32", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d32", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt13.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "33";
				final String s1 = "AIAGRTNEN";
				final String s2 = "LBLA";
				final String s3 = "UIIQLD";
				final String s4 = "PSNSHIA";
				final String s5 = "RLRAU";
				final String c1 = "ARGENTINA";
				final String c2 = "BALL";
				final String c3 = "LIQUID";
				final String c4 = "SPANISH";
				final String c5 = "RURAL";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t33", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a33", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b33", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c33", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d33", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt14.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "34";
				final String s1 = "PGTYE";
				final String s2 = "AYLC";
				final String s3 = "EUMSO";
				final String s4 = "IVLETO";
				final String s5 = "EOIALRNT";
				final String c1 = "EGYPT";
				final String c2 = "CLAY";
				final String c3 = "MOUSE";
				final String c4 = "VOILET";
				final String c5 = "RELATION";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t34", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a34", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b34", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c34", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d34", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt15.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "35";
				final String s1 = "MLGBUIE";
				final String s2 = "LIBL";
				final String s3 = "ETNT";
				final String s4 = "OOIECCDRL";
				final String s5 = "RGPSNI";
				final String c1 = "BELGIUM";
				final String c2 = "BILL";
				final String c3 = "TENT";
				final String c4 = "CROCODILE";
				final String c5 = "SPRING";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t35", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a35", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b35", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c35", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d35", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt16.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "36";
				final String s1 = "ZRBLIA";
				final String s2 = "SPSA";
				final String s3 = "IORTHCS";
				final String s4 = "EELGA";
				final String s5 = "RRDPCEOU";
				final String c1 = "BRAZIL";
				final String c2 = "PASS";
				final String c3 = "OSTRICH";
				final String c4 = "EAGLE";
				final String c5 = "PRODUCER";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t36", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a36", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b36", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c36", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d36", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt17.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "37";
				final String s1 = "GNDNLAE";
				final String s2 = "LCXMAI";
				final String s3 = "CSNREE";
				final String s4 = "AEMG";
				final String s5 = "UAUMNT";
				final String c1 = "ENGLAND";
				final String c2 = "CLIMAX";
				final String c3 = "SCREEN";
				final String c4 = "GAME";
				final String c5 = "AUTUMN";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t37", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a37", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b37", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c37", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d37", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt18.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "38";
				final String s1 = "AUIMBM";
				final String s2 = "LAIYT";
				final String s3 = "IIAUSMNC";
				final String s4 = "TBHRIIS";
				final String s5 = "TNRHEU";
				final String c1 = "MUMBAI";
				final String c2 = "ITALY";
				final String c3 = "MUSICIAN";
				final String c4 = "BRITISH";
				final String c5 = "HUNTER";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t38", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a38", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b38", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c38", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d38", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt19.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "39";
				final String s1 = "SUAISR";
				final String s2 = "SSEENF";
				final String s3 = "TCA";
				final String s4 = "RDTCTIEO";
				final String s5 = "TDSMUIA";
				final String c1 = "RUSSIA";
				final String c2 = "DEFEND";
				final String c3 = "CAT";
				final String c4 = "DIRECTOR";
				final String c5 = "STADIUM";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t39", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a39", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b39", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c39", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d39", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

			}
		});
		bt20.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final String aaa = "40";
				final String s1 = "RGNMYEA";
				final String s2 = "TBA";
				final String s3 = "HKRSA";
				final String s4 = "MWMEIRS";
				final String s5 = "NCYLOO";
				final String c1 = "GERMANY";
				final String c2 = "BAT";
				final String c3 = "SHARK";
				final String c4 = "SWIMMER";
				final String c5 = "COLONY";
				Intent aaaa = new Intent(ACT2.this, WORDS.class);
				aaaa.putExtra("a", s1);
				aaaa.putExtra("b", s2);
				aaaa.putExtra("c", s3);
				aaaa.putExtra("d", s4);
				aaaa.putExtra("e", s5);
				aaaa.putExtra("a1", c1);
				aaaa.putExtra("b1", c2);
				aaaa.putExtra("c1", c3);
				aaaa.putExtra("d1", c4);
				aaaa.putExtra("e1", c5);
				aaaa.putExtra("tn", aaa);
				aaaa.putExtra("tit", "act2");
				String t1 = sh.getString("t40", "");
				aaaa.putExtra("ta1", t1);
				String a1 = sh.getString("a40", "");
				aaaa.putExtra("ta2", a1);
				String b1 = sh.getString("b40", "");
				aaaa.putExtra("ta3", b1);
				String ca1 = sh.getString("c40", "");
				aaaa.putExtra("ta4", ca1);
				String d1 = sh.getString("d40", "");
				aaaa.putExtra("ta5", d1);
				startActivity(aaaa);

				finish();

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
