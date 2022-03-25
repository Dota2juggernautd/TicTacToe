package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WInDialogActivity extends Dialog {
    private TextView messagetxt;
    private final String message;
    private Button restartbtn;
    private final MainActivity mainActivity;
    public WInDialogActivity(@NonNull Context context,String mesage , MainActivity mainActivity) {
        super(context);
        this.mainActivity = mainActivity;
        this.message = mesage;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_dialog);
        messagetxt = findViewById(R.id.textMessage);
        restartbtn = findViewById(R.id.StartAgainBtn);

        messagetxt.setText(message);

        restartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mainActivity.restartMatch();
            dismiss();
            }
        });
    }

}
