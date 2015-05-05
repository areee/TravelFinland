package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LaplandExercise1Activity extends Activity {

    private EditText editText;
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_exercise_layout);

//        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//        doneLaplandExercises = settings.getInt("doneLaplandExercises", 0); // tallennukseen liittyvää, tässä tarpeettomia?

        final Intent activityThatCalled = getIntent();

        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);
        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        editText = (EditText) findViewById(R.id.exercise_edit_text);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new LaplandExercise1InformationDialog();
                fragment.show(getFragmentManager(), "info");
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lista: muistiinpanot 1) allekkain, 2) lyhyitä, 3) ei saa päättyä pisteeseen
                // + 4) ei tyhjä!

                if (sisaltaaTekstia()) {

                    if (eiPisteita() && onRivinvaihtoja() && ovatLyhyita()) {

                        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                        SharedPreferences.Editor editor = settings.edit();
                        editor.putInt("doneLaplandExercise1", 1);
                        editor.commit();

                        DialogFragment fragment = new ExercisePassedDialog();
                        fragment.show(getFragmentManager(), "lapland_passed");
                    } else {

                        DialogFragment fragment = new ExerciseFailedDialog();
                        fragment.show(getFragmentManager(), "failed");
                    }
                } else {

                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                }
            }
        });
    }

    private boolean eiPisteita() {
        String syotettyTeksti = editText.getText().toString();

        return !syotettyTeksti.contains(".");
    }

    private boolean onRivinvaihtoja() {
        String syotettyTeksti = editText.getText().toString();
        int maara = 0;

        for (int i = 0; i < syotettyTeksti.length(); i++) {
            char kirjain = syotettyTeksti.charAt(i);

            if (kirjain == '\n') {
                maara++;
            }
        }
        return maara >= 2;
    }

    private boolean ovatLyhyita() {
        String syotettyTeksti = editText.getText().toString();

        for (String sana : syotettyTeksti.split("\n")) {
            if (sana.length() > 20) {
                return false;
            }
        }
//        String[] sanat = syotettyTeksti.split("\n");
//
//        for (int i = 0; i < sanat.length; i++) {
//            String sana = sanat[i];
//
//            if (sana.length() > 20) {
//                return false;
//            }
//        }
        return true;
    }

    private boolean sisaltaaTekstia() {
        String syotettyTeksti = editText.getText().toString();

        return !syotettyTeksti.isEmpty();
    }


}
