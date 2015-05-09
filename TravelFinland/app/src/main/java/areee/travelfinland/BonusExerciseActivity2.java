package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class BonusExerciseActivity2 extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences settings;
    public String fornamn;
    public String efternamn;
    public ImageView selfiePhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonus_exercise_2_layout);

//        View view = findViewById(R.id.multiple_choice_exercise_5_layout);
//        View root = view.getRootView();
//        root.setBackground(getResources().getDrawable(R.drawable.midsummer_in_lapland));

        Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button okButton = (Button) findViewById(R.id.ok_button);
        final Button takePhotoButton = (Button) findViewById(R.id.take_photo_button);
        final TextView fornamnTextView1 = (TextView) findViewById(R.id.fornamn1);
        final TextView efternamnTextView = (TextView) findViewById(R.id.efternamn);
        final TextView fornamnTextView2 = (TextView) findViewById(R.id.fornamn2);
        final TextView date = (TextView) findViewById(R.id.date);
        selfiePhoto = (ImageView) findViewById(R.id.selfie_photo);


        settings = getSharedPreferences(PREFS_NAME, 0);
        fornamn = settings.getString("fornamn", null);
        efternamn = settings.getString("efternamn", null);

        fornamnTextView1.setText(fornamn);
        efternamnTextView.setText(efternamn);
        fornamnTextView2.setText(fornamn);

        // päivämäärä:
        final Calendar c = Calendar.getInstance();
        int yy = c.get(Calendar.YEAR);
        int mm = c.get(Calendar.MONTH);
        int dd = c.get(Calendar.DAY_OF_MONTH);
        // set current date into textview
        date.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(dd).append(".").append(mm + 1).append(".")
                .append(yy));

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        takePhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tänne sisältöä!
            }
        });

    }
}