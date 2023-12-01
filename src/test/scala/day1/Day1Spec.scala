package day1

import zio.test.ZIOSpecDefault
import zio.test.Assertion.*
import zio.test.*

object Day1Spec extends ZIOSpecDefault:
  def spec = suite("Day1Spec")(
    test("part1 example") {
      assert(Day1.part1(Day1.readInput("day1/example.txt")))(equalTo(142))
    },
    test("part1") {
      assert(Day1.part1(Day1.readInput("day1/input.txt")))(equalTo(55607))
    },
    test("part2 example") {
      assert(Day1.part2(Day1.readInput("day1/example2.txt")))(equalTo(281))
    },
    test("part2") {
      assert(Day1.part2(Day1.readInput("day1/input.txt")))(equalTo(55291))
    }
  )
