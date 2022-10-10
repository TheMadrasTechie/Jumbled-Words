package com.radson.jumbledwords;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;



public class MainActivity extends ActionBarActivity implements AdListener {

	
	private InterstitialAd interstitialAds ;
	private AdView adview;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		//banner ads
				adview=(AdView)this.findViewById(R.id.ad);
				AdRequest re=new AdRequest();
				re.setTesting(true);
				adview.loadAd(re);
		 
		//interstitial ads                                   
				this.interstitialAds = new InterstitialAd(this, "ca-app-pub-2805037520028203/8228285575");
				this.interstitialAds.setAdListener(this);
				AdRequest adr = new AdRequest();
				interstitialAds.loadAd(adr);
	
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
						Intent asdfgh = new Intent(MainActivity.this, ACT2.class);
						asdfgh.putExtra("tn", "0");
						startActivity(asdfgh);
						finish();
					}
				});
				btpre.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent asdfgh = new Intent(MainActivity.this, ACT2.class);
						asdfgh.putExtra("tn", "0");
						startActivity(asdfgh);
						finish();
					}
				});
				final SharedPreferences sh = getSharedPreferences("shp",
						Context.MODE_PRIVATE);

				bt1.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						

						final String aaa = "1";
						final String s1 = "CQEUARI";
						final String s2 = "EUMGARTN";
						final String s3 = "LDNRAECA";
						final String s4 = "LEEEIVB";
						final String s5 = "EVLDI";
						final String c1 = "ACQUIRE";
						final String c2 = "ARGUMENT";
						final String c3 = "CALENDAR";
						final String c4 = "BELIEVE";
						final String c5 = "DEVIL";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t1", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a1", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b1", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c1", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d1", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);

						finish();

					}
				});

				bt2.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						

						final String aaa = "2";
						final String s1 = "CICADTEN";
						final String s2 = "ULBEBB";
						final String s3 = "AAACVNR";
						final String s4 = "YKMOEN";
						final String s5 = "EOLVABL";
						final String c1 = "ACCIDENT";
						final String c2 = "BUBBLE";
						final String c3 = "CARAVAN";
						final String c4 = "MONKEY";
						final String c5 = "LOVABLE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t2", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a2", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b2", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c2", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d2", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);

						finish();
					}
				});
				bt3.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "3";
						final String s1 = "PPAAETTRMN";
						final String s2 = "APOPLT";
						final String s3 = "CPRTUOME";
						final String s4 = "NEGORI";
						final String s5 = "TEALEPHN";
						final String c1 = "APPARTMENT";
						final String c2 = "LAPTOP";
						final String c3 = "COMPUTER";
						final String c4 = "REGION";
						final String c5 = "ELEPHANT";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t3", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a3", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b3", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c3", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d3", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt4.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "4";
						final String s1 = "LOLOFBAT";
						final String s2 = "LALOGB";
						final String s3 = "LOODNN";
						final String s4 = "MOOCWS";
						final String s5 = "OUEAFTTRN";
						final String c1 = "FOOTBALL";
						final String c2 = "GLOBAL";
						final String c3 = "LONDON";
						final String c4 = "MOSCOW";
						final String c5 = "FORTUNATE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t4", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a4", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b4", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c4", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d4", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt5.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "5";
						final String s1 = "AERYLP";
						final String s2 = "FEFOIONSSPR";
						final String s3 = "OOIETTRS";
						final String s4 = "ERBAZ";
						final String s5 = "EOHSR";
						final String c1 = "PLAYER";
						final String c2 = "PROFESSION";
						final String c3 = "TORTOISE";
						final String c4 = "ZEBRA";
						final String c5 = "HORSE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t5", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a5", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b5", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c5", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d5", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt6.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "6";
						final String s1 = "COECSR";
						final String s2 = "LNVEOE";
						final String s3 = "CCCOOAKRH";
						final String s4 = "EIEPRTL";
						final String s5 = "VOIEM";
						final String c1 = "SOCCER";
						final String c2 = "LENEVO";
						final String c3 = "COCKROACH";
						final String c4 = "REPTILE";
						final String c5 = "MOVIE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t6", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a6", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b6", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c6", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d6", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt7.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "7";
						final String s1 = "HOCUP";
						final String s2 = "THLCSEO";
						final String s3 = "ZKUSIU";
						final String s4 = "DBUDAH";
						final String s5 = "CETNRGLEA";
						final String c1 = "POUCH";
						final String c2 = "CLOTHES";
						final String c3 = "SUZUKI";
						final String c4 = "BUDDHA";
						final String c5 = "RECTANGLE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t7", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a7", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b7", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c7", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d7", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt8.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "8";
						final String s1 = "TNDASEPN";
						final String s2 = "ORMO";
						final String s3 = "RDIB";
						final String s4 = "CBEU";
						final String s5 = "RLABNAECO";
						final String c1 = "PENSTAND";
						final String c2 = "ROOM";
						final String c3 = "BIRD";
						final String c4 = "CUBE";
						final String c5 = "BARCELONA";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t8", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a8", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b8", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c8", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d8", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt9.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "9";
						final String s1 = "TODOCR";
						final String s2 = "TLAERI";
						final String s3 = "PESAERK";
						final String s4 = "RMICEAA";
						final String s5 = "MITRTREOA";
						final String c1 = "DOCTOR";
						final String c2 = "TAILER";
						final String c3 = "SPEAKER";
						final String c4 = "AMERICA";
						final String c5 = "TERMINATOR";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t9", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a9", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b9", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c9", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d9", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt10.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "10";
						final String s1 = "IERDRV";
						final String s2 = "BTELTA";
						final String s3 = "NTLIUSE";
						final String s4 = "LKOOTBE";
						final String s5 = "MRHPAAYC";
						final String c1 = "DRIVER";
						final String c2 = "TABLET";
						final String c3 = "UTENSIL";
						final String c4 = "BOOKLET";
						final String c5 = "PHARMACY";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t10", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a10", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b10", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c10", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d10", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt11.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "11";
						final String s1 = "OUEWSFNRL";
						final String s2 = "BTMNDAINO";
						final String s3 = "IRETG";
						final String s4 = "ETURFINUR";
						final String s5 = "XMMIOARC";
						final String c1 = "SUNFLOWER";
						final String c2 = "BADMINTON";
						final String c3 = "TIGER";
						final String c4 = "FURNITURE";
						final String c5 = "MICROMAX";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t11", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a11", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b11", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c11", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d11", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt12.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "12";
						final String s1 = "EIWR";
						final String s2 = "YBKADOER";
						final String s3 = "SJENMAI";
						final String s4 = "KJEOR";
						final String s5 = "ECMSTHI";
						final String c1 = "WIRE";
						final String c2 = "KEYBOARD";
						final String c3 = "JASMINE";
						final String c4 = "JOKER";
						final String c5 = "CHEMIST";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t12", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a12", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b12", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c12", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d12", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt13.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "13";
						final String s1 = "URDM";
						final String s2 = "ODOG";
						final String s3 = "EDNOUFR";
						final String s4 = "RIENWN";
						final String s5 = "TMINUAS";
						final String c1 = "DRUM";
						final String c2 = "GOOD";
						final String c3 = "FOUNDER";
						final String c4 = "WINNER";
						final String c5 = "TSUNAMI";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t13", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a13", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b13", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c13", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d13", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt14.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "14";
						final String s1 = "AYNM";
						final String s2 = "DKNI";
						final String s3 = "APYL";
						final String s4 = "EOYCDM";
						final String s5 = "HRTDBAIY";
						final String c1 = "MANY";
						final String c2 = "KIND";
						final String c3 = "PLAY";
						final String c4 = "COMEDY";
						final String c5 = "BIRTHDAY";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t14", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a14", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b14", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c14", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d14", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt15.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "15";
						final String s1 = "TCA";
						final String s2 = "ESROL";
						final String s3 = "OIANP";
						final String s4 = "ASD";
						final String s5 = "RSMIUTKDC";
						final String c1 = "CAT";
						final String c2 = "LOSER";
						final String c3 = "PIANO";
						final String c4 = "SAD";
						final String c5 = "DRUMSTICK";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t15", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a15", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b15", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c15", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d15", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt16.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "16";
						final String s1 = "ATR";
						final String s2 = "YEHMRS";
						final String s3 = "CLMWOEE";
						final String s4 = "EIPRDS";
						final String s5 = "DMCNAIEO";
						final String c1 = "RAT";
						final String c2 = "RHYMES";
						final String c3 = "WELCOME";
						final String c4 = "SPIDER";
						final String c5 = "COMEDIAN";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t16", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a16", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b16", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c16", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d16", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});

				bt17.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "17";
						final String s1 = "PTE";
						final String s2 = "OLOF";
						final String s3 = "TPYI";
						final String s4 = "PAHYP";
						final String s5 = "GVLTBEEEA";
						final String c1 = "PET";
						final String c2 = "FOOL";
						final String c3 = "PITY";
						final String c4 = "HAPPY";
						final String c5 = "VEGETABLE";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t17", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a17", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b17", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c17", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d17", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt18.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "18";
						final String s1 = "NCA";
						final String s2 = "SKNHTA";
						final String s3 = "UNNFY";
						final String s4 = "RUEPS";
						final String s5 = "LOTB";
						final String c1 = "CAN";
						final String c2 = "THANKS";
						final String c3 = "FUNNY";
						final String c4 = "SUPER";
						final String c5 = "BOLT";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t18", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a18", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b18", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c18", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d18", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt19.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "19";
						final String s1 = "IAMNLA";
						final String s2 = "WEORN";
						final String s3 = "IUARGT";
						final String s4 = "EKOJ";
						final String s5 = "BRTOO";
						final String c1 = "ANIMAL";
						final String c2 = "OWNER";
						final String c3 = "GUITAR";
						final String c4 = "JOKE";
						final String c5 = "ROBOT";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t19", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a19", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b19", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c19", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d19", "");
						aaaa.putExtra("ta5", d1);
						startActivity(aaaa);
						finish();
					}
				});
				bt20.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub

						final String aaa = "20";
						final String s1 = "EASTBK";
						final String s2 = "RNRNEU";
						final String s3 = "REOJK";
						final String s4 = "UTRIF";
						final String s5 = "NEANRB";
						final String c1 = "BASKET";
						final String c2 = "RUNNER";
						final String c3 = "JOKER";
						final String c4 = "FRUIT";
						final String c5 = "BANNER";
						Intent aaaa = new Intent(MainActivity.this, WORDS.class);
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
						aaaa.putExtra("tit", "sssss");
						String t1 = sh.getString("t20", "");
						aaaa.putExtra("ta1", t1);
						String a1 = sh.getString("a20", "");
						aaaa.putExtra("ta2", a1);
						String b1 = sh.getString("b20", "");
						aaaa.putExtra("ta3", b1);
						String ca1 = sh.getString("c20", "");
						aaaa.putExtra("ta4", ca1);
						String d1 = sh.getString("d20", "");
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
		interstitialAds.show();

	}
}
