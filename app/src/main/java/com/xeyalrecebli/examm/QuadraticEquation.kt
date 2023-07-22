package com.xeyalrecebli.examm

import java.lang.Math.sqrt
import java.util.Scanner

fun main(){
    val sc= Scanner(System.`in`)
    val a=sc.nextDouble()
    val b=sc.nextDouble()
    val c=sc.nextDouble()
    val d=b*b-4*a*c
    var result1=0
    var result2=0
    if(d.toInt()==0){
        result1= ((-1*b)/(2*a)).toInt()
        println(result1)
    }
    else if(d>0){
        result1=((-1*b)+sqrt(d)/(2*a)).toInt()
        result2=((-1*b)-sqrt(d)/(2*a)).toInt()
        println(result1)
        println(result2)
    }
    else{
        println("This equation has not real roots!")
    }

}