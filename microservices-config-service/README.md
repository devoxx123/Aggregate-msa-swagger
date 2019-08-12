Spring Cloud Config Server
---------------------------
1.Spring Cloud Config provides server-side and client-side support for externalized configuration in a distributed system. 

2.The Config Server you have a central place to manage external properties for applications across all environments. 

3.The concepts on both client and server map identically to the Spring Environment and PropertySource abstractions, so they fit very well with Spring applications but can be used with any application running in any language.

4.As an application moves through the deployment pipeline from dev to test and into production, you can manage the configuration between those environments and be certain that applications have everything they need to run when they migrate. 

5.The default implementation of the server storage backend uses git, so it easily supports labelled versions of configuration environments as well as being accessible to a wide range of tooling for managing the content.

6.It is easy to add alternative implementations and plug them in with Spring configuration.

Features

Spring Cloud Config Server

Spring Cloud Config Server offers the following benefits:

HTTP resource-based API for external configuration (name-value pairs or equivalent YAML content)

Encrypt and decrypt property values (symmetric or asymmetric)

Embeddable easily in a Spring Boot application using @EnableConfigServer

Spring Cloud Config Client
Specifically for Spring applications, Spring Cloud Config Client lets you:

Bind to the Config Server and initialize Spring Environment with remote property sources.

Encrypt and decrypt property values (symmetric or asymmetric).

@RefreshScope for Spring @Beans that want to be re-initialized when configuration changes.

Use management endpoints:

/env for updating Environment and rebinding @ConfigurationProperties and log levels.

/refresh for refreshing the @RefreshScope beans.

/restart for restarting the Spring context (disabled by default).

/pause and /resume for calling the Lifecycle methods (stop() and start() on the ApplicationContext).

Bootstrap application context: a parent context for the main application that can be trained to do anything (by default, it binds to the Config Server and decrypts property values).
