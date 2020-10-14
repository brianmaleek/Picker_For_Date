package com.brma.pickerfordate;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements
        DatePickerDialog.OnDateSetListener {

    /**
     * Creates the date picker dialog with the current date from Calendar.
     *
     * @param savedInstanceState    Saved instance state bundle.
     * @return DatePickerDialog     The date picker dialog.
     */

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //Use the current date as the default date in the picker.
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(Objects.requireNonNull(getActivity()), this, year, month, day);
    }

    /**
     *Grabs the date and passes it to processDatePickerResult().
     *
     * @param datePicker    The date picker view
     * @param year          The year chosen
     * @param month         The month chosen
     * @param dayOfMonth    The day chosen
     * */


    //Method will be called when the user sets the date.
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        //Set activity to the Main Activity
        MainActivity activity = (MainActivity) getActivity();

        //Invoke Main Activity's processDatePickerResult() method.
        Objects.requireNonNull(activity).processDatePickerResult(year, month, dayOfMonth);
    }
}