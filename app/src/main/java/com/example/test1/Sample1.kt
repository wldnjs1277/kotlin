package com.example.test1

fun main(){
    // string Template
    /*val name="jiwon"
    val lastname = "Lee"
    println("my name is ${name +" "+lastname}")
    println("this is 2\$")*/
    checknumber(1)
}
//함수

fun helloworld(){
    println("Hello world!")
}
fun add(a:Int, b:Int):Int{
    return a+b
}
fun hi(){
    val a : Int= 5
    var b : Int= 10
    val c = 100
    var d = 100
    var name = "jiwon"
    var e : String
}
//조건식

fun maxBy(a :Int, b: Int) : Int {
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a:Int,b: Int) : Int = if(a>b) a else b

fun checknumber(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }
    var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")
    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Array & List
fun array(){
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 : Array<Any> = arrayOf(1,"a",3,4f)
    val list2 : List<Any> = listOf(1,"d",11L)

    array[0] = 1
    var result = list.get(0)

    val arraylist : ArrayList<Int> = arrayListOf<Int>()
    arraylist.add(10)
    arraylist.add(20)
}
