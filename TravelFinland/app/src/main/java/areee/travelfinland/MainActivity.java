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
    public int doneVaasaExercise1;
    public int doneVaasaExercise2;
    public int doneVaasaExercise3;
    public int doneVaasaExercise4;
    public int doneSavonlinnaExercise1;
    public int doneSavonlinnaExercise2;
    public int doneSavonlinnaExercise3;
    public int doneSavonlinnaExercise4;
    public int doneVantaaExercise1;
    public int doneVantaaExercise2;
    public int doneVantaaExercise3;
    public int doneVantaaExercise4;
    public int doneTurkuExercise1; //varalla, otetaanko?
    public int doneTurkuExercise2; //varalla, otetaanko?
    public int doneTurkuExercise3; //varalla, otetaanko?
    public int doneTurkuExercise4; //varalla, otetaanko?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        doneLaplandExercise1 = settings.getInt("doneLaplandExercise1", 0); // 0 = no (default), 1 = yes
        doneLaplandExercise2 = settings.getInt("doneLaplandExercise2", 0);
        doneLaplandExercise3 = settings.getInt("doneLaplandExercise3", 0);
        doneLaplandExercise4 = settings.getInt("doneLaplandExercise4", 0);
        doneOuluExercise1 = settings.getInt("doneOuluExercise1", 0);
        doneOuluExercise2 = settings.getInt("doneOuluExercise2", 0);
        doneOuluExercise3 = settings.getInt("doneOuluExercise3", 0);
        doneOuluExercise4 = settings.getInt("doneOuluExercise4", 0);
        doneVaasaExercise1 = settings.getInt("doneVaasaExercise1", 0);
        doneVaasaExercise2 = settings.getInt("doneVaasaExercise2", 0);
        doneVaasaExercise3 = settings.getInt("doneVaasaExercise3", 0);
        doneVaasaExercise4 = settings.getInt("doneVaasaExercise4", 0);
        doneSavonlinnaExercise1 = settings.getInt("doneSavonlinnaExercise1", 0);
        doneSavonlinnaExercise2 = settings.getInt("doneSavonlinnaExercise2", 0);
        doneSavonlinnaExercise3 = settings.getInt("doneSavonlinnaExercise3", 0);
        doneSavonlinnaExercise4 = settings.getInt("doneSavonlinnaExercise4", 0);
        doneVantaaExercise1 = settings.getInt("doneVantaaExercise1", 0);
        doneVantaaExercise2 = settings.getInt("doneVantaaExercise2", 0);
        doneVantaaExercise3 = settings.getInt("doneVantaaExercise3", 0);
        doneVantaaExercise4 = settings.getInt("doneVantaaExercise4", 0);
        doneTurkuExercise1 = settings.getInt("doneTurkuExercise1", 0);
        doneTurkuExercise2 = settings.getInt("doneTurkuExercise2", 0);
        doneTurkuExercise3 = settings.getInt("doneTurkuExercise3", 0);
        doneTurkuExercise4 = settings.getInt("doneTurkuExercise4", 0);

        final Button rovaniemiButton = (Button) findViewById(R.id.rovaniemiButton);
        final Button ouluButton = (Button) findViewById(R.id.ouluButton);
        final Button vaasaButton = (Button) findViewById(R.id.vaasaButton);
        final Button turkuButton = (Button) findViewById(R.id.turkuButton);
        final Button vantaaButton = (Button) findViewById(R.id.vantaaButton);
        TextView mapExerciseText = (TextView) findViewById(R.id.map_exercise_text);

        mapExerciseText.setText(R.string.map_layout_rovaniemi_text);

        if (lapinTehtavatTehty()) {
            mapExerciseText.setText(R.string.map_layout_oulu_text);
        } else if (oulunTehtavatTehty()) {
            mapExerciseText.setText("Oulu on nyt pelattu. Valitse seuraavaksi Vaasa.");
        } else if (vaasanTehtavatTehty()) {
            mapExerciseText.setText("Vaasa on nyt pelattu. Valitse seuraavaksi Savonlinna.");
        } else if (savonlinnanTehtavatTehty()) {
            mapExerciseText.setText("Savonlinna on nyt pelattu. Valitse seuraavaksi Turku.");
        } else if (turunTehtavatTehty()) {
            mapExerciseText.setText("Viimeistä viedään! Turku on nyt pelattu. Valitse viimeisenä Vantaa.");
        } else if (vantaanTehtavatTehty()) {
            mapExerciseText.setText("Sinä teit sen, pelasit pelin läpi! Hyvä!");
        }

        rovaniemiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (lapinTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again");
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

                if (lapinTehtavatTehty()) {
                    DialogFragment fragment = new Map2ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "passed");
                } else {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
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

    private boolean lapinTehtavatTehty() { // 0 = no (default), 1 = yes
        return doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
                && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1;
    }

    private boolean oulunTehtavatTehty() {
        return doneOuluExercise1 == 1 && doneOuluExercise2 == 1
                && doneOuluExercise3 == 1 && doneOuluExercise4 == 1;
    }

    private boolean vaasanTehtavatTehty() {
        return doneVaasaExercise1 == 1 && doneVaasaExercise2 == 1
                && doneVaasaExercise3 == 1 && doneVaasaExercise4 == 1;
    }

    private boolean savonlinnanTehtavatTehty() {
        return doneSavonlinnaExercise1 == 1 && doneSavonlinnaExercise2 == 1
                && doneSavonlinnaExercise3 == 1 && doneSavonlinnaExercise4 == 1;
    }

    private boolean vantaanTehtavatTehty() {
        return doneVantaaExercise1 == 1 && doneVantaaExercise2 == 1
                && doneVantaaExercise3 == 1 && doneVantaaExercise4 == 1;
    }

    private boolean turunTehtavatTehty() {
        return doneTurkuExercise1 == 1 && doneTurkuExercise2 == 1
                && doneTurkuExercise3 == 1 && doneTurkuExercise4 == 1;
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
