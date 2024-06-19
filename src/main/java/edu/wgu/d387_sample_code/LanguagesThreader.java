package edu.wgu.d387_sample_code;

import java.util.*;

public class LanguagesThreader extends Thread {
    private String bundleName;
    private ArrayList<String> msgs;

    public LanguagesThreader() {}

    public LanguagesThreader(String bundleName, ArrayList<String> msgs) {
        this.bundleName = bundleName;
        this.msgs = msgs;
    }

    public void run() {
        ResourceBundle translationBundle = ResourceBundle.getBundle(bundleName);
        msgs.add(translationBundle.getString("welcome"));
    }
}
