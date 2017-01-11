package alram.androidtown.org.asalarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton addAlarm = (ImageButton) findViewById(R.id.add_btn);
        addAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callAlarmPropertice = new Intent(MainActivity.this, AlarmPropertice.class);
                startActivity(callAlarmPropertice);

            }
        });
    }
}
