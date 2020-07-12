package ru.netology.profile

import ru.netology.profile.model.profile

fun main() {
    val profile = profile(name = "Artem", surname = "Kaisin")
    println(profile.fullname)
}