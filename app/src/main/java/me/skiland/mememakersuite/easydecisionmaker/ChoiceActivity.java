package me.skiland.mememakersuite.easydecisionmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        String questionString = getIntent().getStringExtra("question");
        TextView questionChoiceText = (TextView) findViewById(R.id.QuestionChoice);
        questionChoiceText.setText(questionString + "?");

        String selectedString = getIntent().getStringExtra("selected");
        TextView selectedChoiceText = (TextView) findViewById(R.id.AnswerChoice);
        selectedChoiceText.setText(selectedString);
    }
}
