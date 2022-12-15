package com.corradodev.kmmwithreactweb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform