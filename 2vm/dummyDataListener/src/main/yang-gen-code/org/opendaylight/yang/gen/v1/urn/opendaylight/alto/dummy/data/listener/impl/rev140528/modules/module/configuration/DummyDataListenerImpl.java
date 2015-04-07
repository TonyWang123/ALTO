package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.dummy.data.listener.impl.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;host-tracker-impl&lt;/b&gt;
 * &lt;br&gt;(Source path: &lt;i&gt;META-INF/yang/dummy-data-listener-impl.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * case dummy-data-listener-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:alto:dummy-data-listener-impl?revision=2014-05-28)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * &lt;/pre&gt;
 * The schema path to identify an instance is
 * &lt;i&gt;host-tracker-impl/modules/module/configuration/(urn:opendaylight:alto:dummy-data-listener-impl?revision=2014-05-28)dummy-data-listener-impl&lt;/i&gt;
 *
 */
public interface DummyDataListenerImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.alto.dummy.data.listener.impl.rev140528.modules.module.configuration.DummyDataListenerImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.cachedReference(org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:alto:dummy-data-listener-impl","2014-05-28","dummy-data-listener-impl"));

    DataBroker getDataBroker();

}

