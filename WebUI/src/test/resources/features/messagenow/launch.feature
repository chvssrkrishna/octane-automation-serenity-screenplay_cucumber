@launch
Feature:launch feature
#mvn clean verify -Dfailsafe.rerunFailingTestsCount=1 -Dtags="launch"
# mvn clean verify -Dfailsafe.rerunFailingTestsCount=1 -Dtags="launch"  -Dserenity.outputDirectory=target/site/messagenow -Dserenity.project.name=messagenow
# mvn clean verify -Dfailsafe.rerunFailingTestsCount=1 -Dcucumber.options="--tags @launch1"  -Dserenity.outputDirectory=target/site/messagenow -Dserenity.project.name=messagenow

  @launch1
  Scenario Outline: launch customer home page
    Given sudheer launch customer home page of dealer "<dealer>"
    When sudheer open chat panel from "Chat" Icon Button
    Then sudheer send "hello agent" message to dealer "<dealer>"
    Then sudheer submit contact information

    Examples:
      | dealer         |
      | krishna_toyota |
    @launch2
  Scenario Outline: launch customer home page Testing
    Given govardhan launch customer home page of dealer "<dealer>"
    When govardhan open chat panel from "Chat" Icon Button
    Then govardhan submit contact information

    Examples:
      | dealer         |
      | krishna_toyota |

