package com.example.taskmanagement

interface TaskItemClickListener {
    fun editTaskitem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)

}