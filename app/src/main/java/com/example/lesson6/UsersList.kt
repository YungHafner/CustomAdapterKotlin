package com.example.lesson6

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customadapterlistviewexample.adapters.UserAdapter
import com.example.lesson6.databinding.ActivityUsersListBinding as DataContext

class UsersList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataContext.inflate(layoutInflater)
        val view:View = binding.root
        setContentView(view)

        var UsersCollection = ArrayList(UserData.getAnotherUsers())
        binding.usersList.adapter = UserAdapter(this, UsersCollection)
        binding.usersList.setOnItemClickListener { parent, view, position, id ->
                Toast.makeText(this, "Pressed : ${UserData.getUsers().get(position)}",  Toast.LENGTH_LONG).show()
        }
    }
}