package io.elfinos.scalapy

import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

object Main extends App {
  val listLengthPython = py.Dynamic.global.len(List(1, 2, 3, 4, 5).toPythonProxy)
  val listLength       = listLengthPython.as[Int]
  println(listLength)
  val tf               = py.module("tensorflow")
  println(tf)
}
