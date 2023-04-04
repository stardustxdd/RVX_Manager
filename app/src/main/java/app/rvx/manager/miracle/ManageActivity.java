package app.rvx.manager.miracle;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
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
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class ManageActivity extends Activity {
	
	private double YT_Visb = 0;
	private double YM_Visb = 0;
	private double MG_Visb = 0;
	
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
	private Switch switch1;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview1;
	private LinearLayout linear46;
	private ImageView imageview7;
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
	
	private SharedPreferences Settings;
	
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
		switch1 = findViewById(R.id.switch1);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview1 = findViewById(R.id.textview1);
		linear46 = findViewById(R.id.linear46);
		imageview7 = findViewById(R.id.imageview7);
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
		Settings = getSharedPreferences("getSettings", Activity.MODE_PRIVATE);
		
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
					imageview3.setImageResource(R.drawable.ic_arrow_drop_up_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview3, "#ffffff");
					}
				}
				else {
					YT_Visb = 0;
					linear11.setVisibility(View.GONE);
					linear13.setVisibility(View.GONE);
					imageview3.setImageResource(R.drawable.ic_arrow_drop_down_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview3, "#ffffff");
					}
				}
			}
		});
		
		linear31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (YM_Visb == 0) {
					YM_Visb = 1;
					linear22.setVisibility(View.VISIBLE);
					linear53.setVisibility(View.VISIBLE);
					imageview4.setImageResource(R.drawable.ic_arrow_drop_up_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview4, "#ffffff");
					}
				}
				else {
					YM_Visb = 0;
					linear22.setVisibility(View.GONE);
					linear53.setVisibility(View.GONE);
					imageview4.setImageResource(R.drawable.ic_arrow_drop_down_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview4, "#ffffff");
					}
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
					imageview6.setImageResource(R.drawable.ic_arrow_drop_up_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview6, "#ffffff");
					}
				}
				else {
					MG_Visb = 0;
					linear35.setVisibility(View.GONE);
					linear61.setVisibility(View.GONE);
					imageview6.setImageResource(R.drawable.ic_arrow_drop_down_black);
					if (Settings.getString("themes", "").equals("black")) {
						_ColorFilter(imageview6, "#ffffff");
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		Settings.edit().putString("themes", "light").commit();
		_LightTheme();
		_DefaultVisibleity();
		YT_Visb = 1;
		YM_Visb = 0;
		MG_Visb = 0;
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
		_rippleRoundStroke(b1, "#F5F5F5", "#E0E0E0", 15, 0, "#000000");
		_rippleRoundStroke(b2, "#304ffe", "#40FFFFFF", 15, 0, "#000000");
		b1.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
				dialog1.dismiss();
				SketchwareUtil.showMessage(getApplicationContext(), "button1 Press");
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
		_status_bar_color("#ffffff", "#e0e0e0");
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =ManageActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFE0E0E0);
		}
		Settings.edit().putString("themes", "light").commit();
		_ColorFilter(imageview8, "#304ffe");
		_ColorFilter(imageview9, "#304ffe");
		_ColorFilter(imageview10, "#304ffe");
		_ColorFilter(imageview11, "#304ffe");
		_ColorFilter(imageview12, "#304ffe");
		_ColorFilter(imageview13, "#304ffe");
		_ColorFilter(imageview14, "#304ffe");
		_ColorFilter(imageview15, "#304ffe");
		_ColorFilter(imageview16, "#304ffe");
		_ColorFilter(imageview17, "#304ffe");
		_ColorFilter(imageview18, "#304ffe");
		_ColorFilter(imageview19, "#304ffe");
		imageview3.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		imageview4.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		imageview6.setColorFilter(0xFF000000, PorterDuff.Mode.MULTIPLY);
		textview2.setTextColor(0xFF000000);
		textview6.setTextColor(0xFF424242);
		textview8.setTextColor(0xFF424242);
		textview10.setTextColor(0xFF424242);
		textview5.setTextColor(0xFF000000);
		textview7.setTextColor(0xFF000000);
		textview9.setTextColor(0xFF000000);
		vscroll1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)00, 0xFFE0E0E0));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF304FFE));
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear20.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear43.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
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
		_ColorFilter(imageview3, "#000000");
		_ColorFilter(imageview4, "#000000");
		_ColorFilter(imageview6, "#000000");
		_ColorFilter(imageview7, "#000000");
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
		imageview3.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview4.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		imageview6.setColorFilter(0xFFFFFFFF, PorterDuff.Mode.MULTIPLY);
		linear10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear20.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear43.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		textview6.setTextColor(0xFFE0E0E0);
		textview2.setTextColor(0xFFFFFFFF);
		textview8.setTextColor(0xFFE0E0E0);
		textview10.setTextColor(0xFFE0E0E0);
		textview5.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview14.setTextColor(0xFF3D5AFE);
		textview15.setTextColor(0xFF3D5AFE);
		textview16.setTextColor(0xFF3D5AFE);
		textview20.setTextColor(0xFF3D5AFE);
		textview21.setTextColor(0xFF3D5AFE);
		textview22.setTextColor(0xFF3D5AFE);
		textview20.setTextColor(0xFF3D5AFE);
		textview21.setTextColor(0xFF3D5AFE);
		textview22.setTextColor(0xFF3D5AFE);
		textview26.setTextColor(0xFF3D5AFE);
		textview27.setTextColor(0xFF3D5AFE);
		textview28.setTextColor(0xFF304FFE);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		textview17.setTextColor(0xFFFFFFFF);
		textview18.setTextColor(0xFFFFFFFF);
		textview19.setTextColor(0xFFFFFFFF);
		textview23.setTextColor(0xFFFFFFFF);
		textview24.setTextColor(0xFFFFFFFF);
		textview25.setTextColor(0xFFFFFFFF);
		_GradientDrawable(linear30, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear31, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear39, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_GradientDrawable(linear46, 25, 00, 00, "#000000", "#ffffff", true, true, 1000);
		_ColorFilter(imageview3, "#ffffff");
		_ColorFilter(imageview4, "#ffffff");
		_ColorFilter(imageview6, "#ffffff");
		_ColorFilter(imageview7, "#ffffff");
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
				popup.dismiss();
			} });
		
		lin_sketchub.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				popup.dismiss();
			} });
		
		lin_settings.setOnClickListener(new OnClickListener() { public void onClick(View view) {
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