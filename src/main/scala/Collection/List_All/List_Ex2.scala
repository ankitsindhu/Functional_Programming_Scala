package Collection.List_All

/**
  * Created by ankit on 24/3/17.
  * Concatination on lists
  */
object List_Ex2 extends App{
  val fruit:List[String]=List("Oranges ","Mangoes ","Pears ")
  val fruit2=List("Oranges ","Mangoes ","Pears ")
  val nums=List(1,2,4,5)
  val empty:List[Nothing]=List()
  val empty2=List()
  val dim:List[List[Int]]=List(List(1,0,1),List(1,2,1),List(2,3,4))
  val dim2=List(List(1,0,1),List(1,2,1),List(2,3,4))
  val nums2=1::(2::(3::(4::Nil)))
  val fruitfamily= fruit ::: fruit2  //append all the elements of second list into first list and make a
                                      // list of all the elements
  val fruitfamily2= fruit :: fruit2 //just append all the elements of second list after first list
                                    // and makes lists of lists

  val fruitfamily3=List.concat(fruit,fruit2)  //make a list of all the elements
  fruitfamily.foreach(print(_))
  println()
  fruitfamily2.foreach(print(_))
  println()
  println(fruitfamily2)
  println()
  fruitfamily3.foreach(print(_))
}
