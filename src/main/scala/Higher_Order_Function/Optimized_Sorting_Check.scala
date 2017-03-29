package Higher_Order_Function

/**
  * Created by ankit on 23/3/17.
  *2.Implement isSorted, which checks whether an Array[A] is sorted according to a
    given comparison function:
    def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean
    with generics
  */
object Optimized_Sorting_Check extends App{
  def isSorted[A](as: Array[A], order: (A,A) => Boolean) : Boolean= {
    for (i <- 0 until as.length - 1) {
      if (order(as(i), as(i + 1)))
        return false
    }
    true
  }
  val arr:Array[Int]=Array(1,2,3,8,12,90)
  val arr1:Array[Int]=Array(12,8,5,2,1)
  println(isSorted(arr, check_Ascending))
  println(isSorted(arr1, check_Descending))

  def check_Ascending[A](a:A,b:A):Boolean= a match {
    case a:Int => a.asInstanceOf[Int]>b.asInstanceOf[Int]
    case a:String => a.asInstanceOf[String]>b.asInstanceOf[String]
    case a:Double =>a.asInstanceOf[Double]>b.asInstanceOf[Double]
   /*if(a.asInstanceOf[Int]>b.asInstanceOf[Int]) true
    else false*/
  }
  def check_Descending[A](a:A,b:A):Boolean= a match {
    case a: Int => a.asInstanceOf[Int] < b.asInstanceOf[Int]
    case a: String => a.asInstanceOf[String] < b.asInstanceOf[String]
    case a: Double => a.asInstanceOf[Double] < b.asInstanceOf[Double]
    /*if(a.asInstanceOf[Int]<b.asInstanceOf[Int]) true
    else false*/
  }
}
