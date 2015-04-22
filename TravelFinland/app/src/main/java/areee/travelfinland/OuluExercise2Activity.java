package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class OuluExercise2Activity extends Activity {
    private EditText address1;
    private EditText address2;
    private EditText address3;
    private EditText address4;
    private EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.oulu_exercise2_layout);

        Intent activityThatCalled = getIntent();

        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new OuluExercise2InformationDialog();
                fragment.show(getFragmentManager(), "info");
            }
        });

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        address1 = (EditText) findViewById(R.id.address_edit_text1);
        address2 = (EditText) findViewById(R.id.address_edit_text2);
        address3 = (EditText) findViewById(R.id.address_edit_text3);
        address4 = (EditText) findViewById(R.id.address_edit_text4);
        message = (EditText) findViewById(R.id.postcard_message_edit_text);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kirje: 1) vähintään 3 lausetta, 2) vastaanottajan nimi ja osoite, 3) postinumero 5 numeroa (kotimaassa) (?)

                if (sisaltaaTekstia(address1) && sisaltaaTekstia(address2) &&
                        sisaltaaTekstia(address3) && sisaltaaTekstia(message)) {

                    if (onKolmeLausetta(message) && onRivinvaihtoja(message)) {

                        ExercisePassedDialog fragment = new ExercisePassedDialog();
                        fragment.show(getFragmentManager(), "passed");
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

    private boolean sisaltaaTekstia(EditText editText) {
        String syotettyTeksti = editText.getText().toString();
        return !syotettyTeksti.isEmpty();
    }

    private boolean onKolmeLausetta(EditText editText) {

        String syotettyTeksti = editText.getText().toString();
        int maara = 0;

        for (int i = 0; i < syotettyTeksti.length(); i++) {
            char kirjain = syotettyTeksti.charAt(i);

            if ((kirjain == '.' || kirjain == '?' || kirjain == '!') && i + 1 < syotettyTeksti.length()) {

                if (syotettyTeksti.charAt(i + 1) == ' ' || syotettyTeksti.charAt(i + 1) == '\n') {
                    maara++;
                }
            }
        }
        return maara >= 3;
    }

    private boolean onRivinvaihtoja(EditText editText) {
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
}
