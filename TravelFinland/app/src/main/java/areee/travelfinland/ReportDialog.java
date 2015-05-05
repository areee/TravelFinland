package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ReportDialog extends DialogFragment {
    public static final String PREFS_NAME = "MyPrefsFile";
    public int doneLaplandExercise1;
    public int doneLaplandExercise2;
    public int doneLaplandExercise3;
    public int doneLaplandExercise4;
    public int doneOuluExercise1;
    public int doneOuluExercise2;
    public int doneOuluExercise3;
    public int doneOuluExercise4;
    public int doneVaasaExercise1;
    public int doneVaasaExercise2;
    public int doneVaasaExercise3;
    public int doneVaasaExercise4;
    public int doneSavonlinnaExercise1;
    public int doneSavonlinnaExercise2;
    public int doneSavonlinnaExercise3;
    public int doneSavonlinnaExercise4;
    public int doneHelsinkiVantaaExercise1;
    public int doneHelsinkiVantaaExercise2;
    public int doneHelsinkiVantaaExercise3;
    public int doneHelsinkiVantaaExercise4;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        SharedPreferences settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
        doneLaplandExercise1 = settings.getInt("doneLaplandExercise1", 0); // 0 = no (default), 1 = yes
        doneLaplandExercise2 = settings.getInt("doneLaplandExercise2", 0);
        doneLaplandExercise3 = settings.getInt("doneLaplandExercise3", 0);
        doneLaplandExercise4 = settings.getInt("doneLaplandExercise4", 0);
        doneOuluExercise1 = settings.getInt("doneOuluExercise1", 0);
        doneOuluExercise2 = settings.getInt("doneOuluExercise2", 0);
        doneOuluExercise3 = settings.getInt("doneOuluExercise3", 0);
        doneOuluExercise4 = settings.getInt("doneOuluExercise4", 0);
        doneVaasaExercise1 = settings.getInt("doneVaasaExercise1", 0);
        doneVaasaExercise2 = settings.getInt("doneVaasaExercise2", 0);
        doneVaasaExercise3 = settings.getInt("doneVaasaExercise3", 0);
        doneVaasaExercise4 = settings.getInt("doneVaasaExercise4", 0);
        doneSavonlinnaExercise1 = settings.getInt("doneSavonlinnaExercise1", 0);
        doneSavonlinnaExercise2 = settings.getInt("doneSavonlinnaExercise2", 0);
        doneSavonlinnaExercise3 = settings.getInt("doneSavonlinnaExercise3", 0);
        doneSavonlinnaExercise4 = settings.getInt("doneSavonlinnaExercise4", 0);
        doneHelsinkiVantaaExercise1 = settings.getInt("doneHelsinkiVantaaExercise1", 0);
        doneHelsinkiVantaaExercise2 = settings.getInt("doneHelsinkiVantaaExercise2", 0);
        doneHelsinkiVantaaExercise3 = settings.getInt("doneHelsinkiVantaaExercise3", 0);
        doneHelsinkiVantaaExercise4 = settings.getInt("doneHelsinkiVantaaExercise4", 0);

        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Övningar som du har gjort (1=gjort, 0=inte)");
        builder.setMessage("Rovaniemi 1:" + doneLaplandExercise1 + "\n" +
                "Rovaniemi 2: " + doneLaplandExercise2 + "\n" +
                "Rovaniemi 3: " + doneLaplandExercise3 + "\n" +
                "Rovaniemi 4: " + doneLaplandExercise4 + "\n" +
                "Åleåborg 1: " + doneOuluExercise1 + "\n" +
                "Åleåborg 2: " + doneOuluExercise2 + "\n" +
                "Åleåborg 3: " + doneOuluExercise3 + "\n" +
                "Åleåborg 4: " + doneOuluExercise4 + "\n" +
                "Vasa 1: " + doneVaasaExercise1 + "\n" +
                "Vasa 2: " + doneVaasaExercise2 + "\n" +
                "Vasa 3: " + doneVaasaExercise3 + "\n" +
                "Vasa 4: " + doneVaasaExercise4 + "\n" +
                "Nyslott 1: " + doneSavonlinnaExercise1 + "\n" +
                "Nyslott 2: " + doneSavonlinnaExercise2 + "\n" +
                "Nyslott 3: " + doneSavonlinnaExercise3 + "\n" +
                "Nyslott 4: " + doneSavonlinnaExercise4 + "\n" +
                "Helsingfors 1: " + doneHelsinkiVantaaExercise1 + "\n" +
                "Helsingfors 2: " + doneHelsinkiVantaaExercise2 + "\n" +
                "Helsingfors 3: " + doneHelsinkiVantaaExercise3 + "\n" +
                "Helsingfors 4: " + doneHelsinkiVantaaExercise4 + "\n")

                .setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();//super.onCreateDialog(savedInstanceState)
    }
}
