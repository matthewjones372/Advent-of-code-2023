package day1

import scala.io.Source

object Day1:
  def readInput(path: String): Iterator[String] =
    Source.fromResource(path).getLines()

  def part1(input: Iterator[String]): Int =
    input.flatMap(getNumber).sum

  def part2(input: Iterator[String]): Int =
    input.map(replaceWithDigit).flatMap(getNumber).sum

  private def getNumber(line: String) =
    val numbers = line.filter(_.isDigit)
    (numbers.headOption, numbers.lastOption) match
      case (Some(head), Some(last)) => s"$head$last".toIntOption
      case _                        => throw new RuntimeException(s"Invalid input: $line")

  private def replaceWithDigit(line: String) =
    line
      .replaceAll("one", "one1one")
      .replaceAll("two", "two2two")
      .replaceAll("three", "three3three")
      .replaceAll("four", "four4four")
      .replaceAll(j"five", "five5five")
      .replaceAll("six", "six6six")
      .replaceAll("seven", "seven7seven")
      .replaceAll("eight", "eight8eight")
      .replaceAll("nine", "nine9nine")
      .replaceAll("zero", "zero0zero")
