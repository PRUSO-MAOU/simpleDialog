package com.pruso.simpledialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SimpleDialog extends Dialog {
    private Context context;
    private TextView title, subtitle, firstButton, secondButton;
    private EditText editText;
    private LinearLayout layout;

    public SimpleDialog(Context context) {
        super(context);
        this.context = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.simpledialog);

        // Initialize UI elements
        title = findViewById(R.id.title);
        subtitle = findViewById(R.id.subtitle);
        firstButton = findViewById(R.id.first_button);
        secondButton = findViewById(R.id.second_button);
        editText = findViewById(R.id.first_edit_text);
        layout = findViewById(R.id.main_frame);


        this.setCancelable(false);
    }



    public SimpleDialog isCancelable(boolean cancelable) {
        this.setCancelable(cancelable);
        return this;
    }

    public SimpleDialog setTitle(String titleText) {
        title.setVisibility(View.VISIBLE);
        title.setText(titleText);
        return this;
    }

    public SimpleDialog setSubtitle(String subtitleText) {
        subtitle.setVisibility(View.VISIBLE);
        subtitle.setText(subtitleText);
        return this;
    }

    public String getFirstTextField() {
        return editText.getText().toString();
    }

    public SimpleDialog withFirstTextField(boolean hasEditText) {
        if (hasEditText) {
            editText.setVisibility(View.VISIBLE);
        } else {
            editText.setVisibility(View.GONE);
        }
        return this;
    }

    public SimpleDialog setFirstTextField(String firstText) {
        editText.setVisibility(View.VISIBLE);
        editText.setText(firstText);
        return this;
    }

    public SimpleDialog withFirstButtonListener(View.OnClickListener confirmListener) {
        firstButton.setVisibility(View.VISIBLE);
        firstButton.setOnClickListener(confirmListener);
        return this;
    }

    public SimpleDialog withSecondButtonListener(View.OnClickListener cancelListener) {
        secondButton.setVisibility(View.VISIBLE);
        secondButton.setOnClickListener(cancelListener);
        return this;
    }

}