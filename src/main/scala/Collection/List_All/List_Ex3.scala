package Collection.List_All

/**
  * Created by ankit on 24/3/17.
  * 1.Creating uniform list (use of fill function)
  * fill function create a list consisting 0 or more copies of an element
  * 2.Tabulating a Function
  * List.tabulate is also used to fill the list with elements but can be used with a function that applies on
  * all the elements of the list before tabulating it.
  * --> List.tabulate takes two parameters, the first gives the dimensions of the list to create and second for
  * the elements of the list
  * 3. Reverse a list-- reversing a list with List.reverse method
  */
object List_Ex3 extends App{
  val fruit:List[String]=List("Oranges ","Mangoes ","Pears ")
  val fruit2=List("Oranges ","Mangoes ","Pears ")
  val fruit4=List.fill(3)("Hello")
  val cube=List.tabulate(5)(n=> n*n*n)
  val multi=List.tabulate(4,5)((x,y)=> x*y)
  println("filled list with three strings\n")
  println(fruit4)
  println()
  fruit4.foreach(print(_))
  println("Tabulating List examples\n")
  cube.foreach(print(_))
  println()
  multi.foreach(print(_))
  println()
 fruit2.reverse.foreach(print(_))
}
