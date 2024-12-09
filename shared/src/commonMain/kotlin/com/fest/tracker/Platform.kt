package com.fest.tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform