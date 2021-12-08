package com.example.livedata.viewmodel

//Our imports
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedata.R
import com.example.livedata.model.User
import java.util.*

//Create viewModel class
class MainViewModel : ViewModel() {
    //Our instance properties
    var userMutableLiveData: MutableLiveData<ArrayList<User>?> = MutableLiveData()
    var userArrayList: ArrayList<User>? = null

    //Initialize stuff
    init {
        init()
    }

    private fun init() {
        populateList()
    }

    //generate dummy users
    fun populateList() {
        var user = User()
        user.name = "Yatish"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.male_young_64
        userArrayList = ArrayList()
        userArrayList!!.add(user)
        user = User()
        user.name = "Jane Doe"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.female_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Kael Doe"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.male_office_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Teresa Doe"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.feamle_avatar_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Ronnie Doe"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.male_grandma_64
        userArrayList!!.add(user)
        user = User()
        user.name = "Mary Doe"
        user.description = generateRandomPassword(7)
        user.img = R.drawable.female_afro_mp4
        userArrayList!!.add(user)
        userMutableLiveData.value = userArrayList
    }

    private fun generateRandomPassword(len: Int): String {
        val chars = ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyz!@#$%&")
        val rnd = Random()
        val sb = StringBuilder(len)
        for (i in 0 until len) sb.append(chars[rnd.nextInt(chars.length)])
        return sb.toString()
    }


}
//end