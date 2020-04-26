package adm.ailatrieuphu.activity;

import android.app.ListActivity;
import android.os.Bundle;

import adm.ailatrieuphu.App;
import adm.ailatrieuphu.R;
import adm.ailatrieuphu.adapter.HighScoreAdapter;
import adm.ailatrieuphu.manager.DatabaseManager;

public class HighScoreActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        DatabaseManager databaseManager = new DatabaseManager(App.getContext());
        getListView().setAdapter(new HighScoreAdapter(databaseManager.getHighScore()));
    }

    @Override
    protected void onPause() {
        super.onPause();
        App.getMusicPlayer().pauseBgMusic();
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.getMusicPlayer().resumeBgMusic();

    }
}
