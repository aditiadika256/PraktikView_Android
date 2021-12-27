package id.ac.id.telkomuniversity.tass.praktikpanel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar1 = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            // Menampilkan toast
//            case R.id.menu_email:
//                Toast.makeText(MainActivity.this, "Tombol email diklik", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu_user:
//                Toast.makeText(MainActivity.this, "Tombol user diklik", Toast.LENGTH_SHORT).show();
//                break;

            case R.id.menu_email:
                Intent ie = new Intent(this, EmailActivity.class);
                startActivity(ie);
                break;
            case R.id.menu_user:
                Intent iu = new Intent(this, UserActivity.class);
                startActivity(iu);
                break;
            case R.id.menu1:
                Toast.makeText(MainActivity.this, "Tombol menu 1 diklik", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Toast.makeText(MainActivity.this, "Tombol menu 2 diklik", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                Toast.makeText(MainActivity.this, "Tombol menu 3 diklik", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}