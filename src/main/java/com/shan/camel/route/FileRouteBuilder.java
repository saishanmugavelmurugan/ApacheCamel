package com.shan.camel.route;

import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\auros\\OneDrive\\Documents\\VISA?noop=true").autoStartup(false)
                .to("file:C:\\Users\\auros\\OneDrive\\Documents\\output");

        from("file:C:\\Users\\auros\\OneDrive\\Documents\\VISA?noop=true").autoStartup(false)
                .to("aws2-s3://test-bucket");
    }
}
