package areee.travelfinland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class RovaniemiActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lapland_city_layout);

        Intent activityThatCalled = getIntent();
    }
}
