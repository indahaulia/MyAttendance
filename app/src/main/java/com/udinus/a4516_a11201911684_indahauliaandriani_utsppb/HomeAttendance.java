package com.udinus.a4516_a11201911684_indahauliaandriani_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeAttendance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_attendance);
    }
    public void clickGetHistory(View view) {
        Intent i = new Intent(HomeAttendance.this, HistoryAttendance.class);
        startActivity(i);
    }

    public void clickCheckin(View view) {
        Intent i = new Intent(HomeAttendance.this, SuccessActivity.class);
        startActivity(i);
    }

    public void clickCheckout(View view) {
        Intent i = new Intent(HomeAttendance.this, SuccessOut.class);
        startActivity(i);
    }
}