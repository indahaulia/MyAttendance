package com.udinus.a4516_a11201911684_indahauliaandriani_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.Toast;
import android.util.Patterns;

import android.os.Bundle;

public class ValidasiForgotPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi_forgot_password);

        // Binding EditText
        editTextEmail = findViewById(R.id.edt_txt_email);
    }

    public void postSendRequest(View view) {
        // Validasi email kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email Tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }

        // Validasi format email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ValidasiForgotPassword.this, ResetPassword.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail (CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

}