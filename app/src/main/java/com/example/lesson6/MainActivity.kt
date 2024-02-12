package com.example.lesson6

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

   fun sendData( view: View){
        //binding.textContent.text = binding.textView.
        val intent = Intent(this, UsersList :: class.java)
        startActivity(intent)
    }
    /*
        override fun onSaveInstanceState(outState: Bundle){
            outState.run {
                putString("KEY", binding. textContent.text.toString())
            }

        super.onSaveInstanceState(outState)
    }
        override  fun  onRestoreInstanceState(savedInstanceState: Bundle){
            super.onRestoreInstanceState(savedInstanceState)

            binding.textContent.text = savedInstanceState.getString("KEY")
        }



        private fun toastMeState(message: String) {

            Toast.makeText(this, "${lifecycle.currentState}, $message", Toast.LENGTH_LONG).show()
        }
        override fun onStart(){
            super.onStart()
            toastMeState("ON_START")
        }
        override  fun onResume(){
            super.onResume()
            toastMeState("ON_RESUME")
        }
        override fun onPostResume(){
            super.onPostResume()
            toastMeState("ON_POST_RESUME")
        }

        override fun onPause() {
            super.onPause()
            toastMeState("ON_PAUSE")
        }

        override fun onStop() {
            super.onStop()
            toastMeState("ON_STOP")
        }

        override fun onRestart() {
            super.onRestart()
            toastMeState("ON_RESTART")
        }

        override fun onDestroy() {
            super.onDestroy()
            toastMeState("ON_DESTROY")
        }*/



}