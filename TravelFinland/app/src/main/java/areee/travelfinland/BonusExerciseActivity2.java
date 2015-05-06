package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
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

        final Calendar c = Calendar.getInstance();
        int yy = c.get(Calendar.YEAR);
        int mm = c.get(Calendar.MONTH);
        int dd = c.get(Calendar.DAY_OF_MONTH);
        // set current date into textview
        date.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(dd).append(".").append(mm + 1).append(".")
                .append(yy));

//        selfiePhoto.

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tänne sisältöä!
                finish();
            }
        });
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            selfiePhoto.setImageBitmap(imageBitmap);
        }
    }


}