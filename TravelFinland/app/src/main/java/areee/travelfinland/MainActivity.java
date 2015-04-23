package areee.travelfinland;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static final String PREFS_NAME = "MyPrefsFile";
    public int doneLaplandExercise1;
    public int doneLaplandExercise2;
    public int doneLaplandExercise3;
    public int doneLaplandExercise4;
    public int doneOuluExercise1;
    public int doneOuluExercise2;
    public int doneOuluExercise3;
    public int doneOuluExercise4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        doneLaplandExercise1 = settings.getInt("doneLaplandExercise1", 0);
        doneLaplandExercise2 = settings.getInt("doneLaplandExercise2", 0);
        doneLaplandExercise3 = settings.getInt("doneLaplandExercise3", 0);
        doneLaplandExercise4 = settings.getInt("doneLaplandExercise4", 0);
        doneOuluExercise1 = settings.getInt("doneOuluExercise1", 0);
        doneOuluExercise2 = settings.getInt("doneOuluExercise2", 0);
        doneOuluExercise3 = settings.getInt("doneOuluExercise3", 0);
        doneOuluExercise4 = settings.getInt("doneOuluExercise4", 0);

        final Button rovaniemiButton = (Button) findViewById(R.id.rovaniemiButton);
        final Button ouluButton = (Button) findViewById(R.id.ouluButton);
        final Button vaasaButton = (Button) findViewById(R.id.vaasaButton);
        final Button turkuButton = (Button) findViewById(R.id.turkuButton);
        final Button vantaaButton = (Button) findViewById(R.id.vantaaButton);
        TextView mapExerciseText = (TextView) findViewById(R.id.map_exercise_text);

        if (doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
                && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1) {
            mapExerciseText.setText(R.string.map_layout_oulu_text);
        }

        rovaniemiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
                        && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1) {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                } else {
                    DialogFragment fragment = new Map1ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "passed");
                }

//                Intent lapland = new Intent(getApplicationContext(), LaplandActivity.class);
//                startActivity(lapland);
            }
        });

        ouluButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
                        && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1) {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                } else {
                    DialogFragment fragment = new Map2ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "passed");
                }

//                Intent oulu = new Intent(getApplicationContext(), OuluActivity.class);
//                startActivity(oulu);
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
