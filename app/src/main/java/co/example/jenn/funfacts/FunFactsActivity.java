package co.example.jenn.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.*;


public class FunFactsActivity extends Activity {
    private factBook mFactBook = new factBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables and assign them the views fr layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactbutton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact= mFactBook.getFact();
                //Update the label with our dynamic fact
                int color = mColorWheel.getColor();
                factLabel.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
    }

}
