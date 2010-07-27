JavaSteam readme

Adriaan Koster / 13-07-2010

--

Installation steps:

install Maven (2.2.1)
  set system environment variables MAVEN_HOME and JAVA_HOME
  add MAVEN_HOME/bin to your system path
  add M2_REPO variable in Eclipse
  
install MySql (5.1.46)
  make sure there is a user called 'root' with an empty password

in the project root run:
  mvn test
a new database 'carrental' will be created in MySql

run:
  mvn eclipse:eclipse
refresh in Eclipse; the classpath and source folders will be set correctly

Populate database from commandline (until Spring version is upped):
mysql carrental -u root -p < C:\dev\workspace\javasteam\src\main\resources\db\populateDB.txt