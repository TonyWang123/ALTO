package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.dummy.data.listener.impl.DataBroker;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl
 *
 */
public class DummyDataListenerImplBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl> {

    private DataBroker _dataBroker;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> augmentation = new HashMap<>();

    public DummyDataListenerImplBuilder() {
    }

    public DummyDataListenerImplBuilder(DummyDataListenerImpl base) {
        this._dataBroker = base.getDataBroker();
        if (base instanceof DummyDataListenerImplImpl) {
            DummyDataListenerImplImpl _impl = (DummyDataListenerImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public DataBroker getDataBroker() {
        return _dataBroker;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DummyDataListenerImplBuilder setDataBroker(DataBroker value) {
        this._dataBroker = value;
        return this;
    }
    
    public DummyDataListenerImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DummyDataListenerImplBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> augmentationType) {
        this.augmentation.remove(augmentationType);
        return this;
    }

    public DummyDataListenerImpl build() {
        return new DummyDataListenerImplImpl(this);
    }

    private static final class DummyDataListenerImplImpl implements DummyDataListenerImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl.class;
        }

        private final DataBroker _dataBroker;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> augmentation = new HashMap<>();

        private DummyDataListenerImplImpl(DummyDataListenerImplBuilder base) {
            this._dataBroker = base.getDataBroker();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>singletonMap(e.getKey(), e.getValue());
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public DataBroker getDataBroker() {
            return _dataBroker;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_dataBroker == null) ? 0 : _dataBroker.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl other = (org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl)obj;
            if (_dataBroker == null) {
                if (other.getDataBroker() != null) {
                    return false;
                }
            } else if(!_dataBroker.equals(other.getDataBroker())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DummyDataListenerImplImpl otherImpl = (DummyDataListenerImplImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("DummyDataListenerImpl [");
            boolean first = true;
        
            if (_dataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataBroker=");
                builder.append(_dataBroker);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
