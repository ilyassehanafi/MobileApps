package ils.hanafi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView txt;
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("thanks! " + i );
                i ++;
                if (i == 11 || i == 21 ){
                    Toast.makeText(MainActivity.this, "you're a trash stop spaming clicks !", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
