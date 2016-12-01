package falleight.isft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        Button teachersbutton = (Button)findViewById(R.id.TeachersButton);
        teachersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartMenuActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        Button studentsbutton = (Button)findViewById(R.id.StudentsButton);
        studentsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartMenuActivity.this, StudentsMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
