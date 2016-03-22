#!/bin/sh

mx -p ${GRAAL_HOME} vm \
    -Xbootclasspath/a:lib/graal-directives.jar \
    -G:-RemoveNeverExecutedCode -G:+UseGraalInstrumentation -G:-InlineDuringParsing \
    -agentpath:lib/libdislagent.jnilib -Xbootclasspath/a:lib/disl-bypass.jar:build/profiler.jar:bin-target $*
