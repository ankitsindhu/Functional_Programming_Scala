package collection_API

/**
  * Created by ankit on 28/3/17.
  */
object program1 extends App{
  val greetStrings = new Array[String](3)
  greetStrings.update(0, "Hello")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "world!!")
  greetStrings.update(2, "Ankit!\n")
  greetStrings(2)="Kumar Sindhu"

  val numNames = Array("zero", "one", "two")

  println(numNames(0))

  numNames.foreach(println _)

  for (i <- 0 to numNames.length-1)
    print(" "+numNames(i))
println()
  /*for (i <- 0.to(2))
    print(greetStrings.apply(i))*/
//----OR-----------
  for (i <- 0.to(2))
    print(greetStrings.apply(i))

}
