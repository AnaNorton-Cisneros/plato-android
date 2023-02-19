package com.example.platoandroid.tutorial.ui.displaysteps.five_state.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepEightHelpHint() {
  Column {
    Text(text = "Make sure your TodoListRow looks like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoListRow(todoItem: TodoListItem) {\n" +
        "  var isComplete = remember { mutableStateOf(todoItem.isComplete) }\n" +
        "  Row(\n" +
        "    modifier = Modifier.height(64.dp),\n" +
        "    verticalAlignment = Alignment.CenterVertically,\n" +
        "  ) {\n" +
        "    if (isComplete.value) {\n" +
        "      IconButton(onClick = { isComplete.value = false }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = CheckMarkGreen,\n" +
        "        )\n" +
        "      }\n" +
        "    } else {\n" +
        "      IconButton(onClick = { isComplete.value = true }) {\n" +
        "        Icon(\n" +
        "          imageVector = Icons.Filled.CheckCircle,\n" +
        "          contentDescription = \"Checkmark\",\n" +
        "          tint = Gray,\n" +
        "        )\n" +
        "      }\n" +
        "    }\n" +
        "    Spacer(modifier = Modifier.width(12.dp))\n" +
        "    Text(text = todoItem.taskName)\n" +
        "    IconButton(onClick = { /*TODO*/ }) {\n" +
        "      Icon(\n" +
        "        imageVector = Icons.Filled.Close,\n" +
        "        contentDescription = \"Checkmark\",\n" +
        "      )\n" +
        "    }\n" +
        "  }\n" +
        "  Divider()\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}