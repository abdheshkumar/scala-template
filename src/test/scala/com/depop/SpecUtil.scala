package com.depop

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

trait SpecUtil
    extends AnyFlatSpec
    with Matchers
    with AlphaGenerator
    with ScalaCheckDrivenPropertyChecks
