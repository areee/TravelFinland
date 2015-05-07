package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Set;

public class CheatDialog extends DialogFragment {
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
    public SharedPreferences settings;
    public Set<String> cheatSeletedItems;
    private final CharSequence[] items = {" Rovaniemi 1 ", " Rovaniemi 2 ", " Rovaniemi 3 ", " Rovaniemi 4 ",
            " Uleåborg 1 ", " Uleåborg 2 ", " Ulåborg 3 ", " Uleåborg 4 ", " Vasa 1 ", " Vasa 2 ",
            " Vasa 3 ", " Vasa 4 ", " Nyslott 1 ", " Nyslott 2 ", " Nyslott 3 ", " Nyslott 4 ",
            " Helsingfors 1 ", " Helsingfors 2 ", " Helsingfors 3 ", " Helsingfors 4 "};
    //    private final CharSequence[] items
//            = {
//            " " + getString(R.string.exercise_1) + " " + getString(R.string.rovaniemi_city_name) + " ",
//            " " + getString(R.string.exercise_2) + " " + getString(R.string.rovaniemi_city_name) + " ",
//            " " + getString(R.string.exercise_3) + " " + getString(R.string.rovaniemi_city_name) + " ",
//            " " + getString(R.string.exercise_4) + " " + getString(R.string.rovaniemi_city_name) + " ",
//            " " + getString(R.string.exercise_1) + " " + getString(R.string.oulu_city_name) + " ",
//            " " + getString(R.string.exercise_2) + " " + getString(R.string.oulu_city_name) + " ",
//            " " + getString(R.string.exercise_3) + " " + getString(R.string.oulu_city_name) + " ",
//            " " + getString(R.string.exercise_4) + " " + getString(R.string.oulu_city_name) + " ",
//            " " + getString(R.string.exercise_1) + " " + getString(R.string.vaasa_city_name) + " ",
//            " " + getString(R.string.exercise_2) + " " + getString(R.string.vaasa_city_name) + " ",
//            " " + getString(R.string.exercise_3) + " " + getString(R.string.vaasa_city_name) + " ",
//            " " + getString(R.string.exercise_4) + " " + getString(R.string.vaasa_city_name) + " ",
//            " " + getString(R.string.exercise_1) + " " + getString(R.string.savonlinna_city_name) + " ",
//            " " + getString(R.string.exercise_2) + " " + getString(R.string.savonlinna_city_name) + " ",
//            " " + getString(R.string.exercise_3) + " " + getString(R.string.savonlinna_city_name) + " ",
//            " " + getString(R.string.exercise_4) + " " + getString(R.string.savonlinna_city_name) + " ",
//            " " + getString(R.string.exercise_1) + " " + getString(R.string.helsinki_vantaa_city_name) + " ",
//            " " + getString(R.string.exercise_2) + " " + getString(R.string.helsinki_vantaa_city_name) + " ",
//            " " + getString(R.string.exercise_3) + " " + getString(R.string.helsinki_vantaa_city_name) + " ",
//            " " + getString(R.string.exercise_4) + " " + getString(R.string.helsinki_vantaa_city_name) + " "};
    final ArrayList seletedItems = new ArrayList();


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
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
        cheatSeletedItems = settings.getStringSet("cheatSeletedItems", null);

//        List<String> list = new ArrayList(cheatSeletedItems);
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//        }//työn alla


        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Välj övningar som du vill ha gjort:");

        builder.setMultiChoiceItems(items, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    // indexSelected contains the index of item (of which checkbox checked)
                    @Override
                    public void onClick(DialogInterface dialog, int indexSelected,
                                        boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                            // write your code when user checked the checkbox
                            seletedItems.add(indexSelected);

                            cheatEditSharedPreferences(settings, indexSelected, isChecked);
                        } else if (seletedItems.contains(indexSelected)) {
                            // Else, if the item is already in the array, remove it
                            // write your code when user Uchecked the checkbox
                            seletedItems.remove(Integer.valueOf(indexSelected));

                            cheatEditSharedPreferences(settings, indexSelected, isChecked);
                        }
                    }
                });

        builder.setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //reloads the current activity:
                getActivity().finish();
                startActivity(getActivity().getIntent());
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

    public void cheatEditSharedPreferences(SharedPreferences settings, int indexSelected, boolean isChecked) {
        SharedPreferences.Editor editor = settings.edit();
        int newIndex = indexSelected + 1;
        int i;
        if (isChecked) {
            i = 1;
        } else {
            i = 0;
        }
        if (newIndex <= 4) {
            String put = "doneLaplandExercise" + newIndex;
            editor.putInt(put, i);
            editor.commit();
        } else if (newIndex >= 5 && newIndex <= 8) {

            newIndex = jakojaannos(newIndex);
            String put = "doneOuluExercise" + newIndex;
            editor.putInt(put, i);
            editor.commit();

        } else if (newIndex >= 9 && newIndex <= 12) {

            newIndex = jakojaannos(newIndex);
            String put = "doneVaasaExercise" + newIndex;
            editor.putInt(put, i);
            editor.commit();

        } else if (newIndex >= 13 && newIndex <= 16) {

            newIndex = jakojaannos(newIndex);
            String put = "doneSavonlinnaExercise" + newIndex;
            editor.putInt(put, i);
            editor.commit();

        } else if (newIndex >= 17 && newIndex <= 20) {

            newIndex = jakojaannos(newIndex);
            String put = "doneHelsinkiVantaaExercise" + newIndex;
            editor.putInt(put, i);
            editor.commit();
        }
    }

    private int jakojaannos(int newIndex) {
        int jakojaannos = newIndex % 4;
        // esim. newIndex=8:
        if (jakojaannos == 0) {
            newIndex = 4;
        } else {
            newIndex = jakojaannos;
        }
        return newIndex;
    }
}
