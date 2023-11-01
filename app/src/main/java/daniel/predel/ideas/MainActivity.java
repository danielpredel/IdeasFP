package daniel.predel.ideas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnInicio = findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}