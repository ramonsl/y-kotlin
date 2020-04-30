package com.example.bestbeer

import android.os.Parcel
import android.os.Parcelable

class Beer (
    var name: String?,
    var mL: Double,
    var price: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeDouble(mL)
        parcel.writeDouble(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Beer> {
        override fun createFromParcel(parcel: Parcel): Beer {
            return Beer(parcel)
        }

        override fun newArray(size: Int): Array<Beer?> {
            return arrayOfNulls(size)
        }
    }
    fun calculateBeer(): Double {
        var result =  (price / mL)*1000
        return result
    }
}