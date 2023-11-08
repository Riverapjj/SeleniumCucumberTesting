Feature: Hear shout
  Scenario: Listener is whithin range
    Given Lucy is 15 meters from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener hears a different message
    Given Lucy is 15 meters from Sean
    When Sean shouts "Free coffe!"
    Then Lucy should hear Sean's message