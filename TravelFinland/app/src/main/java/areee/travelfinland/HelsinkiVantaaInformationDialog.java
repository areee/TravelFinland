package areee.travelfinland;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;

public class HelsinkiVantaaInformationDialog extends DialogFragment {
//    private MediaPlayer mediaPlayer;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

//        LayoutInflater inflater = getActivity().getLayoutInflater();
//        builder.setView(inflater.inflate(R.layout.lapland_information_dialog_layout, null));

//        final Button listen_button = (Button) getActivity().findViewById(R.id.listen_button);
//        final Button stop_button = (Button) getActivity().findViewById(R.id.stop_button);


//        listen_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lapland_spoken_text_box);
//                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//                        mp.release();
//                    }
//                });
//                mediaPlayer.start();
//            }
//        });
//
//        stop_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (mediaPlayer.isPlaying()) {
//                    mediaPlayer.stop();
//                    mediaPlayer.reset();
//                }
//            }
//        });


        builder.setMessage(R.string.helsinki_vantaa_info_box);
        builder.setPositiveButton(R.string.ok_button_text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                dialog.cancel();
            }
        })
                .setNeutralButton(R.string.listen_button_text, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lapland_spoken_text_box);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                        mediaPlayer.start();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();//super.onCreateDialog(savedInstanceState)
    }
}
