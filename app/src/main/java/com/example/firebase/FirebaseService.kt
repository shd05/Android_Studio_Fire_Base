package com.example.firebase


import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("fb_token",token)
    }
}