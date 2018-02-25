import org.scalamock.scalatest.MockFactory
import org.scalatest.{FunSpec, GivenWhenThen}

class SampleTest extends FunSpec with GivenWhenThen with MockFactory {

  describe("Main test") {
    it("Should create test method") {
      assert(1 == 1)
    }
  }
}
