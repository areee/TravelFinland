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

public class VaasaExercise4Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    private boolean clickedVerbButton1 = false;
    private boolean clickedVerbButton2 = false;
    private boolean clickedVerbButton3 = false;
    private boolean clickedVerbButton4 = false;
    private boolean clickedVerbButton5 = false;
    private boolean clickedVerbButton6 = false;
    private boolean clickedVerbButton7 = false;
    private boolean clickedVerbButton8 = false;
    private boolean clickedVerbButton9 = false;
    private boolean clickedVerbButton10 = false;
    private boolean clickedVerbButton11 = false;
    private boolean clickedVerbButton12 = false;
    private int foundVerb = 0;
    private TextView verben_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.open_text_exercise_layout);

        Intent activityThatCalled = getIntent();

        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new VaasaExercise4InformationDialog();
                fragment.show(getFragmentManager(), "vaasa_exercise_4_info");
            }
        });

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final Button verbButton1 = (Button) findViewById(R.id.adjective_button1);
        final Button verbButton2 = (Button) findViewById(R.id.verb_button2);
        final Button verbButton3 = (Button) findViewById(R.id.verb_button3);
        final Button verbButton4 = (Button) findViewById(R.id.adjective_button1);
        final Button verbButton5 = (Button) findViewById(R.id.text3);
        final Button verbButton6 = (Button) findViewById(R.id.adjective_button2);
        final Button verbButton7 = (Button) findViewById(R.id.body_verb_button4);
        final Button verbButton8 = (Button) findViewById(R.id.adjective_button3);
        final Button verbButton9 = (Button) findViewById(R.id.adjective_button4);
        final Button verbButton10 = (Button) findViewById(R.id.text8);
        final Button verbButton11 = (Button) findViewById(R.id.adjective_button5);
        final Button verbButton12 = (Button) findViewById(R.id.adjective_button6);
        verben_number = (TextView) findViewById(R.id.adjektiven_number);

        verben_number.setText("" + foundVerb);

        verbButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton1) {
                    verbButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton1 = true;
                    foundVerb++;
                }

            }
        });

        verbButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton2) {
                    verbButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton2 = true;
                    foundVerb++;
                }

            }
        });

        verbButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton3) {
                    verbButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton3 = true;
                    foundVerb++;
                }

            }
        });

        verbButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton4) {
                    verbButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton4 = true;
                    foundVerb++;
                }

            }
        });

        verbButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton5) {
                    verbButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton5 = true;
                    foundVerb++;
                }

            }
        });

        verbButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton6) {
                    verbButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton6 = true;
                    foundVerb++;
                }

            }
        });

        verbButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton7) {
                    verbButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton7 = true;
                    foundVerb++;
                }

            }
        });

        verbButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton8) {
                    verbButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton8 = true;
                    foundVerb++;
                }

            }
        });

        verbButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton9) {
                    verbButton9.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton9 = true;
                    foundVerb++;
                }
            }
        });

        verbButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton10) {
                    verbButton10.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton10 = true;
                    foundVerb++;
                }
            }
        });

        verbButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton11) {
                    verbButton11.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton11 = true;
                    foundVerb++;
                }
            }
        });

        verbButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedVerbButton12) {
                    verbButton12.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedVerbButton12 = true;
                    foundVerb++;
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
        verben_number.setText("" + foundVerb);

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

        if (clickedVerbButton1 && clickedVerbButton2 && clickedVerbButton3 && clickedVerbButton4 && clickedVerbButton5
                && clickedVerbButton6 && clickedVerbButton7 && clickedVerbButton8 && clickedVerbButton9 && clickedVerbButton10
                && clickedVerbButton11 && clickedVerbButton12) {
            return true;
        }
        return false;
    }
}
