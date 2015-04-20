package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class OuluExercise1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.oulu_exercise1_layout);

        Intent activityThatCalled = getIntent();
    }


}
