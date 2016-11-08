package eu.cactosfp7.cactosim.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class PathUtil {
    public static List<String> getPathsAsString(final List<EObject> elements) {
        final List<String> pathsAsString = new ArrayList<String>();
        for(EObject element : elements) {
            String filePath = getElementURItoString(element);
            filePath = addFilePrefixToPath(filePath);
            pathsAsString.add(filePath);
        }
        return pathsAsString;
    }

    private static String addFilePrefixToPath(String filePath) {
        if (!filePath.startsWith("platform:")) {
            filePath = "file:" + filePath;
        }
        return filePath;
    }
    
    public static String getPathAsString(final List<EObject> elements) {
        return addFilePrefixToPath(getElementURItoString(elements.get(0)));
    }
    
    private static String getElementURItoString(final EObject object) {
        return object.eResource().getURI().toString();
    }
}
