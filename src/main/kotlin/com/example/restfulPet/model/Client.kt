package com.example.restfulPet.model

class Client {
    private var id: Int = 0;
    private var name: String = "";
    private var email: String = "";
    private var phone: String = "";

    fun getId(): Int {
        return id;
    }

    fun setId(id: Int) {
        this.id = id;
    }

    fun getName(): String {
        return name;
    }

    fun setName(name: String) {
        this.name = name;
    }

    fun getEmail(): String {
        return email;
    }

    fun setEmail(email: String) {
        this.email = email;
    }

    fun getPhone(): String {
        return phone;
    }

    fun setPhone(phone: String) {
        this.phone = phone;
    }
}
