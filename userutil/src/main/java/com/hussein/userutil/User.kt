package com.hussein.userutil

class User(name: String, email: String, phone: String) { //primary constructor
    var name:String= name
        get() = field
        set(value) { field = value }
    var email:String= email
        get() = field
        set(value) { field = value }
    var phone:String= phone
        get() = field
        set(value) { field = value }

    //Secondary Constructor
   /* constructor(name: String, email: String, phone: String) {
        this.name = name
        this.email = email
        this.phone = phone
    }*/
    init {
        this.name = name
        this.email = email
        this.phone = phone
    }



}