package com.example.testanim;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener{
	ImageView iv1,iv2,iv3,iv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iv1=(ImageView)this.findViewById(R.id.imageView1);
        iv2=(ImageView)this.findViewById(R.id.imageView2);
        iv3=(ImageView)this.findViewById(R.id.imageView3);
        iv5=(ImageView)this.findViewById(R.id.imageView5);
        
        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv5.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.imageView1:
			Animation ani1=AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
			iv1.startAnimation(ani1);
			break;
		case R.id.imageView2:
			Animation ani2=AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
			iv2.startAnimation(ani2);
			break;
		case R.id.imageView3:
			Animation ani3=AnimationUtils.loadAnimation(this, R.anim.scale_animation);
			iv3.startAnimation(ani3);
			break;
		case R.id.imageView5:
			AnimationDrawable dd = (AnimationDrawable) iv5.getBackground();
			if(!dd.isRunning()){
				dd.start();
			}
			break;
		
		
		}
	}


   
    
}
