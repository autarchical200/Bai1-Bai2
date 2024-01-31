package org.coolstyles.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edt_email;
    private EditText edt_password;
    private Button btn_login;


    private void initGui(){
        edt_email= findViewById(R.id.editEmail);
        edt_password=findViewById(R.id.editPassword);
        btn_login=findViewById(R.id.btnLogin);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_event);
        initGui();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmail = edt_email.getText().toString().trim();
                String enteredPassword = edt_password.getText().toString().trim();
                if (enteredEmail.equals("admin") && enteredPassword.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Email hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
