package org.cuatrovientos.davolarris.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IMCActivity extends AppCompatActivity {

    private EditText editText, editText2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView3 = (TextView) findViewById(R.id.textView3);
    }


    public void calculate (View view) {

        String data = editText.getText().toString();
        String data1 = editText2.getText().toString();

        if (data.isEmpty()) {
            Toast.makeText(this, "Error, espacio en blanco", Toast.LENGTH_SHORT);
            return;
        }

        if (data1.isEmpty()) {
            Toast.makeText(this, "Error, espacio en blanco", Toast.LENGTH_SHORT);
            return;
        }

        double h = Double.parseDouble(data);
        double w = Double.parseDouble(data1);
        textView3.setText("" + w / Math.pow(h, 2));
    }
}
