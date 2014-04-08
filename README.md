HelloTWU
========

App for testing that TWU stack is correctly configured.

You should have:
* svn
 * preinstalled in MacOSX
 * on Ubuntu - ```sudo apt-get install subversion```
* java
 * http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html
* firefox - http://www.mozilla.org/en-US/firefox/organizations/all/
* postgres
 * for Ubuntu - https://help.ubuntu.com/community/PostgreSQL
 * for Mac:
   * download http://postgresapp.com/
   * Then make sure you have the Postgres App Command Line Tools set up. Follow the documentation: http://postgresapp.com/documentation (Command-Line Tools section)

You should do:
* Get a copy of the app code by clicking the 'Download ZIP' button on the righthand side of the github page (https://github.com/johncowie/hellotwu/archive/master.zip).
* Create a postgres database named 'trailblazers'. Execute in the terminal:
  ```createdb trailblazers```
* Create a postgres superuser named 'postgres'. Execute in the terminal:
  ```createuser -s postgres```

This should set up your machine to run the HelloTWU webapp and its tests properly.

To start the HelloTWU webapp, open up a terminal window and navigate into the hellotwu directory.

Run ```./tools/ant/bin/ant start```

Navigate to http://localhost:8080 in a browser. You should see a hello message.

Run ```./tools/ant/bin/ant test```

This will trigger a functional test that will perform an automated test of the app with firefox. If everything goes well, you will see a "Build Successful" message in your terminal window after the tests are executed.
