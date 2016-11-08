package eu.cactosfp7.cactosim.optimisationconnector;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "eu.cactosfp7.cactosim";

    // The shared instance
    private static Activator plugin;

    /**
     * Returns the shared plugin instance.
     *
     * @return the shared plugin instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

}