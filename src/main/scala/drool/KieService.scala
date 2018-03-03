package drool

import org.kie.api.{KieBase, KieServices}
import org.kie.api.runtime.{KieContainer, KieSession, StatelessKieSession}

object KieService {
  val kieServices: KieServices = KieServices.Factory.get
  val kContainer: KieContainer = kieServices.getKieClasspathContainer
  val kSession: KieSession = kContainer.newKieSession

  def newStatelessSession: StatelessKieSession = kContainer.newStatelessKieSession()

  def executeStateless(facts: List[Any]): Unit = newStatelessSession.execute(facts)

  def newSession: KieSession = kSession

  def loadRules: KieBase = kContainer.getKieBase()

}
