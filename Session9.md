Download and install JDK 5
http://www.oracle.com/technetwork/java/archive-139210.html
(JDK5u18 worked)

Download and install maven 2.0.9 (needed for compatibility with a specific project)

Reviewed Continuum project site
  * Checkstyle
  * Cobertura
  * PMD
  * Code duplication

Found buglet (unused parameter in private method)

Wrestled with build of project
  * maven / Java compatibility issues
  * Nexus repository configuration in settings.xml
  * Generating SSH keypair, deploying public key to server
  * Configuring properties