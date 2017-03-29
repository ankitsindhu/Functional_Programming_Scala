package collection_API

/**
  * Created by ankit on 29/3/17.
  */
object Map_Example extends App{
  var capital = Map("US" -> "Washington", "France" -> "Paris", "India" -> "Paris")
  capital.foreach(x=> println(x._2=="Paris")) //returns true or false
  capital.foreach(x=> if(x._2=="Paris") println(x))    // print key and values having given value
  capital.foreach(x=> if(x._2=="Paris") println(x._1)) //print keys having given value
}
