package com.julioluis.singleresposability.formatter;

import org.springframework.stereotype.Component;

@Component
public class ReportFormatter {

    public String convertObjectToXML(Object object) {
        return "XML "+ object.toString();
    }

    public String convertObjectToCVS(Object object) {
        return "CVS "+ object.toString();
    }

    public String getFormatterValue() {
        return "formatter";
    }
}
