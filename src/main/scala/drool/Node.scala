package drool

import scala.beans.BeanInfo

@BeanInfo
trait Node {
  var NodeType: String
  var HealthStatus: Int
  var Status: Boolean
}

