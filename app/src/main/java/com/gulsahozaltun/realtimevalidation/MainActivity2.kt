package com.gulsahozaltun.realtimevalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import bloder.com.blitzcore.enableWhen
import bloder.com.blitzcore.enableWhenUsing
import bloder.com.blitzcore.mask.withMask
import com.google.android.material.textfield.TextInputLayout
import com.gulsahozaltun.realtimevalidation.databinding.ActivityMain2Binding
import com.wajahatkarim3.easyvalidation.core.view_ktx.validEmail
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //buildCustomFormValidation()
        binding.button.setOnClickListener {
            Toast.makeText(this, "Signed up", Toast.LENGTH_LONG).show()

        }
        binding.editext.setOnClickListener {
            validate(binding.editext,binding.textInputLayout)
        }
    }


    fun validate(editText: EditText, errorField: TextInputLayout) {
        ValidationHandler.validateEmail(editText,errorField)
    }


/*    private fun buildCustomFormValidation() =
        binding.button.enableWhenUsing(CustomValidationExample()) {
            binding.editext.isFilled() onValidationSuccess {
                binding.editext.validator()
                    .noSpecialCharacters()
                    .noNumbers()
                    .minLength(2)
                    .nonEmpty()
                    .addErrorCallback {
                        binding.textInputLayout.error = it
                    }.check()
                // This method will be called when myEmailStr is not a valid email.
                binding.textInputLayout.error = null
            }


            binding.edittext2.isFilled() onValidationSuccess {
                binding.edittext2.validator()
                    .noSpecialCharacters()
                    .noNumbers()
                    .minLength(2)
                    .nonEmpty()
                    .addErrorCallback {
                        binding.textInputLayout2.error = it
                    }.check()
                // This method will be called when myEmailStr is not a valid email.
                binding.textInputLayout2.error = null
            }


            binding.edittext3.isFilled() onValidationSuccess {
                binding.edittext3.validator()
                    .noSpecialCharacters()
                    .noNumbers()
                    .minLength(2)
                    .nonEmpty()
                    .addErrorCallback {
                        binding.textInputLayout3.error = it
                    }.check()
                // This method will be called when myEmailStr is not a valid email.
                binding.textInputLayout3.error = null
            }
        }*/
}

/*

        binding.edittext4.isFilled() onValidationSuccess {
            binding.edittext4.validator()
                .nonEmpty()
                .maxLength(3)
                .lessThan(32)
                .addErrorCallback {
                    binding.textInputLayout4.error=it
                }.check()
            // This method will be called when myEmailStr is not a valid email.
            binding.textInputLayout4.error = null
        }

        binding.edittext5.isFilled() onValidationSuccess {
            binding.edittext4.validator()
                .nonEmpty()
                .maxLength(3)
                .lessThan(13)
                .addErrorCallback {
                    binding.textInputLayout5.error=it
                }.check()
            // This method will be called when myEmailStr is not a valid email.
            binding.textInputLayout5.error = null
        }

        binding.edittext6.isFilled() onValidationSuccess {
            binding.edittext4.validator()
                .nonEmpty()
                .maxLength(4)
                .lessThan(2020)
                .addErrorCallback {
                    binding.textInputLayout6.error=it
                }.check()
            // This method will be called when myEmailStr is not a valid email.
            binding.textInputLayout6.error = null
        }






        binding.checkBox.isAccepted()
    }

    private fun buildFormValidation() = binding.button.enableWhen {
        binding.editext.isFilled()
        binding.edittext3.isFilled()
    }*/
