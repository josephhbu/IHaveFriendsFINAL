package com.example.csaper6.ihavefriends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private Switch onOff;
    private Spinner notifications, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setSpinners();
    }

    private void setSpinners() {
        ArrayAdapter<CharSequence> notificationsAdapter = ArrayAdapter.createFromResource(this,
                R.array.notifications_array, android.R.layout.simple_spinner_dropdown_item);
        notificationsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        notifications.setAdapter(notificationsAdapter);
        ArrayAdapter<CharSequence> timeAdapter = ArrayAdapter.createFromResource(this,
                R.array.time_array, android.R.layout.simple_spinner_dropdown_item);
        timeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        time.setAdapter(timeAdapter);
    }

    private void wireWidgets() {
        onOff= (Switch) findViewById(R.id.switch_on_off);
        notifications = (Spinner) findViewById(R.id.spinner_notifications);
        time = (Spinner) findViewById(R.id.spinner_time);
    }
}
