package com.amanguru.mathoprations

import java.lang.IllegalArgumentException

class MathOprtaion {

    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun min(a:Int,b:Int):Int
    {
        return a-b
    }
    fun mul(a:Int,b:Int):Int{
        return a*b
    }
    fun div(a:Int,b:Int):Int
    {
        if(b==0)
        {
            throw IllegalArgumentException("Last Number Cannot be Zero")
        }else
        return a/b
    }
}