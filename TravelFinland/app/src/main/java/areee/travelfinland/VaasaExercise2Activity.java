package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class VaasaExercise2Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.multiple_choice_exercise_4_layout);
        View view = findViewById(R.id.multiple_choice_exercise_4_layout);
        View root = view.getRootView();
        root.setBackground(getResources().getDrawable(R.drawable.vaasa_market_square));

        Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box4);

        checkBox1.setText(R.string.vaasa_exercise2_alternative1);
        checkBox2.setText(R.string.vaasa_exercise2_alternative2);
        checkBox3.setText(R.string.vaasa_exercise2_alternative3);
        checkBox4.setText(R.string.vaasa_exercise2_alternative4);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!checkBox1.isChecked() && checkBox3.isChecked() && checkBox2.isChecked() &&
                        checkBox4.isChecked()) {

                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt("doneVaasaExercise2", 1);
                    editor.commit();

                    DialogFragment fragment = new ExercisePassedDialog();
//                    fragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog);
                    fragment.show(getFragmentManager(), "vaasa_passed");

                } else {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                }
            }
        });
    }
}
