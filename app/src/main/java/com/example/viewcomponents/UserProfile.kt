package com.example.viewcomponents

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**     Code with ❤
╔════════════════════════════╗
║  Created by Sibel YILDIZ   ║
╠════════════════════════════╣
║ sibelyldz2012@gmail.com    ║
╠════════════════════════════╣
║     19/02/2020 - 15:44     ║
╚════════════════════════════╝
 */

@Parcelize
data class UserProfile(
    val keyName: String,
    val keyAge: Int,
    val keyIsMale: Boolean
) : Parcelable