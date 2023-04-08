package app.rvx.manager.miracle;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.prime.arab.ware.everythingutils.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.downloader.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import android.content.pm.PackageManager;

public class ManageActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double YT_Visb = 0;
	private double YM_Visb = 0;
	private double MG_Visb = 0;
	private String fontName = "";
	private String typeace = "";
	private String filePath = "";
	private String fileName = "";
	private String YTUrl = "";
	private boolean downloading = false;
	private double progressPercent = 0;
	private boolean pause = false;
	private String RVXYtPkg = "";
	private String packageName = "";
	private String YTVersionName = "";
	private String YTSHA256 = "";
	private String RVXYmPkg = "";
	private String RVXMgPkg = "";
	private String YMVersionName = "";
	private String YMSHA256 = "";
	private String MGVersionName = "";
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear32;
	private LinearLayout linear43;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private Switch switch1;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview1;
	private LinearLayout linear46;
	private ImageView imageview7;
	private LinearLayout linear69;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear8;
	private TextView textview4;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private ImageView imageview1;
	private TextView textview5;
	private TextView textview6;
	private LinearLayout linear30;
	private ImageView imageview3;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear52;
	private LinearLayout linear51;
	private LinearLayout linear50;
	private LinearLayout linear49;
	private LinearLayout linear48;
	private LinearLayout linear47;
	private LinearLayout linear29;
	private ImageView imageview11;
	private ImageView imageview10;
	private ImageView imageview9;
	private ImageView imageview8;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear53;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private ImageView imageview2;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear31;
	private ImageView imageview4;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private TextView textview17;
	private TextView textview19;
	private TextView textview18;
	private TextView textview20;
	private TextView textview21;
	private TextView textview22;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private ImageView imageview12;
	private ImageView imageview13;
	private ImageView imageview14;
	private ImageView imageview15;
	private LinearLayout linear33;
	private LinearLayout linear35;
	private LinearLayout linear61;
	private LinearLayout linear36;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private ImageView imageview5;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear39;
	private ImageView imageview6;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private TextView textview28;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private ImageView imageview16;
	private ImageView imageview17;
	private ImageView imageview18;
	private ImageView imageview19;
	private LinearLayout linear73;
	private LinearLayout linear72;
	private LinearLayout linear74;
	private TextView textview31;
	private LinearLayout linear75;
	private ProgressBar progressbar1;
	private LinearLayout linear82;
	private LinearLayout linear77;
	private LinearLayout linear76;
	private TextView textview29;
	private TextView textview30;
	
	private SharedPreferences Settings;
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private TimerTask timer;
	private Intent intent = new Intent();
	private RequestNetwork Connection;
	private RequestNetwork.RequestListener _Connection_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.manage);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear32 = findViewById(R.id.linear32);
		linear43 = findViewById(R.id.linear43);
		linear70 = findViewById(R.id.linear70);
		linear71 = findViewById(R.id.linear71);
		switch1 = findViewById(R.id.switch1);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview1 = findViewById(R.id.textview1);
		linear46 = findViewById(R.id.linear46);
		imageview7 = findViewById(R.id.imageview7);
		linear69 = findViewById(R.id.linear69);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		linear8 = findViewById(R.id.linear8);
		textview4 = findViewById(R.id.textview4);
		linear12 = findViewById(R.id.linear12);
		linear11 = findViewById(R.id.linear11);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		imageview1 = findViewById(R.id.imageview1);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		linear30 = findViewById(R.id.linear30);
		imageview3 = findViewById(R.id.imageview3);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear52 = findViewById(R.id.linear52);
		linear51 = findViewById(R.id.linear51);
		linear50 = findViewById(R.id.linear50);
		linear49 = findViewById(R.id.linear49);
		linear48 = findViewById(R.id.linear48);
		linear47 = findViewById(R.id.linear47);
		linear29 = findViewById(R.id.linear29);
		imageview11 = findViewById(R.id.imageview11);
		imageview10 = findViewById(R.id.imageview10);
		imageview9 = findViewById(R.id.imageview9);
		imageview8 = findViewById(R.id.imageview8);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		linear53 = findViewById(R.id.linear53);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		imageview2 = findViewById(R.id.imageview2);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		linear31 = findViewById(R.id.linear31);
		imageview4 = findViewById(R.id.imageview4);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		textview17 = findViewById(R.id.textview17);
		textview19 = findViewById(R.id.textview19);
		textview18 = findViewById(R.id.textview18);
		textview20 = findViewById(R.id.textview20);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
		linear54 = findViewById(R.id.linear54);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		linear58 = findViewById(R.id.linear58);
		linear59 = findViewById(R.id.linear59);
		linear60 = findViewById(R.id.linear60);
		imageview12 = findViewById(R.id.imageview12);
		imageview13 = findViewById(R.id.imageview13);
		imageview14 = findViewById(R.id.imageview14);
		imageview15 = findViewById(R.id.imageview15);
		linear33 = findViewById(R.id.linear33);
		linear35 = findViewById(R.id.linear35);
		linear61 = findViewById(R.id.linear61);
		linear36 = findViewById(R.id.linear36);
		linear37 = findViewById(R.id.linear37);
		linear38 = findViewById(R.id.linear38);
		imageview5 = findViewById(R.id.imageview5);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		linear39 = findViewById(R.id.linear39);
		imageview6 = findViewById(R.id.imageview6);
		linear40 = findViewById(R.id.linear40);
		linear41 = findViewById(R.id.linear41);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linear64 = findViewById(R.id.linear64);
		linear65 = findViewById(R.id.linear65);
		linear66 = findViewById(R.id.linear66);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		imageview16 = findViewById(R.id.imageview16);
		imageview17 = findViewById(R.id.imageview17);
		imageview18 = findViewById(R.id.imageview18);
		imageview19 = findViewById(R.id.imageview19);
		linear73 = findViewById(R.id.linear73);
		linear72 = findViewById(R.id.linear72);
		linear74 = findViewById(R.id.linear74);
		textview31 = findViewById(R.id.textview31);
		linear75 = findViewById(R.id.linear75);
		progressbar1 = findViewById(R.id.progressbar1);
		linear82 = findViewById(R.id.linear82);
		linear77 = findViewById(R.id.linear77);
		linear76 = findViewById(R.id.linear76);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		Settings = getSharedPreferences("getSettings", Activity.MODE_PRIVATE);
		net = new RequestNetwork(this);
		Connection = new RequestNetwork(this);
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					_DarkTheme();
				}
				else {
					_LightTheme();
				}
			}
		});
		
		linear46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Popup();
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Popup();
			}
		});
		
		linear30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (YT_Visb == 0) {
					YT_Visb = 1;
					linear11.setVisibility(View.VISIBLE);
					linear13.setVisibility(View.VISIBLE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview3.setImageResource(R.drawable.ic_angle_small_up_black);
					}
					else {
						imageview3.setImageResource(R.drawable.ic_angle_small_up);
					}
				}
				else {
					YT_Visb = 0;
					linear11.setVisibility(View.GONE);
					linear13.setVisibility(View.GONE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview3.setImageResource(R.drawable.ic_angle_small_down_black);
					}
					else {
						imageview3.setImageResource(R.drawable.ic_angle_small_down);
					}
				}
			}
		});
		
		linear52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				packageName = RVXYtPkg;
				try {
					    Intent miracle = new Intent(intent.ACTION_DELETE);
					    miracle.setData(Uri.parse("package:" + packageName));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found !");
				}
			}
		});
		
		linear48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:"+RVXYtPkg));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !");
				}
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (YM_Visb == 0) {
					YM_Visb = 1;
					linear22.setVisibility(View.VISIBLE);
					linear53.setVisibility(View.VISIBLE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview4.setImageResource(R.drawable.ic_angle_small_up_black);
					}
					else {
						imageview4.setImageResource(R.drawable.ic_angle_small_up);
					}
				}
				else {
					YM_Visb = 0;
					linear22.setVisibility(View.GONE);
					linear53.setVisibility(View.GONE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview4.setImageResource(R.drawable.ic_angle_small_down_black);
					}
					else {
						imageview4.setImageResource(R.drawable.ic_angle_small_down);
					}
				}
			}
		});
		
		linear54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					    Intent miracle = new Intent(intent.ACTION_DELETE);
					    miracle.setData(Uri.parse("package:"+RVXYmPkg));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found !");
				}
			}
		});
		
		linear58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:"+RVXYmPkg));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !");
				}
			}
		});
		
		linear39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (MG_Visb == 0) {
					MG_Visb = 1;
					linear35.setVisibility(View.VISIBLE);
					linear61.setVisibility(View.VISIBLE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview6.setImageResource(R.drawable.ic_angle_small_up_black);
					}
					else {
						imageview6.setImageResource(R.drawable.ic_angle_small_up);
					}
				}
				else {
					MG_Visb = 0;
					linear35.setVisibility(View.GONE);
					linear61.setVisibility(View.GONE);
					if (Settings.getString("themes", "").equals("light")) {
						imageview6.setImageResource(R.drawable.ic_angle_small_down_black);
					}
					else {
						imageview6.setImageResource(R.drawable.ic_angle_small_down);
					}
				}
			}
		});
		
		linear62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					    Intent miracle = new Intent(intent.ACTION_DELETE);
					    miracle.setData(Uri.parse("package:"+RVXMgPkg));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found !");
				}
			}
		});
		
		linear66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try {
					    Intent miracle = new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
					    miracle.setData(Uri.parse("package:"+RVXMgPkg));
					    startActivity(miracle);
					
				} catch ( ActivityNotFoundException e ) {
					SketchwareUtil.showMessage(getApplicationContext(), "Application Not Found On Your Device !");
				}
			}
		});
		
		linear76.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PRDownloader.cancelAll();
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_Connection_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				/*
_telegramLoaderDialog(false);
*/
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				/*
_telegramLoaderDialog(false);
final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(ManageActivity.this);

View bottomSheetView; bottomSheetView = getLayoutInflater().inflate(R.layout.no_internet,null );
bottomSheetDialog.setContentView(bottomSheetView);

bottomSheetDialog.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
TextView t1 = (TextView) bottomSheetView.findViewById(R.id.t1);

TextView t2 = (TextView) bottomSheetView.findViewById(R.id.t2);

TextView b1 = (TextView) bottomSheetView.findViewById(R.id.b1);

TextView b2 = (TextView) bottomSheetView.findViewById(R.id.b2);

ImageView i1 = (ImageView) bottomSheetView.findViewById(R.id.i1);

LinearLayout bg = (LinearLayout) bottomSheetView.findViewById(R.id.bg);
t1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
t2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
b1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
b2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
i1.setImageResource(R.drawable.thumb_1);
t1.setText("Disconnected From Internet !");
t2.setText("Sorry you can't connect to this project at this moment. please try again later.");
b1.setText("Cancel");
b2.setText("Try again");
_RoundAndBorder(i1, "#D50000", 0, "#D50000", 100);
_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
_rippleRoundStroke(b1, "#FFFFFF", "#EEEEEE", 15, 2.5d, "#EEEEEE");
_rippleRoundStroke(b2, "#D50000", "#40FFFFFF", 15, 0, "#000000");
i1.setElevation((float)0.1d);
_ICC(i1, "#FFFFFF", "#FFFFFF");
b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
_FetchRequest();
_telegramLoaderDialog(true);
bottomSheetDialog.dismiss();
}
});
bottomSheetDialog.setCancelable(false);
b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
bottomSheetDialog.dismiss();
finish();
}
});
bottomSheetDialog.show();
*/
			}
		};
	}
	
	private void initializeLogic() {
		Settings.edit().putString("themes", "light").commit();
		_LightTheme();
		/*
_FetchRequest();
_telegramLoaderDialog(true);
*/
		downloading = false;
		pause = false;
		RVXYtPkg = "app.rvx.android.youtube";
		RVXYmPkg = "app.rvx.android.apps.youtube.music";
		RVXMgPkg = "com.mgoogle.android.gms";
		_DefaultVisibleity();
		_changeActivityFont("en_medium");
		YT_Visb = 1;
		YM_Visb = 0;
		MG_Visb = 0;
		YTUrl = "https://github.com/inotia00/VancedMicroG/releases/download/v0.2.27.230755/microg.apk";
		_DownloadLogic();
		_AppInfo();
		Resources res = getResources();
		progressbar1.setProgressDrawable(res.getDrawable( R.drawable.gradient_progress));
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		
		if(timeOfDay >= 0 && timeOfDay < 12){
			    textview2.setText("Good Morning,");
		}else if(timeOfDay >= 12 && timeOfDay < 16){
			    textview2.setText("Good Afternoon,");
		}else if(timeOfDay >= 16 && timeOfDay < 21){
			    textview2.setText("Good Evening,");
		}else if(timeOfDay >= 21 && timeOfDay < 24){
			    textview2.setText( "Good Night,");
		}
		if (Settings.getString("UserName", "").equals("")) {
			Settings.edit().putString("UserName", "Unknown User").commit();
			textview3.setText(Settings.getString("UserName", ""));
		}
		else {
			textview3.setText(Settings.getString("UserName", ""));
		}
		_ColorFilterLight();
	}
	
	@Override
	public void onBackPressed() {
		final AlertDialog dialog1 = new AlertDialog.Builder(ManageActivity.this).create();
		View inflate = getLayoutInflater().inflate(R.layout.bottom_sheet_p2,null); 
		dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
		dialog1.setView(inflate);
		TextView t1 = (TextView) inflate.findViewById(R.id.t1);
		
		TextView t2 = (TextView) inflate.findViewById(R.id.t2);
		
		TextView b1 = (TextView) inflate.findViewById(R.id.b1);
		
		TextView b2 = (TextView) inflate.findViewById(R.id.b2);
		
		LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
		t1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
		t2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
		b1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
		b2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
		t1.setText("Wanna Quit ?");
		t2.setText("Are you sure to exit from application !!");
		b1.setText("No, Stay");
		b2.setText("Yes, Quit");
		_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
		if (Settings.getString("themes", "").equals("black")) {
			t1.setTextColor(0xFFFFFFFF);
			_rippleRoundStroke(bg, "#454545", "#000000", 15, 0, "#000000");
		}
		_rippleRoundStroke(b1, "#F5F5F5", "#E0E0E0", 15, 0, "#000000");
		_rippleRoundStroke(b2, "#304ffe", "#40FFFFFF", 15, 0, "#000000");
		b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				dialog1.dismiss();
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				finish();
			}
		});
		dialog1.setCancelable(true);
		dialog1.show();
	}
	
	public void _status_bar_color(final String _colour1, final String _colour2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
			   Window w = this.getWindow(); w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			   w.setStatusBarColor(Color.parseColor(_colour1)); w.setNavigationBarColor(Color.parseColor(_colour2));
		}
	}
	
	
	public void _LightTheme() {
		_status_bar_color("#ffffff", "#EEEEEE");
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =ManageActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFEEEEEE);
		}
		Settings.edit().putString("themes", "light").commit();
		textview2.setTextColor(0xFF000000);
		textview6.setTextColor(0xFF424242);
		textview8.setTextColor(0xFF424242);
		textview10.setTextColor(0xFF424242);
		textview5.setTextColor(0xFF000000);
		textview7.setTextColor(0xFF000000);
		textview9.setTextColor(0xFF000000);
		vscroll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, 0xFFEEEEEE));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF304FFE));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear20.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear43.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear71.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		textview1.setTextColor(0xFF304FFE);
		textview3.setTextColor(0xFF304FFE);
		textview14.setTextColor(0xFF2962FF);
		textview15.setTextColor(0xFF2962FF);
		textview16.setTextColor(0xFF2962FF);
		textview20.setTextColor(0xFF2962FF);
		textview21.setTextColor(0xFF2962FF);
		textview22.setTextColor(0xFF2962FF);
		textview20.setTextColor(0xFF2962FF);
		textview21.setTextColor(0xFF2962FF);
		textview22.setTextColor(0xFF2962FF);
		textview26.setTextColor(0xFF2962FF);
		textview27.setTextColor(0xFF2962FF);
		textview28.setTextColor(0xFF2962FF);
		textview11.setTextColor(0xFF000000);
		textview12.setTextColor(0xFF000000);
		textview13.setTextColor(0xFF000000);
		textview17.setTextColor(0xFF000000);
		textview18.setTextColor(0xFF000000);
		textview19.setTextColor(0xFF000000);
		textview23.setTextColor(0xFF000000);
		textview24.setTextColor(0xFF000000);
		textview25.setTextColor(0xFF000000);
		textview29.setTextColor(0xFF000000);
		textview30.setTextColor(0xFF000000);
		textview31.setTextColor(0xFF000000);
		_GradientDrawable(linear30, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear31, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear39, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear46, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear48, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear50, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear52, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear29, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear54, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear56, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear58, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear60, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear54, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear56, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear58, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear60, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear62, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear64, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear66, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear68, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear76, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 1000);
		_GradientDrawable(linear82, 25, 00, 00, "#eeeeee", "#ffffff", false, true, 1000);
		_ColorFilterLight();
		_IconColorUpDown();
	}
	
	
	public void _DarkTheme() {
		_status_bar_color("#ffffff", "#000000");
		getWindow().getDecorView().setSystemUiVisibility(0);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =ManageActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
		}
		Settings.edit().putString("themes", "black").commit();
		vscroll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, 0xFF000000));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear20.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear43.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear71.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		textview6.setTextColor(0xFFE0E0E0);
		textview2.setTextColor(0xFFFFFFFF);
		textview8.setTextColor(0xFFE0E0E0);
		textview10.setTextColor(0xFFE0E0E0);
		textview5.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview1.setTextColor(0xFF8C9EFF);
		textview3.setTextColor(0xFF8C9EFF);
		textview14.setTextColor(0xFF8C9EFF);
		textview15.setTextColor(0xFF8C9EFF);
		textview16.setTextColor(0xFF8C9EFF);
		textview20.setTextColor(0xFF8C9EFF);
		textview21.setTextColor(0xFF8C9EFF);
		textview22.setTextColor(0xFF8C9EFF);
		textview20.setTextColor(0xFF8C9EFF);
		textview21.setTextColor(0xFF8C9EFF);
		textview22.setTextColor(0xFF8C9EFF);
		textview26.setTextColor(0xFF8C9EFF);
		textview27.setTextColor(0xFF8C9EFF);
		textview28.setTextColor(0xFF8C9EFF);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		textview17.setTextColor(0xFFFFFFFF);
		textview18.setTextColor(0xFFFFFFFF);
		textview19.setTextColor(0xFFFFFFFF);
		textview23.setTextColor(0xFFFFFFFF);
		textview24.setTextColor(0xFFFFFFFF);
		textview25.setTextColor(0xFFFFFFFF);
		textview29.setTextColor(0xFFFFFFFF);
		textview30.setTextColor(0xFFFFFFFF);
		textview31.setTextColor(0xFFFFFFFF);
		_GradientDrawable(linear30, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear31, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear39, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear46, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear48, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear50, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear52, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear29, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear54, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear56, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear58, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear60, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear54, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear56, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear58, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear60, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear62, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear64, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear66, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear68, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear76, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear82, 25, 00, 00, "#000000", "#ffffff", false, true, 1000);
		_ColorFilter(imageview7, "#ffffff");
		_IconColorUpDown();
	}
	
	
	public void _Popup() {
		View popupView = getLayoutInflater().inflate(R.layout.popup, null);
		
		final PopupWindow popup = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
		TextView txt1 = popupView.findViewById(R.id.txt1);
		
		TextView txt2 = popupView.findViewById(R.id.txt2);
		
		TextView txt3 = popupView.findViewById(R.id.txt3);
		
		LinearLayout lin_popup = popupView.findViewById(R.id.lin_popup);
		
		LinearLayout lin_text = popupView.findViewById(R.id.lin_text);
		
		LinearLayout lin_sketchub = popupView.findViewById(R.id.lin_sketchub);
		
		LinearLayout lin_div = popupView.findViewById(R.id.lin_div);
		
		LinearLayout lin_settings = popupView.findViewById(R.id.lin_settings);
		
		ImageView img1 = popupView.findViewById(R.id.imageview1);
		
		ImageView img2 = popupView.findViewById(R.id.imageview2);
		
		ImageView img3 = popupView.findViewById(R.id.imageview3);
		lin_text.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				Intent in_tent = new Intent();
				in_tent.setClass(getApplicationContext(), UpdateActivity.class);
				startActivity(in_tent);
				com.blogspot.atifsoftwares.animatoolib.Animatoo.animateFade(ManageActivity.this);
				popup.dismiss();
			} });
		
		lin_sketchub.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				Intent in_tent = new Intent();
				in_tent.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(in_tent);
				com.blogspot.atifsoftwares.animatoolib.Animatoo.animateFade(ManageActivity.this);
				popup.dismiss();
			} });
		
		lin_settings.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				Intent in_tent = new Intent();
				in_tent.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(in_tent);
				com.blogspot.atifsoftwares.animatoolib.Animatoo.animateFade(ManageActivity.this);
				popup.dismiss();
			} });
		
		if (Settings.getString("themes", "").equals("black")) {
			android.graphics.drawable.GradientDrawable round = new android.graphics.drawable.GradientDrawable ();
			round.setColor (Color.parseColor("#2E2F32"));
			
			round.setCornerRadius (50);
			
			lin_popup.setBackground (round);
			
			lin_popup.setElevation(6);
			
			txt1.setTextColor(0xFFFFFFFF);
			txt2.setTextColor(0xFFFFFFFF);
			txt3.setTextColor(0xFFFFFFFF);
			
			img1.getDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
			img2.getDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
			img3.getDrawable().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
			lin_div.setBackgroundColor(0xFF202124);
		}
		else {
			android.graphics.drawable.GradientDrawable round2 = new android.graphics.drawable.GradientDrawable ();
			round2.setColor (Color.parseColor("#FFFFFF"));
			
			round2.setCornerRadius (50);
			
			lin_popup.setBackground (round2);
			
			lin_popup.setElevation(6);
			
			txt1.setTextColor(0xFF000000);
			txt2.setTextColor(0xFF000000);
			txt3.setTextColor(0xFF000000);
			
			img1.getDrawable().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);
			
			img2.getDrawable().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);
			
			img3.getDrawable().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);
		}
		popup.setAnimationStyle(android.R.style.Animation_Dialog);
		
		popup.showAsDropDown(linear46, 0,0);
	}
	
	
	public void _GradientDrawable(final View _view, final double _radius, final double _stroke, final double _shadow, final String _color, final String _borderColor, final boolean _ripple, final boolean _clickAnim, final double _animDuration) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#304FFE")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int)_stroke,Color.parseColor(_borderColor));
			_view.setBackground(gd);
			if (Build.VERSION.SDK_INT >= 21){
				_view.setElevation((int)_shadow);}
		}
		if (_clickAnim) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration((int)_animDuration);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration((int)_animDuration);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _ColorFilter(final ImageView _view, final String _color) {
		_view.getDrawable().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
	}
	
	
	public void _DefaultVisibleity() {
		linear22.setVisibility(View.GONE);
		linear53.setVisibility(View.GONE);
		linear35.setVisibility(View.GONE);
		linear61.setVisibility(View.GONE);
		linear71.setVisibility(View.GONE);
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _changeActivityFont(final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _DownloadLogic() {
		linear29.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
				linear71.setVisibility(View.VISIBLE);
				if (downloading) {
					SketchwareUtil.showMessage(getApplicationContext(), "Please wait until file download not complete !");
					final AlertDialog dialognc = new AlertDialog.Builder(ManageActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.dnc,null); 
					dialognc.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
					dialognc.setView(inflate);
					TextView t1 = (TextView) inflate.findViewById(R.id.t1);
					
					TextView t2 = (TextView) inflate.findViewById(R.id.t2);
					
					TextView b1 = (TextView) inflate.findViewById(R.id.b1);
					
					TextView b2 = (TextView) inflate.findViewById(R.id.b2);
					
					LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
					t1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
					t2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
					/*
b1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
*/
					b2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_medium.ttf"), 0);
					
					t1.setText("Please Wait");
					t2.setText("A another file is already downloading please wait until download complete !");
					b2.setText("Okay");
					_rippleRoundStroke(bg, "#FFFFFF", "#000000", 15, 0, "#000000");
					if (Settings.getString("themes", "").equals("black")) {
						t1.setTextColor(0xFFFFFFFF);
						_rippleRoundStroke(bg, "#454545", "#000000", 15, 0, "#000000");
					}
					/*
_rippleRoundStroke(b1, "#F5F5F5", "#E0E0E0", 15, 0, "#000000");
*/
					_rippleRoundStroke(b2, "#304ffe", "#40FFFFFF", 15, 0, "#000000");
					/*
b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
dialog1.dismiss();
}
});
*/
					b2.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							dialognc.dismiss();
						}
					});
					dialognc.setCancelable(true);
					dialognc.show();
				}
				else {
					PRDownloaderConfig config = PRDownloaderConfig.newBuilder()
					                .setDatabaseEnabled(true)
					                .setReadTimeout(30_000)
					                .setConnectTimeout(30_000)
					                .build();
					PRDownloader.initialize(ManageActivity.this, config);
					if (Status.RUNNING == PRDownloader.getStatus(rvxyt)) {
											PRDownloader.pause(rvxyt);
											return;
								}
								
					if (Status.PAUSED == PRDownloader.getStatus(rvxyt)) {
											PRDownloader.resume(rvxyt);
											return;
								}
					int rvxyt = PRDownloader.download(YTUrl, FileUtil.getPackageDataDir(getApplicationContext()).concat("/saved/"), "YT_Miracle.apk")
					                        .build()
					                        .setOnStartOrResumeListener(new OnStartOrResumeListener() {
						                            @Override
						                            public void onStartOrResume() {
							
						}
						                        })
					                        .setOnPauseListener(new OnPauseListener() {
						                            @Override
						                            public void onPause() {
							
						}
						                        })
					                        .setOnCancelListener(new OnCancelListener() {
						                            @Override
						                            public void onCancel() {
							downloading = false;
							linear71.setVisibility(View.GONE);
							
						}
						                        })
					                        .setOnProgressListener(new OnProgressListener() {
						                            @Override
						                            public void onProgress(Progress progress) {
							long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
							downloading = true;
							progressbar1.setMax((int)100);
							progressbar1.setProgress((int)progressPercent);
							textview29.setText(String.valueOf((long)(progressPercent)).concat(" %"));
							
						}
						                        })
					                        .start(new OnDownloadListener() {
						                            @Override
						                            public void onDownloadComplete() {
							try {
								if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
														Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
																ManageActivity.this.getPackageName() + ".provider", new java.io.File(FileUtil.getPackageDataDir(getApplicationContext()).concat("/saved/YT_Miracle.apk")));
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
														intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														intent.setDataAndType(uri, "application/vnd.android.package-archive");
														startActivity(intent);
									
												} else {
														Intent intent = new Intent(Intent.ACTION_VIEW);
														intent.setDataAndType(Uri.fromFile( new java.io.File(FileUtil.getPackageDataDir(getApplicationContext()).concat("/saved/YT_Miracle.apk"))),
																"application/vnd.android.package-archive");
														intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
														startActivity(intent);
												}
								
							} catch (Exception rr) {
								showMessage (rr.toString());
							}
							downloading = false;
							linear71.setVisibility(View.GONE);
							SketchwareUtil.showMessage(getApplicationContext(), "Complete");
							
						}
						
						                            @Override
						                            public void onError(Error error) {
							
						}
						                        });
				}
			}
			                        });
	}
	
	
	public void _lib() {
		//this block and project made by suaib ahmed
	}
	
	public static class PRDownloader {
		    private PRDownloader() {
				    }
		    public static void initialize(Context context) {
				        initialize(context, PRDownloaderConfig.newBuilder().build());
				    }
		    public static void initialize(Context context, PRDownloaderConfig config) {
				        ComponentHolder.getInstance().init(context, config);
				        DownloadRequestQueue.initialize();
				    }
		    public static DownloadRequestBuilder download(String url, String dirPath, String fileName) {
				        return new DownloadRequestBuilder(url, dirPath, fileName);
				    }
		    public static void pause(int downloadId) {
				        DownloadRequestQueue.getInstance().pause(downloadId);
				    }
		    public static void resume(int downloadId) {
				        DownloadRequestQueue.getInstance().resume(downloadId);
				    }
		    public static void cancel(int downloadId) {
				        DownloadRequestQueue.getInstance().cancel(downloadId);
				    }
		    public static void cancel(Object tag) {
				        DownloadRequestQueue.getInstance().cancel(tag);
				    }
		    public static void cancelAll() {
				        DownloadRequestQueue.getInstance().cancelAll();
				    }
		    public static Status getStatus(int downloadId) {
				        return DownloadRequestQueue.getInstance().getStatus(downloadId);
				    }
		    public static void cleanUp(int days) {
				        Utils.deleteUnwantedModelsAndTempFiles(days);
				    }
		    public static void shutDown() {
				        Core.shutDown();
				    }
	}
	
	public static class Response {
		    private Error error;
		    private boolean isSuccessful;
		    private boolean isPaused;
		    private boolean isCancelled;
		    public Error getError() {
				        return error;
				    }
		    public void setError(Error error) {
				        this.error = error;
				    }
		    public boolean isSuccessful() {
				        return isSuccessful;
				    }
		    public void setSuccessful(boolean successful) {
				        isSuccessful = successful;
				    }
		    public boolean isPaused() {
				        return isPaused;
				    }
		    public void setPaused(boolean paused) {
				        isPaused = paused;
				    }
		    public boolean isCancelled() {
				        return isCancelled;
				    }
		    public void setCancelled(boolean cancelled) {
				        isCancelled = cancelled;
				    }
	}
	
	public static enum Status {
		    QUEUED,
		    RUNNING,
		    PAUSED,
		    COMPLETED,
		    CANCELLED,
		    UNKNOWN
	}
	
	public static class Progress implements java.io.Serializable {
		    public long currentBytes;
		    public long totalBytes;
		    public Progress(long currentBytes, long totalBytes) {
				        this.currentBytes = currentBytes;
				        this.totalBytes = totalBytes;
				    }
		    @Override
		    public String toString() {
				        return "Progress{" +
				                "currentBytes=" + currentBytes +
				                ", totalBytes=" + totalBytes +
				                '}';
				    }
	}
	
	public static enum Priority {
		    LOW,
		    MEDIUM,
		    HIGH,
		    IMMEDIATE
	}
	
	
	public static class PRDownloaderConfig {
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private HttpClient httpClient;
		    private boolean databaseEnabled;
		    private PRDownloaderConfig(Builder builder) {
				        this.readTimeout = builder.readTimeout;
				        this.connectTimeout = builder.connectTimeout;
				        this.userAgent = builder.userAgent;
				        this.httpClient = builder.httpClient;
				        this.databaseEnabled = builder.databaseEnabled;
				    }
		    public int getReadTimeout() {
				        return readTimeout;
				    }
		    public void setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				    }
		    public int getConnectTimeout() {
				        return connectTimeout;
				    }
		    public void setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				    }
		    public String getUserAgent() {
				        return userAgent;
				    }
		    public void setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				    }
		    public HttpClient getHttpClient() {
				        return httpClient;
				    }
		    public void setHttpClient(HttpClient httpClient) {
				        this.httpClient = httpClient;
				    }
		    public boolean isDatabaseEnabled() {
				        return databaseEnabled;
				    }
		    public void setDatabaseEnabled(boolean databaseEnabled) {
				        this.databaseEnabled = databaseEnabled;
				    }
		    public static Builder newBuilder() {
				        return new Builder();
				    }
		    public static class Builder {
				        int readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS;
				        int connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS;
				        String userAgent = Constants.DEFAULT_USER_AGENT;
				        HttpClient httpClient = new DefaultHttpClient();
				        boolean databaseEnabled = false;
				        public Builder setReadTimeout(int readTimeout) {
						            this.readTimeout = readTimeout;
						            return this;
						        }
				        public Builder setConnectTimeout(int connectTimeout) {
						            this.connectTimeout = connectTimeout;
						            return this;
						        }
				        public Builder setUserAgent(String userAgent) {
						            this.userAgent = userAgent;
						            return this;
						        }
				        public Builder setHttpClient(HttpClient httpClient) {
						            this.httpClient = httpClient;
						            return this;
						        }
				        public Builder setDatabaseEnabled(boolean databaseEnabled) {
						            this.databaseEnabled = databaseEnabled;
						            return this;
						        }
				        public PRDownloaderConfig build() {
						            return new PRDownloaderConfig(this);
						        }
				    }
	}
	
	
	public static final class Constants {
		    private Constants() {
				    }
		    public static final int UPDATE = 0x01;
		    public static final String RANGE = "Range";
		    public static final String ETAG = "ETag";
		    public static final String USER_AGENT = "User-Agent";
		    public static final String DEFAULT_USER_AGENT = "Gymkhana-Studio";
		    public static final int DEFAULT_READ_TIMEOUT_IN_MILLS = 20_000;
		    public static final int DEFAULT_CONNECT_TIMEOUT_IN_MILLS = 20_000;
		    public static final int HTTP_RANGE_NOT_SATISFIABLE = 416;
		    public static final int HTTP_TEMPORARY_REDIRECT = 307;
		    public static final int HTTP_PERMANENT_REDIRECT = 308;
	}
	
	public static class Error {
		    private boolean isServerError;
		    private boolean isConnectionError;
		    public boolean isServerError() {
				        return isServerError;
				    }
		    public void setServerError(boolean serverError) {
				        isServerError = serverError;
				    }
		    public boolean isConnectionError() {
				        return isConnectionError;
				    }
		    public void setConnectionError(boolean connectionError) {
				        isConnectionError = connectionError;
				    }
	}
	
	public static interface OnCancelListener {
		    void onCancel();
	}
	
	public static interface OnDownloadListener {
		    void onDownloadComplete();
		    void onError(Error error);
	}
	
	public static interface OnPauseListener {
		    void onPause();
	}
	
	public static interface OnProgressListener {
		    void onProgress(Progress progress);
	}
	
	public static interface OnStartOrResumeListener {
		    void onStartOrResume();
	}
	
	
	
	public static class ProgressHandler extends Handler {
		    private final OnProgressListener listener;
		    public ProgressHandler(OnProgressListener listener) {
				        super(Looper.getMainLooper());
				        this.listener = listener;
				    }
		    @Override
		    public void handleMessage(Message msg) {
				        switch (msg.what) {
						            case Constants.UPDATE:
						                if (listener != null) {
								                    final Progress progress = (Progress) msg.obj;
								                    listener.onProgress(progress);
								                }
						                break;
						            default:
						                super.handleMessage(msg);
						                break;
						        }
				    }
	}
	
	public static class DefaultHttpClient implements HttpClient {
		    private java.net.URLConnection connection;
		    public DefaultHttpClient() {
				    }
		    @SuppressWarnings("CloneDoesntCallSuperClone")
		    @Override
		    public HttpClient clone() {
				        return new DefaultHttpClient();
				    }
		    @Override
		    public void connect(DownloadRequest request) throws java.io.IOException {
				        connection = new java.net.URL(request.getUrl()).openConnection();
				        connection.setReadTimeout(request.getReadTimeout());
				        connection.setConnectTimeout(request.getConnectTimeout());
				        final String range = String.format(Locale.ENGLISH,
				                "bytes=d-", request.getDownloadedBytes());
				        connection.addRequestProperty(Constants.RANGE, range);
				        connection.addRequestProperty(Constants.USER_AGENT, request.getUserAgent());
				        addHeaders(request);
				        connection.connect();
				    }
		    @Override
		    public int getResponseCode() throws java.io.IOException {
				        int responseCode = 0;
				        if (connection instanceof java.net.HttpURLConnection) {
						            responseCode = ((java.net.HttpURLConnection) connection).getResponseCode();
						        }
				        return responseCode;
				    }
		    @Override
		    public java.io.InputStream getInputStream() throws java.io.IOException {
				        return connection.getInputStream();
				    }
		    @Override
		    public long getContentLength() {
				        String length = connection.getHeaderField("Content-Length");
				        try {
						            return Long.parseLong(length);
						        } catch (NumberFormatException e) {
						            return -1;
						        }
				    }
		    @Override
		    public String getResponseHeader(String name) {
				        return connection.getHeaderField(name);
				    }
		    @Override
		    public void close() {
				    }
		    private void addHeaders(DownloadRequest request) {
				        final HashMap<String, List<String>> headers = request.getHeaders();
				        if (headers != null) {
						            Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
						            for (Map.Entry<String, List<String>> entry : entries) {
								                String name = entry.getKey();
								                List<String> list = entry.getValue();
								                if (list != null) {
										                    for (String value : list) {
												                        connection.addRequestProperty(name, value);
												                    }
										                }
								            }
						        }
				    }
		
	}
	
	public static interface HttpClient extends Cloneable {
		    HttpClient clone();
		    void connect(DownloadRequest request) throws java.io.IOException;
		    int getResponseCode() throws java.io.IOException;
		    java.io.InputStream getInputStream() throws java.io.IOException;
		    long getContentLength();
		    String getResponseHeader(String name);
		    void close();
	}
	
	public static class DownloadRequest {
		    private Priority priority;
		    private Object tag;
		    private String url;
		    private String dirPath;
		    private String fileName;
		    private int sequenceNumber;
		    private java.util.concurrent.Future future;
		    private long downloadedBytes;
		    private long totalBytes;
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private OnProgressListener onProgressListener;
		    private OnDownloadListener onDownloadListener;
		    private OnStartOrResumeListener onStartOrResumeListener;
		    private OnPauseListener onPauseListener;
		    private OnCancelListener onCancelListener;
		    private int downloadId;
		    private HashMap<String, List<String>> headerMap;
		    private Status status;
		
		    DownloadRequest(DownloadRequestBuilder builder) {
				        this.url = builder.url;
				        this.dirPath = builder.dirPath;
				        this.fileName = builder.fileName;
				        this.headerMap = builder.headerMap;
				        this.priority = builder.priority;
				        this.tag = builder.tag;
				        this.readTimeout =
				                builder.readTimeout != 0 ?
				                        builder.readTimeout :
				                        getReadTimeoutFromConfig();
				        this.connectTimeout =
				                builder.connectTimeout != 0 ?
				                        builder.connectTimeout :
				                        getConnectTimeoutFromConfig();
				        this.userAgent = builder.userAgent;
				    }
		
		    public Priority getPriority() {
				        return priority;
				    }
		
		    public void setPriority(Priority priority) {
				        this.priority = priority;
				    }
		
		    public Object getTag() {
				        return tag;
				    }
		
		    public void setTag(Object tag) {
				        this.tag = tag;
				    }
		
		    public String getUrl() {
				        return url;
				    }
		
		    public void setUrl(String url) {
				        this.url = url;
				    }
		
		    public String getDirPath() {
				        return dirPath;
				    }
		
		    public void setDirPath(String dirPath) {
				        this.dirPath = dirPath;
				    }
		
		    public String getFileName() {
				        return fileName;
				    }
		
		    public void setFileName(String fileName) {
				        this.fileName = fileName;
				    }
		
		    public int getSequenceNumber() {
				        return sequenceNumber;
				    }
		
		    public void setSequenceNumber(int sequenceNumber) {
				        this.sequenceNumber = sequenceNumber;
				    }
		
		    public HashMap<String, List<String>> getHeaders() {
				        return headerMap;
				    }
		
		    public java.util.concurrent.Future getFuture() {
				        return future;
				    }
		
		    public void setFuture(java.util.concurrent.Future future) {
				        this.future = future;
				    }
		
		    public long getDownloadedBytes() {
				        return downloadedBytes;
				    }
		
		    public void setDownloadedBytes(long downloadedBytes) {
				        this.downloadedBytes = downloadedBytes;
				    }
		
		    public long getTotalBytes() {
				        return totalBytes;
				    }
		
		    public void setTotalBytes(long totalBytes) {
				        this.totalBytes = totalBytes;
				    }
		
		    public int getReadTimeout() {
				        return readTimeout;
				    }
		
		    public void setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				    }
		
		    public int getConnectTimeout() {
				        return connectTimeout;
				    }
		
		    public void setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				    }
		
		    public String getUserAgent() {
				        if (userAgent == null) {
						            userAgent = ComponentHolder.getInstance().getUserAgent();
						        }
				        return userAgent;
				    }
		
		    public void setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				    }
		
		    public int getDownloadId() {
				        return downloadId;
				    }
		
		    public void setDownloadId(int downloadId) {
				        this.downloadId = downloadId;
				    }
		
		    public Status getStatus() {
				        return status;
				    }
		
		    public void setStatus(Status status) {
				        this.status = status;
				    }
		
		    public OnProgressListener getOnProgressListener() {
				        return onProgressListener;
				    }
		
		    public DownloadRequest setOnStartOrResumeListener(OnStartOrResumeListener onStartOrResumeListener) {
				        this.onStartOrResumeListener = onStartOrResumeListener;
				        return this;
				    }
		
		    public DownloadRequest setOnProgressListener(OnProgressListener onProgressListener) {
				        this.onProgressListener = onProgressListener;
				        return this;
				    }
		
		    public DownloadRequest setOnPauseListener(OnPauseListener onPauseListener) {
				        this.onPauseListener = onPauseListener;
				        return this;
				    }
		
		    public DownloadRequest setOnCancelListener(OnCancelListener onCancelListener) {
				        this.onCancelListener = onCancelListener;
				        return this;
				    }
		
		    public int start(OnDownloadListener onDownloadListener) {
				        this.onDownloadListener = onDownloadListener;
				        downloadId = Utils.getUniqueId(url, dirPath, fileName);
				        DownloadRequestQueue.getInstance().addRequest(this);
				        return downloadId;
				    }
		
		    public Response executeSync() {
				        downloadId = Utils.getUniqueId(url, dirPath, fileName);
				        return new SynchronousCall(this).execute();
				    }
		
		    public void deliverError(final Error error) {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onDownloadListener != null) {
												                                onDownloadListener.onError(error);
												                            }
										                            finish();
										                        }
								                    });
						        }
				    }
		
		    public void deliverSuccess() {
				        if (status != Status.CANCELLED) {
						            setStatus(Status.COMPLETED);
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onDownloadListener != null) {
												                                onDownloadListener.onDownloadComplete();
												                            }
										                            finish();
										                        }
								                    });
						        }
				    }
		
		    public void deliverStartEvent() {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onStartOrResumeListener != null) {
												                                onStartOrResumeListener.onStartOrResume();
												                            }
										                        }
								                    });
						        }
				    }
		
		    public void deliverPauseEvent() {
				        if (status != Status.CANCELLED) {
						            Core.getInstance().getExecutorSupplier().forMainThreadTasks()
						                    .execute(new Runnable() {
								                        public void run() {
										                            if (onPauseListener != null) {
												                                onPauseListener.onPause();
												                            }
										                        }
								                    });
						        }
				    }
		
		    private void deliverCancelEvent() {
				        Core.getInstance().getExecutorSupplier().forMainThreadTasks()
				                .execute(new Runnable() {
						                    public void run() {
								                        if (onCancelListener != null) {
										                            onCancelListener.onCancel();
										                        }
								                    }
						                });
				    }
		
		    public void cancel() {
				        status = Status.CANCELLED;
				        if (future != null) {
						            future.cancel(true);
						        }
				        deliverCancelEvent();
				        Utils.deleteTempFileAndDatabaseEntryInBackground(Utils.getTempPath(dirPath, fileName), downloadId);
				    }
		
		    private void finish() {
				        destroy();
				        DownloadRequestQueue.getInstance().finish(this);
				    }
		
		    private void destroy() {
				        this.onProgressListener = null;
				        this.onDownloadListener = null;
				        this.onStartOrResumeListener = null;
				        this.onPauseListener = null;
				        this.onCancelListener = null;
				    }
		
		    private int getReadTimeoutFromConfig() {
				        return ComponentHolder.getInstance().getReadTimeout();
				    }
		
		    private int getConnectTimeoutFromConfig() {
				        return ComponentHolder.getInstance().getConnectTimeout();
				    }
		
	}
	
	public static class DownloadRequestBuilder implements RequestBuilder {
		    String url;
		    String dirPath;
		    String fileName;
		    Priority priority = Priority.MEDIUM;
		    Object tag;
		    int readTimeout;
		    int connectTimeout;
		    String userAgent;
		    HashMap<String, List<String>> headerMap;
		    public DownloadRequestBuilder(String url, String dirPath, String fileName) {
				        this.url = url;
				        this.dirPath = dirPath;
				        this.fileName = fileName;
				    }
		    @Override
		    public DownloadRequestBuilder setHeader(String name, String value) {
				        if (headerMap == null) {
						            headerMap = new HashMap<>();
						        }
				        List<String> list = headerMap.get(name);
				        if (list == null) {
						            list = new ArrayList<>();
						            headerMap.put(name, list);
						        }
				        if (!list.contains(value)) {
						            list.add(value);
						        }
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setPriority(Priority priority) {
				        this.priority = priority;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setTag(Object tag) {
				        this.tag = tag;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setReadTimeout(int readTimeout) {
				        this.readTimeout = readTimeout;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setConnectTimeout(int connectTimeout) {
				        this.connectTimeout = connectTimeout;
				        return this;
				    }
		    @Override
		    public DownloadRequestBuilder setUserAgent(String userAgent) {
				        this.userAgent = userAgent;
				        return this;
				    }
		    public DownloadRequest build() {
				        return new DownloadRequest(this);
				    }
	}
	
	public static interface RequestBuilder {
		    RequestBuilder setHeader(String name, String value);
		    RequestBuilder setPriority(Priority priority);
		    RequestBuilder setTag(Object tag);
		    RequestBuilder setReadTimeout(int readTimeout);
		    RequestBuilder setConnectTimeout(int connectTimeout);
		    RequestBuilder setUserAgent(String userAgent);
	}
	
	public static final class Utils {
		    private final static int MAX_REDIRECTION = 10;
		    private Utils() {
				    }
		    public static String getPath(String dirPath, String fileName) {
				        return dirPath + java.io.File.separator + fileName;
				    }
		    public static String getTempPath(String dirPath, String fileName) {
				        return getPath(dirPath, fileName) + ".temp";
				    }
		    public static void renameFileName(String oldPath, String newPath) throws java.io.IOException {
				        final java.io.File oldFile = new java.io.File(oldPath);
				        try {
						            final java.io.File newFile = new java.io.File(newPath);
						            if (newFile.exists()) {
								                if (!newFile.delete()) {
										                    throw new java.io.IOException("Deletion Failed");
										                }
								            }
						            if (!oldFile.renameTo(newFile)) {
								                throw new java.io.IOException("Rename Failed");
								            }
						        } finally {
						            if (oldFile.exists()) {
								                oldFile.delete();
								            }
						        }
				    }
		
		    public static void deleteTempFileAndDatabaseEntryInBackground(final String path, final int downloadId) {
				        Core.getInstance().getExecutorSupplier().forBackgroundTasks()
				                .execute(new Runnable() {
						                    @Override
						                    public void run() {
								                        ComponentHolder.getInstance().getDbHelper().remove(downloadId);
								                        java.io.File file = new java.io.File(path);
								                        if (file.exists()) {
										                            //noinspection ResultOfMethodCallIgnored
										                            file.delete();
										                        }
								                    }
						                });
				    }
		
		    public static void deleteUnwantedModelsAndTempFiles(final int days) {
				        Core.getInstance().getExecutorSupplier().forBackgroundTasks()
				                .execute(new Runnable() {
						                    @Override
						                    public void run() {
								                        List<DownloadModel> models = ComponentHolder.getInstance()
								                                .getDbHelper()
								                                .getUnwantedModels(days);
								                        if (models != null) {
										                            for (DownloadModel model : models) {
												                                final String tempPath = getTempPath(model.getDirPath(), model.getFileName());
												                                ComponentHolder.getInstance().getDbHelper().remove(model.getId());
												                                java.io.File file = new java.io.File(tempPath);
												                                if (file.exists()) {
														                                    file.delete();
														                                }
												                            }
										                        }
								                    }
						                });
				    }
		
		    public static int getUniqueId(String url, String dirPath, String fileName) {
				        String string = url + java.io.File.separator + dirPath + java.io.File.separator + fileName;
				        byte[] hash;
				        try {
						            hash = java.security.MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
						        } catch (java.security.NoSuchAlgorithmException e) {
						            throw new RuntimeException("NoSuchAlgorithmException", e);
						        } catch (java.io.UnsupportedEncodingException e) {
						            throw new RuntimeException("UnsupportedEncodingException", e);
						        }
				        StringBuilder hex = new StringBuilder(hash.length * 2);
				
				        for (byte b : hash) {
						            if ((b & 0xFF) < 0x10) hex.append("0");
						            hex.append(Integer.toHexString(b & 0xFF));
						        }
				        return hex.toString().hashCode();
				
				    }
		    public static HttpClient getRedirectedConnectionIfAny(HttpClient httpClient,
		                                                          DownloadRequest request)
		            throws java.io.IOException, IllegalAccessException {
				        int redirectTimes = 0;
				        int code = httpClient.getResponseCode();
				        String location = httpClient.getResponseHeader("Location");
				        while (isRedirection(code)) {
						            if (location == null) {
								                throw new IllegalAccessException("Location is null");
								            }
						            httpClient.close();
						            request.setUrl(location);
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            code = httpClient.getResponseCode();
						            location = httpClient.getResponseHeader("Location");
						            redirectTimes++;
						            if (redirectTimes >= MAX_REDIRECTION) {
								                throw new IllegalAccessException("Max redirection done");
								            }
						        }
				        return httpClient;
				    }
		    private static boolean isRedirection(int code) {
				        return code == java.net.HttpURLConnection.HTTP_MOVED_PERM
				                || code == java.net.HttpURLConnection.HTTP_MOVED_TEMP
				                || code == java.net.HttpURLConnection.HTTP_SEE_OTHER
				                || code == java.net.HttpURLConnection.HTTP_MULT_CHOICE
				                || code == Constants.HTTP_TEMPORARY_REDIRECT
				                || code == Constants.HTTP_PERMANENT_REDIRECT;
				    }
	}
	
	
	public static class Core {
		    private static Core instance = null;
		    private final ExecutorSupplier executorSupplier;
		    private Core() {
				        this.executorSupplier = new DefaultExecutorSupplier();
				    }
		    public static Core getInstance() {
				        if (instance == null) {
						            synchronized (Core.class) {
								                if (instance == null) {
										                    instance = new Core();
										                }
								            }
						        }
				        return instance;
				    }
		    public ExecutorSupplier getExecutorSupplier() {
				        return executorSupplier;
				    }
		    public static void shutDown() {
				        if (instance != null) {
						            instance = null;
						        }
				    }
	}
	
	
	public static class PriorityThreadFactory implements java.util.concurrent.ThreadFactory {
		    private final int mThreadPriority;
		    PriorityThreadFactory(int threadPriority) {
				        mThreadPriority = threadPriority;
				    }
		    @Override
		    public Thread newThread(final Runnable runnable) {
				        Runnable wrapperRunnable = new Runnable() {
						            @Override
						            public void run() {
								                try {
										                    android.os.Process.setThreadPriority(mThreadPriority);
										                } catch (Throwable ignored) {
										
										                }
								                runnable.run();
								            }
						        };
				        return new Thread(wrapperRunnable);
				    }
	}
	public static class MainThreadExecutor implements java.util.concurrent.Executor {
		    private final Handler handler = new Handler(Looper.getMainLooper());
		    @Override
		    public void execute(Runnable runnable) {
				        handler.post(runnable);
				    }
	}
	
	public static class DefaultExecutorSupplier implements ExecutorSupplier {
		    private static final int DEFAULT_MAX_NUM_THREADS = 2 * Runtime.getRuntime().availableProcessors() + 1;
		    private final DownloadExecutor networkExecutor;
		    private final java.util.concurrent.Executor backgroundExecutor;
		    private final java.util.concurrent.Executor mainThreadExecutor;
		    DefaultExecutorSupplier() {
				        java.util.concurrent.ThreadFactory backgroundPriorityThreadFactory = new PriorityThreadFactory(android.os.Process.THREAD_PRIORITY_BACKGROUND);
				        networkExecutor = new DownloadExecutor(DEFAULT_MAX_NUM_THREADS, backgroundPriorityThreadFactory);
				        backgroundExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
				        mainThreadExecutor = new MainThreadExecutor();
				    }
		    @Override
		    public DownloadExecutor forDownloadTasks() {
				        return networkExecutor;
				    }
		    @Override
		    public java.util.concurrent.Executor forBackgroundTasks() {
				        return backgroundExecutor;
				    }
		    @Override
		    public java.util.concurrent.Executor forMainThreadTasks() {
				        return mainThreadExecutor;
				    }
	}
	
	public static interface ExecutorSupplier {
		    DownloadExecutor forDownloadTasks();
		    java.util.concurrent.Executor forBackgroundTasks();
		    java.util.concurrent.Executor forMainThreadTasks();
	}
	
	
	public static class FileDownloadRandomAccessFile implements FileDownloadOutputStream {
		    private final java.io.BufferedOutputStream out;
		    private final java.io.FileDescriptor fd;
		    private final java.io.RandomAccessFile randomAccess;
		    private FileDownloadRandomAccessFile(java.io.File file) throws java.io.IOException {
				        randomAccess = new java.io.RandomAccessFile(file, "rw");
				        fd = randomAccess.getFD();
				        out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(randomAccess.getFD()));
				    }
		    @Override
		    public void write(byte[] b, int off, int len) throws java.io.IOException {
				        out.write(b, off, len);
				    }
		    @Override
		    public void flushAndSync() throws java.io.IOException {
				        out.flush();
				        fd.sync();
				    }
		    @Override
		    public void close() throws java.io.IOException {
				        out.close();
				        randomAccess.close();
				    }
		    @Override
		    public void seek(long offset) throws java.io.IOException {
				        randomAccess.seek(offset);
				    }
		    @Override
		    public void setLength(long totalBytes) throws java.io.IOException {
				        randomAccess.setLength(totalBytes);
				    }
		    public static FileDownloadOutputStream create(java.io.File file) throws java.io.IOException {
				        return new FileDownloadRandomAccessFile(file);
				    }
	}
	
	public static interface FileDownloadOutputStream {
		    void write(byte b[], int off, int len) throws java.io.IOException;
		    void flushAndSync() throws java.io.IOException;
		    void close() throws java.io.IOException;
		    void seek(long offset) throws java.io.IOException, IllegalAccessException;
		    void setLength(final long newLength) throws java.io.IOException, IllegalAccessException;
	}
	public static class DownloadRunnable implements Runnable {
		    public final Priority priority;
		    public final int sequence;
		    public final DownloadRequest request;
		    DownloadRunnable(DownloadRequest request) {
				        this.request = request;
				        this.priority = request.getPriority();
				        this.sequence = request.getSequenceNumber();
				    }
		    @Override
		    public void run() {
				        request.setStatus(Status.RUNNING);
				        DownloadTask downloadTask = DownloadTask.create(request);
				        Response response = downloadTask.run();
				        if (response.isSuccessful()) {
						            request.deliverSuccess();
						        } else if (response.isPaused()) {
						            request.deliverPauseEvent();
						        } else if (response.getError() != null) {
						            request.deliverError(response.getError());
						        } else if (!response.isCancelled()) {
						            request.deliverError(new Error());
						        }
				    }
	}
	
	
	public static class SynchronousCall {
		    public final DownloadRequest request;
		    public SynchronousCall(DownloadRequest request) {
				        this.request = request;
				    }
		    public Response execute() {
				        DownloadTask downloadTask = DownloadTask.create(request);
				        return downloadTask.run();
				    }
	}
	
	public static class ComponentHolder {
		    private final static ComponentHolder INSTANCE = new ComponentHolder();
		    private int readTimeout;
		    private int connectTimeout;
		    private String userAgent;
		    private HttpClient httpClient;
		    private DbHelper dbHelper;
		    public static ComponentHolder getInstance() {
				        return INSTANCE;
				    }
		    public void init(Context context, PRDownloaderConfig config) {
				        this.readTimeout = config.getReadTimeout();
				        this.connectTimeout = config.getConnectTimeout();
				        this.userAgent = config.getUserAgent();
				        this.httpClient = config.getHttpClient();
				        this.dbHelper = config.isDatabaseEnabled() ? new AppDbHelper(context) : new NoOpsDbHelper();
				        if (config.isDatabaseEnabled()) {
						            PRDownloader.cleanUp(30);
						        }
				    }
		    public int getReadTimeout() {
				        if (readTimeout == 0) {
						            synchronized (ComponentHolder.class) {
								                if (readTimeout == 0) {
										                    readTimeout = Constants.DEFAULT_READ_TIMEOUT_IN_MILLS;
										                }
								            }
						        }
				        return readTimeout;
				    }
		    public int getConnectTimeout() {
				        if (connectTimeout == 0) {
						            synchronized (ComponentHolder.class) {
								                if (connectTimeout == 0) {
										                    connectTimeout = Constants.DEFAULT_CONNECT_TIMEOUT_IN_MILLS;
										                }
								            }
						        }
				        return connectTimeout;
				    }
		    public String getUserAgent() {
				        if (userAgent == null) {
						            synchronized (ComponentHolder.class) {
								                if (userAgent == null) {
										                    userAgent = Constants.DEFAULT_USER_AGENT;
										                }
								            }
						        }
				        return userAgent;
				    }
		    public DbHelper getDbHelper() {
				        if (dbHelper == null) {
						            synchronized (ComponentHolder.class) {
								                if (dbHelper == null) {
										                    dbHelper = new NoOpsDbHelper();
										                }
								            }
						        }
				        return dbHelper;
				    }
		    public HttpClient getHttpClient() {
				        if (httpClient == null) {
						            synchronized (ComponentHolder.class) {
								                if (httpClient == null) {
										                    httpClient = new DefaultHttpClient();
										                }
								            }
						        }
				        return httpClient.clone();
				    }
	}
	
	
	public static class DownloadTask {
		    private static final int BUFFER_SIZE = 1024 * 4;
		    private static final long TIME_GAP_FOR_SYNC = 2000;
		    private static final long MIN_BYTES_FOR_SYNC = 65536;
		    private final DownloadRequest request;
		    private ProgressHandler progressHandler;
		    private long lastSyncTime;
		    private long lastSyncBytes;
		    private java.io.InputStream inputStream;
		    private FileDownloadOutputStream outputStream;
		    private HttpClient httpClient;
		    private long totalBytes;
		    private int responseCode;
		    private String eTag;
		    private boolean isResumeSupported;
		    private String tempPath;
		    private DownloadTask(DownloadRequest request) {
				        this.request = request;
				    }
		    static DownloadTask create(DownloadRequest request) {
				        return new DownloadTask(request);
				    }
		    Response run() {
				        Response response = new Response();
				        if (request.getStatus() == Status.CANCELLED) {
						            response.setCancelled(true);
						            return response;
						        } else if (request.getStatus() == Status.PAUSED) {
						            response.setPaused(true);
						            return response;
						        }
				        try {
						            if (request.getOnProgressListener() != null) {
								                progressHandler = new ProgressHandler(request.getOnProgressListener());
								            }
						            tempPath = Utils.getTempPath(request.getDirPath(), request.getFileName());
						            java.io.File file = new java.io.File(tempPath);
						            DownloadModel model = getDownloadModelIfAlreadyPresentInDatabase();
						            if (model != null) {
								                if (file.exists()) {
										                    request.setTotalBytes(model.getTotalBytes());
										                    request.setDownloadedBytes(model.getDownloadedBytes());
										                } else {
										                    removeNoMoreNeededModelFromDatabase();
										                    request.setDownloadedBytes(0);
										                    request.setTotalBytes(0);
										                    model = null;
										                }
								            }
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            httpClient = Utils.getRedirectedConnectionIfAny(httpClient, request);
						            responseCode = httpClient.getResponseCode();
						            eTag = httpClient.getResponseHeader(Constants.ETAG);
						            if (checkIfFreshStartRequiredAndStart(model)) {
								                model = null;
								            }
						            if (!isSuccessful()) {
								                Error error = new Error();
								                error.setServerError(true);
								                response.setError(error);
								                return response;
								            }
						            setResumeSupportedOrNot();
						            totalBytes = request.getTotalBytes();
						            if (!isResumeSupported) {
								                deleteTempFile();
								            }
						            if (totalBytes == 0) {
								                totalBytes = httpClient.getContentLength();
								                request.setTotalBytes(totalBytes);
								            }
						            if (isResumeSupported && model == null) {
								                createAndInsertNewModel();
								            }
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            request.deliverStartEvent();
						            inputStream = httpClient.getInputStream();
						            byte[] buff = new byte[BUFFER_SIZE];
						            if (!file.exists()) {
								                if (file.getParentFile() != null && !file.getParentFile().exists()) {
										                    if (file.getParentFile().mkdirs()) {
												                        file.createNewFile();
												                    }
										                } else {
										                    file.createNewFile();
										                }
								            }
						            this.outputStream = FileDownloadRandomAccessFile.create(file);
						            if (isResumeSupported && request.getDownloadedBytes() != 0) {
								                outputStream.seek(request.getDownloadedBytes());
								            }
						            if (request.getStatus() == Status.CANCELLED) {
								                response.setCancelled(true);
								                return response;
								            } else if (request.getStatus() == Status.PAUSED) {
								                response.setPaused(true);
								                return response;
								            }
						            do {
								                final int byteCount = inputStream.read(buff, 0, BUFFER_SIZE);
								                if (byteCount == -1) {
										                    break;
										                }
								                outputStream.write(buff, 0, byteCount);
								                request.setDownloadedBytes(request.getDownloadedBytes() + byteCount);
								                sendProgress();
								                syncIfRequired(outputStream);
								                if (request.getStatus() == Status.CANCELLED) {
										                    response.setCancelled(true);
										                    return response;
										                } else if (request.getStatus() == Status.PAUSED) {
										                    sync(outputStream);
										                    response.setPaused(true);
										                    return response;
										                }
								            } while (true);
						            final String path = Utils.getPath(request.getDirPath(), request.getFileName());
						            Utils.renameFileName(tempPath, path);
						            response.setSuccessful(true);
						            if (isResumeSupported) {
								                removeNoMoreNeededModelFromDatabase();
								            }
						        } catch (java.io.IOException | IllegalAccessException e) {
						            if (!isResumeSupported) {
								                deleteTempFile();
								            }
						            Error error = new Error();
						            error.setConnectionError(true);
						            response.setError(error);
						        } finally {
						            closeAllSafely(outputStream);
						        }
				        return response;
				    }
		    private void deleteTempFile() {
				        java.io.File file = new java.io.File(tempPath);
				        if (file.exists()) {
						            file.delete();
						        }
				    }
		    private boolean isSuccessful() {
				        return responseCode >= java.net.HttpURLConnection.HTTP_OK
				                && responseCode < java.net.HttpURLConnection.HTTP_MULT_CHOICE;
				    }
		    private void setResumeSupportedOrNot() {
				        isResumeSupported = (responseCode == java.net.HttpURLConnection.HTTP_PARTIAL);
				    }
		    private boolean checkIfFreshStartRequiredAndStart(DownloadModel model) throws java.io.IOException,
		            IllegalAccessException {
				        if (responseCode == Constants.HTTP_RANGE_NOT_SATISFIABLE || isETagChanged(model)) {
						            if (model != null) {
								                removeNoMoreNeededModelFromDatabase();
								            }
						            deleteTempFile();
						            request.setDownloadedBytes(0);
						            request.setTotalBytes(0);
						            httpClient = ComponentHolder.getInstance().getHttpClient();
						            httpClient.connect(request);
						            httpClient = Utils.getRedirectedConnectionIfAny(httpClient, request);
						            responseCode = httpClient.getResponseCode();
						            return true;
						        }
				        return false;
				    }
		    private boolean isETagChanged(DownloadModel model) {
				        return !(eTag == null || model == null || model.getETag() == null)
				                && !model.getETag().equals(eTag);
				    }
		    private DownloadModel getDownloadModelIfAlreadyPresentInDatabase() {
				        return ComponentHolder.getInstance().getDbHelper().find(request.getDownloadId());
				    }
		    private void createAndInsertNewModel() {
				        DownloadModel model = new DownloadModel();
				        model.setId(request.getDownloadId());
				        model.setUrl(request.getUrl());
				        model.setETag(eTag);
				        model.setDirPath(request.getDirPath());
				        model.setFileName(request.getFileName());
				        model.setDownloadedBytes(request.getDownloadedBytes());
				        model.setTotalBytes(totalBytes);
				        model.setLastModifiedAt(System.currentTimeMillis());
				        ComponentHolder.getInstance().getDbHelper().insert(model);
				    }
		    private void removeNoMoreNeededModelFromDatabase() {
				        ComponentHolder.getInstance().getDbHelper().remove(request.getDownloadId());
				    }
		    private void sendProgress() {
				        if (request.getStatus() != Status.CANCELLED) {
						            if (progressHandler != null) {
								                progressHandler
								                        .obtainMessage(Constants.UPDATE,
								                                new Progress(request.getDownloadedBytes(),
								                                        totalBytes)).sendToTarget();
								            }
						        }
				    }
		    private void syncIfRequired(FileDownloadOutputStream outputStream) {
				        final long currentBytes = request.getDownloadedBytes();
				        final long currentTime = System.currentTimeMillis();
				        final long bytesDelta = currentBytes - lastSyncBytes;
				        final long timeDelta = currentTime - lastSyncTime;
				        if (bytesDelta > MIN_BYTES_FOR_SYNC && timeDelta > TIME_GAP_FOR_SYNC) {
						            sync(outputStream);
						            lastSyncBytes = currentBytes;
						            lastSyncTime = currentTime;
						        }
				    }
		    private void sync(FileDownloadOutputStream outputStream) {
				        boolean success;
				        try {
						            outputStream.flushAndSync();
						            success = true;
						        } catch (java.io.IOException e) {
						            success = false;
						            e.printStackTrace();
						        }
				        if (success && isResumeSupported) {
						            ComponentHolder.getInstance().getDbHelper()
						                    .updateProgress(request.getDownloadId(),
						                            request.getDownloadedBytes(),
						                            System.currentTimeMillis());
						        }
				    }
		    private void closeAllSafely(FileDownloadOutputStream outputStream) {
				        if (httpClient != null) {
						            try {
								                httpClient.close();
								            } catch (Exception e) {
								                e.printStackTrace();
								            }
						        }
				        if (inputStream != null) {
						            try {
								                inputStream.close();
								            } catch (java.io.IOException e) {
								                e.printStackTrace();
								            }
						        }
				        try {
						            if (outputStream != null) {
								                try {
										                    sync(outputStream);
										                } catch (Exception e) {
										                    e.printStackTrace();
										                }
								            }
						
						        } finally {
						            if (outputStream != null)
						                try {
								                    outputStream.close();
								                } catch (java.io.IOException e) {
								                    e.printStackTrace();
								                }
						        }
				    }
	}
	
	
	public static class DownloadRequestQueue {
		    private static DownloadRequestQueue instance;
		    private final Map<Integer, DownloadRequest> currentRequestMap;
		    private final java.util.concurrent.atomic.AtomicInteger sequenceGenerator;
		    private DownloadRequestQueue() {
				        currentRequestMap = new java.util.concurrent.ConcurrentHashMap<>();
				        sequenceGenerator = new java.util.concurrent.atomic.AtomicInteger();
				    }
		    public static void initialize() {
				        getInstance();
				    }
		    public static DownloadRequestQueue getInstance() {
				        if (instance == null) {
						            synchronized (DownloadRequestQueue.class) {
								                if (instance == null) {
										                    instance = new DownloadRequestQueue();
										                }
								            }
						        }
				        return instance;
				    }
		    private int getSequenceNumber() {
				        return sequenceGenerator.incrementAndGet();
				    }
		    public void pause(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            request.setStatus(Status.PAUSED);
						        }
				    }
		    public void resume(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            request.setStatus(Status.QUEUED);
						            request.setFuture(Core.getInstance()
						                    .getExecutorSupplier()
						                    .forDownloadTasks()
						                    .submit(new DownloadRunnable(request)));
						        }
				    }
		    private void cancelAndRemoveFromMap(DownloadRequest request) {
				        if (request != null) {
						            request.cancel();
						            currentRequestMap.remove(request.getDownloadId());
						        }
				    }
		    public void cancel(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        cancelAndRemoveFromMap(request);
				    }
		    public void cancel(Object tag) {
				        for (Map.Entry<Integer, DownloadRequest> currentRequestMapEntry : currentRequestMap.entrySet()) {
						            DownloadRequest request = currentRequestMapEntry.getValue();
						            if (request.getTag() instanceof String && tag instanceof String) {
								                final String tempRequestTag = (String) request.getTag();
								                final String tempTag = (String) tag;
								                if (tempRequestTag.equals(tempTag)) {
										                    cancelAndRemoveFromMap(request);
										                }
								            } else if (request.getTag().equals(tag)) {
								                cancelAndRemoveFromMap(request);
								            }
						        }
				    }
		    public void cancelAll() {
				        for (Map.Entry<Integer, DownloadRequest> currentRequestMapEntry : currentRequestMap.entrySet()) {
						            DownloadRequest request = currentRequestMapEntry.getValue();
						            cancelAndRemoveFromMap(request);
						        }
				    }
		    public Status getStatus(int downloadId) {
				        DownloadRequest request = currentRequestMap.get(downloadId);
				        if (request != null) {
						            return request.getStatus();
						        }
				        return Status.UNKNOWN;
				    }
		    public void addRequest(DownloadRequest request) {
				        currentRequestMap.put(request.getDownloadId(), request);
				        request.setStatus(Status.QUEUED);
				        request.setSequenceNumber(getSequenceNumber());
				        request.setFuture(Core.getInstance()
				                .getExecutorSupplier()
				                .forDownloadTasks()
				                .submit(new DownloadRunnable(request)));
				    }
		    public void finish(DownloadRequest request) {
				        currentRequestMap.remove(request.getDownloadId());
				    }
	}
	
	
	public static class DownloadModel {
		    static final String ID = "id";
		    static final String URL = "url";
		    static final String ETAG = "etag";
		    static final String DIR_PATH = "dir_path";
		    static final String FILE_NAME = "file_name";
		    static final String TOTAL_BYTES = "total_bytes";
		    static final String DOWNLOADED_BYTES = "downloaded_bytes";
		    static final String LAST_MODIFIED_AT = "last_modified_at";
		    private int id;
		    private String url;
		    private String eTag;
		    private String dirPath;
		    private String fileName;
		    private long totalBytes;
		    private long downloadedBytes;
		    private long lastModifiedAt;
		    public int getId() {
				        return id;
				    }
		    public void setId(int id) {
				        this.id = id;
				    }
		    public String getUrl() {
				        return url;
				    }
		    public void setUrl(String url) {
				        this.url = url;
				    }
		    public String getETag() {
				        return eTag;
				    }
		    public void setETag(String eTag) {
				        this.eTag = eTag;
				    }
		    public String getDirPath() {
				        return dirPath;
				    }
		    public void setDirPath(String dirPath) {
				        this.dirPath = dirPath;
				    }
		    public String getFileName() {
				        return fileName;
				    }
		    public void setFileName(String fileName) {
				        this.fileName = fileName;
				    }
		    public long getTotalBytes() {
				        return totalBytes;
				    }
		    public void setTotalBytes(long totalBytes) {
				        this.totalBytes = totalBytes;
				    }
		    public long getDownloadedBytes() {
				        return downloadedBytes;
				    }
		    public void setDownloadedBytes(long downloadedBytes) {
				        this.downloadedBytes = downloadedBytes;
				    }
		    public long getLastModifiedAt() {
				        return lastModifiedAt;
				    }
		    public void setLastModifiedAt(long lastModifiedAt) {
				        this.lastModifiedAt = lastModifiedAt;
				    }
	}
	
	
	
	public static class AppDbHelper implements DbHelper {
		
		    public static final String TABLE_NAME = "prdownloader";
		    private final android.database.sqlite.SQLiteDatabase db;
		    public AppDbHelper(Context context) {
				        DatabaseOpenHelper databaseOpenHelper = new DatabaseOpenHelper(context);
				        db = databaseOpenHelper.getWritableDatabase();
				    }
		    @Override
		    public DownloadModel find(int id) {
				        android.database.Cursor cursor = null;
				        DownloadModel model = null;
				        try {
						            cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.ID + " = " + id, null);
						            if (cursor != null && cursor.moveToFirst()) {
								                model = new DownloadModel();
								                model.setId(id);
								                model.setUrl(cursor.getString(cursor.getColumnIndex(DownloadModel.URL)));
								                model.setETag(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
								                model.setDirPath(cursor.getString(cursor.getColumnIndex(DownloadModel.DIR_PATH)));
								                model.setFileName(cursor.getString(cursor.getColumnIndex(DownloadModel.FILE_NAME)));
								                model.setTotalBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.TOTAL_BYTES)));
								                model.setDownloadedBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.DOWNLOADED_BYTES)));
								                model.setLastModifiedAt(cursor.getLong(cursor.getColumnIndex(DownloadModel.LAST_MODIFIED_AT)));
								            }
						        } catch (Exception e) {
						            e.printStackTrace();
						        } finally {
						            if (cursor != null) {
								                cursor.close();
								            }
						        }
				        return model;
				    }
		    @Override
		    public void insert(DownloadModel model) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.ID, model.getId());
						            values.put(DownloadModel.URL, model.getUrl());
						            values.put(DownloadModel.ETAG, model.getETag());
						            values.put(DownloadModel.DIR_PATH, model.getDirPath());
						            values.put(DownloadModel.FILE_NAME, model.getFileName());
						            values.put(DownloadModel.TOTAL_BYTES, model.getTotalBytes());
						            values.put(DownloadModel.DOWNLOADED_BYTES, model.getDownloadedBytes());
						            values.put(DownloadModel.LAST_MODIFIED_AT, model.getLastModifiedAt());
						            db.insert(TABLE_NAME, null, values);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void update(DownloadModel model) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.URL, model.getUrl());
						            values.put(DownloadModel.ETAG, model.getETag());
						            values.put(DownloadModel.DIR_PATH, model.getDirPath());
						            values.put(DownloadModel.FILE_NAME, model.getFileName());
						            values.put(DownloadModel.TOTAL_BYTES, model.getTotalBytes());
						            values.put(DownloadModel.DOWNLOADED_BYTES, model.getDownloadedBytes());
						            values.put(DownloadModel.LAST_MODIFIED_AT, model.getLastModifiedAt());
						            db.update(TABLE_NAME, values, DownloadModel.ID + " = ? ",
						                    new String[]{String.valueOf(model.getId())});
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void updateProgress(int id, long downloadedBytes, long lastModifiedAt) {
				        try {
						            ContentValues values = new ContentValues();
						            values.put(DownloadModel.DOWNLOADED_BYTES, downloadedBytes);
						            values.put(DownloadModel.LAST_MODIFIED_AT, lastModifiedAt);
						            db.update(TABLE_NAME, values, DownloadModel.ID + " = ? ",
						                    new String[]{String.valueOf(id)});
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public void remove(int id) {
				        try {
						            db.execSQL("DELETE FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.ID + " = " + id);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
		    @Override
		    public List<DownloadModel> getUnwantedModels(int days) {
				        List<DownloadModel> models = new ArrayList<>();
				        android.database.Cursor cursor = null;
				        try {
						            final long daysInMillis = days * 24 * 60 * 60 * 1000L;
						            final long beforeTimeInMillis = System.currentTimeMillis() - daysInMillis;
						            cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " +
						                    DownloadModel.LAST_MODIFIED_AT + " <= " + beforeTimeInMillis, null);
						            if (cursor != null && cursor.moveToFirst()) {
								                do {
										                    DownloadModel model = new DownloadModel();
										                    model.setId(cursor.getInt(cursor.getColumnIndex(DownloadModel.ID)));
										                    model.setUrl(cursor.getString(cursor.getColumnIndex(DownloadModel.URL)));
										                    model.setETag(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
										                    model.setDirPath(cursor.getString(cursor.getColumnIndex(DownloadModel.DIR_PATH)));
										                    model.setFileName(cursor.getString(cursor.getColumnIndex(DownloadModel.FILE_NAME)));
										                    model.setTotalBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.TOTAL_BYTES)));
										                    model.setDownloadedBytes(cursor.getLong(cursor.getColumnIndex(DownloadModel.DOWNLOADED_BYTES)));
										                    model.setLastModifiedAt(cursor.getLong(cursor.getColumnIndex(DownloadModel.LAST_MODIFIED_AT)));
										                    models.add(model);
										                } while (cursor.moveToNext());
								            }
						        } catch (Exception e) {
						            e.printStackTrace();
						        } finally {
						            if (cursor != null) {
								                cursor.close();
								            }
						        }
				        return models;
				    }
		    @Override
		    public void clear() {
				        try {
						            db.delete(TABLE_NAME, null, null);
						        } catch (Exception e) {
						            e.printStackTrace();
						        }
				    }
	}
	
	public static class DatabaseOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
		    private static final String DATABASE_NAME = "prdownloader.db";
		    private static final int DATABASE_VERSION = 1;
		    DatabaseOpenHelper(Context context) {
				        super(context, DATABASE_NAME, null, DATABASE_VERSION);
				    }
		    @Override
		    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
				        db.execSQL("CREATE TABLE IF NOT EXISTS " +
				                AppDbHelper.TABLE_NAME + "( " +
				                DownloadModel.ID + " INTEGER PRIMARY KEY, " +
				                DownloadModel.URL + " VARCHAR, " +
				                DownloadModel.ETAG + " VARCHAR, " +
				                DownloadModel.DIR_PATH + " VARCHAR, " +
				                DownloadModel.FILE_NAME + " VARCHAR, " +
				                DownloadModel.TOTAL_BYTES + " INTEGER, " +
				                DownloadModel.DOWNLOADED_BYTES + " INTEGER, " +
				                DownloadModel.LAST_MODIFIED_AT + " INTEGER " +
				                ")");
				    }
		    @Override
		    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int i, int i1) {
				    }
	}
	
	public static interface DbHelper {
		    DownloadModel find(int id);
		    void insert(DownloadModel model);
		    void update(DownloadModel model);
		    void updateProgress(int id, long downloadedBytes, long lastModifiedAt);
		    void remove(int id);
		    List<DownloadModel> getUnwantedModels(int days);
		    void clear();
	}
	
	
	public static class NoOpsDbHelper implements DbHelper {
		    public NoOpsDbHelper() {
				    }
		    @Override
		    public DownloadModel find(int id) {
				        return null;
				    }
		    @Override
		    public void insert(DownloadModel model) {
				    }
		    @Override
		    public void update(DownloadModel model) {
				    }
		    @Override
		    public void updateProgress(int id, long downloadedBytes, long lastModifiedAt) {
				    }
		    @Override
		    public void remove(int id) {
				    }
		    @Override
		    public List<DownloadModel> getUnwantedModels(int days) {
				        return null;
				    }
		    @Override
		    public void clear() {
				    }
	}
	
	public static class DownloadFutureTask extends java.util.concurrent.FutureTask<DownloadRunnable> implements Comparable<DownloadFutureTask> {
		    private final DownloadRunnable runnable;
		    DownloadFutureTask(DownloadRunnable downloadRunnable) {
				        super(downloadRunnable, null);
				        this.runnable = downloadRunnable;
				    }
		    @Override
		    public int compareTo(DownloadFutureTask other) {
				        Priority p1 = runnable.priority;
				        Priority p2 = other.runnable.priority;
				        return (p1 == p2 ? runnable.sequence - other.runnable.sequence : p2.ordinal() - p1.ordinal());
				    }
	}
	
	public static class DownloadExecutor extends java.util.concurrent.ThreadPoolExecutor {
		    DownloadExecutor(int maxNumThreads, java.util.concurrent.ThreadFactory threadFactory) {
				        super(maxNumThreads, maxNumThreads, 0, java.util.concurrent.TimeUnit.MILLISECONDS,
				                new java.util.concurrent.PriorityBlockingQueue<Runnable>(), threadFactory);
				    }
		    @Override
		    public java.util.concurrent.Future<?> submit(Runnable task) {
				        DownloadFutureTask futureTask = new DownloadFutureTask((DownloadRunnable) task);
				        execute(futureTask);
				        return futureTask;
				    }
	}
	{
	}
	
	
	public void _lib2() {
	}
	private int downloadId;
	public int rvxyt;
	private static String dirPath;
	public static final class Utilss {
			    private Utilss() {
					    }
			    public static String getRootDirPath(Context context) {
					        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
							           // java.io.File file = context.getExternalFilesDirs(context.getApplicationContext(), null)[0];
							           // return file.getAbsolutePath();
							            return context.getApplicationContext().getFilesDir().getAbsolutePath();
							        } else {
							            return context.getApplicationContext().getFilesDir().getAbsolutePath();
							        }
					    }
			    public static String getProgressDisplayLine(long currentBytes, long totalBytes) {
					        return getBytesToMBString(currentBytes) + "/" + getBytesToMBString(totalBytes);
					    }
			    private static String getBytesToMBString(long bytes){
					        return String.format(Locale.ENGLISH, "", bytes / (1024.00 * 1024.00));
					    }
	}
	{
	}
	
	
	public void _AppInfo() {
		ApkUtils apk = new ApkUtils(ManageActivity.this);
		ApkUtils qapk = new ApkUtils(ManageActivity.this);
		ApkUtils rapk = new ApkUtils(ManageActivity.this);
		try{
			apk.setPackageName(RVXYtPkg);
		}catch(Exception e){
			 
		}
		YTVersionName = apk.getVersionName();
		YTSHA256 =  apk.getSHA256();
		if (YTVersionName.equals("null")) {
			textview15.setText("Application not installed !");
		}
		else {
			if (YTSHA256.toLowerCase().equals("301a91e1fb5ec0d3462d6f6134b9f2d9b6dfed4d998c24ee04529c3dd7553c67")) {
				textview15.setText(YTVersionName);
			}
			else {
				textview15.setText("Signature Mismatch, Please uninstall\n ReVanced Extended APK.");
			}
		}
		try{
			qapk.setPackageName(RVXYmPkg);
		}catch(Exception e){
			 
		}
		YMVersionName = qapk.getVersionName();
		YMSHA256 =  qapk.getSHA256();
		if (YMVersionName.equals("null")) {
			textview21.setText("Application not installed !");
		}
		else {
			if (YMSHA256.toLowerCase().equals("301a91e1fb5ec0d3462d6f6134b9f2d9b6dfed4d998c24ee04529c3dd7553c67")) {
				textview21.setText(YMVersionName);
			}
			else {
				textview21.setText("Signature Mismatch, Please uninstall\n ReVanced Extended Music APK.");
			}
		}
		try{
			rapk.setPackageName(RVXMgPkg);
		}catch(Exception e){
			 
		}
		MGVersionName = rapk.getVersionName();
		if (MGVersionName.equals("null")) {
			textview27.setText("Application not installed !");
		}
		else {
			textview27.setText(MGVersionName);
		}
	}
	
	
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RoundAndBorder(final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	public void _FetchRequest() {
		Connection.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "a", _Connection_request_listener);
	}
	
	
	public void _telegramLoaderDialog(final boolean _visibility) {
		if (_visibility) {
			if (coreprog == null){
				coreprog = new ProgressDialog(this);
				coreprog.setCancelable(false);
				coreprog.setCanceledOnTouchOutside(false);
				
				coreprog.requestWindowFeature(Window.FEATURE_NO_TITLE);  coreprog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
				
			}
			coreprog.show();
			coreprog.setContentView(R.layout.loading);
			
			
			LinearLayout linear2 = (LinearLayout)coreprog.findViewById(R.id.linear2);
			
			LinearLayout back = (LinearLayout)coreprog.findViewById(R.id.background);
			
			LinearLayout layout_progress = (LinearLayout)coreprog.findViewById(R.id.layout_progress);
			
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); 
			gd.setColor(Color.parseColor("#BDBDBD")); /* color */
			gd.setCornerRadius(40); /* radius */
			gd.setStroke(0, Color.WHITE); /* stroke heigth and color */
			linear2.setBackground(gd);
			
			RadialProgressView progress = new RadialProgressView(this);
			layout_progress.addView(progress);
		}
		else {
			if (coreprog != null){
				coreprog.dismiss();
			}
		}
	}
	private ProgressDialog coreprog;
	{
	}
	
	
	public void _ColorFilterLight() {
		_ColorFilter(imageview7, "#000000");
		_ColorFilter(imageview8, "#304FFE");
		_ColorFilter(imageview9, "#304FFE");
		_ColorFilter(imageview10, "#304FFE");
		_ColorFilter(imageview11, "#304FFE");
		_ColorFilter(imageview12, "#304FFE");
		_ColorFilter(imageview13, "#304FFE");
		_ColorFilter(imageview14, "#304FFE");
		_ColorFilter(imageview15, "#304FFE");
		_ColorFilter(imageview16, "#304FFE");
		_ColorFilter(imageview17, "#304FFE");
		_ColorFilter(imageview18, "#304FFE");
		_ColorFilter(imageview19, "#304FFE");
	}
	
	
	public void _IconColorUpDown() {
		if (Settings.getString("themes", "").equals("light")) {
			if (YT_Visb == 0) {
				imageview3.setImageResource(R.drawable.ic_angle_small_up_black);
			}
			else {
				imageview3.setImageResource(R.drawable.ic_angle_small_down_black);
			}
			if (YM_Visb == 0) {
				imageview4.setImageResource(R.drawable.ic_angle_small_down_black);
			}
			else {
				imageview4.setImageResource(R.drawable.ic_angle_small_up_black);
			}
			if (MG_Visb == 0) {
				imageview6.setImageResource(R.drawable.ic_angle_small_down_black);
			}
			else {
				imageview6.setImageResource(R.drawable.ic_angle_small_up_black);
			}
		}
		else {
			if (YT_Visb == 0) {
				imageview3.setImageResource(R.drawable.ic_angle_small_down);
			}
			else {
				imageview3.setImageResource(R.drawable.ic_angle_small_up);
			}
			if (YM_Visb == 0) {
				imageview4.setImageResource(R.drawable.ic_angle_small_down);
			}
			else {
				imageview4.setImageResource(R.drawable.ic_angle_small_up);
			}
			if (MG_Visb == 0) {
				imageview6.setImageResource(R.drawable.ic_angle_small_down);
			}
			else {
				imageview6.setImageResource(R.drawable.ic_angle_small_up);
			}
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}