package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SavonlinnaExercise1Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    Activity parentActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.savonlinna_exercise1_layout);
        View view = findViewById(R.id.savonlinna_exercise1_layout);
        View root = view.getRootView();
        root.setBackground(getResources().getDrawable(R.drawable.numbers));

        final Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final EditText editText = (EditText) findViewById(R.id.users_answer);
        final TextView exerciseText = (TextView) findViewById(R.id.exercise_text);
        final TextView exercise_link = (TextView) findViewById(R.id.exercise_link);

        exerciseText.setText(R.string.savonlinna_exercise1_text);
        exercise_link.setText(R.string.savonlinna_exercise1_link);
        exercise_link.setMovementMethod(LinkMovementMethod.getInstance());


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("4.00") || editText.getText().toString().equals("4")) {
                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt("doneSavonlinnaExercise1", 1);
                    editor.commit();

                    DialogFragment fragment = new ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "savonlinna_passed");
                } else {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                }
            }
        });

    }


}
