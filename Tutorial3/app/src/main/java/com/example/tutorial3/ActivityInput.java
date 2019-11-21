//package com.example.tutorial3;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class ActivityInput extends AppCompatActivity {
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanState) {
//        super.onCreate(savedInstanState);
//        setContentView(R.layout.activity_input);
//
//        final EditText firstNum = (EditText) findViewById(R.id.angkaSatu);
//        final EditText secNum = (EditText) findViewById(R.id.angkaDua);
//        Button btnAdd = (Button) findViewById(R.id.btnTambah);
//
//        btnAdd.setOnClickListener(new View.OnClickListener()) {
//            int num1 = Integer.parseInt(firstNum.getText().toString());
//            int num2 = Integer.parseInt(secNum.getText().toString());
//            int hasil = num1+num2;
//
//            Intent intent = new Intent(ActivityInput.this, ActivityOutput.class);
//
//            intent.putExtra("jumlah", num1+ "+" +num2+ "=" + hasil);
//            startActivity(intent);
//        }
//    }
//}