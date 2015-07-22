package com.arcbees.gwt.client.component;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;

@JsNamespace("jdramaix")
@JsType
public class ExtendedAgeSlider extends AgeSlider {
  @JsExport
  public ExtendedAgeSlider() {
  }

  @Override
  public void randomName(Event event, Object details, Element sender) {
    super.randomName(event, details, sender);

    name = "Extended" + name;
  }
}
