#!/bin/bash

mvn package && \
echo "Built $(readlink -f target/{{ cookiecutter.plugin_name }}*.jar)"