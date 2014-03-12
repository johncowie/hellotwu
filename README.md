hellotwu
========

App for testing that TWU stack is correctly configured.

At this point you should have postgres, svn, firefox (version 24 or below) and java installed.

Get a copy of the app code by clicking the 'Download ZIP' button on the righthand side of the github page.

You need a postgres database named 'trailblazers' and a postgres superuser named 'postgres'.

To create the postgres user run ```createuser -s postgres``` in a terminal.

To create the database run ```createdb trailblazers``` in a terminal.

To start up this webapp, open up a terminal window and navigate into the hellotwu directory.

Run ```./tools/ant/bin/ant start```

Navigate to http://localhost:8080 in a browser.  You should see a hello message.

Run ```./tools/ant/bin/ant test```

The task should trigger a functional test that will perform an automated test of the app with firefox.
