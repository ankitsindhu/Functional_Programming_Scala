package Higher_Order_Function

/**
  * Created by ankit on 22/3/17.
  *2.Implement isSorted, which checks whether an Array[A] is sorted according to a
    given comparison function:
    def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean
  */
object Sorted_Array extends App
{
  def isSorted[A](as: Array[A], order: (A,A) => Boolean) : Boolean=
  {
    var temp=false
    def loop(a:Int,b:Int):Boolean=
    {
      if(a<as.length-2)
      {
      if(order(as(a),as(b)))
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

 println(isSorted(Array(1,5,7,9,14,15), order))

  def order[A](a:A,b:A):Boolean=
  if(a.asInstanceOf[Int]<b.asInstanceOf[Int]) true
  else false
}
