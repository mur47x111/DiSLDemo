#!/bin/sh

java -cp build/profiler.jar:lib/disl-server.jar -Ddislserver.disablebypass=true ch.usi.dag.dislserver.DiSLServer &
