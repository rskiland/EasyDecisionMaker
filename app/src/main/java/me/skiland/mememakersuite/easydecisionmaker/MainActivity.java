package me.skiland.mememakersuite.easydecisionmaker;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static android.os.SystemClock.sleep;
import static me.skiland.mememakersuite.easydecisionmaker.R.id.time;

public class MainActivity extends AppCompatActivity {

    private AdView currentAd;

    private int optionTracker = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button AddOption =(Button) findViewById(R.id.AddOptionButton);
        final Button RemoveOption =(Button)findViewById(R.id.RemoveOptionButton);
        final Button DecideOption =(Button)findViewById(R.id.DecideButton);

        // ADS
        MobileAds.initialize(this, "ca-app-pub-5374459420704533~6674634200");
        currentAd = (AdView) findViewById(R.id.bottomad);
        AdRequest adRequest = new AdRequest.Builder().build();
        currentAd.loadAd(adRequest);

        // BUTTONS
        AddOption.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        if (optionTracker == 2){
                            EditText selectedText = (EditText) findViewById(R.id.OptionC);
                            selectedText.setVisibility(View.VISIBLE);
                            optionTracker+=1;
                        }
                        else if (optionTracker == 3){
                            EditText selectedText = (EditText) findViewById(R.id.OptionD);
                            selectedText.setVisibility(View.VISIBLE);
                            optionTracker+=1;
                        }
                        else if (optionTracker == 4){
                            EditText selectedText = (EditText) findViewById(R.id.OptionE);
                            selectedText.setVisibility(View.VISIBLE);
                            optionTracker+=1;
                        }
                        else if (optionTracker == 5){
                            EditText selectedText = (EditText) findViewById(R.id.OptionF);
                            selectedText.setVisibility(View.VISIBLE);
                            optionTracker+=1;
                        }
                    }
                }
        );

        RemoveOption.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        if (optionTracker == 3){
                            EditText selectedText = (EditText) findViewById(R.id.OptionC);
                            selectedText.setVisibility(View.INVISIBLE);
                            optionTracker-=1;
                        }
                        else if (optionTracker == 4){
                            EditText selectedText = (EditText) findViewById(R.id.OptionD);
                            selectedText.setVisibility(View.INVISIBLE);
                            optionTracker-=1;
                        }
                        else if (optionTracker == 5){
                            EditText selectedText = (EditText) findViewById(R.id.OptionE);
                            selectedText.setVisibility(View.INVISIBLE);
                            optionTracker-=1;
                        }
                        else if (optionTracker == 6){
                            EditText selectedText = (EditText) findViewById(R.id.OptionF);
                            selectedText.setVisibility(View.INVISIBLE);
                            optionTracker-=1;
                        }
                    }
                }
        );

        final Intent intent = new Intent(getBaseContext(), ChoiceActivity.class);


        DecideOption.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        if (optionTracker == 2){
                            int randomNum = (int) Math.floor(Math.random() * 2);
                            if (randomNum == 0){
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                EditText selectedText = (EditText) findViewById(R.id.OptionA);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 1){
                                EditText selectedText = (EditText) findViewById(R.id.OptionB);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                        }
                        else if (optionTracker == 3){
                            int randomNum = (int) Math.floor(Math.random() * 3);
                            if (randomNum == 0){
                                EditText selectedText = (EditText) findViewById(R.id.OptionA);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());

                            }
                            else if (randomNum == 1){
                                EditText selectedText = (EditText) findViewById(R.id.OptionB);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 2){
                                EditText selectedText = (EditText) findViewById(R.id.OptionC);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                        }
                        else if (optionTracker == 4){
                            int randomNum = (int) Math.floor(Math.random() * 4);
                            if (randomNum == 0){
                                EditText selectedText = (EditText) findViewById(R.id.OptionA);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 1){
                                EditText selectedText = (EditText) findViewById(R.id.OptionB);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 2){
                                EditText selectedText = (EditText) findViewById(R.id.OptionC);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 3){
                                EditText selectedText = (EditText) findViewById(R.id.OptionD);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                        }
                        else if (optionTracker == 5){
                            int randomNum = (int) Math.floor(Math.random() * 5);
                            if (randomNum == 0){
                                EditText selectedText = (EditText) findViewById(R.id.OptionA);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 1){
                                EditText selectedText = (EditText) findViewById(R.id.OptionB);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 2){
                                EditText selectedText = (EditText) findViewById(R.id.OptionC);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 3){
                                EditText selectedText = (EditText) findViewById(R.id.OptionD);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 4){
                                EditText selectedText = (EditText) findViewById(R.id.OptionE);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                        }
                        else if (optionTracker == 6){
                            int randomNum = (int) Math.floor(Math.random() * 6);
                            if (randomNum == 0){
                                EditText selectedText = (EditText) findViewById(R.id.OptionA);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 1){
                                EditText selectedText = (EditText) findViewById(R.id.OptionB);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 2){
                                EditText selectedText = (EditText) findViewById(R.id.OptionC);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 3){
                                EditText selectedText = (EditText) findViewById(R.id.OptionD);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 4){
                                EditText selectedText = (EditText) findViewById(R.id.OptionE);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                            else if (randomNum == 5){
                                EditText selectedText = (EditText) findViewById(R.id.OptionF);
                                EditText questionBox = (EditText) findViewById(R.id.QuestionBox);
                                intent.putExtra("question", questionBox.getText().toString());
                                intent.putExtra("selected", selectedText.getText().toString());
                            }
                        }
                        startActivity(intent);
                    }
                }
        );
    }

    /*public void CycleOptions(){
        int tracker = 0;
        if (optionTracker == 2){
            EditText selectedTextA = (EditText) findViewById(R.id.OptionA);
            EditText selectedTextB = (EditText) findViewById(R.id.OptionB);
            int randomNum = (int) Math.floor(Math.random() * 3);
            for (int x = 0; x < randomNum; x++){
                sleep(1000);
                if (tracker == 0){
                    selectedTextA.setBackgroundColor(Color.RED);
                    selectedTextB.setBackgroundColor(Color.WHITE);
                    tracker++;
                }
                else{
                    selectedTextA.setBackgroundColor(Color.WHITE);
                    selectedTextB.setBackgroundColor(Color.RED);
                    tracker=0;
                }
            }

        }
        else if (optionTracker == 3){

        }
        else if (optionTracker == 4){

        }
        else if (optionTracker == 5){

        }
        else if (optionTracker == 6){

        }
    }*/
}
