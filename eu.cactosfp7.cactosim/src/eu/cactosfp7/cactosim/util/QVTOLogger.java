package eu.cactosfp7.cactosim.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

/**
 * The Class QVTOLogger.
 */
public class QVTOLogger implements Log {

    /** The Constant logger. */
    private final Logger logger = Logger.getLogger(QVTOLogger.class);

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.m2m.qvt.oml.util.Log#log(java.lang.String)
     */
    @Override
    public void log(String message) {
        this.log(Level.INFO_INT, message, null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.m2m.qvt.oml.util.Log#log(int, java.lang.String)
     */
    @Override
    public void log(int level, String message) {
        this.log(level, message, null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.m2m.qvt.oml.util.Log#log(java.lang.String,
     * java.lang.Object)
     */
    @Override
    public void log(String message, Object param) {
        this.log(Level.INFO_INT, message, param);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.m2m.qvt.oml.util.Log#log(int, java.lang.String,
     * java.lang.Object)
     */
    @Override
    public void log(int level, String message, Object param) {
        Level logLevel = Level.toLevel(level);
        if (logger.isEnabledFor(logLevel)) {
            String paramToString = param == null ? "" : " <" + param + ">";
            logger.log(logLevel, message + paramToString);
        }
    }

}
