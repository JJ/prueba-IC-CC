package jjmerelo

import io.circe._,io.circe.parser._

class Hitos_IV(val hitos_file: String = "hitos.json")  {

  private var lines = scala.io.Source.fromFile("hitos.json").mkString
  private var _hitos = parse(lines )

  def hitos = _hitos

}


