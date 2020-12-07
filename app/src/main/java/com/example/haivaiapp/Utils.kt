//package com.example.haivaiapp
//
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.app.ActivityCompat
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentTransaction
//
//fun AppCompatActivity.addFragment(fragment: Fragment, id: Int) {
//    supportFragmentManager.inTransaction {
//        add(id, fragment)
//    }
//}
//
//fun AppCompatActivity.replaceFragment(fragment: Fragment, id: Int) {
//    supportFragmentManager.inTransaction { replace(id, fragment) }
//}
//
//fun AppCompatActivity.removeFragment(fragment: Fragment) {
//    supportFragmentManager.inTransaction { remove(fragment) }
//}
//
//inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransactionz) {
//    beginTransaction().func().addToBackStack(null).commit()
//}