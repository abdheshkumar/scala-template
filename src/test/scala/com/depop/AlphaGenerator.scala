package com.depop

import org.scalacheck.{Arbitrary, Gen}

trait AlphaGenerator {
  private val stringGen: Gen[String] = Gen.nonEmptyListOf(Gen.alphaChar).map(_.mkString)
  implicit val arbitraryString: Arbitrary[String] = Arbitrary(stringGen)
}
