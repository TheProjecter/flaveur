package org.linuxgears.webnode.conf;

import org.linuxgears.webnode.HTTPProcessor;

public class Configuration {
    public static int port = 4567;
    public static Class<HTTPProcessor> processor = HTTPProcessor.class;
}
