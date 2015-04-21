package areee.travelfinland;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OuluActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oulu_city_layout);

        Intent activityThatCalled = getIntent();

        final Button exerciseButton1 = (Button) findViewById(R.id.exerciseButton1);
        final Button exerciseButton2 = (Button) findViewById(R.id.exerciseButton2);
        final Button exerciseButton3 = (Button) findViewById(R.id.exerciseButton3);
        final Button exerciseButton4 = (Button) findViewById(R.id.exerciseButton4);

        exerciseButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise1 = new Intent(getApplicationContext(), OuluExercise1Activity.class);
                startActivity(exercise1);
            }
        });

        exerciseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise2 = new Intent(getApplicationContext(), OuluExercise2Activity.class);
                startActivity(exercise2);
            }
        });

        exerciseButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise3 = new Intent(getApplicationContext(), OuluExercise3Activity.class);
                startActivity(exercise3);
            }
        });

        exerciseButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise4 = new Intent(getApplicationContext(), OuluExercise4Activity.class);
                startActivity(exercise4);
            }
        });
    }
}
