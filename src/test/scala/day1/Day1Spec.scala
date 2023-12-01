package day1

import zio.test.ZIOSpecDefault
import zio.test.Assertion.*
import zio.test.*

object Day1Spec extends ZIOSpecDefault:
  def spec = suite("Day1Spec")(
    test("part1 example") {
      val input = Day1.readInput("day1/example.txt")
      assert(Day1.part1(input))(equalTo(142))
    },
    test("part1") {
      val input = Day1.readInput("day1/input.txt")
      assert(Day1.part1(input))(equalTo(55607))
    },
    test("part2 example") {
      val input = Day1.readInput("day1/example2.txt")
      assert(Day1.part2(input))(equalTo(281))
    },
    test("part2") {
      val input = Day1.readInput("day1/input.txt")
      assert(Day1.part2(input))(equalTo(55291))
    }
  )
