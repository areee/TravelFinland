package areee.travelfinland;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SavonlinnaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savonlinna_city_layout);

        Intent activityThatCalled = getIntent();

        final Button exerciseButton1 = (Button) findViewById(R.id.exerciseButton1);
        final Button exerciseButton2 = (Button) findViewById(R.id.exerciseButton2);
        final Button exerciseButton3 = (Button) findViewById(R.id.exerciseButton3);
        final Button exerciseButton4 = (Button) findViewById(R.id.exerciseButton4);
        final ImageButton infoButton = (ImageButton) findViewById(R.id.info_button);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment fragment = new SavonlinnaInformationDialog();
                fragment.show(getFragmentManager(), "savonlinna_info");
            }
        });

        exerciseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise1 = new Intent(getApplicationContext(), LaplandExercise1Activity.class);
                startActivity(exercise1);
            }
        });

        exerciseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise2 = new Intent(getApplicationContext(), LaplandExercise2Activity.class);
                startActivity(exercise2);
            }
        });

        exerciseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise3 = new Intent(getApplicationContext(), LaplandExercise3Activity.class);
                startActivity(exercise3);
            }
        });

        exerciseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent exercise4 = new Intent(getApplicationContext(), Exercise4Activity.class);
//                startActivity(exercise4);
                Intent exercise4 = new Intent(getApplicationContext(), LaplandExercise4Activity.class);
                startActivity(exercise4);
            }
        });

    }
}
