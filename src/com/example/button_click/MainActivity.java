package com.example.button_click;

import com.example.button_click.MainActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	Button b;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)
			{
			//for (int i = 0; i < 4; i++)
				i++;
				{
					if(i==1)
					{
						Toast.makeText(MainActivity.this,"good Morning",10).show();
					}
					if (i==2) 
					{
						Toast.makeText(MainActivity.this,"good afternoon",10).show();	
					}
					if (i==3)
					{
						Toast.makeText(MainActivity.this,"good evening",10).show();	
					}
					else {
						Toast.makeText(MainActivity.this,"over clicked",10).show();
					}
					
				}
				
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
