package areee.travelfinland;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    //ActionBarActivity
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
    public int doneHelsinkiVantaaExercise1;
    public int doneHelsinkiVantaaExercise2;
    public int doneHelsinkiVantaaExercise3;
    public int doneHelsinkiVantaaExercise4;

    private Button rovaniemiButton;
    private Button ouluButton;
    private Button vaasaButton;
    private Button helsinkiVantaaButton;
    private Button savonlinnaButton;
    private TextView mapExerciseText;

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
        doneHelsinkiVantaaExercise1 = settings.getInt("doneHelsinkiVantaaExercise1", 0);
        doneHelsinkiVantaaExercise2 = settings.getInt("doneHelsinkiVantaaExercise2", 0);
        doneHelsinkiVantaaExercise3 = settings.getInt("doneHelsinkiVantaaExercise3", 0);
        doneHelsinkiVantaaExercise4 = settings.getInt("doneHelsinkiVantaaExercise4", 0);

        rovaniemiButton = (Button) findViewById(R.id.rovaniemiButton);
        ouluButton = (Button) findViewById(R.id.ouluButton);
        vaasaButton = (Button) findViewById(R.id.vaasaButton);
        helsinkiVantaaButton = (Button) findViewById(R.id.helsinkiVantaaButton);
        savonlinnaButton = (Button) findViewById(R.id.savonlinnaButton);
        mapExerciseText = (TextView) findViewById(R.id.map_exercise_text);

        rovaniemiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jos lappi on jo suoritettu:
                if (lapinTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again_lapland");
                }
                // lappia ei ole vielä suoritettu -> pelin alku:
                else {
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
                // lappi suoritettu, muttei vielä oulua:
                if (lapinTehtavatTehty() && !oulunTehtavatTehty()) {
                    DialogFragment fragment = new Map2ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "passed");
                }
                // jos oulu jo on suoritettu:
                else if (oulunTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again_oulu");
                }
                // muut tapaukset (esim. tapaus pelin alku: oulu eikä lappi ole suoritettu):
                else {
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
                // jos aiemmat paitsi nykyinen on suoritettu:
                if (lapinTehtavatTehty() && oulunTehtavatTehty() && !vaasanTehtavatTehty()) {

                }
                // jos nykyinen on suoritettu:
                else if (vaasanTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again_vaasa");
                }
                // muut tapaukset (esim. tapaus pelin alku):
                else {

                }

                //ei vielä saatavilla -toiminto:
//                featureNotAvailable();
            }
        });

        savonlinnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // jos aiemmat paitsi nykyinen on suoritettu:
                if (lapinTehtavatTehty() && oulunTehtavatTehty() && vaasanTehtavatTehty()
                        && !savonlinnanTehtavatTehty()) {

                }
                // jos nykyinen on suoritettu:
                else if (savonlinnanTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again_savonlinna");
                }
                // muut tapaukset (esim. tapaus pelin alku):
                else {

                }

                //ei vielä saatavilla:
//                featureNotAvailable();
            }
        });

        helsinkiVantaaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // jos aiemmat paitsi nykyinen on suoritettu:
                if (lapinTehtavatTehty() && oulunTehtavatTehty() && vaasanTehtavatTehty()
                        && savonlinnanTehtavatTehty() && !helsinkiVantaanTehtavatTehty()) {

                }
                // jos nykyinen on suoritettu:
                else if (helsinkiVantaanTehtavatTehty()) {
                    DialogFragment fragment = new YouHavePlayedThisInformationDialog();
                    fragment.show(getFragmentManager(), "play_again_vantaa");
                }
                // muut tapaukset (esim. tapaus pelin alku):
                else {

                }

                //ei vielä saatavilla:
//                featureNotAvailable();

            }
        });
    }

    private void featureNotAvailable() {
        //ei vielä saatavilla:
        DialogFragment fragment = new FeatureNotAvailableDialog();
        fragment.show(getFragmentManager(), "feature_not_available");
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

    private boolean helsinkiVantaanTehtavatTehty() {
        return doneHelsinkiVantaaExercise1 == 1 && doneHelsinkiVantaaExercise2 == 1
                && doneHelsinkiVantaaExercise3 == 1 && doneHelsinkiVantaaExercise4 == 1;
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
        if (id == R.id.action_about) {
            DialogFragment fragment = new AboutDialog();
            fragment.show(getFragmentManager(), "about_dialog");
            return true;
        } else if (id == R.id.action_report) {
            return true;
        } else if (id == R.id.action_insert_code) {
            DialogFragment fragment = new InsertCodeDialog();
            fragment.show(getFragmentManager(), "insert_code_dialog");
            return true;
        } else if (id == R.id.action_reset) {
            DialogFragment fragment = new ResetAppDialog();
            fragment.show(getFragmentManager(), "reset_dialog");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapExerciseText.setText(R.string.map_layout_rovaniemi_text);
        if (lapinTehtavatTehty()) {
            mapExerciseText.setText(R.string.map_layout_oulu_text);
            rovaniemiButton.setText(R.string.rovaniemi_city_name);
        } else if (oulunTehtavatTehty()) {
            mapExerciseText.setText(R.string.map_layout_vaasa);
            rovaniemiButton.setText(R.string.oulu_city_name);
        } else if (vaasanTehtavatTehty()) {
            mapExerciseText.setText(R.string.map_layout_savonlinna);
            rovaniemiButton.setText(R.string.vaasa_city_name);
        } else if (savonlinnanTehtavatTehty()) {
            mapExerciseText.setText(R.string.map_layout_helsinki_vantaa);
            rovaniemiButton.setText(R.string.savonlinna_city_name);
        } else if (helsinkiVantaanTehtavatTehty()) {
            mapExerciseText.setText("Du gjorde det, du spelade spelet till punkt! Utmärkt!");
            rovaniemiButton.setText(R.string.helsinki_vantaa_city_name);
        }
    }
}
