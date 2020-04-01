package com.example.imc_app

import android.os.Parcel
import android.os.Parcelable

data class dadosIMC(
    var etAltura: String?,
    var etPeso: String?
    //var imc: Double,
    //var imcResp: Double

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
        //parcel.readDouble(),
        //parcel.readDouble()
        )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(etAltura)
        parcel.writeString(etPeso)
        //parcel.writeDouble(imc)
        //parcel.writeDouble(imcResp)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<dadosIMC> {
        override fun createFromParcel(parcel: Parcel): dadosIMC {
            return dadosIMC(parcel)
        }

        override fun newArray(size: Int): Array<dadosIMC?> {
            return arrayOfNulls(size)
        }
    }
}