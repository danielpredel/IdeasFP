package daniel.predel.ideas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LeccionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leccion_layout);

        TextView txtTitulo = findViewById(R.id.txtTitulo);
        if(getIntent().getExtras() != null){
            int level = getIntent().getIntExtra("level", 1);
            txtTitulo.setText(level + ": ");
        }
    }
}
