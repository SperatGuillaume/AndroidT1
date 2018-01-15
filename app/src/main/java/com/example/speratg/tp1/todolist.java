package com.example.speratg.tp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by speratg on 15/01/2018.
 */
public class todolist extends Activity implements View.OnClickListener{
    private Button btnValider ;
    private Button btnVider;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button) findViewById(R.id.valider);
        btnValider.setOnClickListener(this) ;

        btnVider = (Button)findViewById(R.id.viderliste);
        btnVider.setOnClickListener(this);

    }

    @Override
        public void onClick(View v) {

        if (v.getId() == R.id.valider) {
            EditText valuetext = (EditText) findViewById(R.id.edittext);
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText(valuetext.getText().toString());

        } else {
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText("");
        }
    }

}
