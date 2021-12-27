package id.ac.id.telkomuniversity.tass.praktikpanel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class EmailActivity extends AppCompatActivity {

    Toolbar toolbar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
    }

}