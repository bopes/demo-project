Account Center-Tests
==========
Automated UI tests for Account Center using Selenium and Java

Prerequisites:
-------------
 1. Java JDK
     - Download: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
     - Install Java JDK
     - Ensure JAVA_HOME environment variable is set and points to your JDK installation
 2. Maven:
     - Download: http://maven.apache.org/download.cgi
     - UnZip in desired location
     - Add the `bin` directory of the unzip directory to the `PATH` environment variable
     - Confirm with `mvn -v` in a new shell. The result should look similar to:

```console
Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T04:57:37-07:00)
Maven home: /opt/apache-maven-3.3.3
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"
```
 3. Selenium Drivers:
     - Create a `drivers` folder in a desired location
     - Download drivers and add unzip them to the created folder:
         - Chrome: https://sites.google.com/a/chromium.org/chromedriver/
        - Firefox: https://github.com/mozilla/geckodriver/releases
        - IE: http://selenium-release.storage.googleapis.com/index.html
    - Add the `drivers` directory  that contains all unzipped drivers to the `PATH` environment variable
 4. Web browsers:
     - Install compatible browser versions on the host where you want to run tests.
     - **Note:**
          - Some browsers latest version are not compatible with the latest Selenium version.
              - Ex: the current Selenium version works with Firefox 47 or smaller.

Setup:
-------
 1. Open terminal
 2. Navigate to repository folder
 3. Run:
     - `mvn clean`

Running tests:
-------

 1. Open terminal
 2. Navigate to repository folder
 3. Run:
     - `mvn verify`
### Run options:###
```console
-D browserstack.build = Demo
-D browserstack.url = http://<User>:<Key>@hub.browserstack.com:80/wd/hub
-D browserstack.local = true
-D browserstack.project = LocalTest
-D browserstack.debug = true
-D browserstack.resolution = 1920x1080

-D browserstack.os = Windows
-D browserstack.os_version = 10

-D browserstack.browser = Chrome
-D browserstack.browser_version = 54
```

Generating final reports:
-------
 1. Open terminal
 2. Navigate to repository folder
 3. Run:
     - `mvn serenity:aggregate`
 4. Open `\target\site\serenity\index.html` to view the report

License
-------

