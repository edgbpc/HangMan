package edu.eric.goodwin.hangman

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat

class NotificationGenerator {

    companion object {
        private const val CHANNEL_ID = "My Channel"
    }

    fun buildNotificationWith(context: Context, title: String, message: String): Notification {

        val builder = NotificationCompat.Builder(context, CHANNEL_ID)
        builder.setSmallIcon(R.drawable.hal)
        builder.setContentTitle(title)
        builder.setContentText(message)
        builder.priority = NotificationCompat.PRIORITY_DEFAULT
        return builder.build()
    }

    fun createNotificationChannel(context: Context) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.channel_name)
//            val descriptionText = context.getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = "Channel Description"
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }
}