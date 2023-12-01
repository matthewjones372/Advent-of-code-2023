package day1

import scala.io.Source

object Day1:
  def readInput(path: String): Iterator[String] =
    Source.fromResource(path).getLines()

  def part1(input: Iterator[String]): Int =
    input.map(getNumber).sum

  def part2(input: Iterator[String]): Int =
    input.map(replaceWithDigit).map(getNumber).sum

  private def getNumber(line: String) =
    val numbers = line.filter(_.isDigit)
    (numbers.headOption, numbers.lastOption) match
      case (Some(head), Some(last)) => s"$head$last".toInt
      case _                        => throw new RuntimeException(s"Invalid input: $line")

  private val replacements = Map(
    "one"   -> "one1one",
    "two"   -> "two2two",
    "three" -> "three3three",
    "four"  -> "four4four",
    "five"  -> "five5five",
    "six"   -> "six6six",
    "seven" -> "seven7seven",
    "eight" -> "eight8eight",
    "nine"  -> "nine9nine",
    "zero"  -> "zero0zero"
  )
  private def replaceWithDigit(line: String) =
    replacements.foldLeft(line) { case (acc, (key, value)) =>
      acc.replaceAll(key, value)
    }
