package com.codecafe.scala
package classes

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // x = 2    not allowed! vals are immutable

  val y = 21 // compiler can infer types
  println(y.getClass)

  val str: String = "hello"; // semi-colons are allowed but optional

}