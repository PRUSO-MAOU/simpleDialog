package com.pruso.simpledialog;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create and customize the SimpleDialog
        SimpleDialog dialog = new SimpleDialog(this);

        dialog
                .setTitle("Custom Title")
                .setSubtitle("Custom Subtitle")
                .withFirstTextField(true);

        // Set a click listener for the first button within the dialog
        dialog.withFirstButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the first button click action
                // You can dismiss the dialog or perform other actions here
                dialog.dismiss();
            }
        });

        // Show the dialog
        dialog.show();
    }
}
