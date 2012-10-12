package com.origami;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
public  class  ActivitySwitchByButtonActivity  extends  Activity {  
    private  ViewFlipper mViewFlipper;  
    @Override   
    public  void  onCreate(Bundle savedInstanceState) {  
        super .onCreate(savedInstanceState);  
        setContentView(R.layout.main);  
          //测试git
        Button buttonNext1 = (Button) findViewById(R.id.Button_next1);  
        mViewFlipper = (ViewFlipper) findViewById(R.id.details);  
        buttonNext1.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                //ÔÚlayoutÖÐ¶¨ÒåµÄÊôÐÔ£¬Ò²¿ÉÒÔÔÚ´úÂëÖÐÖ¸¶¨   
//             mViewFlipper.setInAnimation(getApplicationContext(), R.anim.push_left_in);   
//             mViewFlipper.setOutAnimation(getApplicationContext(), R.anim.push_left_out);   
//             mViewFlipper.setPersistentDrawingCache(ViewGroup.PERSISTENT_ALL_CACHES);   
//             mViewFlipper.setFlipInterval(1000);   
                mViewFlipper.showNext();  
                //µ÷ÓÃÏÂÃæµÄº¯Êý½«»áÑ­»·ÏÔÊ¾mViewFlipperÄÚµÄËùÓÐView¡£   
//             mViewFlipper.startFlipping();   
        }  
        });  
   
        Button buttonNext2 = (Button) findViewById(R.id.Button_next2);  
        buttonNext2.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                mViewFlipper.showNext();  
        }  
   
        });     
        Button buttonNext3 = (Button) findViewById(R.id.Button_next3);  
        buttonNext3.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                mViewFlipper.showNext();  
        }  
   
        });  
   
    }  
    } 