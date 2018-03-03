package drool

import scala.beans.BeanInfo

@BeanInfo
case class ServiceNode(var HealthStatus: Int, var NodeType: String = "ServiceNode", var Status: Boolean = false) extends Node {
  def setStatus(): Unit = {
    this.Status = true
  }
}
