package day1

import zio.Chunk
import scala.io.Source

object Day1:
  def readInput(path: String): Chunk[String] = Chunk
    .fromIterator(Source.fromResource(path).getLines())

  def part1(input: Chunk[String]): Int =
    input.map(firstLastNumber).sum
  def part2(input: Chunk[String]): Int =
    input.map(replaceWithNumberPad).map(firstLastNumber).sum

  private def firstLastNumber(line: String) =
    val numbers = line.filter(_.isDigit)
    s"${numbers.head}${numbers.last}".toInt

  private def replaceWithNumberPad(line: String) =
    line
      .replaceAll("one", "one1one")
      .replaceAll("two", "two2two")
      .replaceAll("three", "three3three")
      .replaceAll("four", "four4four")
      .replaceAll("five", "five5five")
      .replaceAll("six", "six6six")
      .replaceAll("seven", "seven7seven")
      .replaceAll("eight", "eight8eight")
      .replaceAll("nine", "nine9nine")
      .replaceAll("zero", "zero0zero")
