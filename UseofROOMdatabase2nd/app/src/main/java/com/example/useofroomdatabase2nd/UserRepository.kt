package com.example.useofroomdatabase2nd

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDAO) {
    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user:User){
        userDao.addUser(user)
    }

}