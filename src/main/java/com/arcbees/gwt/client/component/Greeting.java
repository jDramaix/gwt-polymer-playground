package com.arcbees.gwt.client.component;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;

@JsNamespace("jdramaix")
@JsType
public class Greeting {
  @JsType
  public static class Salutation {
    public String who;
    public String what;

    public Salutation(String what, String who) {
      this.who = who;
      this.what = what;
    }
  }

  public Salutation[] salutations;

  @JsExport
  public Greeting() {
  }


  @SuppressWarnings("unused")
  public void created() {
    salutations = new Salutation[4];

    salutations[0] = new Salutation("Hello", "World");
    salutations[1] = new Salutation("GoodBye", "DOM APIs");
    salutations[2] = new Salutation("Hello", "Declarative");
    salutations[3] = new Salutation("GoodBye", "Imperative");
  }
}
