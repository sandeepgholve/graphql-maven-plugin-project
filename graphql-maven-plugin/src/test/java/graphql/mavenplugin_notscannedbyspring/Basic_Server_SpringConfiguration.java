/**
 * 
 */
package graphql.mavenplugin_notscannedbyspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import graphql.mavenplugin.PluginMode;

/**
 * The Spring configuration used for JUnit tests
 * 
 * @author EtienneSF
 */
@Configuration
@ComponentScan(basePackages = "graphql.mavenplugin")
public class Basic_Server_SpringConfiguration extends AbstractSpringConfiguration {

	public Basic_Server_SpringConfiguration() {
		super("src/test/resources/basic.graphqls", PluginMode.server);
	}
}
