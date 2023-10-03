package com.example.sharesphere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.sharesphere.daos.PostDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        postDao=PostDao()

        var postButton = findViewById<View>(R.id.postButton) as Button
        postButton.setOnClickListener{
            var postInput = findViewById<View>(R.id.postInput) as EditText
            val input=postInput.text.toString().trim()

            if(input.isNotEmpty()){
            postDao.addPost(input)
                finish()
            }
        }

    }
}