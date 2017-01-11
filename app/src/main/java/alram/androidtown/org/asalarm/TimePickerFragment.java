package alram.androidtown.org.asalarm;

/**
 * Created by ChoiJK on 2017-01-08.
 */

/*
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
    private Calendar calendar;
    private String title;
    public TimePickerFragment(Calendar calendar, String title){
        this.calendar = calendar;
        this.title = title;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle on){
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min  = calendar.get(Calendar.MINUTE);
        return new TimePickerDialog(
                getActivity(), this, hour, min, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(android.widget.TimePicker timePicker, int hour, int min) {
        calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                hour, min, 0);
        presenter.onDateUpdate(calendar.getTime(), getTag());
    }
}*/
