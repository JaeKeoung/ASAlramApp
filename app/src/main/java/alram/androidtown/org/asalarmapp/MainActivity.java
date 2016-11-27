package alram.androidtown.org.asalarmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_main);

        Button addAlarm = (Button) findViewById(R.id.addA);
        addAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callAlarmPropertice = new Intent(v.getContext(), AlarmPropertice.class);
                startActivity(callAlarmPropertice);

            }
        });

    }
}
