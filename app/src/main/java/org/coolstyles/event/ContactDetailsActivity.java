package org.coolstyles.event;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailsActivity extends AppCompatActivity {

    private TextView txtName, txtPhoneNumber;
    private ImageView imageViewAvatar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_danhba_relative);

        final String[] names = {"Người dùng 1", "Người dùng 2"};
        final String[] phoneNumbers = {"0123456789", "0987654321"};

        txtName = findViewById(R.id.name);
        txtPhoneNumber = findViewById(R.id.phoneNumber);
        imageViewAvatar1 = findViewById(R.id.imageViewAvatar1);

        imageViewAvatar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy vị trí của imageViewAvatar1 trong RelativeLayout
                int position = (Integer) view.getTag();

                String name = names[position];
                String phoneNumber = phoneNumbers[position];

                // Hiển thị thông tin
                txtName.setText(name);
                txtPhoneNumber.setText(phoneNumber);

                // Hiển thị Toast khi click vào ảnh
                showContactInfoToast(name, phoneNumber);
            }
        });

        // Gán tag cho imageViewAvatar1 để lưu trữ vị trí
        imageViewAvatar1.setTag(0); // Nếu chỉ có một hình ảnh, set tag là 0
    }

    private void showContactInfoToast(String name, String phoneNumber) {
        String toastMessage = "Name: " + name + "\nPhone Number: " + phoneNumber;
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
