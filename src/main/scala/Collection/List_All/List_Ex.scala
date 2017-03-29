package Collection.List_All

/**
  * Created by ankit on 24/3/17.
  * Basic Operations on list
  * There are only three basic operations on lists - head, tail and isEmpty
  */
object List_Ex extends App{
val fruit:List[String]=List("Oranges","Mangoes","Pears")
  val fruit2=List("Oranges","Mangoes","Pears")
  val nums=List(1,2,4,5)
  val empty:List[Nothing]=List()
  val empty2=List()
  val dim:List[List[Int]]=List(List(1,0,1),List(1,2,1),List(2,3,4))
  val dim2=List(List(1,0,1),List(1,2,1),List(2,3,4))
  val nums2=1::(2::(3::(4::Nil)))
  nums.foreach(print(_))
  println()
  dim2.foreach(_.foreach(print(_)))
  println()
  dim.foreach(_.foreach(print(_)))
  println()
  dim.tail.foreach(_.foreach(print(_)))
  println()
  dim.tail.tail.foreach(_.foreach(print(_)))
  println()
  empty.foreach(print(_))
  println(empty.isEmpty)
  nums.foreach(print(_))
  println()
  fruit.foreach(print(_))
  println()
  fruit2.foreach(print(_))
}
