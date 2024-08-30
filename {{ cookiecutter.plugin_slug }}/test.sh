#!/bin/bash
nf-test test tests/**/*.nf.test --plugins target/{{ cookiecutter.plugin_name }}-*.jar "${@}"