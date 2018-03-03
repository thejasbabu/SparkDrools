package drool




object RulesBuilder {
  def main(args: Array[String]): Unit = {
    val hostNode1 = HostNode(40)
    val hostNode2 = HostNode(60)
    val serviceNode1 = ServiceNode(60)
    val serviceNode2 = ServiceNode(60)

    val nodes = List(hostNode1, hostNode2, serviceNode1, serviceNode2)
    val session = KieService.newSession

    nodes map session.insert

    session.fireAllRules()
    session.dispose()

    val filteredNodes = nodes.filter(n => n.Status)
    println(filteredNodes)
  }
}
