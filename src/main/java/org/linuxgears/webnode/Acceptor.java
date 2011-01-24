package org.linuxgears.webnode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linuxgears.webnode.conf.Configuration;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: khilkeol
 * Date: 24.01.11
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class Acceptor implements Runnable {

    private static Log log = LogFactory.getLog(Acceptor.class);

    public static class Error {
        public static final int BIND_FAILED = -1;
    };

    public void run() {
        log.info("Starting....");

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(Configuration.port);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.exit(Error.BIND_FAILED);
        }

        Socket clientSocket;

        while (true) {
            try {
                clientSocket = serverSocket.accept();

                log.info("Creating processor");

                AbstractProcessor processor = Configuration.processor.newInstance();
                processor.setIn(clientSocket.getInputStream());
                processor.setOut(clientSocket.getOutputStream());

                new Thread(processor, "processor").start();

            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (InstantiationException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IllegalAccessException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }

    }
}
