package com.example.recyclerview_lailafiqyrahayu_18

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Foto(
    val imgfoto: Int,
    val namefoto: String,
    val descfoto: String
) : Parcelable
