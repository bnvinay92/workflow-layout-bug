package com.careem.viewstub

import com.squareup.workflow.Workflow
import com.squareup.workflow.stateless
import com.squareup.workflow.ui.*
import kotlinx.coroutines.Dispatchers

class TestWorkflowFragment : WorkflowFragment<Unit, Nothing>() {

    override val viewEnvironment = ContainerHints(ViewRegistry(TestLayoutRunner))

    object TestLayoutRunner : ViewBinding<Unit> by LayoutRunner.bindNoRunner(R.layout.layout_test)

    override fun onCreateWorkflow(): WorkflowRunner.Config<Unit, Nothing> {
        return WorkflowRunner.Config(
            workflow = Workflow.stateless { Unit },
            props = Unit,
            dispatcher = Dispatchers.Main.immediate,
            diagnosticListener = null
        )
    }
}

