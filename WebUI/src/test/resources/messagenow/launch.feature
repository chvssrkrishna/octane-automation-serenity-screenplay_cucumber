Feature:launch feature


  Scenario Outline: launch customer home page
    Given krishna launch customer home page of dealer "<dealer>"
    When krishna open chat panel from "Chat" Icon Button
    Then krishna send "hello agent" message to dealer "<dealer>"
    Then krishna submit contact information

    Examples:
      | dealer         |
      | krishna_toyota |

