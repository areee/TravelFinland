package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;

public class InsertCodeDialog extends DialogFragment {
//    public static final String PREFS_NAME = "MyPrefsFile";
//    public int doneLaplandExercise1;
//    public int doneLaplandExercise2;
//    public int doneLaplandExercise3;
//    public int doneLaplandExercise4;
//    public int doneOuluExercise1;
//    public int doneOuluExercise2;
//    public int doneOuluExercise3;
//    public int doneOuluExercise4;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setStyle(DialogFragment.STYLE_NO_TITLE,R.style.MyDialog);
//    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        Window window = getDialog().getWindow();
//        window.setBackgroundDrawableResource(android.R.color.transparent);
//    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//        SharedPreferences settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
//        doneLaplandExercise1 = settings.getInt("doneLaplandExercise1", 0);
//        doneLaplandExercise2 = settings.getInt("doneLaplandExercise2", 0);
//        doneLaplandExercise3 = settings.getInt("doneLaplandExercise3", 0);
//        doneLaplandExercise4 = settings.getInt("doneLaplandExercise4", 0);
//        doneOuluExercise1 = settings.getInt("doneOuluExercise1", 0);
//        doneOuluExercise2 = settings.getInt("doneOuluExercise2", 0);
//        doneOuluExercise3 = settings.getInt("doneOuluExercise3", 0);
//        doneOuluExercise4 = settings.getInt("doneOuluExercise4", 0);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.insert_code_dialog_layout, null));

//        builder.setMessage(R.string.right_answer_text);

        builder.setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                EditText codeText = (EditText) getActivity().findViewById(R.id.code_text);
                String code = codeText.toString();

                TextView result_text = (TextView) getActivity().findViewById(R.id.result_text);

                if (code.equals("asdf")) {

                    result_text.setText("Rätt!");

                } else {
                    result_text.setText("Fel!");
                }

//                if (lapinTehtavatTehty()) {
//                    Intent lapland = new Intent(getActivity(), MainActivity.class);
//                    startActivity(lapland);
//                } else {
//                    getActivity().finish();
//                }

//                getActivity().finish();
//                dialog.dismiss();
//                ((Activity) context).finish();
            }
        });

        builder.setNegativeButton(R.string.cancel_button_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        return builder.create(); //super.onCreateDialog(savedInstanceState)
    }

//    private boolean lapinTehtavatTehty() {
//
//        return doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
//                && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1;
//    }

//    public void finishActivity(){
//
//    }
}
