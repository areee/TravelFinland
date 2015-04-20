package areee.travelfinland;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

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
                Intent lapland = new Intent(getApplicationContext(), LaplandActivity.class);
                startActivity(lapland);
            }
        });

        ouluButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oulu = new Intent(getApplicationContext(), OuluActivity.class);
                startActivity(oulu);
            }
        });


        vaasaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent lapland = new Intent(getApplicationContext(), LaplandActivity.class);
//                startActivity(lapland);
                //ei vielä saatavilla:
                DialogFragment fragment = new FeatureNotAvailableDialog();
                fragment.show(getFragmentManager(), "feature");
            }
        });

        turkuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent lapland = new Intent(getApplicationContext(), LaplandActivity.class);
//                startActivity(lapland);
                //ei vielä saatavilla:
                DialogFragment fragment = new FeatureNotAvailableDialog();
                fragment.show(getFragmentManager(), "feature");
            }
        });

        vantaaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent lapland = new Intent(getApplicationContext(), LaplandActivity.class);
//                startActivity(lapland);
                //ei vielä saatavilla:
                DialogFragment fragment = new FeatureNotAvailableDialog();
                fragment.show(getFragmentManager(), "feature");
            }
        });

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
