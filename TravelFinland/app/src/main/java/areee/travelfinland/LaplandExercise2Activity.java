package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LaplandExercise2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lapland_exercise2_layout);

        Intent activityThatCalled = getIntent();
    }


}
