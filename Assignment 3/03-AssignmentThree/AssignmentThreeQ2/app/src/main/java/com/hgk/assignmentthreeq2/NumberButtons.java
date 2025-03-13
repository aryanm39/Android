package com.hgk.assignmentthreeq2;

import android.view.View;
import android.widget.TextView;

public class NumberButtons implements View.OnClickListener{
    int i = 0;
    static String numberString;
    TextView editor;
    public NumberButtons(int i, TextView editor)
    {
        this.i = i;
        this.editor = editor;
    }

    @Override
    public void onClick(View view) {
        if(numberString == null)
        {
            numberString = "";
        }
        numberString += i;
        String str = null;
        if((str = getString()) == null)
        {
            editor.setText("");
        }
        else {
            editor.setText(getString());
        }
    }

    public String getString()
    {
        if(numberString != null)
            return numberString;
        else
            return "";
    }
}
