package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ExerciseActivity extends Activity {
    int contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(contentView);

        Intent activityThatCalled = getIntent();
    }

//    public void setView(int view) {
//
//        contentView = view;
//    }
}
