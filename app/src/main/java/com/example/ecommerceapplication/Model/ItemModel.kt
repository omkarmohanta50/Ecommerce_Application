package com.example.ecommerceapplication.Model

import android.media.Rating
import java.io.FileDescriptor

data class ItemModel(
    var title: String = "",
    var description:String = "",
    var picUrl:ArrayList<String> = ArrayList(),
    var size:ArrayList<String> =  ArrayList(),
    var price: Double= 0.0,
    var rating: Double = 0.0,
    var numberInCart:Int = 0
)
