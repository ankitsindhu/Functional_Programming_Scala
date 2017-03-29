package Higher_Order_Function

/**
  * Created by ankit on 23/3/17.
  */
object Sorting_Array_Check {
  def ascendingOrdered(a:Int,b:Int):Boolean=  {
    if(a>b) false
    else true
  }
  def descendingOrder(a:Int,b:Int):Boolean=  {
    if(a>b) true
    else false
  }
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean={
    var temp=false
    def loop(a:Int,b:Int):Boolean=
    {
      if(a<as.length-2)
      {
        if(ordered(as(a),as(b)))
        {
          temp=true
          loop(a+1,b+1)
        }
        else
        {
          temp=false
          loop(as.length,as.length)
        }
      }
      temp
    }
    loop(0,1)
  }
  def main(args: Array[String]): Unit = {
    val arr:Array[Int]=Array(25,21,18,15)
    println(isSorted(arr,ascendingOrdered))
    println(isSorted(arr,descendingOrder))
  }
}
