package org.opendaylight.controller.dummyNB;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class DummyNBApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(DummyNB.class);
        return classes;
    }
}