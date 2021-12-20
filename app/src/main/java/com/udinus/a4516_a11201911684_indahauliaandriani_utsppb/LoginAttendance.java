package com.udinus.a4516_a11201911684_indahauliaandriani_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import org.w3c.dom.Text;
import android.os.Bundle;

public class LoginAttendance extends AppCompatActivity {

    // Deklarasi variabel editTextEmail dengan tipe EditText
    EditText editTextEmail;
    // Deklarasi variabel editTextPassword dengan tipe EditText
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_attendance);
        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_txt_email);

        // Binding edt_txt_password ke variabel editTextPassword
        editTextPassword = findViewById(R.id.edt_txt_password);
    }

    public void clickForgot(View view) {
        Intent i = new Intent(LoginAttendance.this, ValidasiForgotPassword.class);
        startActivity(i);
    }

    public void clickGetStarted(View view) {
        // Validasi input email dan password kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email dan Password Tidak boleh kosong!",Toast.LENGTH_LONG).show();
        }
        // Validasi input email kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak boleh kosong!",Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Valid",Toast.LENGTH_LONG).show();
        }
        // Validasi password kosong
        else if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Password Tidak boleh kosong!",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(LoginAttendance.this, HomeAttendance.class);
            startActivity(i);}
    }

    public static boolean isValidEmail (CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}