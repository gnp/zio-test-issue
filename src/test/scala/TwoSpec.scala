import zio._
import zio.test.Assertion._
import zio.test._

object TwoSpec extends ZIOSpecDefault {

  override def spec: Spec[TestEnvironment with Scope, Any] = suite("TwoSpec")(
    test("TwoSpec Test 1") {
      assert(1)(equalTo(1))
    },
    test("TwoSpec Test 2") {
      assert(2)(equalTo(2))
    }
  )

}
