hellotwu
========

App for testing that TWU stack is correctly configured.

At this point you should have:
* java - preinstalled in MacOSX
* svn - preinstalled in MacOSX
* postgres - http://postgresapp.com/
* firefox - https://ftp.mozilla.org/pub/mozilla.org/firefox/releases/24.0/mac/en-US/Firefox%2024.0.dmg (version 24 or below, and make sure to disable auto-upgrade in preferences)

Get a copy of the app code by clicking the 'Download ZIP' button on the righthand side of the github page.

You need to:
* create a postgres database named 'trailblazers': ```createdb trailblazers```
* and create a postgres superuser named 'postgres': ```createuser -s postgres```

To start up this webapp, open up a terminal window and navigate into the hellotwu directory.

Run ```./tools/ant/bin/ant start```

Navigate to http://localhost:8080 in a browser.  You should see a hello message.

Run ```./tools/ant/bin/ant test```

The task should trigger a functional test that will perform an automated test of the app with firefox.
