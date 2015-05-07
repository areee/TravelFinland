package areee.travelfinland;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BonusExerciseActivity1 extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences settings;
    public String fornamn;
    public String efternamn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonus_exercise_1_layout);

//        View view = findViewById(R.id.multiple_choice_exercise_5_layout);
//        View root = view.getRootView();
//        root.setBackground(getResources().getDrawable(R.drawable.midsummer_in_lapland));

        Intent activityThatCalled = getIntent();

        final Button cancelButton = (Button) findViewById(R.id.cancel_button);
        final Button camera_button = (Button) findViewById(R.id.camera_button);
        final EditText fornamnEditText = (EditText) findViewById(R.id.fornamn);
        final EditText efternamnEditText = (EditText) findViewById(R.id.efternamn);

        settings = getSharedPreferences(PREFS_NAME, 0);
        fornamn = settings.getString("fornamn", null);
        efternamn = settings.getString("efternamn", null);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("fornamn", fornamnEditText.getText().toString());
                editor.putString("efternamn", efternamnEditText.getText().toString());
                editor.commit();

                Intent intent = new Intent(getApplicationContext(), BonusExerciseActivity2.class);
                startActivity(intent);

                // tänne sisältöä!
//                dispatchTakePictureIntent();

            }
        });
    }

//    static final int REQUEST_IMAGE_CAPTURE = 1;
//
//    private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
//            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        }
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
//            Bitmap imageBitmap = (Bitmap) extras.get("data");
//            mImageView.setImageBitmap(imageBitmap);
//        }
//    }


}
