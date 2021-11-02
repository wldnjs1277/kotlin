package com.example.test1

fun main(){
    helloworld()
    println(add(a=4,b=5))
}
//1.함수

fun helloworld(){
    println("Hello world!")
}
fun add(a:Int, b:Int):Int{
    return a+b
}