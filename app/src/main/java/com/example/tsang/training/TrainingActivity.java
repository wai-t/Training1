package com.example.tsang.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tsang.training.ui.sensors.SensorsFragment;

public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SensorsFragment.newInstance())
                    .commitNow();
        }
    }
}
