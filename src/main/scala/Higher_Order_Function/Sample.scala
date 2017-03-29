package Higher_Order_Function

/**
  * Created by ankit on 23/3/17.
  */
object Sample {
  def ascendingOrdered(a:Int,b:Int):Boolean=  {
    if(a>b) false
    else true
  }
  def descendingOrder(a:Int,b:Int):Boolean=  {
    if(a>b) true
    else false
  }
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean={
    var inOrder = false
    for(i <- 0 until as.length - 1)
      if(ordered(as(i),as(i+1)))  inOrder=true
      else return false
    return inOrder
  }

  def main(args: Array[String]): Unit = {
    val arr:Array[Int]=Array(15,12,1,10,9)
    //val arr:Array[Int]=Array(1,2,3,8,12,90)
    //val arr:Array[Int]=Array(12,8,5,2,1)
    println(isSorted(arr,ascendingOrdered))
    println(isSorted(arr,descendingOrder(_,_)))

}

}
