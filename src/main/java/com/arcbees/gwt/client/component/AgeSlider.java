package com.arcbees.gwt.client.component;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;

@JsNamespace("jdramaix")
@JsType
public class AgeSlider {
  private static final String[] names = {"Manon", "Geneviève", "Christian", "Christopher", "Jason",
      "Jean-Christophe", "Joel", "Julien", "Larry", "Maxime", "Philippe"};

  public int age;
  public String name;
  public String color;
  public String owner;

  private int nameIndex;

  @JsExport
  public AgeSlider() {
  }

  /**
   * Called by polymer when the name changes.
   */
  @SuppressWarnings("unused")
  public void nameChanged(String oldValue, String newValue) {
    if (newValue != null && newValue.length() > 0) {
      name = newValue.substring(0, 1).toUpperCase() + newValue.substring(1);
    }
  }

  //   public void randomName() {
  public void randomName(Event event, Object details, Element sender) {
    name = names[nameIndex++];

    nameIndex = nameIndex % names.length;
  }

  /**
   * Called by Polymer when a component is created
   */
  @SuppressWarnings("unused")
  public void created() {
    age = 25;
    name = "Fred";
    color = "red";
    owner = "GWT";
  }

  // to explain that component extends automtically the
  // return js("this.$[$0]", id);
  public native <T> T $(String id) /*-{
      return this.$[id];
  }-*/;
}
