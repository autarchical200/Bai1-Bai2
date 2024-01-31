package org.coolstyles.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    private EditText edit_email_register;
    private EditText edt_password_register;
    private EditText edt_password_register_repeat;
    private Button btn_register;

    private void initGui(){

        edit_email_register = findViewById(R.id.editEmailRegister);
        edt_password_register= findViewById(R.id.editPasswordRegister);
        edt_password_register_repeat= findViewById(R.id.editPasswordRegisterRepeat);
        btn_register= findViewById(R.id.btnRegister);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_event);
        initGui();


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmailRegister = edit_email_register.getText().toString().trim();
                String enteredPasswordRegister = edt_password_register.getText().toString().trim();
                String enteredPasswordRegisterRepeat = edt_password_register_repeat.getText().toString().trim();

                if (isValidRegistration(enteredEmailRegister, enteredPasswordRegister, enteredPasswordRegisterRepeat)) {
                    // Registration logic here
                    Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(RegisterActivity.this, "Invalid registration information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidRegistration(String email, String password, String repeatPassword) {
        return !email.isEmpty() && !password.isEmpty() && password.equals(repeatPassword);
    }
    }


