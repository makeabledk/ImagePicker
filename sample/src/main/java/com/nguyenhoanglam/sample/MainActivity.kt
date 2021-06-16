package com.nguyenhoanglam.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nguyenhoanglam.imagepicker.ui.imagepicker.ImagePicker


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImagePicker.with(this)
                .setFolderMode(false)
                .setFolderTitle("Album")
                .setDirectoryName("Image Picker")
                .setMultipleMode(true)
                .setShowNumberIndicator(true)
                .setMaxSize(10)
                .setLimitMessage("You can select up to 10 images")
                .setRequestCode(100)
                .start()
    }
}