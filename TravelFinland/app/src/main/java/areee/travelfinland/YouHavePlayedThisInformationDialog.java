package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class YouHavePlayedThisInformationDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.you_have_played_this_city_text)
//                .setPositiveButton("Tulta", new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // FIRE ZE MISSILES!
//                    }
//                })
                .setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        String tag = getTag();

                        switch (tag) {
                            case "play_again_lapland":
                                Intent lapland = new Intent(getActivity(), LaplandActivity.class);
                                startActivity(lapland);
                                break;
                            case "play_again_oulu":
                                Intent oulu = new Intent(getActivity(), OuluActivity.class);
                                startActivity(oulu);
                                break;
                            case "play_again_vaasa":
                                Intent vaasa = new Intent(getActivity(), VaasaActivity.class);
                                startActivity(vaasa);
                                break;
                            case "play_again_savonlinna":
                                Intent savonlinna = new Intent(getActivity(), SavonlinnaActivity.class);
                                startActivity(savonlinna);
                                break;
                            case "play_again_turku":
                                Intent turku = new Intent(getActivity(), TurkuActivity.class);
                                startActivity(turku);
                                break;
                            case "play_again_helsinki_vantaa":
                                Intent vantaa = new Intent(getActivity(), HelsinkiVantaaActivity.class);
                                startActivity(vantaa);
                                break;
                        }


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
