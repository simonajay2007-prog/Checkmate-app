package com.checkmate.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "servers")
data class ServerConnection(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val host: String,
    val port: Int = 3389,
    val username: String,
    val password: String,
    val domain: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val isConnected: Boolean = false
)
