package com.brma.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.action_date_picker));
    }

    public void processDatePickerResult (int year, int month, int day) {
        //convert the month, day, and year to separate strings, and to concatenate the three strings
        // with slash marks for the U.S. date format
        //The month integer returned by the date picker starts counting at 0 for January, so you
        //need to add 1 to it to show months starting at 1.
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);

        Toast.makeText(this, getString(R.string.action_date) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }
}