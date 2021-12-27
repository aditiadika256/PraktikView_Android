package id.ac.id.telkomuniversity.tass.praktikpanel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class UserActivity extends AppCompatActivity {

    Toolbar toolbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        toolbar3 = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar3);
    }

}