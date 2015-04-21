package areee.travelfinland;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OuluExercise4Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.oulu_exercise4_layout);

        Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button checkButton = (Button) findViewById(R.id.check_button);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new ExerciseFailedDialog();
                fragment.show(getFragmentManager(), "failed");
            }
        });
    }


}
