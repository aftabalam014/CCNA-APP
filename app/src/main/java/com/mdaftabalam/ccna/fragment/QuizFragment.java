package com.mdaftabalam.ccna.fragment;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.activity.MainActivity;
import com.mdaftabalam.ccna.activity.ScoreActivity;
import com.mdaftabalam.ccna.utils.QuestionBank;

public class QuizFragment extends Fragment implements View.OnClickListener {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;   // view for current total score
    private TextView mQuestionView;// current question to answer
    private Button mButtonChoice1; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4; // multiple choice 4 for mQuestionView

    private String mAnswer;  // correct answer for question in mQuestionView
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; // current question number

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        mScoreView = view.findViewById(R.id.score);
        mQuestionView = view.findViewById(R.id.question);
        mButtonChoice1 = view.findViewById(R.id.choice1);
        mButtonChoice2 = view.findViewById(R.id.choice2);
        mButtonChoice3 = view.findViewById(R.id.choice3);
        mButtonChoice4 = view.findViewById(R.id.choice4);
        mButtonChoice1.setOnClickListener(this);
        mButtonChoice2.setOnClickListener(this);
        mButtonChoice3.setOnClickListener(this);
        mButtonChoice4.setOnClickListener(this);
        updateQuestion();
        // show current total score for the user
        updateScore();
        return view;
    }

    private void updateQuestion() {
        // check if we are not outside array bounds for questions
        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber, 4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            //Toast.makeText(getActivity(), "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), ScoreActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
        }
    }

    // show current total score for the user
    @SuppressLint("SetTextI18n")
    private void updateScore() {
        mScoreView.setText("" + mScore + "/" + mQuestionLibrary.getLength());
    }

    public void onClick(View v) {
        //all logic for all answers buttons in one method
        Button answer = (Button) v;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer) {
            mScore = mScore + 1;
            //Toast.makeText(getActivity(), "Yes, Correct!", Toast.LENGTH_SHORT).show();
        } else
            //Toast.makeText(getActivity(), "No, Wrong!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore();
        // once user answer the question, we move on to the next one, if any
        updateQuestion();
    }
}