package drool

import scala.beans.BeanInfo

@BeanInfo
case class HostNode(var HealthStatus: Int, var NodeType: String = "HostNode", var Status: Boolean = false) extends Node {
  def setStatus(): Unit = {
    this.Status = true
  }
}

