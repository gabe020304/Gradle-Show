package org.gradleproj;

import java.util.List;

public class Dog {

    private List<String> nameList;

    public Dog(List<String> nameList) {
        this.nameList = nameList;
    }

    public String getName(int index) {
        return nameList.get(index);
    }
}
