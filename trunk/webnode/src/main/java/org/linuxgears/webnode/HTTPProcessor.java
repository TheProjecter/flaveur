package org.linuxgears.webnode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: khilkeol
 * Date: 24.01.11
 * Time: 15:31
 * To change this template use File | Settings | File Templates.
 */
public class HTTPProcessor extends AbstractProcessor {

    private static Log log = LogFactory.getLog(HTTPProcessor.class);

    @Override
    public void process(InputStream in, OutputStream out) {
        log.info("Starting...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        while (true) {
            try {
                String line = reader.readLine();

                log.info(line);
            } catch (IOException e) {
                log.info("error reading line from client");
            }
        }
    }
}
