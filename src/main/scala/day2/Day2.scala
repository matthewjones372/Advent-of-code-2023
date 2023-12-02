package day2

import scala.io.Source

enum Colour(count: Int):
  case Red(count: Int) extends Colour(count)
  case Green(count: Int) extends Colour(count)
  case Blue(count: Int) extends Colour(count)
object Colour:
  def from(s: String): Colour =
    s match
      case s"$count red"   => Red(count.toInt)
      case s"$count green" => Green(count.toInt)
      case s"$count blue"  => Blue(count.toInt)

final case class Rounds(rounds: List[Colour])
object Rounds:
  def from(s: String): Rounds =
    Rounds(s.split(",").map(_.trim).map(Colour.from).toList)

final case class Game(id: Int, rounds: List[Rounds]):
  def gamePossible(red: Int, green: Int, blue: Int): Boolean =
    val redPossible   = red >= maxRed
    val bluePossible  = blue >= maxBlue
    val greenPossible = green >= maxGreen
    redPossible && bluePossible && greenPossible

  def fewestProduct =
    maxBlue * maxGreen * maxRed

  private def maxRed: Int =
    rounds.flatMap(_.rounds).collect { case Colour.Red(count) => count }.max

  private def maxBlue: Int =
    rounds.flatMap(_.rounds).collect { case Colour.Blue(count) => count }.max

  private def maxGreen: Int =
    rounds.flatMap(_.rounds).collect { case Colour.Green(count) => count }.max
object Game:
  def from(s: String): Game =
    s match
      case s"Game $id: $rounds" =>
        Game(id.toInt, rounds.split(";").map(Rounds.from).toList)

object Day2:
  def readInput(path: String): Iterator[String] =
    Source.fromResource(path).getLines()

  def part1(input: Iterator[String], red: Int, green: Int, blue: Int): Int =
    input.map(Game.from).filter(_.gamePossible(red, green, blue)).map(_.id).sum

  def part2(input: Iterator[String]): Int =
    input.map(Game.from).map(_.fewestProduct).sum
