package com.buschmais.jqassistant.plugin.common.test;

import java.io.IOException;

import com.buschmais.jqassistant.neo4j.embedded.EmbeddedNeo4jConfiguration;

import org.junit.jupiter.api.Test;

/**
 * Manual test to start a server.
 */
public class EmbeddedNeo4jServerMT extends AbstractPluginIT {

    @Override
    protected EmbeddedNeo4jConfiguration getEmbeddedNeo4jConfiguration() {
        return EmbeddedNeo4jConfiguration.builder().connectorEnabled(true).build();
    }

    @Test
    @TestStore
    public void server() throws IOException {
        System.out.println("Hit Enter to continue.");
        System.in.read();
    }
}
