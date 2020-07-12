package ru.netology.profile.model

open class profile(
    val id :Int = 1,
    val login :String = "colllapsar",
    val name :String,
    val surname :String,
    var status :String = "god",
    var avatar :String = "-_-"
){
    val fullname :String = "$name $surname"
}