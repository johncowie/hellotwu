#!/bin/bash

set -e

USER=$1
HOST=$2

if [ $# -ne 2 ]; then
  echo usage: scripts/install.sh USER HOST
  exit -1
fi;

if [ ! -e "dist/freewheelers.zip" ]; then
  echo "cannot find dist/freewheelers.zip to deploy"
  exit -1
fi;

scp dist/freewheelers.zip ${USER}@${HOST}:/tmp

ssh ${USER}@${HOST} /bin/bash << EOF
OLD="/tmp/freewheelersOld"
CUR="/tmp/freewheelersCur"

rm -rf "\$OLD"
mkdir -p "\$CUR"
mv "\$CUR" "\$OLD"

mkdir -p "\$CUR"
cp /tmp/freewheelers.zip "\$CUR"
cd "\$CUR"

unzip freewheelers.zip
sh stop-server.sh
sh db/migrate-database.sh
nohup sh start-server.sh > server.out 2> server.err < /dev/null
EOF