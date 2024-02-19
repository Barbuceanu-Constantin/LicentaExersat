package com.example.useofroomdatabase2nd

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.reflect.KProperty

@Entity(tableName = "user_table")
class User {
    @delegate:PrimaryKey(autoGenerate = true)
    val id: Int by IdDelegate(id)
    val firstName: String get() = this.firstName
    val lastName: String get() = this.lastName
    val age: Int get() = this.age

    class IdDelegate(private var value: Int) {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
            return value
        }
    }
}
