package Higher_Order_Function

import scala.annotation.tailrec

/**
  * Created by ankit on 22/3/17.
  *1. Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
  * The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of the
  * previous two—the sequence begins 0, 1, 1, 2, 3, 5. Your definition should use a
  * local tail-recursive function.
  * def fib(n: Int): Int
  */
object Fibonaccci_Example extends App{
def fib(num:Int):Int=
{
  @annotation.tailrec
  def fib2(n:Int,f:(Int, Int)=> Int,a:Int, b:Int):Int=
    {
      if(n==num) a
      else fib2(n+1,f, b,f(a,b))
    }
  fib2(0,sum,0,1)
}
  def sum(a:Int,b:Int):Int=a+b
  //println("0")
  //println("1")
  println(fib(9))

//---OR----
  //Second way
  println(fibn(9))
  def fibn(x: Int): BigInt = {
    @tailrec def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, (next + prev))
    }
    fibHelper(x)
  }
}
