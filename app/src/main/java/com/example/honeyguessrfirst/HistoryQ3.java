package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class HistoryQ3 extends AppCompatActivity {

    private int presCounter = 0;
    private int maxPresCounter =1;
    private String[] keys = {"Hidilyn Diaz", "Teofilo Yldefonso", "Onyok Velasco", "Jose Villanueva"};
    private String textAnswer = "Teofilo Yldefonso";
    TextView textScreen, textQuestion, textTitle;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historyq3);

//        timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                Intent qTimer = new Intent(HistoryQ3.this, Categories.class);
//                startActivity(qTimer);
//                finish();
//            }
//        }, 2000);

        keys = shuffleArray(keys);

        for (String key : keys) {
            addView(findViewById(R.id.layoutParent), key, ((EditText) findViewById(R.id.editText)));
        }
        maxPresCounter = 1;
    }
    private String[] shuffleArray(String [] ar) {
        Random rnd = new Random();
        for (int i = ar.length -1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
    private void addView(LinearLayout viewParent, final String text, final EditText editText) {
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutParams.rightMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.backgroundq));
        textView.setTextColor(this.getResources().getColor(R.color.black));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(25);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/lazydog.ttf");
        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (TextView) findViewById(R.id.textTitle);

        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);
        editText.setTypeface(typeface);
        textView.setTypeface(typeface);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(presCounter < maxPresCounter) {
                    if (presCounter == 0)
                        editText.setText("");

                    editText.setText(editText.getText().toString() + text);
                    //textView.startAnimation(bigsmallforth);
                    textView.animate().alpha(0).setDuration(300);
                    presCounter++;

                    if (presCounter == maxPresCounter)
                        doValidate();
                }
            }
        });
        viewParent.addView(textView);
    }
    private void doValidate() {
        presCounter = 0;
        EditText editText = findViewById(R.id.editText);
        LinearLayout linearLayout = findViewById(R.id.layoutParent);

        if(editText.getText().toString().equals(textAnswer)) {
            Toast.makeText(HistoryQ3.this, "Tama! Ang sagot ay Teofilo Yldefonso!", Toast.LENGTH_LONG).show();

            Intent b3 = new Intent(HistoryQ3.this, TriviaforArts2.class);
            startActivity(b3);

        } else {
            Toast.makeText(HistoryQ3.this, "Mali! Subukan muli!", Toast.LENGTH_SHORT).show();
            editText.setText("");
        }
        linearLayout.removeAllViews();
        for (String key : keys) {
            addView(linearLayout, key, editText);
        }
    }
}