package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

public class ExerciseFailedDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.exercise_failed_dialog_layout, null));

//        builder.setMessage(R.string.wrong_answer_text);
        builder.setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        return builder.create(); //super.onCreateDialog(savedInstanceState)
    }
}
