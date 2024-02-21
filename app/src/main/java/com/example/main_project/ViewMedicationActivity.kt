package com.example.main_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.main_project.R.layout.activity_view_medication

class ViewMedicationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_view_medication)

        val buttonNavigate= findViewById<Button>(R.id.addMedicationButton)
        buttonNavigate.setOnClickListener {
            val intent = Intent(this, SetMedicationActivity::class.java)
            startActivity(intent)
           }

    }
}

