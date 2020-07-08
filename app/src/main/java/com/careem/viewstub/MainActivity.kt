package com.careem.viewstub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.workflow.ui.WorkflowFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val workflowFragment = TestWorkflowFragment()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, workflowFragment)
            .commitNow()
    }
}