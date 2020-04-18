package com.example.bestbeer

import android.os.Parcel
import android.os.Parcelable

class Cerveja (
    var name: String?,
    var mL: String?,
    var price: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(mL)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cerveja> {
        override fun createFromParcel(parcel: Parcel): Cerveja {
            return Cerveja(parcel)
        }

        override fun newArray(size: Int): Array<Cerveja?> {
            return arrayOfNulls(size)
        }
    }
}