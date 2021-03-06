package com.ikempf.mower.model

sealed trait Command

object Command {
  case object Advance   extends Command
  case object TurnLeft  extends Command
  case object TurnRight extends Command
}
