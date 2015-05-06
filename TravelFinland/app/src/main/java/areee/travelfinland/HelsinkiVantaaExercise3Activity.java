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
    private boolean clickedText1 = false;
    private boolean clickedText2 = false;
    private boolean clickedText3 = false;
    private boolean clickedText4 = false;
    private boolean clickedText5 = false;
    private boolean clickedText6 = false;
    private boolean clickedText7 = false;
    private boolean clickedText8 = false;
    private boolean clickedText9 = false;
    private boolean clickedText10 = false;
    private boolean clickedText11 = false;
    private boolean clickedText12 = false;
    private boolean clickedText13 = false;
    private boolean clickedText14 = false;
    private boolean clickedText15 = false;
    private boolean clickedText16 = false;
    private boolean clickedText17 = false;
    private boolean clickedText18 = false;
    private boolean clickedText19 = false;
    private boolean clickedText20 = false;
    private boolean clickedText21 = false;
    private boolean clickedText22 = false;
    private boolean clickedText23 = false;
    private boolean clickedText24 = false;
    private boolean clickedText25 = false;
    private boolean clickedText26 = false;
    private boolean clickedText27 = false;
    private boolean clickedText28 = false;
    private boolean clickedText29 = false;
    private boolean clickedText30 = false;
    private boolean clickedText31 = false;
    private boolean clickedText32 = false;
    private boolean clickedText33 = false;
    private boolean clickedText34 = false;
    private boolean clickedText35 = false;
    private boolean clickedText36 = false;
    private boolean clickedText37 = false;
    private boolean clickedText38 = false;
    private boolean clickedText39 = false;
    private boolean clickedText40 = false;
    private boolean clickedText41 = false;
    private boolean clickedText42 = false;
    private boolean clickedText43 = false;
    private boolean clickedText44 = false;
    private boolean clickedText45 = false;
    private boolean clickedText46 = false;
    private boolean clickedText47 = false;
    private boolean clickedText48 = false;
    private boolean clickedText49 = false;
    private boolean clickedText50 = false;
    private boolean clickedText51 = false;
    private boolean clickedText52 = false;
    private boolean clickedText53 = false;
    private boolean clickedText54 = false;
    private boolean clickedText55 = false;
    private boolean clickedText56 = false;
    private boolean clickedText57 = false;
    private int foundAdjective = 0;
    private TextView adjectivesNumber;
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.helsinki_vantaa_exercise_3_layout);

        Intent activityThatCalled = getIntent();

        settings = getSharedPreferences(PREFS_NAME, 0);
        editor = settings.edit();

        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new HelsinkiVantaaExercise3InformationDialog();
                fragment.show(getFragmentManager(), "helsinki_vantaa_exercise_3_info");
            }
        });

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);

        final Button adjectiveButton1 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv1);
        final Button adjectiveButton2 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv2);
        final Button adjectiveButton3 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv3);
        final Button adjectiveButton4 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv4);
        final Button adjectiveButton5 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv5);
        final Button adjectiveButton6 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv6);
        final Button adjectiveButton7 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv7);
        final Button adjectiveButton8 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv8);
        final Button adjectiveButton9 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv9);
        final Button adjectiveButton10 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv10);
        final Button adjectiveButton11 = (Button) findViewById(R.id.helsinki_exercise3_adjektiv11);
        final Button text1 = (Button) findViewById(R.id.helsinki_exercise3_text1);
        final Button text2 = (Button) findViewById(R.id.helsinki_exercise3_text2);
        final Button text3 = (Button) findViewById(R.id.helsinki_exercise3_text3);
        final Button text4 = (Button) findViewById(R.id.helsinki_exercise3_text4);
        final Button text5 = (Button) findViewById(R.id.helsinki_exercise3_text5);
        final Button text6 = (Button) findViewById(R.id.helsinki_exercise3_text6);
        final Button text7 = (Button) findViewById(R.id.helsinki_exercise3_text7);
        final Button text8 = (Button) findViewById(R.id.helsinki_exercise3_text8);
        final Button text9 = (Button) findViewById(R.id.helsinki_exercise3_text9);
        final Button text10 = (Button) findViewById(R.id.helsinki_exercise3_text10);
        final Button text11 = (Button) findViewById(R.id.helsinki_exercise3_text11);
        final Button text12 = (Button) findViewById(R.id.helsinki_exercise3_text12);
        final Button text13 = (Button) findViewById(R.id.helsinki_exercise3_text13);
        final Button text14 = (Button) findViewById(R.id.helsinki_exercise3_text14);
        final Button text15 = (Button) findViewById(R.id.helsinki_exercise3_text15);
        final Button text16 = (Button) findViewById(R.id.helsinki_exercise3_text16);
        final Button text17 = (Button) findViewById(R.id.helsinki_exercise3_text17);
        final Button text18 = (Button) findViewById(R.id.helsinki_exercise3_text18);
        final Button text19 = (Button) findViewById(R.id.helsinki_exercise3_text19);
        final Button text20 = (Button) findViewById(R.id.helsinki_exercise3_text20);
        final Button text21 = (Button) findViewById(R.id.helsinki_exercise3_text21);
        final Button text22 = (Button) findViewById(R.id.helsinki_exercise3_text22);
        final Button text23 = (Button) findViewById(R.id.helsinki_exercise3_text23);
        final Button text24 = (Button) findViewById(R.id.helsinki_exercise3_text24);
        final Button text25 = (Button) findViewById(R.id.helsinki_exercise3_text25);
        final Button text26 = (Button) findViewById(R.id.helsinki_exercise3_text26);
        final Button text27 = (Button) findViewById(R.id.helsinki_exercise3_text27);
        final Button text28 = (Button) findViewById(R.id.helsinki_exercise3_text28);
        final Button text29 = (Button) findViewById(R.id.helsinki_exercise3_text29);
        final Button text30 = (Button) findViewById(R.id.helsinki_exercise3_text30);
        final Button text31 = (Button) findViewById(R.id.helsinki_exercise3_text31);
        final Button text32 = (Button) findViewById(R.id.helsinki_exercise3_text32);
        final Button text33 = (Button) findViewById(R.id.helsinki_exercise3_text33);
        final Button text34 = (Button) findViewById(R.id.helsinki_exercise3_text34);
        final Button text35 = (Button) findViewById(R.id.helsinki_exercise3_text35);
        final Button text36 = (Button) findViewById(R.id.helsinki_exercise3_text36);
        final Button text37 = (Button) findViewById(R.id.helsinki_exercise3_text37);
        final Button text38 = (Button) findViewById(R.id.helsinki_exercise3_text38);
        final Button text39 = (Button) findViewById(R.id.helsinki_exercise3_text39);
        final Button text40 = (Button) findViewById(R.id.helsinki_exercise3_text40);
        final Button text41 = (Button) findViewById(R.id.helsinki_exercise3_text41);
        final Button text42 = (Button) findViewById(R.id.helsinki_exercise3_text42);
        final Button text43 = (Button) findViewById(R.id.helsinki_exercise3_text43);
        final Button text44 = (Button) findViewById(R.id.helsinki_exercise3_text44);
        final Button text45 = (Button) findViewById(R.id.helsinki_exercise3_text45);
        final Button text46 = (Button) findViewById(R.id.helsinki_exercise3_text46);
        final Button text47 = (Button) findViewById(R.id.helsinki_exercise3_text47);
        final Button text48 = (Button) findViewById(R.id.helsinki_exercise3_text48);
        final Button text49 = (Button) findViewById(R.id.helsinki_exercise3_text49);
        final Button text50 = (Button) findViewById(R.id.helsinki_exercise3_text50);
        final Button text51 = (Button) findViewById(R.id.helsinki_exercise3_text51);
        final Button text52 = (Button) findViewById(R.id.helsinki_exercise3_text52);
        final Button text53 = (Button) findViewById(R.id.helsinki_exercise3_text53);
        final Button text54 = (Button) findViewById(R.id.helsinki_exercise3_text54);
        final Button text55 = (Button) findViewById(R.id.helsinki_exercise3_text55);
        final Button text56 = (Button) findViewById(R.id.helsinki_exercise3_text56);
        final Button text57 = (Button) findViewById(R.id.helsinki_exercise3_text57);

        adjectivesNumber = (TextView) findViewById(R.id.adjectives_number);

        adjectivesNumber.setText("" + foundAdjective);

        adjectiveButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton1) {
                    adjectiveButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton1 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton1 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton2) {
                    adjectiveButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton2 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton2.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton2 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton3) {
                    adjectiveButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton3 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton3.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton3 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton4) {
                    adjectiveButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton4 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton4.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton4 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton5) {
                    adjectiveButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton5 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton5.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton5 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton6) {
                    adjectiveButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton6 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton6.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton6 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton7) {
                    adjectiveButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton7 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton7.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton7 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton8) {
                    adjectiveButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton8 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton8.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton8 = false;
                    foundAdjective--;
                }

            }
        });

        adjectiveButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton9) {
                    adjectiveButton9.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton9 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton9.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton9 = false;
                    foundAdjective--;
                }
            }
        });

        adjectiveButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton10) {
                    adjectiveButton10.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton10 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton10.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton10 = false;
                    foundAdjective--;
                }
            }
        });

        adjectiveButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickedAdjectiveButton11) {
                    adjectiveButton11.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    clickedAdjectiveButton11 = true;
                    foundAdjective++;
                } else {
                    adjectiveButton11.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    clickedAdjectiveButton11 = false;
                    foundAdjective--;
                }
            }
        });

//        text1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!clickedText1) {
//                    text1.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
//                    clickedText1 = true;
//                    foundAdjective++;
//                } else {
//                    text1.setBackgroundColor(getResources().getColor(android.R.color.transparent));
//                    clickedText1 = false;
//                    foundAdjective--;
//                }
//            }
//        });

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
                    editor.putInt("doneHelsinkiVantaaExercise3", 1);
                    editor.commit();
                    DialogFragment fragment = new ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "helsinki_vantaa_passed");
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
        adjectivesNumber.setText("" + foundAdjective);

    }

    private boolean onkoKaikkiKlikattu() {

        if (clickedAdjectiveButton1 && clickedAdjectiveButton2 && clickedAdjectiveButton3 && clickedAdjectiveButton4 && clickedAdjectiveButton5
                && clickedAdjectiveButton6 && clickedAdjectiveButton7 && clickedAdjectiveButton8 && clickedAdjectiveButton9 && clickedAdjectiveButton10
                && clickedAdjectiveButton11) {
            return true;
        }
        return false;
    }
}
