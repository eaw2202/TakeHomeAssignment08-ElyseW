package com.elysewarren.takehomeassignment08_elysew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("title");
    private DatabaseReference studentRef = database.getReference("student");

    private EditText displayTitle;
    private EditText displayName;
    private EditText displayAge;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTitle = (EditText) findViewById(R.id.title_view);
        displayName = (EditText) findViewById(R.id.student_name);
        displayAge = (EditText) findViewById(R.id.student_age);
        checkBox = (CheckBox) findViewById(R.id.my_student);
    }

    public void set(View view) {
        titleRef.setValue(displayTitle.getText().toString());
    }

    public void add(View view) {
        String studentName = displayName.getText().toString();
        int studentAge = Integer.parseInt(displayAge.getText().toString());
        boolean isMyStudent = checkBox.isChecked();

        Student Elyse = new Student(studentName, studentAge, isMyStudent);
        studentRef.push().setValue(Elyse);
    }
}


