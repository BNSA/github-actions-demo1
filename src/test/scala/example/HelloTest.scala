package example

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {

  test("addition should work") {
    assert(Hello.add(1, 1) == 2)
  }

}
