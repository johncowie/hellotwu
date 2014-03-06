#!/bin/bash

printf "\n" | java -cp "lib/main/*:bin/main/" -XX:MaxPermSize=256M hellotwu.web.HelloServer > server.log &

