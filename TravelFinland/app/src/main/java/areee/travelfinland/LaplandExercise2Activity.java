package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class LaplandExercise2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lapland_exercise2_layout);

        Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.check_box1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_box2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.check_box3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.check_box4);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked() && checkBox3.isChecked() && !checkBox2.isChecked() &&
                        !checkBox4.isChecked()) {
                    ExercisePassedDialog fragment = new ExercisePassedDialog();
//                    fragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.MyDialog);
                    fragment.show(getFragmentManager(), "passed");

                } else {
                    DialogFragment fragment = new ExerciseFailedDialog();
                    fragment.show(getFragmentManager(), "failed");
                }
            }
        });
    }
}
