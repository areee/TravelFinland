package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class YouHavePlayedThisInformationDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Du har redan gått igenom denna stad. Vill du spela det igen?")
//                .setPositiveButton("Tulta", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // FIRE ZE MISSILES!
//                    }
//                })
                .setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        Intent lapland = new Intent(getActivity(), LaplandActivity.class);
                        startActivity(lapland);

                    }
                })
                .setNegativeButton(R.string.cancel_button_text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();//super.onCreateDialog(savedInstanceState)
    }
}
