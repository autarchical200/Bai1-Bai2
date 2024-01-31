package org.coolstyles.event;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerInfoActivity extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextPhoneNumber, editTextAddress, editTextIDCard,
            editTextBirthDate, editTextHobbies;
    private Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_customer_relative);

        editTextName = findViewById(R.id.editTextName2);
        editTextEmail = findViewById(R.id.editTextEmail2);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber2);
        editTextAddress = findViewById(R.id.editTextAddress2);
        editTextIDCard = findViewById(R.id.editTextIDCard2);
        editTextBirthDate = findViewById(R.id.editTextBirthDate2);
        editTextHobbies = findViewById(R.id.editTextHobbies2);

        buttonConfirm = findViewById(R.id.buttonConfirm2);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy thông tin từ các ô nhập liệu
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String phoneNumber = editTextPhoneNumber.getText().toString();
                String address = editTextAddress.getText().toString();
                String idCard = editTextIDCard.getText().toString();
                String birthDate = editTextBirthDate.getText().toString();
                String hobbies = editTextHobbies.getText().toString();

                // Hiển thị thông tin trong LogCat
                Log.d("CustomerInfoActivity", "Name: " + name);
                Log.d("CustomerInfoActivity", "Email: " + email);
                Log.d("CustomerInfoActivity", "Phone Number: " + phoneNumber);
                Log.d("CustomerInfoActivity", "Address: " + address);
                Log.d("CustomerInfoActivity", "ID Card: " + idCard);
                Log.d("CustomerInfoActivity", "Birth Date: " + birthDate);
                Log.d("CustomerInfoActivity", "Hobbies: " + hobbies);
            }
        });
    }
}
