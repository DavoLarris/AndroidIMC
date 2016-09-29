package org.cuatrovientos.davolarris.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button b1 = (Button) findViewById(R.id.button);

        Button b2 = (Button) findViewById(R.id.button2);

        Button b3 = (Button) findViewById(R.id.button3);

    }

    public void OnClick(View v) {
        Intent intent;
        // Perform action on click
        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(MenuActivity.this, IMCActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(MenuActivity.this, HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(MenuActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
