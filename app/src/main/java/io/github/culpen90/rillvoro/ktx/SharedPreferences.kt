package io.github.culpen90.rillvoro.ktx

import android.content.SharedPreferences

fun SharedPreferences.getStringSafe(key: String, defValue: String): String {
    return getString(key, null) ?: defValue
}
