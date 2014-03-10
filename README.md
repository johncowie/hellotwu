hellotwu
========

App for testing that TWU stack is correctly configured.

At this point you should have postgres, svn, firefox (version 24 or below) and java installed.

To start up this webapp, open up a terminal window and navigate into the hellotwu directory.

Run ```./tools/ant/bin/ant start```

Navigate to http://localhost:8080 in a browser.  You should see a hello message.

Run ```./tools/ant/bin/ant test```

The task should trigger a functional test that will perform an automated test of the app with firefox.