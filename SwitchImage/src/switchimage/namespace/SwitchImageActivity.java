package switchimage.namespace;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class SwitchImageActivity extends Activity {
    /** Called when the activity is first created. */
	
	ImageView iv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        iv = (ImageView) findViewById(R.id.imageView1);
        ToggleButton btn = (ToggleButton)findViewById(R.id.toggleButton1);
        btn.setOnCheckedChangeListener(new OnCheckedChangeListener(){

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					iv.setImageResource(R.drawable.button_pause);
				}else{
					iv.setImageResource(R.drawable.button_play);
				}
				
			}});
        
        
    }
}