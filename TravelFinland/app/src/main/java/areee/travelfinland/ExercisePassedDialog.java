package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;

public class ExercisePassedDialog extends DialogFragment {
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

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.exercise_passed_dialog_layout, null));

//        builder.setMessage(R.string.right_answer_text);

        builder.setPositiveButton(R.string.continue_button_text, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String tag = getTag();

                if ((tag.equals("lapland_passed") && lapinTehtavatTehty())
                        || (tag.equals("oulu_passed") && oulunTehtavatTehty())
                        || (tag.equals("vaasa_passed") && vaasanTehtavatTehty())
                        || (tag.equals("savonlinna_passed") && savonlinnanTehtavatTehty())
                        || (tag.equals("helsinki_vantaa_passed") && helsinkiVantaanTehtavatTehty())) {
                    getActivity().finish();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

//                    getActivity().getParent().finish();
//                    startActivity(getActivity().getParent().getParent().getIntent());

//                    Activity host = (Activity) getView().getContext();
//                    startActivity(host.getIntent());

//                    Intent intent = new Intent(getActivity(), MainActivity.class);
//                    startActivity(intent);
                } else {
                    getActivity().finish();
                }

//                getActivity().finish();
//                dialog.dismiss();
//                ((Activity) context).finish();
            }
        });

        return builder.create(); //super.onCreateDialog(savedInstanceState)
    }

    private boolean lapinTehtavatTehty() { // 0 = no (default), 1 = yes
        return doneLaplandExercise1 == 1 && doneLaplandExercise2 == 1
                && doneLaplandExercise3 == 1 && doneLaplandExercise4 == 1;
    }

    private boolean oulunTehtavatTehty() {
        return doneOuluExercise1 == 1 && doneOuluExercise2 == 1
                && doneOuluExercise3 == 1 && doneOuluExercise4 == 1;
    }

    private boolean vaasanTehtavatTehty() {
        return doneVaasaExercise1 == 1 && doneVaasaExercise2 == 1
                && doneVaasaExercise3 == 1 && doneVaasaExercise4 == 1;
    }

    private boolean savonlinnanTehtavatTehty() {
        return doneSavonlinnaExercise1 == 1 && doneSavonlinnaExercise2 == 1
                && doneSavonlinnaExercise3 == 1 && doneSavonlinnaExercise4 == 1;
    }

    private boolean helsinkiVantaanTehtavatTehty() {
        return doneHelsinkiVantaaExercise1 == 1 && doneHelsinkiVantaaExercise2 == 1
                && doneHelsinkiVantaaExercise3 == 1 && doneHelsinkiVantaaExercise4 == 1;
    }

//    public void finishActivity(){
//
//    }
}
