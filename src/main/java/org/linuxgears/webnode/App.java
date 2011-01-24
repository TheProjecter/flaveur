package org.linuxgears.webnode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 */
public class App {
    private static Log log = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        log.info("Hello World!");

        Thread acceptorThread = new Thread(new Acceptor(), "acceptor");
        acceptorThread.start();
    }
}
