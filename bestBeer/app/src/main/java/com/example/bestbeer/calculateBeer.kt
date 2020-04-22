package com.example.bestbeer

fun calculateBeer(price: Double, ml: Double): Double {
    var result =  (price / ml)*1000
    return result

}

fun compareBeers(firstBeer: Double, secondBeer: Double) : Double{
    if(firstBeer<secondBeer){
        return firstBeer
    } else {
        return secondBeer
    }
}