package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle receivedData = getIntent().getExtras();
        String dayForecast = receivedData.getString(Intent.EXTRA_TEXT);

        TextView dayWeather = (TextView) findViewById(R.id.tv_weather_data);
        dayWeather.setText(dayForecast);
        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
    }
}