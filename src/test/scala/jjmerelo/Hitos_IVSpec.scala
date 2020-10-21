package jjmerelo

import org.scalatest._
import flatspec._
import matchers._

class Hitos_IVSpec extends AnyFlatSpec with should.Matchers {
  "El objeto Hitos" should "devolver los hitos" in {
    var hitos_iv = new Hitos_IV
    hitos_iv.hitos should not equal {}
  }
}
