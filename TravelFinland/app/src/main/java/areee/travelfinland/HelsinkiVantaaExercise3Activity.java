package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HelsinkiVantaaExercise3Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    private boolean clickedAdjectiveButton1 = false;
    private boolean clickedAdjectiveButton2 = false;
    private boolean clickedAdjectiveButton3 = false;
    private boolean clickedAdjectiveButton4 = false;
    private boolean clickedAdjectiveButton5 = false;
    private boolean clickedAdjectiveButton6 = false;
    private boolean clickedAdjectiveButton7 = false;
    private boolean clickedAdjectiveButton8 = false;
    private boolean clickedAdjectiveButton9 = false;
    private boolean clickedAdjectiveButton10 = false;
    private boolean clickedAdjectiveButton11 = false;
    private boolean clickedAdjectiveButton12 = false;
    private int foundAdjective = 0;
    private TextView adjective_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.helsinki_vantaa_exercise_3_layout);

        Intent activityThatCalled = getIntent();

        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new HelsinkiVantaaExercise3InformationDialog();
                fragment.show(getFragmentManager(), "helsinki_vantaaa_exercise_3_info");
            }
        });

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final Button verbButton1 = (Button) findViewById(R.id.verb_button1);
        final Button verbButton2 = (Button) findViewById(R.id.verb_button2);
        final Button verbButton3 = (Button) findViewById(R.id.verb_button3);
        final Button verbButton4 = (Button) findViewById(R.id.body_verb_button1);
        final Button verbButton5 = (Button) findViewById(R.id.body_verb_button2);
        final Button verbButton6 = (Button) findViewById(R.id.body_verb_button3);
        final Button verbButton7 = (Button) findViewById(R.id.body_verb_button4);
        final Button verbButton8 = (Button) findViewById(R.id.body_verb_button5);
        final Button verbButton9 = (Button) findViewById(R.id.body_verb_button6);
        final Button verbButton10 = (Button) findViewById(R.id.body_verb_button7);
        final Button verbButton11 = (Button) findViewById(R.id.body_verb_button8);
        final Button verbButton12 = (Button) findViewById(R.id.body_verb_button9);
        adjective_number = (TextView) findViewById(R.id.verben_number);

        adjective_number.setText("" + foundAdjective);

        verbButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton1) {
                    verbButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton1 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton2) {
                    verbButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton2 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton3) {
                    verbButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton3 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton4) {
                    verbButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton4 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton5) {
                    verbButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton5 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton6) {
                    verbButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton6 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton7) {
                    verbButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton7 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton8) {
                    verbButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton8 = true;
                    foundAdjective++;
                }

            }
        });

        verbButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton9) {
                    verbButton9.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton9 = true;
                    foundAdjective++;
                }
            }
        });

        verbButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton10) {
                    verbButton10.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton10 = true;
                    foundAdjective++;
                }
            }
        });

        verbButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton11) {
                    verbButton11.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton11 = true;
                    foundAdjective++;
                }
            }
        });

        verbButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton12) {
                    verbButton12.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton12 = true;
                    foundAdjective++;
                }
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

                if (onkoKaikkiKlikattu()) {
                    // pass:
                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt("doneVaasaExercise4", 1);
                    editor.commit();
                    DialogFragment fragment = new ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "vaasa_passed");
                } else {
                    // fail:
                    DialogFragment fragment2 = new ExerciseFailedDialog();
                    fragment2.show(getFragmentManager(), "failed");
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        adjective_number.setText("" + foundAdjective);

    }

    //    private boolean sisaltaaTekstia(EditText editText) {
//        String syotettyTeksti = editText.getText().toString();
//        return !syotettyTeksti.isEmpty();
//    }

//    private boolean onKolmeLausetta(EditText editText) {
//
//        String syotettyTeksti = editText.getText().toString();
//        int maara = 0;
//
//        for (int i = 0; i < syotettyTeksti.length(); i++) {
//            char kirjain = syotettyTeksti.charAt(i);
//
//            if ((kirjain == '.' || kirjain == '?' || kirjain == '!') && i + 1 < syotettyTeksti.length()) {
//
//                if (syotettyTeksti.charAt(i + 1) == ' ' || syotettyTeksti.charAt(i + 1) == '\n') {
//                    maara++;
//                }
//            }
//        }
//        return maara >= 3;
//    }

//    private boolean onRivinvaihtoja(EditText editText) {
//        String syotettyTeksti = editText.getText().toString();
//        int maara = 0;
//
//        for (int i = 0; i < syotettyTeksti.length(); i++) {
//            char kirjain = syotettyTeksti.charAt(i);
//
//            if (kirjain == '\n') {
//                maara++;
//            }
//        }
//        return maara >= 2;
//    }


    private boolean onkoKaikkiKlikattu() {

        if (clickedAdjectiveButton1 && clickedAdjectiveButton2 && clickedAdjectiveButton3 && clickedAdjectiveButton4 && clickedAdjectiveButton5
                && clickedAdjectiveButton6 && clickedAdjectiveButton7 && clickedAdjectiveButton8 && clickedAdjectiveButton9 && clickedAdjectiveButton10
                && clickedAdjectiveButton11 && clickedAdjectiveButton12) {
            return true;
        }
        return false;
    }
}
