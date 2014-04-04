hellotwu
========

App for testing that TWU stack is correctly configured.

You should have:
* java - preinstalled in MacOSX
* svn - preinstalled in MacOSX
* firefox (version 24 or below) - https://ftp.mozilla.org/pub/mozilla.org/firefox/releases/24.0/mac/en-US/Firefox%2024.0.dmg (make sure to disable auto-upgrade in preferences)
* postgres - http://postgresapp.com/

You should do:
* Edit your .bash_profile by opening your terminal, and executing the following:
```touch ~/.bash_profile```
```edit ~/.bash_profile```
* Add the following to your .bash_profile file: ```export PATH="/Applications/Postgres.app/Contents/Versions/9.3/bin:$PATH"```
(Change the path above accordingly in case you installed Postgres in a different directory)
* Execute the following command:
```source ~/.bash_profile```
* Get a copy of the app code by clicking the 'Download ZIP' button on the righthand side of the github page.
* Create a postgres database named 'trailblazers'. Execute in the terminal: 
```createdb trailblazers```
* Create a postgres superuser named 'postgres'. Execute in the terminal: 
```createuser -s postgres```

This should set up your machine to run the HelloTWU webapp and its tests properly.

To start up the webapp, open up a terminal window and navigate into the hellotwu directory.

Run ```./tools/ant/bin/ant start```

Navigate to http://localhost:8080 in a browser. You should see a hello message.

Run ```./tools/ant/bin/ant test```

This will trigger a functional test that will perform an automated test of the app with firefox. If everything goes well, you will see a "Build Successful" message in your terminal window after the tests are executed.
