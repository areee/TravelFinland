package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

public class Map2ExercisePassedDialog extends DialogFragment {

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

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.exercise_passed_dialog_layout, null));

//        builder.setMessage(R.string.right_answer_text);

        builder.setPositiveButton(R.string.continue_button_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent oulu = new Intent(getActivity(), OuluActivity.class);
                startActivity(oulu);

//                getActivity().finish();
//                dialog.dismiss();
//                ((Activity) context).finish();
            }
        });

        return builder.create(); //super.onCreateDialog(savedInstanceState)
    }

//    public void finishActivity(){
//
//    }
}
