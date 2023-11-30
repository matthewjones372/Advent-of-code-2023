package day1

import zio.Chunk

import scala.io.Source
import scala.util.Using



@main def main =
  val lines = Chunk
    .fromIterator(Source.fromResource("day1_input.txt").getLines())

  println(s"Part 1: $lines")
