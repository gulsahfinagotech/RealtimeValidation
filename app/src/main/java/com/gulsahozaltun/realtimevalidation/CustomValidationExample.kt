package com.gulsahozaltun.realtimevalidation

import android.view.View
import android.widget.CheckBox
import bloder.com.blitzcore.validation.DefaultBlitzValidations
import java.util.regex.Pattern

class CustomValidationExample : DefaultBlitzValidations() {

    fun CheckBox.isAccepted() : View = bindViewValidation(this) {
        this.isChecked
    }

}