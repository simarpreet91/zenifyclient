package in.zenify.zenifyclient;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by trapti on 3/22/16.
 */
public class ZenifyClientApplication extends Application<ZenifyClientConfiguration> {
    public static void main(String[] args) throws Exception {
        new ZenifyClientApplication().run(args);
    }

    @Override
    public void run(ZenifyClientConfiguration configuration, Environment environment) throws Exception {
    }
}
