#!/bin/sh

java -agentpath:lib/libdislagent.jnilib -Xbootclasspath/a:lib/disl-bypass.jar:build/profiler.jar -cp bin-target $*
