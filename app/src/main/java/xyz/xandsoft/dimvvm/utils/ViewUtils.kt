package xyz.xandsoft.dimvvm.utils

import android.content.Context
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast

fun Context.showShortToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun ProgressBar.showProgress() {
    visibility = View.VISIBLE
}

fun ProgressBar.hideProgress() {
    visibility = View.GONE
}