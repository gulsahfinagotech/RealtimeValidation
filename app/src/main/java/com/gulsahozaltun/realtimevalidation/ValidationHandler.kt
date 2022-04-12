package com.gulsahozaltun.realtimevalidation

import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

object ValidationHandler {

    fun validateEmail(view: EditText,errorField:TextInputLayout){
        view.validator()
            .noSpecialCharacters()
            .noNumbers()
            .minLength(2)
            .nonEmpty()
            .addErrorCallback {
                errorField.error=it
            }.check()
        errorField.error=null
    }

}