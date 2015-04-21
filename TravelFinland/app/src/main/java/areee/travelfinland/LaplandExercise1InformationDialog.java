package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class LaplandExercise1InformationDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.lapland_exercise1_info_text)
//                .setPositiveButton("Tulta", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // FIRE ZE MISSILES!
//                    }
//                })
                .setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        dialog.cancel();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();//super.onCreateDialog(savedInstanceState)
    }
}
