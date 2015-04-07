/*
* Generated file
*
* Generated from: yang module name: host-tracker-impl yang module local name: dummy-data-listener-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Apr 06 08:07:15 PDT 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-05-28", name = "host-tracker-impl", namespace = "urn:opendaylight:alto:dummy-data-listener-impl")

public abstract class AbstractDummyDataListenerModuleFactory implements org.opendaylight.controller.config.spi.ModuleFactory {
    public static final java.lang.String NAME = "dummy-data-listener-impl";

    private static final java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs;

    @Override
    public final String getImplementationName() {
        return NAME;
    }

    static {
        java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> serviceIfcs2 = new java.util.HashSet<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>>();
        serviceIfcs = java.util.Collections.unmodifiableSet(serviceIfcs2);
    }

    @Override
    public final boolean isModuleImplementingServiceInterface(Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface> serviceInterface) {
        for (Class<?> ifc: serviceIfcs) {
            if (serviceInterface.isAssignableFrom(ifc)){
                return true;
            }
        }
        return false;
    }

    @Override
    public java.util.Set<Class<? extends org.opendaylight.controller.config.api.annotations.AbstractServiceInterface>> getImplementedServiceIntefaces() {
        return serviceIfcs;
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return instantiateModule(instanceName, dependencyResolver, bundleContext);
    }

    @Override
    public org.opendaylight.controller.config.spi.Module createModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.api.DynamicMBeanWithInstance old, org.osgi.framework.BundleContext bundleContext) throws Exception {
        org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule oldModule = null;
        try {
            oldModule = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule) old.getModule();
        } catch(Exception e) {
            return handleChangedClass(old);
        }
        org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule module = instantiateModule(instanceName, dependencyResolver, oldModule, old.getInstance(), bundleContext);
        module.setDataBroker(oldModule.getDataBroker());

        return module;
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule oldModule, java.lang.AutoCloseable oldInstance, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance);
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule instantiateModule(String instanceName, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.osgi.framework.BundleContext bundleContext) {
        return new org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule(new org.opendaylight.controller.config.api.ModuleIdentifier(NAME, instanceName), dependencyResolver);
    }

    public org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule handleChangedClass(org.opendaylight.controller.config.api.DynamicMBeanWithInstance old) throws Exception {
        throw new UnsupportedOperationException("Class reloading is not supported");
    }

    @Override
    public java.util.Set<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule> getDefaultModules(org.opendaylight.controller.config.api.DependencyResolverFactory dependencyResolverFactory, org.osgi.framework.BundleContext bundleContext) {
        return new java.util.HashSet<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.DummyDataListenerModule>();
    }

}
