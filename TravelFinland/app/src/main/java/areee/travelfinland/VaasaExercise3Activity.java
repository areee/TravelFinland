package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VaasaExercise3Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    Activity parentActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mathematics_exercise_layout);
        View view = findViewById(R.id.mathematics_exercise_layout);
        View root = view.getRootView();
        root.setBackground(getResources().getDrawable(R.drawable.numbers));

        final Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final EditText editText = (EditText) findViewById(R.id.users_answer);
        final TextView exerciseText = (TextView) findViewById(R.id.exercise_text);

        exerciseText.setText(R.string.vaasa_exercise3_text);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("6")) {
                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt("doneVaasaExercise3", 1);
                    editor.commit();

                    DialogFragment fragment = new ExercisePassedDialog();
                    fragment.show(getFragmentManager(), "vaasa_passed");
                } else {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                }
            }
        });

    }


}
