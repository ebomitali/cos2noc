"# cos2noc" 

Git repository for cos2noc project
The project defines a spring boot web server.

1. gradlew clean
to empty the project from existing artifacts
2. gradlew genJaxb build
firstly generates the jaxb objects and then compiles all java classes
It runs also a simple test that simply do a contextLoad to verify
that server settings are correct
3. gradlew bootRun
runs the server locally

Se resources/application.* file for configuration
bootRun accepts properties (ie server.port=9999) with -P flag (ie -Pserver.port=9999)