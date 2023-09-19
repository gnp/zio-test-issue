import zio._
import zio.test.Assertion._
import zio.test._

object OneSpec extends ZIOSpecDefault {

  override def spec: Spec[TestEnvironment with Scope, Any] = suite("OneSpec")(
    test("OneSpec Test 1") {
      assert(1)(equalTo(1))
    },
    test("OneSpec Test 2") {
      assert(2)(equalTo(2))
    }
  )

}
