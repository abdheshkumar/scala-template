package com.depop

import org.scalacheck.{Arbitrary, Gen}

class AppSpec extends SpecUtil {

  case class Test(s: String, n: Int)
  implicit val testGen = Arbitrary(Gen.resultOf(Test))
  "This" should "work" in {
    forAll { (a: Test, b: String) =>
      a.s.length + b.length should equal((a.s + b).length)
    }
  }
}
