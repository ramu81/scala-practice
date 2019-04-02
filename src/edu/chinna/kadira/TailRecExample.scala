package edu.chinna.kadira

import scala.annotation.tailrec

object TailRecExample extends App {
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(i: Int, lastEle: Int, nextLastEle: Int): Int =
      if (i >= n) lastEle
      else fibonacciHelper(i + 1, lastEle + nextLastEle, lastEle)

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }

  println(fibonacci(8))

  def isPrimeNum(num:Int):Boolean = {
    def primeNumHelper(x:Int,isStillPrime:Boolean) : Boolean={
      if(!isStillPrime) false
      else if(x<=1) true
      else primeNumHelper(x-1,num%x != 0 && isStillPrime)

    }
    primeNumHelper(num/2,true)
  }
println(isPrimeNum(4))
}

