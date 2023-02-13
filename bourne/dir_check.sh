#/bin/sh
#
# Name: dir_check.sh
#
# Description: Checks to see if a directory exists.
#
# Author: Daniel Ribeirinha-Braga
#

if [ -z $1 ]; then
  echo -e "Error: Parameter missing\nUsage: dir_check.sh [directory]"
  exit 0
fi

if [ -d $1 ]; then
  echo "Directory exists"
fi
