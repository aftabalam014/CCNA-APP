package com.mdaftabalam.ccna.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mdaftabalam.ccna.R;

public class FeedbackActivity extends AppCompatActivity {

    Button sendButton;
    EditText edtSubject, edtMessage;
    String subject, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        edtSubject = findViewById(R.id.subject);
        edtMessage = findViewById(R.id.message);
        sendButton = findViewById(R.id.submit);
        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                subject = edtSubject.getText().toString();
                message = edtMessage.getText().toString();
                if (subject.isEmpty()) {
                    edtSubject.setError("Please enter subject");
                    edtSubject.requestFocus();
                } else if (message.isEmpty()) {
                    edtMessage.setError("Please enter message");
                    edtMessage.requestFocus();
                } else {
                    sendEmail();
                }
            }
        });
    }

    public void sendEmail() {
        String mailto = "mailto:mdaftabalam014@gmail.com" + "?cc=" + "" + "&subject=" + Uri.encode("CCNA GUIDE : " + subject) + "&body=" + Uri.encode(message);
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));
        try {
            startActivity(emailIntent);
        } catch (ActivityNotFoundException e) {
            //TODO: Handle case where no email app is available
        }
    }
}
