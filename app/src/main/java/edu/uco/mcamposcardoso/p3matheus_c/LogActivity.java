package edu.uco.mcamposcardoso.p3matheus_c;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        ArrayList<Integer> matches = getIntent().getIntegerArrayListExtra("matches");
        ListView listGames = (ListView) findViewById(R.id.listMatches);
        listGames.setAdapter(new ArrayAdapter<Integer>(LogActivity.this, R.layout.list_item, R.id.txtList, matches));

        ArrayList<String> winners = getIntent().getStringArrayListExtra("winners");

        for(int i = 0; i < winners.size(); i++)
        {
            if(winners.get(i).equals("T")){
                winners.set(i, "draw");
            }
        }

        ListView listWinners = (ListView) findViewById(R.id.listWinners);
        listWinners.setAdapter(new ArrayAdapter<String> (LogActivity.this, R.layout.list_item, R.id.txtList, winners));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log, menu);
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
