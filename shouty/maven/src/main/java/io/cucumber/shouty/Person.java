package io.cucumber.shouty;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(Integer distance) {
    }

    public void shout(String message) {
    }

    public List<String> getMessageHeard() {
        List<String> result = new ArrayList<>();
        result.add("free bagels at Sean's");
        result.add("Free coffe!");
        return result;
    }
}
