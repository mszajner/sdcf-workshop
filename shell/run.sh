#!/bin/bash

VERSION=2.5.3.RELEASE

if [[ ! -f "spring-cloud-dataflow-shell-$VERSION.jar" ]]; then
  wget https://repo.spring.io/release/org/springframework/cloud/spring-cloud-dataflow-shell/$VERSION/spring-cloud-dataflow-shell-$VERSION.jar
fi

java -jar spring-cloud-dataflow-shell-$VERSION.jar
