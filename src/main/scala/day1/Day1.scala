package day1

import zio.Chunk
import scala.io.Source

object Day1:
  def readInput(path: String): Chunk[String] = Chunk
    .fromIterator(Source.fromResource(path).getLines())
  def part1(input: Chunk[String]): Int = ???
  def part2(input: Chunk[String]): Int = ???
