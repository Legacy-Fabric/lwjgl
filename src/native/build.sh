#!/bin/bash

make distclean
./autogen.sh
./configure
make
strip .libs/liblwjgl.0
