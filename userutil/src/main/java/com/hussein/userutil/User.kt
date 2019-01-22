package com.hussein.userutil

class User {
    private var name:String=""
                get() = field
                set(value) {field=value}
    private var email:String=""
               get() = field
               set(value) {field=value}
    private var phone:String=""
                get() = field
                set(value) {field=value}

    constructor(name: String, email: String, phone: String) {
        this.name = name
        this.email = email
        this.phone = phone
    }
    init {
        this.name = name
        this.email = email
        this.phone = phone
    }



}