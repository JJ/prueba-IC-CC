package jjmerelo

import io.circe._
import org.specs2._


class Hitos_IVSpec2 extends Specification { def is = s2"""

 Especificación para comprobar Hitos_IV

 El objeto tipo Hitos en hitos_iv debe
   existir                                         $exists """
  var hitos_iv = new Hitos_IV
  def exists = hitos_iv.hitos must beRight
}
