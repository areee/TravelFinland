package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;

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
    final CharSequence[] items
            = {" " + R.string.exercise_1 + " " + R.string.rovaniemi_city_name + "," +
            " " + R.string.exercise_2 + " " + R.string.rovaniemi_city_name + "," +
            " " + R.string.exercise_3 + " " + R.string.rovaniemi_city_name + "," +
            " " + R.string.exercise_4 + " " + R.string.rovaniemi_city_name + "," +
            " " + R.string.exercise_1 + " " + R.string.oulu_city_name + "," +
            " " + R.string.exercise_2 + " " + R.string.oulu_city_name + "," +
            " " + R.string.exercise_3 + " " + R.string.oulu_city_name + "," +
            " " + R.string.exercise_4 + " " + R.string.oulu_city_name + "," +
            " " + R.string.exercise_1 + " " + R.string.vaasa_city_name + "," +
            " " + R.string.exercise_2 + " " + R.string.vaasa_city_name + "," +
            " " + R.string.exercise_3 + " " + R.string.vaasa_city_name + "," +
            " " + R.string.exercise_4 + " " + R.string.vaasa_city_name + "," +
            " " + R.string.exercise_1 + " " + R.string.savonlinna_city_name + "," +
            " " + R.string.exercise_2 + " " + R.string.savonlinna_city_name + "," +
            " " + R.string.exercise_3 + " " + R.string.savonlinna_city_name + "," +
            " " + R.string.exercise_4 + " " + R.string.savonlinna_city_name + "," +
            " " + R.string.exercise_1 + " " + R.string.helsinki_vantaa_city_name + "," +
            " " + R.string.exercise_2 + " " + R.string.helsinki_vantaa_city_name + "," +
            " " + R.string.exercise_3 + " " + R.string.helsinki_vantaa_city_name + "," +
            " " + R.string.exercise_4 + " " + R.string.helsinki_vantaa_city_name + ","};
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

                            SharedPreferences.Editor editor = settings.edit();
                            int index = indexSelected + 1;

                            if (index < 5) {
                                String put = "doneLaplandExercise" + index;
                                editor.putInt(put, 1);
                                editor.commit();
                            } else if (index > 4 && index < 9) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 8;
                                }
                                String put = "doneOuluExercise" + index;
                                editor.putInt(put, 1);
                                editor.commit();
                            } else if (index > 8 && index < 13) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 12;
                                }
                                String put = "doneVaasaExercise" + index;
                                editor.putInt(put, 1);
                                editor.commit();
                            } else if (index > 12 && index < 17) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 16;
                                }
                                String put = "doneSavonlinnaExercise" + index;
                                editor.putInt(put, 1);
                                editor.commit();
                            } else if (index > 16 && index < 21) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 20;
                                }
                                String put = "doneHelsinkiVantaaExercise" + index;
                                editor.putInt(put, 1);
                                editor.commit();
                            }


                        } else if (seletedItems.contains(indexSelected)) {
                            // Else, if the item is already in the array, remove it
                            // write your code when user Uchecked the checkbox
                            seletedItems.remove(Integer.valueOf(indexSelected));

                            SharedPreferences.Editor editor = settings.edit();
                            int index = indexSelected + 1;

                            if (index < 5) {
                                String put = "doneLaplandExercise" + index;
                                editor.putInt(put, 0);
                                editor.commit();
                            } else if (index > 4 && index < 9) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 8;
                                }
                                String put = "doneOuluExercise" + index;
                                editor.putInt(put, 0);
                                editor.commit();
                            } else if (index > 8 && index < 13) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 12;
                                }
                                String put = "doneVaasaExercise" + index;
                                editor.putInt(put, 0);
                                editor.commit();
                            } else if (index > 12 && index < 17) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 16;
                                }
                                String put = "doneSavonlinnaExercise" + index;
                                editor.putInt(put, 0);
                                editor.commit();
                            } else if (index > 16 && index < 21) {
                                index = index % 4;
                                if (index == 0) {
                                    index = 20;
                                }
                                String put = "doneHelsinkiVantaaExercise" + index;
                                editor.putInt(put, 0);
                                editor.commit();
                            }


                        }
                    }
                });

        builder.setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // tähän sisältöä...
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
