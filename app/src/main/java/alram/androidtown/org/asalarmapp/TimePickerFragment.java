package alram.androidtown.org.asalarmapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import android.text.format.DateFormat;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment
    implements TimePickerDialog.OnTimeSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedlnstanceState) {
        //현재 시간을 picker의 기본 값으로 사용합니다.
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        //새 인스턴스를 만들고 그것을 반환합니다.
        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

    }
}
