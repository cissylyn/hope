package com.example.taskmanagement

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.LocalTime
import java.util.*
@Entity(tableName = "task_item_table")
class TaskItem (
    @ColumnInfo(name="name")var name:String,
    @ColumnInfo(name="desc")var desc:String,
    @ColumnInfo(name="dueTimeString")var dueTimeString:String?,
    @ColumnInfo(name="completedDateString")var completedDate:LocalDate?,
    @PrimaryKey(autoGenerate=true)var id: Int=0
)
{
fun isCompleted( )=completedDate !=null
    fun imageResource():Int = if(isCompleted())R.drawable.checked_24 else R.drawable.unchecked_24
    fun imageColor(context: Context):Int = if(isCompleted())purple(context) else black(context)

    private  fun purple(context: Context)=ContextCompat.getColor(context,R.color.purple)
    private  fun black(context: Context)=ContextCompat.getColor(context,R.color.black)

}



