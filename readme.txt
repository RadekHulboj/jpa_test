
----------------------------------------------------------------------------------------
To make test succeed and pom working, the developer have to install to the local repository driver for ojdbc8.jar
The instruction is:
1) mvn install:install-file -DgroupId=com.oracle -DartifactId=oracle-driver-8 -Dversion=12.2.0.1.0 -Dfile=./lib/ojdbc8.jar -Dpackaging=jar -DgeneratePom=true
2) the pom.xml with this dependency will be works:
 <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>oracle-driver-8</artifactId>
            <version>12.2.0.1.0</version>
            <scope>test</scope>
 </dependency>

3) mvn clean install - should works
-----------------------------------------------------------------------------------------
!!! The integration test are not isolated, the oracle instance have to work. !!!
-----------------------------------------------------------------------------------------
alter session set "_ORACLE_SCRIPT"=true;
CREATE USER produser IDENTIFIED BY produser;
GRANT ALL PRIVILEGES TO produser;

alter session set "_ORACLE_SCRIPT"=true;
CREATE USER testuser IDENTIFIED BY testuser;
GRANT ALL PRIVILEGES TO testuser;
----------------------------------------------------------------------------------------
                                        Brudnopis
// (ORCLCDB)
// sys as SYSDBA SID ORCLCDB (pswd: Oradoc_db1)

