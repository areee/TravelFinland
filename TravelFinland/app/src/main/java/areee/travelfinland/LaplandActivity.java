package areee.travelfinland;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaplandActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lapland_city_layout);

        Intent activityThatCalled = getIntent();

        final Button exerciseButton1 = (Button) findViewById(R.id.exerciseButton1);
        final Button exerciseButton2 = (Button) findViewById(R.id.exerciseButton2);
        final Button exerciseButton3 = (Button) findViewById(R.id.exerciseButton3);
        final Button exerciseButton4 = (Button) findViewById(R.id.exerciseButton4);

        exerciseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExerciseActivity exerciseActivity = new ExerciseActivity(R.layout.lapland_exercise1_layout);
//                exerciseActivity.setView(R.layout.lapland_exercise1_layout);

                Intent exercise1 = new Intent(getApplicationContext(), exerciseActivity.getClass());
                startActivity(exercise1);
            }
        });

        exerciseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExerciseActivity exerciseActivity = new ExerciseActivity(R.layout.lapland_exercise2_layout);
//                exerciseActivity.setView(R.layout.lapland_exercise2_layout);

                Intent exercise2 = new Intent(getApplicationContext(), exerciseActivity.getClass());
//                setContentView(R.layout.lapland_exercise2_layout);
                startActivity(exercise2);
            }
        });
    }
}
