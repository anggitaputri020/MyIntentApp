package com.example.myintentapp1

import android.os.Parcelable

data class Person(
    val name: String?,
    val age: Int?,
    val email: String?,
    val city: String?
) : Parcelable
