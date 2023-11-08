Feature: Hear shout
  Scenario: Listener is whithin range
    Given Lucy is lcoated 15 meters from Sean
    When Sean shouts "free bagels ar Sean's"
    Then Lucy hears Sean's message