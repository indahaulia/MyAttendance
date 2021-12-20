package com.udinus.a4516_a11201911684_indahauliaandriani_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

public class HistoryAttendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_attendance);
        RecyclerView historyAttendance =(RecyclerView) findViewById(R.id.historyAttendance);

        historyAttendance.setLayoutManager(new LinearLayoutManager((this)));
        String[] data1 = {"Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00","Check In : 07.00"};
        historyAttendance.setAdapter(new AdapterHistory(data1));
    }
}