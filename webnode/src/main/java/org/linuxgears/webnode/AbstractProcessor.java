package org.linuxgears.webnode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: khilkeol
 * Date: 24.01.11
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractProcessor implements Runnable {

    private static Log log = LogFactory.getLog(AbstractProcessor.class);

    private InputStream in;
    private OutputStream out;

    public void run() {
        log.info("Starting....");
        process(in, out);
    }

    public abstract void process(InputStream in, OutputStream out);

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public OutputStream getOut() {
        return out;
    }

    public void setOut(OutputStream out) {
        this.out = out;
    }
}
