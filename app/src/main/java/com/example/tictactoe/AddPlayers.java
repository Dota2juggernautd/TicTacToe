package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {
    private EditText playerOne,playerTwo;
    private Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        playerOne = findViewById(R.id.PlayerOneName);
        playerTwo = findViewById(R.id.PlayerTwoName);
        startGame = findViewById(R.id.StartGameButton);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String getPlayerOne = playerOne.getText().toString();
                final String getPlayerTwo = playerTwo.getText().toString();

                if (getPlayerOne.isEmpty() || getPlayerTwo.isEmpty()){
                    Toast.makeText(AddPlayers.this, "Пожалуйста напишите имя игроков", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("playerOne",getPlayerOne);
                    intent.putExtra("playerTwo",getPlayerTwo);
                    startActivity(intent);
                }
            }
        });
    }
}