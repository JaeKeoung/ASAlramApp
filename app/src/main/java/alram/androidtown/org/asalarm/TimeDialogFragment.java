package alram.androidtown.org.asalarm;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;

/**
 * Created by ChoiJK on 2017-01-08.
 */

public class TimeDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog dialog;

        TimeSettings timeSettings = new TimeSettings(getActivity());
        dialog = new TimePickerDialog(getActivity(), timeSettings, hour, minute, android.text.format.DateFormat.is24HourFormat(getActivity()));
        return dialog;
    }
}
