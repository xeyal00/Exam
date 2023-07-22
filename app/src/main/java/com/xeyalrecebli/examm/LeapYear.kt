package com.xeyalrecebli.examm

import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    if(a%400==0){
        println("It's leap number!")
    }
    else{
        println("It's not leap number!")
    }
}