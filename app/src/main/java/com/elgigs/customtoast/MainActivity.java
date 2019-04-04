package com.elgigs.customtoast;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String toastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastText = String.valueOf(R.string.happy_birthday);
    }

    public void happyBirthday(View view) {
//        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
        showCusomToast("my name is sahil");
    }

    private void showCusomToast(String message) {

//         inflating and setting the layout.

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

//        Setting the text.

        TextView toastKaText = layout.findViewById(R.id.toast_text);
        toastKaText.setText(message);


//        Setting up the image

        ImageView toastImage = layout.findViewById(R.id.toast_image);
        toastImage.setImageResource(R.drawable.ic_child);

//         setting up the toast

        Toast toast = new Toast(this);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }
}
