package app.rvx.manager.miracle;

import android.animation.*;
import android.app.*;
import android.app.Activity;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.*;
import com.android.prime.arab.ware.everythingutils.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import com.downloader.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class AboutActivity extends AppCompatActivity {
	
	private String fontName = "";
	private String typeace = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear3;
	private TextView textview1;
	private ImageView imageview1;
	private LottieAnimationView lottie1;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear9;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear12;
	private TextView textview7;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	
	private SharedPreferences Settings;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear5 = findViewById(R.id.linear5);
		linear8 = findViewById(R.id.linear8);
		linear10 = findViewById(R.id.linear10);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear3 = findViewById(R.id.linear3);
		textview1 = findViewById(R.id.textview1);
		imageview1 = findViewById(R.id.imageview1);
		lottie1 = findViewById(R.id.lottie1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		linear9 = findViewById(R.id.linear9);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		linear12 = findViewById(R.id.linear12);
		textview7 = findViewById(R.id.textview7);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		Settings = getSharedPreferences("getSettings", Activity.MODE_PRIVATE);
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialogncm = new AlertDialog.Builder(AboutActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.dnc,null); 
				dialogncm.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialogncm.setView(inflate);
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
				
				t1.setText("What's New In Latest Version ?");
				t2.setText(Settings.getString("RVX_MANAGER_WHATS_NEW", ""));
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
						dialogncm.dismiss();
					}
				});
				dialogncm.setCancelable(true);
				dialogncm.show();
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Back();
			}
		});
	}
	
	private void initializeLogic() {
		if (Settings.getString("themes", "").equals("light")) {
			_LightTheme();
		}
		else {
			_DarkTheme();
		}
		_changeActivityFont("en_medium");
		int[] colorsCNJKL = { Color.parseColor("#304EFF"), Color.parseColor("#FF0000") }; android.graphics.drawable.GradientDrawable CNJKL = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TL_BR, colorsCNJKL);
		CNJKL.setCornerRadii(new float[]{(int)26,(int)26,(int)26,(int)26,(int)26,(int)26,(int)26,(int)26});
		CNJKL.setStroke((int) 0, Color.parseColor("#000000"));
		linear5.setElevation((float) 0);
		linear5.setBackground(CNJKL);
		lottie1.setAnimation("Animation/VDJzJgKAe8.json");
		if (Settings.getString("RVXMV", "").equals("")) {
			textview2.setText("RVX Manager");
			linear5.setElevation((float) 0);
			linear5.setBackground(CNJKL);
		}
		else {
			textview2.setText("RVX Manager ".concat(Settings.getString("RVXMV", "")));
			linear5.setElevation((float) 0);
			linear5.setBackground(CNJKL);
		}
	}
	
	@Override
	public void onBackPressed() {
		_Back();
	}
	public void _LightTheme() {
		_status_bar_color("#ffffff", "#EEEEEE");
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =AboutActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFEEEEEE);
		}
		Settings.edit().putString("themes", "light").commit();
		vscroll1.setBackgroundColor(0xFFEEEEEE);
		linear1.setBackgroundColor(0xFFEEEEEE);
		_GradientDrawable(linear3, 25, 00, 00, "#eeeeee", "#ffffff", true, true, 200);
		_ColorFilter(imageview1, "#000000");
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFFFFFFFF));
		textview5.setTextColor(0xFF000000);
		textview6.setTextColor(0xFF000000);
		textview7.setTextColor(0xFF000000);
		textview9.setTextColor(0xFF000000);
		textview10.setTextColor(0xFF000000);
		textview11.setTextColor(0xFF000000);
		textview12.setTextColor(0xFF000000);
		textview13.setTextColor(0xFF000000);
		textview1.setTextColor(0xFF304FFE);
		textview4.setTextColor(0xFF304FFE);
		textview8.setTextColor(0xFF304FFE);
	}
	
	
	public void _DarkTheme() {
		_status_bar_color("#ffffff", "#000000");
		getWindow().getDecorView().setSystemUiVisibility(0);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =AboutActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
		}
		linear1.setBackgroundColor(0xFF000000);
		vscroll1.setBackgroundColor(0xFF000000);
		_GradientDrawable(linear3, 25, 00, 00, "#000000", "#ffffff", true, true, 200);
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF252525));
		_ColorFilter(imageview1, "#ffffff");
		textview5.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview10.setTextColor(0xFFFFFFFF);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		textview1.setTextColor(0xFF8C9EFF);
		textview4.setTextColor(0xFF8C9EFF);
		textview8.setTextColor(0xFF8C9EFF);
	}
	
	
	public void _ColorFilter(final ImageView _view, final String _color) {
		_view.getDrawable().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.SRC_IN);
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
	
	
	public void _status_bar_color(final String _colour1, final String _colour2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
			   Window w = this.getWindow(); w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			   w.setStatusBarColor(Color.parseColor(_colour1)); w.setNavigationBarColor(Color.parseColor(_colour2));
		}
	}
	
	
	public void _Back() {
		Intent in_tent = new Intent();
		in_tent.setClass(getApplicationContext(), ManageActivity.class);
		startActivity(in_tent);
		com.blogspot.atifsoftwares.animatoolib.Animatoo.animateZoom(AboutActivity.this);
		finishAffinity();
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