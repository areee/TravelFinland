package areee.travelfinland;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        final Button rovaniemiButton = (Button) findViewById(R.id.rovaniemiButton);
        final Button ouluButton = (Button) findViewById(R.id.ouluButton);
        final Button vaasaButton = (Button) findViewById(R.id.vaasaButton);
        final Button turkuButton = (Button) findViewById(R.id.turkuButton);
        final Button vantaaButton = (Button) findViewById(R.id.vantaaButton);

        rovaniemiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lapland_city_layout);

//                Intent rovaniemiScreenIntent = new Intent(MainActivity.this, LaplandActivity.class);
//                startActivity(rovaniemiScreenIntent);
//                Log.i("Content "," Main activity ");
            }
        });

        ouluButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lapland_city_layout);
            }
        });


        vaasaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lapland_city_layout);
            }
        });

        turkuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lapland_city_layout);
            }
        });

        vantaaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.lapland_city_layout);
            }
        });

//        final Button exerciseButton1 = (Button) findViewById(R.id.exerciseButton1);
//        final Button exerciseButton2 = (Button) findViewById(R.id.exerciseButton2);
//        final Button exerciseButton3 = (Button) findViewById(R.id.exerciseButton3);
//        final Button exerciseButton4 = (Button) findViewById(R.id.exerciseButton4);
//
//        exerciseButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.exercise_layout);
//            }
//        });
//
//        exerciseButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.exercise_layout);
//            }
//        });
//
//        exerciseButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.exercise_layout);
//            }
//        });
//
//        exerciseButton4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.exercise_layout);
//            }
//        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
