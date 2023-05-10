Feature:launch feature


  Scenario Outline: launch customer home page
    Given customer launch home page of dealer "<dealer>"
    When customer open chat panel from "chat" Icon Button
    Then customer send "hello agent" message to "hari"

    Examples:
    |dealer|
    |krishna_toyota |

