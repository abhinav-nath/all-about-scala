package com.codecafe.scala
package classes

object ValuesVariablesTypes extends App {

  // --- Values (constants, immutable) ---
  // Prefer vals over vars

  val x: Int = 42
  println(x)

  // x = 2    not allowed! vals are immutable

  val y = 21 // compiler can infer types
  println(y.getClass)

  val aString: String = "hello"; // semi-colons are allowed but optional

  val aBoolean: Boolean = false
  val aChar: Char = 'x'
  val anInt: Int = x
  val aShort: Short = 1234
  val aLong: Long = 3423421312312312L
  val aFloat: Float = 3.14f
  val aDouble: Double = 22.76

  // --- Variables (mutable) ---
  var aVariable: Int = 4

  aVariable = 5 // variables can be re-assigned unlike vals

}