package edu.uco.mcamposcardoso.p3matheus_c;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TicTacToeActivity extends AppCompatActivity {

    char chrWhosTurn = 'O';
    int intCanWin = 0;
    char[][] matrix = new char[3][3];
    Button button_0_0;
    Button button_0_1;
    Button button_0_2;
    Button button_1_0;
    Button button_1_1;
    Button button_1_2;
    Button button_2_0;
    Button button_2_1;
    Button button_2_2;
    int matchsCount = 0;

    ArrayList<Integer> match = new ArrayList<Integer>();
    ArrayList<Character> winner = new ArrayList<Character>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        button_0_0 = (Button) findViewById(R.id.button_0_0);
        button_0_1 = (Button) findViewById(R.id.button_0_1);
        button_0_2 = (Button) findViewById(R.id.button_0_2);
        button_1_0 = (Button) findViewById(R.id.button_1_0);
        button_1_1 = (Button) findViewById(R.id.button_1_1);
        button_1_2 = (Button) findViewById(R.id.button_1_2);
        button_2_0 = (Button) findViewById(R.id.button_2_0);
        button_2_1 = (Button) findViewById(R.id.button_2_1);
        button_2_2 = (Button) findViewById(R.id.button_2_2);

        final TextView txtHeader = (TextView) findViewById(R.id.txtHeader);

        button_0_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_0_0.setEnabled(false);

                if(chrWhosTurn == 'X') {
                    button_0_0.setTextColor(Color.parseColor("#B1B5FB"));
                    button_0_0.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[0][0] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_0_0.setTextColor(Color.parseColor("#FAF48B"));
                    button_0_0.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[0][0] = 'O';
                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(0, returnOposite(chrWhosTurn)) || verifyColumn(0, returnOposite(chrWhosTurn)) || verifyDiagonals(returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }

            }
        });

        button_0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_0_1.setEnabled(false);


                if(chrWhosTurn == 'X') {
                    button_0_1.setTextColor(Color.parseColor("#B1B5FB"));
                    button_0_1.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[0][1] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_0_1.setTextColor(Color.parseColor("#FAF48B"));
                    button_0_1.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[0][1] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(0, returnOposite(chrWhosTurn)) || verifyColumn(1, returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }

            }
        });


        button_0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_0_2.setEnabled(false);


                if(chrWhosTurn == 'X') {
                    button_0_2.setTextColor(Color.parseColor("#B1B5FB"));
                    button_0_2.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[0][2] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_0_2.setTextColor(Color.parseColor("#FAF48B"));
                    button_0_2.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[0][2] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(0, returnOposite(chrWhosTurn)) || verifyColumn(2, returnOposite(chrWhosTurn)) || verifyDiagonals(returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_1_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_1_0.setEnabled(false);


                if(chrWhosTurn == 'X') {
                    button_1_0.setTextColor(Color.parseColor("#B1B5FB"));
                    button_1_0.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[1][0] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_1_0.setTextColor(Color.parseColor("#FAF48B"));
                    button_1_0.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[1][0] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(1, returnOposite(chrWhosTurn)) || verifyColumn(0, returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_1_1.setEnabled(false);


                if(chrWhosTurn == 'X') {
                    button_1_1.setTextColor(Color.parseColor("#B1B5FB"));
                    button_1_1.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[1][1] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_1_1.setTextColor(Color.parseColor("#FAF48B"));
                    button_1_1.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[1][1] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(1, returnOposite(chrWhosTurn)) || verifyColumn(1, returnOposite(chrWhosTurn)) || verifyDiagonals(returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intCanWin++;
                button_1_2.setEnabled(false);


                if(chrWhosTurn == 'X') {
                    button_1_2.setTextColor(Color.parseColor("#B1B5FB"));
                    button_1_2.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[1][2] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_1_2.setTextColor(Color.parseColor("#FAF48B"));
                    button_1_2.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[1][2] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(1, returnOposite(chrWhosTurn)) || verifyColumn(2, returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_2_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intCanWin++;
                button_2_0.setEnabled(false);

                if(chrWhosTurn == 'X') {
                    button_2_0.setTextColor(Color.parseColor("#B1B5FB"));
                    button_2_0.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[2][0] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_2_0.setTextColor(Color.parseColor("#FAF48B"));
                    button_2_0.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[2][0] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(2, returnOposite(chrWhosTurn)) || verifyColumn(0, returnOposite(chrWhosTurn)) || verifyDiagonals(returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intCanWin++;
                button_2_1.setEnabled(false);

                if(chrWhosTurn == 'X') {
                    button_2_1.setTextColor(Color.parseColor("#B1B5FB"));
                    button_2_1.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[2][1] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_2_1.setTextColor(Color.parseColor("#FAF48B"));
                    button_2_1.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[2][1] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(2, returnOposite(chrWhosTurn)) || verifyColumn(1, returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });


        button_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intCanWin++;
                button_2_2.setEnabled(false);

                if(chrWhosTurn == 'X') {
                    button_2_2.setTextColor(Color.parseColor("#B1B5FB"));
                    button_2_2.setText("X");
                    txtHeader.setText("O's turn!");
                    matrix[2][2] = 'X';

                    chrWhosTurn = 'O';
                }
                else {
                    button_2_2.setTextColor(Color.parseColor("#FAF48B"));
                    button_2_2.setText("O");
                    txtHeader.setText("X's turn!");
                    matrix[2][2] = 'O';

                    chrWhosTurn = 'X';
                }

                if(intCanWin >= 5){
                    if(verifyRow(2, returnOposite(chrWhosTurn)) || verifyColumn(2, returnOposite(chrWhosTurn)) || verifyDiagonals(returnOposite(chrWhosTurn))) {
                        txtHeader.setText("Game Over: Winner is " + returnOposite(chrWhosTurn) + "!!!");
                        disableButtons();
                    }
                    else if(intCanWin == 9) {
                        chrWhosTurn = 'T';
                        txtHeader.setText("Game Over: TIE - No Winner!!!");
                        disableButtons();
                    }
                }
            }
        });

        Button btnNewGame = (Button) findViewById(R.id.btnNewGame);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame();
                txtHeader.setText("Play Tic-Tac-Toe: O's turn!");
                chrWhosTurn = 'O';
            }
        });

        Button btnLog = (Button) findViewById(R.id.btnLog);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(TicTacToeActivity.this, LogActivity.class);
                i.putIntegerArrayListExtra("matches", match);
                i.putStringArrayListExtra("winners", getStringRepresentation(winner));
                startActivity(i);
            }
        });

    }

    boolean verifyRow(int row, char actual){
        return matrix[row][0] == actual && matrix[row][1] == actual && matrix[row][2] == actual;
    }

    boolean verifyColumn(int column, char actual){
        return matrix[0][column] == actual && matrix[1][column] == actual && matrix[2][column] == actual;
    }

    boolean verifyDiagonals(char actual) {
        return matrix[0][0] == actual && matrix[1][1] == actual && matrix[2][2] == actual || matrix[2][0] == actual && matrix[1][1] == actual && matrix[0][2] == actual;

    }

    char returnOposite(char actual){
        if(actual == 'X')
            return 'O';
        else if (actual == 'T')
            return 'T';
        return 'X';
    }

    void disableButtons(){

        matchsCount++;
        match.add(matchsCount);
        winner.add(returnOposite(chrWhosTurn));
        button_0_0.setEnabled(false);
        button_0_1.setEnabled(false);
        button_0_2.setEnabled(false);
        button_1_0.setEnabled(false);
        button_1_1.setEnabled(false);
        button_1_2.setEnabled(false);
        button_2_0.setEnabled(false);
        button_2_1.setEnabled(false);
        button_2_2.setEnabled(false);
    }

    void newGame() {

        button_0_0.setEnabled(true);
        button_0_0.setText("");
        button_0_1.setEnabled(true);
        button_0_1.setText("");
        button_0_2.setEnabled(true);
        button_0_2.setText("");
        button_1_0.setEnabled(true);
        button_1_0.setText("");
        button_1_1.setEnabled(true);
        button_1_1.setText("");
        button_1_2.setEnabled(true);
        button_1_2.setText("");
        button_2_0.setEnabled(true);
        button_2_0.setText("");
        button_2_1.setEnabled(true);
        button_2_1.setText("");
        button_2_2.setEnabled(true);
        button_2_2.setText("");
        intCanWin = 0;

        matrix = new char[3][3];

    }

    ArrayList<String> getStringRepresentation(ArrayList<Character> list)
    {
        ArrayList<String> stringRepresentation = new ArrayList<String>();
        for(Character ch: list)
        {
            stringRepresentation.add(ch.toString());
        }
        return stringRepresentation;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tic_tac_toe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}