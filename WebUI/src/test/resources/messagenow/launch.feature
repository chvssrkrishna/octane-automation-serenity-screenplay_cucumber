Feature:launch feature


  Scenario Outline: launch customer home page
    Given krishna launch customer home page of dealer "<dealer>"
    When krishna open chat panel from "chat" Icon Button
    Then krishna send "hello agent" message to "hari"

    Examples:
      | dealer         |
      | krishna_toyota |

