package com.example.roomone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tampilMyFriendsFragment()
    }

    private fun gantiFragment(fm: FragmentManager, fragment: Fragment, frameId: Int){
        val transaction = fm.beginTransaction()
        transaction.replace(frameId, fragment)
        transaction.commit()
    }

    fun tampilMyFriendsFragment(){
        gantiFragment(supportFragmentManager, MyFriendsFragment.newInstance(), R.id.contentFrame)
    }
    fun tampilMyFriendsAddFragment(){
        gantiFragment(supportFragmentManager, MyFriendsAddFragment.newInstance(), R.id.contentFrame)
    }
}