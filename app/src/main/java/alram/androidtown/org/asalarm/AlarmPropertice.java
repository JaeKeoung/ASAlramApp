package alram.androidtown.org.asalarm;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by ChoiJK on 2017-01-08.
 */

public class AlarmPropertice extends Activity {

    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_propertice);

        Button timePickBtn = (Button) findViewById(R.id.timePicker);
        timePickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimeDialogFragment();
                newFragment.show(getFragmentManager(), "timePicker");
            }

        });

        ImageButton cancelBtn = (ImageButton) findViewById(R.id.cancel_btn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
//test
            }
        });
    }

}
