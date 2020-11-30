package com.example.haivaiapp.postImage

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.haivaiapp.R
import kotlinx.android.synthetic.main.activity_pick_image.*

class PickImageActivity : AppCompatActivity() {
    companion object {
        private const val COLUMN = 3
        private const val PERMISSION_CODE = 100
        private const val ARG_PICTURE = "picture"
    }

    private var adapter: PictureAdapter? = null
    private var pictureList = mutableListOf<Picture>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_image)
        checkPermission()
    }

    private fun initAdapter() {
        pictureList.addAll(Utils.getImage(this))
        pictureList.reverse()
        adapter = PictureAdapter(pictureList)
        adapter?.onItemClick = {

        }
       recyclerViewImage.layoutManager = GridLayoutManager(this, COLUMN)
        recyclerViewImage.adapter = adapter
    }

    private fun checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) ==
                PackageManager.PERMISSION_DENIED
            ) {
                val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                requestPermissions(permissions, PERMISSION_CODE)
            } else {
                initAdapter()
            }
        } else {
            initAdapter()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            when (requestCode) {
                PERMISSION_CODE -> initAdapter()
            }
        } else {
            Toast.makeText(this, "deo cho", Toast.LENGTH_SHORT).show()
        }
    }
}