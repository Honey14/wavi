package dev.honey.wavi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform