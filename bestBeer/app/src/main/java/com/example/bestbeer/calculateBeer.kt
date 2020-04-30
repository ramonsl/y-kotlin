package com.example.bestbeer



fun compareBeers(firstBeer: Double, secondBeer: Double) : Double{
    if(firstBeer<secondBeer){
        return firstBeer
    } else {
        return secondBeer
    }
}