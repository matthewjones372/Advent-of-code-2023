package day2

import zio.test.Assertion.*
import zio.test.*

object Day2Spec extends ZIOSpecDefault:
  def spec = suite("Day2Spec")(
    test("part1 example") {
      assert(Day2.part1(Day2.readInput("day2/example.txt"), 12, 13, 14))(equalTo(8))
    },
    test("part1") {
      assert(Day2.part1(Day2.readInput("day2/input.txt"), 12, 13, 14))(equalTo(2101))
    },
    test("part2 example") {
      assert(Day2.part2(Day2.readInput("day2/example2.txt")))((equalTo(2286)))
    },
    test("part2") {
      assert(Day2.part2(Day2.readInput("day2/input.txt")))(equalTo(58269))
    }
  )
