package it.pg.volta.mycinemaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {

    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        this.textView = (TextView) this.findViewById(R.id.movieText);
        textView.setText(R.string.elenco);

        // definisco un array di String
        String[] movies = new String[] { "Interstellar", "La La Land", "The lord of the rings" };

        // preparo un ArrayAdapter
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies);

        // popolo la ListView iniettando i dati attraverso l'Adapter
        listView = (ListView) findViewById(R.id.movieList);
        listView.setAdapter(itemsAdapter);
    }
}
