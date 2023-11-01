package daniel.predel.ideas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        ImageButton btnLevel1 = findViewById(R.id.btnLevel1);
        ImageButton btnLevel2 = findViewById(R.id.btnLevel2);
        ImageButton btnLevel3 = findViewById(R.id.btnLevel3);
        ImageButton btnLevel4 = findViewById(R.id.btnLevel4);
        ImageButton btnLevel5 = findViewById(R.id.btnLevel5);
        ImageButton btnLevel6 = findViewById(R.id.btnLevel6);
//        Antes de avanzar, leer el progreso del usuario, solo agregar el listener a las actividades desbloqueadas
        btnLevel1.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 1);
            startActivity(intent);
        });
        btnLevel2.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 2);
            startActivity(intent);
        });
        btnLevel3.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 3);
            startActivity(intent);
        });
        btnLevel4.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 4);
            startActivity(intent);
        });
        btnLevel5.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 5);
            startActivity(intent);
        });
        btnLevel6.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LeccionActivity.class);
            intent.putExtra("level", 6);
            startActivity(intent);
        });
    }
}
