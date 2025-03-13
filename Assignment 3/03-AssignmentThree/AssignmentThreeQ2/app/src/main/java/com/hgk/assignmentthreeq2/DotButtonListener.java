package com.hgk.assignmentthreeq2;

import android.view.View;
import android.widget.EditText;

public class DotButtonListener implements View.OnClickListener{

    EditText editor;
    static int dotCount = 0;
    public DotButtonListener(EditText editor)
    {
        this.editor = editor;
    }

    @Override
    public void onClick(View view) {
        if(dotCount >= 1)
        {
            return;
        }
        String str = getString();

        if(str == null)
        {
            return;
        }
        editor.setText(str += ".");
        NumberButtons.numberString = NumberButtons.numberString + ".";

        dotCount = dotCount + 1;
    }

    public String getString()
    {
        if(editor.getText().toString().trim() == "")
        {
            return null;
        }
        else
        {
            return editor.getText().toString().trim();
        }
    }
}
