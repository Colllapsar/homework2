package ru.netology.hiearchy.view

open class View {
    open fun click(click :String = "View clicked") {
        println(click)
    }
}

