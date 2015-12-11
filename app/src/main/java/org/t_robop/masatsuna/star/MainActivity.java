package org.t_robop.masatsuna.star;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String star = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void star(View view) {
        this.star += "*";
        updateStar();
    }

    public void reset(View view){
        this.star = "";
        updateStar();
    }

    public void updateStar(){
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText(String.valueOf(this.star));
    }
}


