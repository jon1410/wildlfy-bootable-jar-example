package org.ijovic.demo.controller;

import java.io.Serial;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Named
@ApplicationScoped
public class IndexController implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Inject
    @ConfigProperty(name = "prop1", defaultValue = "No Prop Found, check the config")
    String prop1;

    @Inject
    @ConfigProperty(name = "prop2", defaultValue = "I should have been provided as ENV-VAR")
    String prop2;

    @Inject
    @ConfigProperty(name = "propExternal", defaultValue = "Could not load Prop, check the config")
    String propExternal;

    public String getProp1() {
        return this.prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return this.prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getPropExternal() {
        return propExternal;
    }

    public void setPropExternal(String propExternal) {
        this.propExternal = propExternal;
    }
}
