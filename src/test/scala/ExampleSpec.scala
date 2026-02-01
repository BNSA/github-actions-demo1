import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExampleSpec extends AnyFlatSpec with Matchers {
  "The answer" should "be 42" in {
    40 + 2 shouldBe 42
  }

  // Uncomment to demo failure:
  // "This test" should "fail intentionally" in {
  //   1 shouldBe 2
  // }
}
