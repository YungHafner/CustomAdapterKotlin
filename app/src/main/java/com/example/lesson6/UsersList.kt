package com.example.lesson6

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.customadapterlistviewexample.adapters.UserAdapter
import com.example.lesson6.databinding.ActivityUsersListBinding as DataContext

class UsersList : AppCompatActivity() {
    var UsersCollection = ArrayList(UserData.getAnotherUsers())
    private  lateinit var binding:DataContext
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataContext.inflate(layoutInflater)
        val view:View = binding.root
        setContentView(view)


        binding.usersList.adapter = UserAdapter(this, UsersCollection)
        binding.usersList.setOnItemClickListener { parent, view, position, id ->
                Toast.makeText(this, "Pressed : ${UserData.getUsers().get(position)}",  Toast.LENGTH_LONG).show()
        }
    }

    fun AddUser(view:View ){
        var user = User(binding.nameText.text.toString() , binding.descriptionText.text.toString())

        UsersCollection.add(user)
        binding.usersList.adapter = UserAdapter(this, UsersCollection)
    }

}