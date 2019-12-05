package com.example.tutorial7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tutorial7.DBManager;
import com.example.tutorial7.R;

public class ActivityAddStudents extends Activity implements
        View.OnClickListener {
    private Button addTodoBtn; private EditText kelasEditText; private EditText namaEditText;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setTitle("Tambah Data"); setContentView(R.layout.activity_addstudents);
        kelasEditText = (EditText) findViewById(R.id.kelas_edittext); namaEditText = (EditText) findViewById(R.id.nama_edittext); addTodoBtn = (Button) findViewById(R.id.add_record);
    DBManager dbManager = new DBManager(this); dbManager.open(); addTodoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.add_record:
                final String kelas = kelasEditText.getText().toString(); final String nama = namaEditText.getText().toString();

                dbManager.insert(kelas, nama);
                Intent main = new Intent(ActivityAddStudents.this, .ActivityDataStudents.class).main.setFlags(); startActivity(main);
                break;
        } } }
