package com.gulsahozaltun.realtimevalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import bloder.com.blitzcore.enableWhen
import bloder.com.blitzcore.enableWhenUsing
import bloder.com.blitzcore.mask.withMask
import com.gulsahozaltun.realtimevalidation.databinding.ActivityMainBinding
import com.wajahatkarim3.easyvalidation.core.view_ktx.atleastOneNumber
import com.wajahatkarim3.easyvalidation.core.view_ktx.validEmail
import com.wajahatkarim3.easyvalidation.core.view_ktx.validator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildCustomFormValidation()
        binding.button.setOnClickListener {
            Toast.makeText(this, "Signed up", Toast.LENGTH_LONG).show()

        }
    }






    private fun buildCustomFormValidation() = binding.button.enableWhenUsing(CustomValidationExample()) {
        binding.editext.isFilled() onValidationSuccess {
            binding.editext.validEmail() {
                // This method will be called when myEmailStr is not a valid email.
                binding.textInputLayout.error=it
            }
            binding.textInputLayout.error = null
        }
        binding.edittext3.isFilled() onValidationSuccess {
            binding.edittext3.validator()
                .nonEmpty()
                .atleastOneNumber("En az bir karakter")
                .atleastOneSpecialCharacters()
                .atleastOneUpperCase()
                .addErrorCallback {
                    binding.textInputLayout3.error=it
                    // it will contain the right message.
                    // For example, if edit text is empty,
                    // then 'it' will show "Can't be Empty" message
                }.check()
            binding.textInputLayout3.error = null
        }
        binding.edittext2.isFilled() withMask "(###)###-##-##"
        binding.checkBox.isAccepted()
    }
/*    private fun buildFormValidation() = binding.button.enableWhen {
        binding.editext.isFilled()
        binding.edittext3.isFilled()
    }*/
    }
